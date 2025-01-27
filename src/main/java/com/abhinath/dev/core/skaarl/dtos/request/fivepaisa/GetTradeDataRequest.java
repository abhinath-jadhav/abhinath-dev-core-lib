package com.abhinath.dev.core.skaarl.dtos.request.fivepaisa;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class GetTradeDataRequest {

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
        @JsonProperty("ClientCode")
        private String clientCode;
    }
}
