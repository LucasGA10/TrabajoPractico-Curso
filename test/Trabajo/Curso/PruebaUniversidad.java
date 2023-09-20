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
		
		boolean registroExitoso = universidad.registrarMateria(materia);
		
	}
	
	@Test 
	public void queSePuedaRegistrarOtraProfesor () {
		
		Integer id = 0;
		String nombre = "Aldolf";
		String apellido = "Hittler";
		Date fechaNacimiento = new Date (20/04/1889);
		Integer dni = 987654321;
		Profesor profesor = new Profesor (id, nombre, apellido, fechaNacimiento, dni);
		
		String nombreUni = "Unlam";
		Universidad universidad = new Universidad (nombreUni);
		
		boolean registroDeProfesor = universidad.registrarProfesor(profesor);
		
		assertTrue(registroDeProfesor);
	}
	
	
}
