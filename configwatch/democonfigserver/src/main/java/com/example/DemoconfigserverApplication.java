package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class DemoconfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoconfigserverApplication.class, args);
	}
}
