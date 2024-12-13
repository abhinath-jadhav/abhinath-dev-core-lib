package com.abhinath.dev.core.akasa.dtos.response;

import com.abhinath.dev.core.akasa.models.Order;
import lombok.experimental.SuperBuilder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@ToString
public class AllOrderResponse extends Response implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private List<Order> orders;
}
