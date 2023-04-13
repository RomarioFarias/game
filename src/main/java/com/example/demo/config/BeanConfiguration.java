package com.example.demo.config;

import com.example.demo.service.impl.GameServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class BeanConfiguration {

    @Bean
    public GameServiceImpl gameServiceImplBean() {
        return new GameServiceImpl();
    }

    @Bean
    public ModelMapper modelMapperBean(){
        return new ModelMapper();
    }
}
