package com.example.rating_data_service;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient  // Enables service registration with Eureka
public class RatingDataServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(RatingDataServiceApplication.class, args);
	}
}
