package com.abhinath.dev.core.akasa.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Objects;

@Data
@ToString(exclude = "userCart")
@AllArgsConstructor
@NoArgsConstructor

public class CartItem {

    private Long id;
    private Long item;
    private Integer quantity;
    private UserCart userCart;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartItem cartItem = (CartItem) o;
        return Objects.equals(item, cartItem.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item);
    }
}