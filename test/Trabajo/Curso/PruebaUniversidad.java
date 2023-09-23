package Trabajo.Curso;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class PruebaUniversidad {

	@Test
	public void queSePuedaRegistrarUnaMateria() {
		String nombreUni = "Unlam";
		String nuevaMateria = "Filosofia";
		
		Universidad universidad = new Universidad (nombreUni);
		Materia materia = new Materia (1, nuevaMateria);
		
		boolean registroExitoso = universidad.agregarMateria(materia);
		
		assertTrue(registroExitoso);
	}
	
	@Test
	public void queNoSePuedaRegistrarDosMateriasConMismaId() {
		String nombreUni = "Unlam";
		String nuevaMateria = "Filosofia";
		
		Universidad universidad = new Universidad (nombreUni);
		Materia materia = new Materia (1, nuevaMateria);
		
		universidad.agregarMateria(materia);
		boolean registroFallido = universidad.agregarMateria(materia);
		
		assertFalse (registroFallido);
	}
	
	@Test
	public void queSePuedaQuitarUnaMateria() {
		String nombreUni = "Unlam";
		String nuevaMateria = "Filosofia";
		Integer id= 1;
		
		Universidad universidad = new Universidad (nombreUni);
		Materia materia = new Materia (id, nuevaMateria);
		universidad.agregarMateria(materia);
		
		
		boolean materiaRemovida = universidad.quitarMateria(id);
		
		assertTrue(materiaRemovida);
	}
	
	@Test 
	public void queSePuedaRegistrarUnProfesor() {
		
		Integer id = 0;
		String nombre = "Rodolfo";
		String apellido = "Mitre";
		Date fechaNacimiento = new Date (20/04/1889);
		Integer dni = 987654321;
		Profesor profesor = new Profesor (id, nombre, apellido, fechaNacimiento, dni);
		
		String nombreUni = "Unlam";
		Universidad universidad = new Universidad (nombreUni);
		
		boolean registroDeProfesor = universidad.registrarProfesor(profesor);
		
		assertTrue(registroDeProfesor);
	}
	
	@Test 
	public void queNoSePuedaRegistrarUnProfesorConMismoDni() {
		
		Integer id = 0;
		String nombre = "Rodolfo";
		String apellido = "Mitre";
		Date fechaNacimiento = new Date (20/04/1889);
		Integer dni = 987654321;
		Profesor profesor = new Profesor (id, nombre, apellido, fechaNacimiento, dni);
		
		String nombreUni = "Unlam";
		Universidad universidad = new Universidad (nombreUni);
		
		universidad.registrarProfesor(profesor);
		boolean registroFallido = universidad.registrarProfesor(profesor);
		
		assertFalse(registroFallido);
	}
	
	@Test
	public void agregarUnNuevoAlumnoALaUniversidad() {
		String nombreUni = "Unlam";
		
		String nombre = "nicolas";
		String apellido = "manauta";
		Integer dni = 123456789;
		Date fechaIngreso = new Date (31/10/2019);
		Date fechaNacimiento = new Date (26/03/2003);
		
		Universidad universidad = new Universidad (nombreUni);
		Alumno alumno = new Alumno (nombre, apellido, fechaNacimiento, dni, fechaIngreso);
		
		boolean registroExitoso = universidad.registrarNuevoAlumno(alumno);
		
		assertTrue(registroExitoso);
	}
	
	@Test 
	public void queSePuedaCrearUnaComision() {
		String nombreUni = "Unlam";
		Integer codComision = 0;
		String nuevaMateria = "Filosofia";
		Date fechaInscripcion = new Date (10/04/2023);
		Date fechaFinInscripcion = new Date(29/04/2023);
		Date fechaInicio = new Date (10/05/2023);
		Date fechaFinalizacion = new Date (10/11/2023);
		
		
		Universidad universidad = new Universidad (nombreUni);
		Materia materia = new Materia (1, nuevaMateria);
		CicloLectivo cicloLectivo = new CicloLectivo(15, fechaInscripcion, fechaFinInscripcion, fechaInicio, fechaFinalizacion, Cuatrimestre.primer_cuatrimestre);
		universidad.agregarMateria(materia);
		
		boolean registroExitoso = universidad.crearComision(codComision, materia, cicloLectivo);
		
		
		assertTrue(registroExitoso);
	}
	
}
