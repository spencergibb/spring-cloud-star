package com.example;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class DemoconsulvaultApplication {

	@Autowired
	Environment env;

	@RequestMapping("/")
	public Object home() {
		HashMap<String, String> map = new HashMap<>();
		map.put("app.prop", env.getProperty("app.prop", "Not Found"));
		map.put("my.secret", env.getProperty("my.secret", "Not Found"));

		return map;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoconsulvaultApplication.class, args);
	}
}
