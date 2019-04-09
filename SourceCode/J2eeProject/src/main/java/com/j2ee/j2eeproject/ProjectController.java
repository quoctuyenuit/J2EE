package com.j2ee.j2eeproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {
	@GetMapping("/helloworld")
	public String hello() {
		return "helloworld";
	}
	
}
