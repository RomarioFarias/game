package com.example.demo.service.impl;

import com.example.demo.entity.Game;
import com.example.demo.repository.GameRepository;
import com.example.demo.service.GameService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class GameServiceImpl implements GameService {

    private final GameRepository gameRepository;
    @Override
    public Game createGame(Game game) {
        return gameRepository.createGame(game);
    }
}
