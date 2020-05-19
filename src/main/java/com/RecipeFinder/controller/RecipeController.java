package com.RecipeFinder.controller;

import com.RecipeFinder.model.RecipeDTO;
import com.RecipeFinder.repository.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@Slf4j
@RestController
public class RecipeController {

    @Autowired
    private RecipeRepository recipeRepository;

    @GetMapping("/getRecipes/{ingredient}")
    @ResponseBody
    public Flux<RecipeDTO> getRecipeByIngredient(@PathVariable("ingredient") String ingredient) {
        log.info("finding recipes with id : " + ingredient);
        return this.recipeRepository.findByTitleContaining(ingredient);
    }

}
