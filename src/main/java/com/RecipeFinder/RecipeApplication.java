package com.RecipeFinder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@EnableReactiveMongoRepositories
@SpringBootApplication
public class RecipeApplication {
    public static void main(String[] args){
        SpringApplication.run(RecipeApplication.class, args);
    }
}
