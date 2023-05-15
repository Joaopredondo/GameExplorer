package com.br.joaopedro.gameexplorer.repositories;

import com.br.joaopedro.gameexplorer.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

//consulta o banco
public interface GameListRepository extends JpaRepository<GameList, Long> {
    @Modifying //adicionou o modify devido a possuir UPDATE na tabela ou quando possuir um palavra reservado que faca alteracoes no scrpit
    @Query(nativeQuery = true,
            value = "UPDATE tb_belonging SET position = :newPosition WHERE list_id = :listId AND game_id = :gameId")
    void updateBelongingPosition(Long listId, Long gameId, Integer newPosition);
}
