package com.abhinath.dev.core.akasa.dtos.response;

import lombok.experimental.SuperBuilder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;    
import lombok.AllArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class GetCartDetailsResponse extends Response {

    private List<CartDetailsResponse> cart;
}
