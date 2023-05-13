package com.br.joaopedro.gameexplorer.dto;

import com.br.joaopedro.gameexplorer.entities.GameList;

public class GameListDTO {

    private long id;
    private String name;

    GameListDTO(){}

    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
