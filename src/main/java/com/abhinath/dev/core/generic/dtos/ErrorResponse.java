package com.abhinath.dev.core.generic.dtos;

import lombok.experimental.SuperBuilder;

import com.fasterxml.jackson.annotation.JsonTypeName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;


@ToString
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@JsonTypeName("error")
@EqualsAndHashCode(callSuper = true)
public class ErrorResponse extends Response {
    private Object error;
}
