package com.abhinath.dev.core.akasa.dtos.response;

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
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = SuccessResponse.class, name = "success"),
    @JsonSubTypes.Type(value = ErrorResponse.class, name = "error")
})
public class Response {
    private String message;
    private Integer status;
    private boolean success;
}
