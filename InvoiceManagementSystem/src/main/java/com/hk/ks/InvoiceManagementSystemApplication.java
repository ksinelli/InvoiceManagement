package com.hk.ks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.hk.ks.dao")
public class InvoiceManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvoiceManagementSystemApplication.class, args);
		
	}

}
