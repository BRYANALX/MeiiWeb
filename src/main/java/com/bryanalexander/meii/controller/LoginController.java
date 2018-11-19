package com.bryanalexander.meii.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@Value("${nombre.aplicacion}")
	String nombre;

	@GetMapping(value = "/validar")
	public String validar(Model model) {

		model.addAttribute("titulo", "Validar Login :)");
		model.addAttribute("app", nombre);

		return "validar";

	}

}
