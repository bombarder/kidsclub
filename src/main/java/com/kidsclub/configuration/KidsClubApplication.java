package com.kidsclub.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.kidsclub")
@EnableJpaRepositories(basePackages = "com.kidsclub.repository")
@EntityScan(basePackages = "com.kidsclub.model")
public class KidsClubApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(KidsClubApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(KidsClubApplication.class, args);
	}
}
