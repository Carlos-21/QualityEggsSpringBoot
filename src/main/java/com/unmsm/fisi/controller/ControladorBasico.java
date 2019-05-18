package com.unmsm.fisi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControladorBasico {
	
	@GetMapping("/inicio")
	public String iniciar() {
		return "index";
	}

}
