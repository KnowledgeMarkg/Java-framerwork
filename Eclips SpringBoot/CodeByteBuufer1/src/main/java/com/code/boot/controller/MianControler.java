package com.code.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MianControler {
	@GetMapping("/")
	public String mian(){
        return "mian hu Don";
    }
}
