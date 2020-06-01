package com.webapp.springbootrestapiwebclient.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.webapp.springbootrestapiwebclient.entity.Customer;

import reactor.core.publisher.Flux;

@RestController
public class WebClientController {
	
	@RequestMapping("/")
	public Flux<Customer> helloWorld(){
		
		WebClient webClient = WebClient.builder().baseUrl("http://localhost:8080/springbootrestapi")
				.defaultHeader(HttpHeaders.CONTENT_TYPE,MediaType.APPLICATION_JSON_VALUE).build();
		Flux<Customer> cust= webClient
				.get().uri("/customers")
				.retrieve()
				.bodyToFlux(Customer.class);
		return cust;
	}

	
	
	

	
	
	
}
