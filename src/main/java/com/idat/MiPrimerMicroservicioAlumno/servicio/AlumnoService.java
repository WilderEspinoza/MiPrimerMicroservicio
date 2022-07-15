package com.idat.MiPrimerMicroservicioAlumno.servicio;

import java.util.List;

import com.idat.MiPrimerMicroservicioAlumno.modelo.Alumno;

public interface AlumnoService {

	public List<Alumno> listarAlumnos();
	public Alumno obtenerAlumnos();
	public void guardarAlumnos(Alumno alumno);
	public void actualizarAlumnos(Alumno alumno);
	public void eliminarAlumnos();
}
