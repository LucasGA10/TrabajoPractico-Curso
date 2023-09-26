package Trabajo.Curso;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class PruebaCurso {

	@Test
	public void queSePuedaCrearUnCurso() {
		String nombreMateria = "Matematica";
		Date fechaInscripcion = new Date (10/04/2023);
		Date fechaFinInscripcion = new Date(29/04/2023);
		Date fechaInicio = new Date (10/05/2023);
		Date fechaFinalizacion = new Date (10/11/2023);
		
		Integer id = 0;
		Dia dia = Dia.Miercoles;
		Turno turno = Turno.mañana;
		
		Materia materia = new Materia (1, nombreMateria);
		CicloLectivo cicloLectivo = new CicloLectivo(id, fechaInscripcion, fechaFinInscripcion, fechaInicio, fechaFinalizacion, Cuatrimestre.primer_cuatrimestre);
		Comision comision = new Comision(materia, cicloLectivo);
		
		Curso curso = new Curso(id, comision, dia, turno);
		
		assertNotNull(curso);
	}
	
	/*
	@Test
	public void AgregarUnAlumnoAlCurso() {
		String nombre = "nicolas";
		String apellido = "manauta";
		Integer dni = 123456789;
		Date fechaIngreso = new Date (31/10/2019);
		Date fechaNacimiento = new Date (26/03/2003);
		
		Materia materia = new Materia(1, "Matematica");
		Integer numeroAula = 120;
		Integer cantidadAulumnos = 80;
		
		Alumno alumno = new Alumno (nombre, apellido, fechaNacimiento, dni, fechaIngreso);
		Curso curso1 = new Curso(materia, Dia.Miercoles, Turno.mañana);
		boolean cargaExitosa = curso1.agregarUnAlumno(alumno);
		
		assertTrue(cargaExitosa);
	}
	
	
	@Test
	public void QueNoSePuedaRepetirUnMismoAlumnoEnElCurso() {
		String nombre = "nicolas";
		String apellido = "manauta";
		Integer dni = 123456789;
		Date fechaIngreso = new Date (31/10/2019);
		Date fechaNacimiento = new Date (26/03/2003);
		
		Materia materia = new Materia(1, "Matematica");
		Integer numeroAula = 120;
		Integer cantidadAulumnos = 80;
		
		Alumno alumno = new Alumno (nombre, apellido, fechaNacimiento, dni, fechaIngreso);
		Curso curso1 = new Curso(materia, Dia.Miercoles, Turno.mañana);
		curso1.agregarUnAlumno(alumno);
		boolean noSeCargo = curso1.agregarUnAlumno(alumno);
		
		
		assertFalse(noSeCargo);
	}*/

}
