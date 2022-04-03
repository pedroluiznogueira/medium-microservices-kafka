package com.github.pedroluiznogueira.consumer.domain.dto;

import lombok.Data;
import lombok.Value;

@Data
@Value
public class FoodOrderDto {
    String item;
    Double amount;
}
