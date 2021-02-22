package com.example.devops.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KontakService {

	@Autowired
	private KontakRepository kontakRepository;
	
	public List<Kontak> findAll(){
		List<Kontak> kontaks = (List<Kontak>) kontakRepository.findAll();
		
		
		return kontaks;
	}
}
