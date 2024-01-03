package com.thymeleaf.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("/about")
	public String index(Model m) {
		List<String> name= List.of("Kausar", "Raza", "Rozi");
		m.addAttribute("name", name);
        return "about";
    }
	@GetMapping("/condition")
	public String condition(Model m) {
		m.addAttribute("isActive", true);
		m.addAttribute("gender", "m");
		List<Integer> num = List.of(1, 2, 4, 5);
		m.addAttribute("num", num);
		return "condition";
	}
	@GetMapping("/service")
	public String service() {
		return "service";
	}
}
