package com.example.demo.controller;

import com.example.demo.dto.GameDto;
import com.example.demo.entity.Game;
import com.example.demo.mapper.GameMapper;
import com.example.demo.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/game")
@RequiredArgsConstructor
public class GameController {

    private final GameService gameService;
    private final GameMapper gameMapper;

    @PostMapping
    public Game createGame(@RequestBody GameDto gameDto){
        gameService.createGame(gameMapper.toGame(gameDto));
        return new Game();
    }

}
