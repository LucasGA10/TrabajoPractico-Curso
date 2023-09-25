package Trabajo.Curso;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class pruebaComision {

	@Test
	public void agregarUnDocenteALaComision() {
		Date fechaNacimiento = new Date (20/04/1889);
		Integer dni = 987654321;
		Integer codComision = 12023;
		String nuevaMateria = "Filosofia";
		Date fechaInscripcion = new Date (10/04/2023);
		Date fechaFinInscripcion = new Date(29/04/2023);
		Date fechaInicio = new Date (10/05/2023);
		Date fechaFinalizacion = new Date (10/11/2023);
		
		Universidad unlam = new Universidad("Unlam");
		Profesor profesor = new Profesor(1, "Mati", "as", fechaNacimiento, dni);
		Materia materia = new Materia (1, nuevaMateria);
		CicloLectivo cicloLectivo = new CicloLectivo(15, fechaInscripcion, fechaFinInscripcion, fechaInicio, fechaFinalizacion, Cuatrimestre.primer_cuatrimestre);
		unlam.agregarMateria(materia);
		unlam.agregarProfesor(profesor );
		unlam.crearComision(codComision, materia, cicloLectivo);
		
		boolean asignacionExitosa = unlam.asignarDocentesAComision(codComision, profesor.getDni());
		
		assertTrue(asignacionExitosa);
	}

}
