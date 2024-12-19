package com.abhinath.dev.core.skaarl.dtos.request;

import com.abhinath.dev.core.skaarl.dtos.request.enums.OrderType;

import jakarta.validation.constraints.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequest{

    @NotBlank(message = "Instrument key is required")
    private String instrumentKey;

    @NotBlank(message = "Instrument name is required")
    private String instrumentName;

    @NotNull(message = "Quantity is required")
    @Min(value = 1, message = "Quantity must be greater than 0")
    private int qty;

    @NotNull(message = "Order type is required")
    private OrderType orderType;

    private float price;
    
    private float stopLoss;

}
