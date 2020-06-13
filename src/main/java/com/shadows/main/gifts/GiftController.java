package com.shadows.main.gifts;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GiftController {

	@Autowired
	private GiftRepository giftRepository;
	
	@GetMapping("/gifts")
	public List<Gift> getGifts(){
		List<Gift> list= new ArrayList<Gift>();
		giftRepository.findAll().forEach(list::add);
		return list;
	}
}
