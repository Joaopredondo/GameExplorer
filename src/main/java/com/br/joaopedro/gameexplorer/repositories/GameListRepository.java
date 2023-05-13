package com.br.joaopedro.gameexplorer.repositories;

import com.br.joaopedro.gameexplorer.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

//consulta o banco
public interface GameListRepository extends JpaRepository<GameList, Long> {
}
