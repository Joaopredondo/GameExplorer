package com.br.joaopedro.gameexplorer.controller;

import com.br.joaopedro.gameexplorer.dto.GameShortInfoDTO;
import com.br.joaopedro.gameexplorer.entities.Game;
import com.br.joaopedro.gameexplorer.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameShortInfoDTO> findAll() {
        List<GameShortInfoDTO> result = gameService.findAll();
        return result;
    }
}
