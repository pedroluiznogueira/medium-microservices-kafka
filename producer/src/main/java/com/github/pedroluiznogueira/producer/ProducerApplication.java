package com.github.pedroluiznogueira.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProducerApplication {

	private static final Logger logger = LoggerFactory.getLogger(ProducerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProducerApplication.class, args);
		logger.info("Running...");
	}

}
