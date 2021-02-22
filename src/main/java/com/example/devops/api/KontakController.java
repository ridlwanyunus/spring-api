package com.example.devops.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kontak")
public class KontakController {

	@Autowired
	private KontakService kontakService;
	
	@GetMapping("/all")
	public List<Kontak> findAll(){
		return kontakService.findAll();
	}
	
	
	@GetMapping("/test")
	public Map<String, String> test(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value4");
		return map;
	}
	
}
