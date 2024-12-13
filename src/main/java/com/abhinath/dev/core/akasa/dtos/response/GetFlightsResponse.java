package com.abhinath.dev.core.akasa.dtos.response;

import com.abhinath.dev.core.akasa.models.Flight;
import lombok.experimental.SuperBuilder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@ToString
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class GetFlightsResponse extends Response {

    private List<Flight> flights;
}
