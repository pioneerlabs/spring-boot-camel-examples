package com.pionieerlabs.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.pionieerlabs.app.config.routes.MessageRouteProperties;

@SpringBootApplication
@EnableConfigurationProperties({MessageRouteProperties.class})
public class DbServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbServiceApplication.class, args);
	}
}
