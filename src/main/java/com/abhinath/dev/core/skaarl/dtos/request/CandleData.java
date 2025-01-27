package com.abhinath.dev.core.skaarl.dtos.request;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CandleData {
    private List<List<Object>> candles;
}