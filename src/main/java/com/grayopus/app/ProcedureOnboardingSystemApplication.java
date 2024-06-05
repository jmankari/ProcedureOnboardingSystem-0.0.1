package com.grayopus.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@EntityScan(basePackages = {"com.grayopus.app.models"})  // scan JPA entities
@SpringBootApplication
public class ProcedureOnboardingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcedureOnboardingSystemApplication.class, args);
	}
}