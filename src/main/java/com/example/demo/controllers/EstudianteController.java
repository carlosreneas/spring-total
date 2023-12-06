package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
	
	@GetMapping
	public String getEstudianteAll() {
		return "Hola Estudiante";
	}
	
	@GetMapping("/{id}")
	public String getEstudiante(@PathVariable String id) {
		return "Hola Estudiante " + id; 
	}
	
	@GetMapping("/{id}/{name}")
	public String getEstudianteName(@PathVariable String id, @PathVariable String name) {
		return "Hola Estudiante " + id; 
	}



}
