package com.abhinath.dev.core.akasa.dtos.response;

import com.abhinath.dev.core.akasa.models.Inventory;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AllInventoryResponse extends SuccessResponse {
    private List<Inventory> inventories;
}
