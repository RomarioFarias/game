package com.example.demo.mapper;

import com.example.demo.dto.GameDto;
import com.example.demo.entity.Game;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GameMapper {
    private final ModelMapper modelMapper;


    public Game toGame(GameDto gameDto){
       return modelMapper.map(gameDto, Game.class);
    }
}
