package com.springboot.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootCicdDemoApplication {

	@GetMapping("/hello")
	public String print() {
		return "Welcome Keerthi Kumar N to the world of Springboot with CICD";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCicdDemoApplication.class, args);
	}

}
