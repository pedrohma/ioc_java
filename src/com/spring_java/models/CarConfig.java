package com.spring_java.models;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {
	@Bean
	public Car newCar() {
		return new Car();
	}
}
