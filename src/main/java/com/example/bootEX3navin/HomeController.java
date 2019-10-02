package com.example.bootEX3navin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.bootEX3navin.repositories.AlienRepo;

@Controller
public class HomeController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String display() {
		return "home.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		repo.save(alien);
		return "home.jsp";
	}

}
