package com.example.springstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringstudyApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringstudyApplication.class, args); // SpringApplicationの起動
	}

	@RequestMapping("/hello")
	public String hello() {
		return "hello world!";
	}

	@RequestMapping("/hello/{name}")
	public String helloWithPathVariable(@PathVariable("name") String name) {
		return "hello world " + name + " ! ";
	}
	
	@RequestMapping("/helloparam")
	public String helloWithRequestParam(@RequestParam("name") String name) {
		return "hello world " + name + " !!!";
	}
}
