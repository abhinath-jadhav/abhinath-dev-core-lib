package com.abhinath.dev.core.skaarl.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Feed {
    private String instrumentId;
    private Double currentPrice;
    private Double change;
    private Double percentageChange;
    private String symbol;
}
