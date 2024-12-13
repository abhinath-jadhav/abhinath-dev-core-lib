package com.abhinath.dev.core.akasa.models;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString(exclude = "items")
public class Order {

    private Long id;
    private List<OrderItem> items;
    private String orderId;
    private Double payment;
    private String userId;
    private String status;
    private String flight;
    private String paymentMode;

}
