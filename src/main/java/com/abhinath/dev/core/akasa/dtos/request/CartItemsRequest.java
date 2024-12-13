package com.abhinath.dev.core.akasa.dtos.request;

import com.abhinath.dev.core.akasa.models.CartItem;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class CartItemsRequest {

    private String status;
    private List<CartItem> list;
    private int count;


}
