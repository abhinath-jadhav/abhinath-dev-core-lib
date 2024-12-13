package com.abhinath.dev.core.akasa.models;

import lombok.Data;
import lombok.ToString;
import java.util.LinkedList;
import java.util.List;

@Data

@ToString(exclude = "items")
public class UserCart {

    private Long id;
    private String userId;
    private List<CartItem> items = new LinkedList<>();
}
