package com.pracitce.rs;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module1")
public class TestController {
	
	
	
	@RequestMapping("/test")
	public void doTest() {
		
	}
}
