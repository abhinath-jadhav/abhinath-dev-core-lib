package com.abhinath.dev.core.akasa.dtos.response;

import lombok.experimental.SuperBuilder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@ToString
public class OrderResponse extends Response {

    private String orderId;
    
}
