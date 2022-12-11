package com.ktw.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 얘 컨트롤러 입니다
public class HomeController {
	
	@RequestMapping("/index")
	public String asf() {
		
		return "Hello Spring Boot";
	}
	
	@RequestMapping("/aabb")
	public String aaa() {
		
		return "aaaa";
	}
}
