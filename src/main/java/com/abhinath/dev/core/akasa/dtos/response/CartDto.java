package com.abhinath.dev.core.akasa.dtos.response;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CartDto {

    private Long item;
    private Integer quantity;

}
