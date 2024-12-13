package com.abhinath.dev.core.akasa.dtos.response;

import com.abhinath.dev.core.akasa.models.FoodItem;
import lombok.experimental.SuperBuilder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString
@SuperBuilder
public class GetFoodItemsResponse extends Response {
    private List<FoodItem> items;
}
