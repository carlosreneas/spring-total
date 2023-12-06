package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/docentes")
public class DocenteController {
	
	@GetMapping
	public String getDocenteAll() {
		return "Hola Docente";
	}
	
	@GetMapping("/{id}")
	public String getDocente(@PathVariable String id) {
		return "Hola Docente " + id; 
	}

}
