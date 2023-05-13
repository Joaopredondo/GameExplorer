package com.br.joaopedro.gameexplorer.services;

import com.br.joaopedro.gameexplorer.dto.GameDTO;
import com.br.joaopedro.gameexplorer.dto.GameShortInfoDTO;
import com.br.joaopedro.gameexplorer.entities.Game;
import com.br.joaopedro.gameexplorer.projections.GameMinProjection;
import com.br.joaopedro.gameexplorer.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//responsavel pela regra de negocio
@Service //registra como componentes do sistema
public class GameService {

    @Autowired //esta injetando(chamando) o gamerepository dentro da service.
    private GameRepository gameRepository;

    @Transactional(readOnly = true) //como essa anotação se garante que a operacao no banco ira seguir de forma transacional, importante utilizar em todos.
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get(); //precisa utilizar o .get pois o retorno do findById vem no modelo optional
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameShortInfoDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameShortInfoDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public List<GameShortInfoDTO> findByList(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameShortInfoDTO(x)).toList();
    }

}
