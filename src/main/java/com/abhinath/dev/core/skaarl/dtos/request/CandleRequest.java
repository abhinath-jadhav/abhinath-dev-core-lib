package com.abhinath.dev.core.skaarl.dtos.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CandleRequest {
    private String stock;
    private String interval;
}
