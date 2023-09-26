package Trabajo.Curso;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class pruebaNota {

	@Test
	public void registrarNotaAUnAlumno() {
		Date fechaNacimiento = new Date (20/04/1889);
		Integer dni = 987654321;
		Integer codComision = 12023;
		String nuevaMateria = "Filosofia";
		Date fechaInscripcion = new Date (10/04/2023);
		Date fechaFinInscripcion = new Date(29/04/2023);
		Date fechaInicio = new Date (10/05/2023);
		Date fechaFinalizacion = new Date (10/11/2023);
		
		Universidad unlam = new Universidad("Unlam");
		Materia materia = new Materia (1, nuevaMateria);
		CicloLectivo cicloLectivo = new CicloLectivo(15, fechaInscripcion, fechaFinInscripcion, fechaInicio, fechaFinalizacion, Cuatrimestre.primer_cuatrimestre);
		Alumno alumno = new Alumno("Eva", "Fort", fechaNacimiento, dni, fechaInicio);
		unlam.agregarMateria(materia);
		unlam.crearComision(materia, cicloLectivo);
		unlam.agregarAlumno(alumno);
		unlam.inscribirAlumnoAComision (dni,codComision);
		
		
		Integer nota = 4;
		
		boolean registroExitoso = unlam.registrarNota (codComision, alumno.getDni(), nota);
		
		assertTrue(registroExitoso);
	}

}
