package com.mycart.controller.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

	@GetMapping("node")
	public String getNode() {
		RestTemplate restTemplate = new RestTemplate();
			String res=restTemplate.getForObject("http://localhost:3000/",String.class);
		return res;
	}
}
