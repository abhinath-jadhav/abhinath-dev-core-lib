package com.abhinath.dev.core.akasa.dtos.response;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CartDetailsResponse{

    private Long id;
    private String name;
    private Float price;
    private Integer diet;
    private Integer category;
    private String description;
    private String img;
    private float ratings;
    private boolean isFeatured;
    private Integer qty;
}
