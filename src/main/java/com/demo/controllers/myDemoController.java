package com.demo.controllers;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class myDemoController {
	
	private String[] quotes= {"The only joy in world is begin.","Happiness is not something ready-made","You always pass failure on the way"};      
	
	//http://localhost:8080/springMVCDemo/getQuote.html
	
	@RequestMapping(value="/getQuote")
	public String getRandomQuote(Model model) {
		
		
		int rand = new Random().nextInt(quotes.length);
		String randomQuote = quotes[rand];
		model.addAttribute("randomQuote", randomQuote);
		return "quote";
	}
}
