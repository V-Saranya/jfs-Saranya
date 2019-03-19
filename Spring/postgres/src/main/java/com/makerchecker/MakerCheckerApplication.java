package com.makerchecker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing()
public class MakerCheckerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MakerCheckerApplication.class, args);
	}
}
