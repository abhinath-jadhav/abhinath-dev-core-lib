package com.abhinath.dev.core.akasa.dtos.response;

import com.abhinath.dev.core.akasa.models.CartItem;
import lombok.experimental.SuperBuilder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
public class CartItemsResponse extends Response {
    private List<CartItem> list;
    private int count;
}
