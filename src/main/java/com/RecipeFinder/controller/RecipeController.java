package com.RecipeFinder.controller;

import com.RecipeFinder.model.RecipeDTO;
import com.RecipeFinder.service.RecipeFinderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@Slf4j
@RestController
public class RecipeController {

    @Autowired
    private RecipeFinderService recipeFinderService;

    @GetMapping("/getRecipes/{ingredient}")
    @ResponseBody
    public Flux<RecipeDTO> getRecipeByIngredient(@RequestParam String ingredient) {
        log.debug("finding recipes with id : " + ingredient);
        return recipeFinderService.findByIngredient(ingredient);
    }

}
