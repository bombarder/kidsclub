package com.kidsclub.configuration;

import com.kidsclub.service.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.kidsclub")
@EnableJpaRepositories(basePackages = "com.kidsclub.repository")
@EntityScan(basePackages = "com.kidsclub.model")
public class KidsClubApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(KidsClubApplication.class, args);
		CustomerService bean = context.getBean(CustomerService.class);

	}
}
