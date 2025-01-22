package com.devsuperior.gameList.repositories;

import com.devsuperior.gameList.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface GameRepository extends JpaRepository<Game, Long> {
}
