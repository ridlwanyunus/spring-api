package com.example.devops.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewController {

	@GetMapping("/")
	public Map<String, String> getIndex() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("key", "Hello World! this service is up");
		return map;
	}
}
