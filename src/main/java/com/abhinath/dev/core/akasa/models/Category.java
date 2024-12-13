package com.abhinath.dev.core.akasa.models;

import lombok.Data;
import lombok.ToString;

@Data

@ToString
public class Category {

    private Long id;
    private String name;
    private String description;
}
