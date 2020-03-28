package com.systemrco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class RestApiRsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiRsApplication.class, args);
	}

}
