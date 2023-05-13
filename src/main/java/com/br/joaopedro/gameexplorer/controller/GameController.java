package com.br.joaopedro.gameexplorer.controller;

import com.br.joaopedro.gameexplorer.dto.GameDTO;
import com.br.joaopedro.gameexplorer.dto.GameShortInfoDTO;
import com.br.joaopedro.gameexplorer.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping(value="/{id}")
    public GameDTO findById(@PathVariable Long id) {
        return gameService.findById(id);
    }



}
