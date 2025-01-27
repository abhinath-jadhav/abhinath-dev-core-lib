package com.abhinath.dev.core.skaarl.dtos.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpstoxAuthRequest {
    private String code="asdsadasgdkgdsf";
    private String client_id="dd927ea1-b01e-4f2b-b59a-0b541c088c2c";
    private String client_secret="ipt5os4rwg";
    private String redirect_uri ="http://localhost:5173";
    private String grant_type = "authorization_code";
}
