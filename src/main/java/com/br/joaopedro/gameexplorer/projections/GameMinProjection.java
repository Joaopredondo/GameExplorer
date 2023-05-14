package com.br.joaopedro.gameexplorer.projections;

//nessa classe é criado metodos get para cada dado que minha consulta esta retornando no select do game repository(sql)
public interface GameMinProjection {
    Long getId();
    String getTitle();
    Integer getGameYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
