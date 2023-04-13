package com.example.demo.repository.impl;

import com.example.demo.entity.Game;
import com.example.demo.repository.GameRepository;
import com.example.demo.repository.data.GameMongoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class GameRepositoryImp implements GameRepository {

    private final GameMongoRepository gameMongoRepository;

    @Override
    public Game createGame(Game game) {
        return gameMongoRepository.save(game);
    }
}
