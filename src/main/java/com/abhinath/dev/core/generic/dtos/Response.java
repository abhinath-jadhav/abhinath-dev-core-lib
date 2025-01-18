package com.abhinath.dev.core.generic.dtos;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Data
@SuperBuilder  
@NoArgsConstructor
@AllArgsConstructor
public class Response {
    private String message;
    private Integer status;
    private boolean success;
}
