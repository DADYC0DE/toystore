package com.VGTU.toystore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableDiscoveryClient
@SpringBootApplication
@EntityScan("com.VGTU.toystore.model") // adjust this if your model package is different
@EnableJpaRepositories("com.VGTU.toystore.repository") // Enable repositories for JPA (if needed)
public class ToystoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToystoreApplication.class, args); // Make sure to call the correct class
	}
}
