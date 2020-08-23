package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@RestController
@RequestMapping(value = "/insurance")
public class Microservice2Application {

	@GetMapping(value = "/provider", produces = {MediaType.ALL_VALUE})
	public List<String> getMessage(){
		return Stream.of("test","test1","trest3").collect(Collectors.toList());
	}

	public static void main(String[] args) {
		SpringApplication.run(Microservice2Application.class, args);
	}

}
