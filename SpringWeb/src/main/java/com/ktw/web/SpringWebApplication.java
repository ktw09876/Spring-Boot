package com.ktw.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWebApplication {

	public static void main(String[] args) { //main이 있다: tomcat도 sping(boot) 밑으로 들어간다
		SpringApplication.run(SpringWebApplication.class, args);
	}

}
