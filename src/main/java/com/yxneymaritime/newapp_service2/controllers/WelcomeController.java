package com.yxneymaritime.newapp_service2.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class WelcomeController {
	 // inject via application.properties
    @Value("${welcome.message}")
    private String message;
    
	  private List<String> tasks = Arrays.asList("a", "b", "c", "d", "e", "f", "g");

	    @GetMapping("/welcome")
	    public List<String>  main(Model model) {

	        return tasks; //view
	    }

}
