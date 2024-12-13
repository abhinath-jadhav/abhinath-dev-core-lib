package com.abhinath.dev.core.akasa.dtos.request;

import lombok.Data;

@Data
public class ValidateUserInfo {
    private String username;
    private String password;
    private String confirmPassword;
}
