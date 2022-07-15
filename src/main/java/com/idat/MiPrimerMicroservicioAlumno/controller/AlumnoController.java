package com.idat.MiPrimerMicroservicioAlumno.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.MiPrimerMicroservicioAlumno.modelo.Alumno;
import com.idat.MiPrimerMicroservicioAlumno.servicio.AlumnoService;

@Controller
@RequestMapping("/api/v1/alumno")
public class AlumnoController {

	@Autowired
	private AlumnoService service;
	
	@GetMapping("/hola")
	public @ResponseBody String holamundo() {
		return "Hola mundo";
	}
	
	@GetMapping("/listar")
	public @ResponseBody List<Alumno> listarAlumnos(){
		return service.listarAlumnos();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody Alumno obtenerAlumno(@PathVariable Integer id){
		return null;
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardarAlumno(@RequestBody Alumno alumno) {
		service.guardarAlumnos(alumno);
	}
	
	@PutMapping("/actualizar")
	public void actualizarAlumno(@RequestBody Alumno alumno) {
		
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminarAlumno(@PathVariable Integer id) {
		
	}
	
}
