package com.pipeline.cicdpipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CiCdPipelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(CiCdPipelineApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(){
		return "Hello From CI-CD Pipeline Application";
	}

}
