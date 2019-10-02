package com.example.bootEX3navin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String display() {
		return "home.jsp";
	}

}
