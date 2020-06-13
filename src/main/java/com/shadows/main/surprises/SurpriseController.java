package com.shadows.main.surprises;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class SurpriseController{

	@Autowired
	private  SurpriseRepository surpriseRepository;
	
	@GetMapping("/surprises")
	public List<Surprise> getSurprises(){
		List<Surprise> list = new ArrayList<Surprise>();
		 surpriseRepository.findAll().forEach(list::add);
		 return list;
	}
	
}
