package com.abhinath.dev.core.akasa.models;

import lombok.Data;

@Data
public class Inventory {

    private Long id;
    private Long itemId;
    private String itemName;
    private int stock;
}
