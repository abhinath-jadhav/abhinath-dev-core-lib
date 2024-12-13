package com.abhinath.dev.core.akasa.models;

import lombok.Data;
import lombok.ToString;

@Data

@ToString
public class FoodItem {

    private Long id;
    private String name;
    private Float price;
    private Integer diet;
    private Integer category;
    private String description;
    private String img;
    private float ratings;
    private boolean isFeatured;


}
