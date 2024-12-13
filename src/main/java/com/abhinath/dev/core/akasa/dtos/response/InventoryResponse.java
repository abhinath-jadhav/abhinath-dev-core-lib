package com.abhinath.dev.core.akasa.dtos.response;

import com.abhinath.dev.core.akasa.models.Inventory;
import lombok.experimental.SuperBuilder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@ToString
public class InventoryResponse extends Response {
    private Inventory item;
}

