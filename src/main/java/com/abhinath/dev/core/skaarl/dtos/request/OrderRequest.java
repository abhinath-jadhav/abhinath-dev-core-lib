package com.abhinath.dev.core.skaarl.dtos.request;

import com.abhinath.dev.core.skaarl.dtos.request.enums.OrderType;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequest{

    private String instrumentKey;
    private String instrumentName;
    private int qty;
    private OrderType orderType;
    private float price;
    private float stopLoss;

}
