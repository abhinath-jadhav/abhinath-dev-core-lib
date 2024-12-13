package com.abhinath.dev.core.akasa.dtos.request;

import com.abhinath.dev.core.generic.dtos.Response;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString
public class RegisterRequest extends Response {

    private String email;
    private String password;
    private String confirmPassword;

}
