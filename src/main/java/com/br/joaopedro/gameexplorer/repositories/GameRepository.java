package com.br.joaopedro.gameexplorer.repositories;

import com.br.joaopedro.gameexplorer.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

//consulta o banco
public interface GameRepository extends JpaRepository<Game, Long> {
}
