package com.abhinath.dev.core.skaarl.dtos.request.fivepaisa;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class PlaceOrderRequest {

    private Head head;
    private Body body;


    @Getter
    @Setter
    @Builder
    public static class Head {
        private String key;
    }

    @Getter
    @Setter
    @Builder
    public static class Body {

        @JsonProperty("Exchange")
        private String exchange;

        @JsonProperty("OrderType")
        private String orderType;

        @JsonProperty("ExchangeType")
        private String exchangeType;

        @JsonProperty("ScripCode")
        private String scripCode;

        @JsonProperty("ScripData")
        private String scripData;

        @JsonProperty("Price")
        private double price;

        @JsonProperty("Qty")
        private int qty;

        @JsonProperty("StopLossPrice")
        private double stopLossPrice;

        @JsonProperty("IsIntraday")
        private boolean isIntraday;

        @JsonProperty("RemoteOrderID")
        private String remoteOrderID;

        @JsonProperty("AHPlaced")
        private String AHPlaced;

    }
}
