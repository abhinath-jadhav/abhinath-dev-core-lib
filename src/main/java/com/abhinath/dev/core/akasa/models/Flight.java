package com.abhinath.dev.core.akasa.models;

import lombok.Data;
import lombok.ToString;


@Data
@ToString
public class Flight {

    private Long id;
    private String flightId;
    private String userId;
    private String path;

}
