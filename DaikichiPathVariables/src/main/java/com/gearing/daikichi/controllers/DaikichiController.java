package com.gearing.daikichi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	
	/*
	 * I know the learn platform tells us to use @RequestMapping, but eclipse seemed to think that GetMapping was better as it's more specific
	 * and I'm inclined to agree from what I do know.
	 * */
	
	@GetMapping("")
	public String welcome() {
		return "Welcome!";
	}
	
	@GetMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@GetMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@GetMapping("/travel/{location}")
	public String travel(@PathVariable("location") String loc) {
		return "Congratulations! You will soon travel to " + loc + "!";
	}
	
	@GetMapping("/lotto/{lottoNum}")
	public String lotto(@PathVariable("lottoNum") String lotto) {
		int num = Integer.parseInt(lotto);
		
		return num % 2 == 0 ? "You will take a grand journey in the near future, but be wary of tempting offers." : 
			"You have enjoyed the fruits of your labor but now is a great time to spend with family and friends.";
	}
}
