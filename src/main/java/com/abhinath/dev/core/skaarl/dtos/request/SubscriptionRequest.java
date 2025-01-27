package com.abhinath.dev.core.skaarl.dtos.request;

import lombok.Data;

import java.util.Set;

@Data
public class SubscriptionRequest {
    private String userId;
    private Set<String> stockSymbols;
}
