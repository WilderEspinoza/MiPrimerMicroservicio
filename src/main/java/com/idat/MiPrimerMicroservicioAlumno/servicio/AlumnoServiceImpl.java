package com.idat.MiPrimerMicroservicioAlumno.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MiPrimerMicroservicioAlumno.modelo.Alumno;
import com.idat.MiPrimerMicroservicioAlumno.repositorio.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	private AlumnoRepository repository;
	
	@Override
	public List<Alumno> listarAlumnos() {
		return repository.findAll();
	}

	@Override
	public Alumno obtenerAlumnos() {		

		return null;
	}

	@Override
	public void guardarAlumnos(Alumno alumno) {
		repository.save(alumno);
	}

	@Override
	public void actualizarAlumnos(Alumno alumno) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarAlumnos() {
		// TODO Auto-generated method stub

	}

}
