package com.github.pedroluiznogueira.producer.domain;

import lombok.Data;
import lombok.Value;

@Data
@Value
public class FoodOrder {
    String item;
    Double amount;
}
