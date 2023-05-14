package com.br.joaopedro.gameexplorer.dto;

import com.br.joaopedro.gameexplorer.entities.Game;
import com.br.joaopedro.gameexplorer.projections.GameMinProjection;

public class GameShortInfoDTO {

        private long id;
        private String title;
        private Integer year;
        private String imgUrl;
        private String shortDescription;

        public GameShortInfoDTO(){}

        public GameShortInfoDTO(Game entity) {
                id = entity.getId();  //foi retirado o this pois não se tem mais paramentros com o mesmo nome das variaveis, pois esta trazendo direto da classe Game.
                title = entity.getTitle();
                year = entity.getYear();
                imgUrl = entity.getImgUrl();
                shortDescription = entity.getShortDescription();
        }

        public GameShortInfoDTO(GameMinProjection projection) {
                id = projection.getId();  //foi retirado o this pois não se tem mais paramentros com o mesmo nome das variaveis, pois esta trazendo direto da classe Game.
                title = projection.getTitle();
                year = projection.getGameYear();
                imgUrl = projection.getImgUrl();
                shortDescription = projection.getShortDescription();
        }

        public long getId() {
                return id;
        }


        public String getTitle() {
                return title;
        }

        public Integer getYear() {
                return year;
        }

        public String getImgUrl() {
                return imgUrl;
        }

        public String getShortDescription() {
                return shortDescription;
        }

        //foram gerados apenas geters pois esta em uma classe DTO e não se precisa da set
}
