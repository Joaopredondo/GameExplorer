package com.br.joaopedro.gameexplorer.controller;

import com.br.joaopedro.gameexplorer.dto.GameListDTO;
import com.br.joaopedro.gameexplorer.dto.GameShortInfoDTO;
import com.br.joaopedro.gameexplorer.services.GameListService;
import com.br.joaopedro.gameexplorer.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @GetMapping(value="/{listId}/games")
    public List<GameShortInfoDTO> findByList(@PathVariable Long listId) {
        List<GameShortInfoDTO> result = gameService.findByList(listId);
        return result;
    }

}
