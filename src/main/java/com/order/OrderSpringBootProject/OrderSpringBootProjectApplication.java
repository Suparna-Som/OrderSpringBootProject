package com.order.OrderSpringBootProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class OrderSpringBootProjectApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(OrderSpringBootProjectApplication.class, args);
	}

}
