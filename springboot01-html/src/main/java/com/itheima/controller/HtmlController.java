package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HtmlController {
    
	@GetMapping("/hello")
	public String hello(){
		return "html/hello.html";
		
	}
}
