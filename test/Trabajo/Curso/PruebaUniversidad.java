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
		
		Integer id = 1;
		Integer id2 = 2;
		Integer id3 = 3;
		String nombre = "Rodolfo";
		String apellido = "Mitre";
		Date fechaNacimiento = new Date (20/04/1889);
		Integer dni = 987654321;
		String nombreUni = "Unlam";
		
		Profesor profesor = new Profesor (nombre, apellido, fechaNacimiento, dni);
		Profesor profesor2 = new Profesor ("Riki", "Ruiz", fechaNacimiento, 1122334455);
		Profesor profesor3 = new Profesor ("Tomas", "Ruiz", fechaNacimiento, 1223445667);
		
		Universidad universidad = new Universidad (nombreUni);
		
		universidad.agregarProfesor(profesor);
		boolean registroDeProfesor = universidad.agregarProfesor(profesor2);
		
		assertTrue(registroDeProfesor);
		assertEquals(id, profesor.getId());
		assertEquals(id2, profesor2.getId());
		assertEquals(id3, profesor3.getId());
	}
	
	@Test 
	public void queNoSePuedaRegistrarUnProfesorConMismoDni() {
		
		String nombre = "Rodolfo";
		String apellido = "Mitre";
		Date fechaNacimiento = new Date (20/04/1889);
		Integer dni = 987654321;
		Profesor profesor = new Profesor (nombre, apellido, fechaNacimiento, dni);
		
		String nombreUni = "Unlam";
		Universidad universidad = new Universidad (nombreUni);
		
		universidad.agregarProfesor(profesor);
		boolean registroFallido = universidad.agregarProfesor(profesor);
		
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
		
		boolean registroExitoso = universidad.agregarAlumno(alumno);
		
		assertTrue(registroExitoso);
	}
	
	@Test 
	public void queSePuedaCrearUnaComision() {
		String nombreUni = "Unlam";
		String nuevaMateria = "Filosofia";
		Date fechaInscripcion = new Date (10/04/2023);
		Date fechaFinInscripcion = new Date(29/04/2023);
		Date fechaInicio = new Date (10/05/2023);
		Date fechaFinalizacion = new Date (10/11/2023);
		
		
		Universidad universidad = new Universidad (nombreUni);
		Materia materia = new Materia (1, nuevaMateria);
		CicloLectivo cicloLectivo = new CicloLectivo(15, fechaInscripcion, fechaFinInscripcion, fechaInicio, fechaFinalizacion, Cuatrimestre.primer_cuatrimestre);
		universidad.agregarMateria(materia);
		
		boolean registroExitoso = universidad.crearComision(materia, cicloLectivo);
		
		
		assertTrue(registroExitoso);
	}
	
}
