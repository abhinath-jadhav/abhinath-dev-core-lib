package com.abhinath.dev.core.akasa.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString(exclude = "order")
@AllArgsConstructor
@NoArgsConstructor

public class OrderItem {

    private Long id;
    private Long item;
    private Integer quantity;

    @JsonIgnore
    private Order order;

}