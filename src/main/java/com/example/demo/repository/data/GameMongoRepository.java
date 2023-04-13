package com.example.demo.repository.data;

import com.example.demo.entity.Game;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GameMongoRepository  extends MongoRepository<Game, String > {
}
