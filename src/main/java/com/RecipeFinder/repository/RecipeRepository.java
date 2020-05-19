package com.RecipeFinder.repository;

import com.RecipeFinder.model.RecipeDTO;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface RecipeRepository extends ReactiveMongoRepository<RecipeDTO, String> {

    Flux<RecipeDTO> findByTitleContaining(String ingredient);

}
