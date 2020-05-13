package com.RecipeFinder.service;

import com.RecipeFinder.model.RecipeDTO;
import com.RecipeFinder.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class RecipeFinderService {

    @Autowired
    private RecipeRepository recipeRepository;

    public Flux<RecipeDTO> findByIngredient(String ingredient){
        return recipeRepository.findByIngredient(ingredient);
    }
}
