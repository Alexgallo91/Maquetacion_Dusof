package com.dusof.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dusof.constantes.ConstantesIndex;

@Controller
public class IndexController {
	
	@Value("${spring.application.name}")
	String nombreAplicacion;
	
	@GetMapping("/")
	public String homePage(Model model) {
		model.addAttribute("nombreAplicacion", nombreAplicacion);
		return ConstantesIndex.HOME;
	}

}
