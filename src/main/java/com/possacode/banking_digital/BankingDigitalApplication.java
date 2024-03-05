package com.possacode.banking_digital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BankingDigitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingDigitalApplication.class, args);
	}

}
