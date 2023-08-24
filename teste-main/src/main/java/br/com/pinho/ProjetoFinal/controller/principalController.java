package br.com.pinho.ProjetoFinal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class principalController {
	
	@GetMapping("/")
	public String menu() {
		return "index";
	}
}
