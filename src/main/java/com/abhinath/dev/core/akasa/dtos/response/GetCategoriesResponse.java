package com.abhinath.dev.core.akasa.dtos.response;

import com.abhinath.dev.core.akasa.models.Category;
import lombok.experimental.SuperBuilder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor 
public class GetCategoriesResponse extends Response {

    private List<Category> categories;

}
