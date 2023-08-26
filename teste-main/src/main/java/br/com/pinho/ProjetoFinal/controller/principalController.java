package br.com.pinho.ProjetoFinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.pinho.ProjetoFinal.model.ProjetoModel;
import br.com.pinho.ProjetoFinal.repository.ProjetoFinalRepository;




@Controller
public class PrincipalController {
	
	@Autowired
	private ProjetoFinalRepository projetoFinalRepository;

	@GetMapping("index")
	public String index() {
		
		
		return "index";
	}

}