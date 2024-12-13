package com.abhinath.dev.core.akasa.dtos.request;

import com.abhinath.dev.core.akasa.dtos.response.Response;
import lombok.experimental.SuperBuilder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class UpdateCartDto extends Response {
    private Long item;
    private Integer quantity;
}
