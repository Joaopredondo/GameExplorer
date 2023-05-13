package com.br.joaopedro.gameexplorer.services;

import com.br.joaopedro.gameexplorer.dto.GameListDTO;
import com.br.joaopedro.gameexplorer.entities.GameList;
import com.br.joaopedro.gameexplorer.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//responsavel pela regra de negocio
@Service //registra como componentes do sistema
public class GameListService {

    @Autowired //esta injetando(chamando) o gamerepository dentro da service.
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }

}
