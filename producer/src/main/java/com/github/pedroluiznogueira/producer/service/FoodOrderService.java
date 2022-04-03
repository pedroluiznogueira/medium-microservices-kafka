package com.github.pedroluiznogueira.producer.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pedroluiznogueira.producer.domain.FoodOrder;
import com.github.pedroluiznogueira.producer.service.producer.Producer;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FoodOrderService {

    private final Producer producer;

    @Autowired
    public FoodOrderService(Producer producer) {
        this.producer = producer;
    }

    public String createFoodOrder(FoodOrder foodOrder) throws JsonProcessingException {
        return producer.sendMessage(foodOrder);
    }
}
