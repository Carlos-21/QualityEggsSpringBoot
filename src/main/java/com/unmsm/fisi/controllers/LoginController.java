package com.unmsm.fisi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping(value={"/", "home"})
	public String iniciar() {
		return "login";
	}
}
