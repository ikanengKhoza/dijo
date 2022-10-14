package com.codingblackfemales.recipe.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecipeController {

    @GetMapping("/recipe")
    public List<Recipe> recipe() {
        return List.of(
                new Recipe(
                        1L,
                        "Easy Carrot Cate",

                        "Carrots, milk, butter",

                        "Mix butter and sugar"
                )

        );
    }
}
