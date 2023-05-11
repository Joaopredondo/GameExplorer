package com.br.joaopedro.gameexplorer.services;

import com.br.joaopedro.gameexplorer.dto.GameShortInfoDTO;
import com.br.joaopedro.gameexplorer.entities.Game;
import com.br.joaopedro.gameexplorer.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//responsavel pela regra de negocio
@Service //registra como componentes do sistema
public class GameService {

    @Autowired //esta injetando(chamando) o gamerepository dentro da service.
    private GameRepository gameRepository;

    public List<GameShortInfoDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameShortInfoDTO(x)).toList();
    }

}
