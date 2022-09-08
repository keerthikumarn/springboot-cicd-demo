package com.springboot.cicd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import static java.lang.System.getenv;

import com.springboot.cicd.config.PropertiesDemo;

@SpringBootApplication
@RestController
public class SpringbootCicdDemoApplication {

	@Autowired
	private PropertiesDemo demo;

	@GetMapping("/hello")
	public String print() {
		StringBuilder sb = new StringBuilder();
		sb.append("Welcome Keerthi Kumar N to the world of Springboot with CICD \n");
		sb.append("URL : ").append(demo.getUrl()).append("\n");
		sb.append("Username from secret : ").append(getenv("APP_USERNAME")).append("\n");
		sb.append("Password from secret : ").append(getenv("APP_PASSWORD")).append("\n");
		return sb.toString();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCicdDemoApplication.class, args);
	}

}
