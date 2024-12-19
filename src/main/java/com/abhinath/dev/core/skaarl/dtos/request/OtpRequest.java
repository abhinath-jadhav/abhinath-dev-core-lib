package com.abhinath.dev.core.skaarl.dtos.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class OtpRequest  {

    @NotBlank(message = "OTP is required")
    private String otp;
}


