package com.devsuperior.gameList.services;

import com.devsuperior.gameList.dto.GameMinDTO;
import com.devsuperior.gameList.entities.Game;
import com.devsuperior.gameList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}
