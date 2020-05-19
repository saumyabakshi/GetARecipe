package com.RecipeFinder.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "1")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecipeDTO {

    private List<String> directions;
    private List<String> ingredients;
    private String language;
    private String source;
    private List<String> tags;

    @Id
    @Indexed
    private String title;
    private String url ;

}
