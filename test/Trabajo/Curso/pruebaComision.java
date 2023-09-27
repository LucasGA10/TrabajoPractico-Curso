package Trabajo.Curso;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class pruebaComision {
	
	@Test
	public void asignarAulaALaComision() {
		Integer codComision = 1001;
		Dia dia = Dia.Miercoles;
		Turno turno = Turno.mañana;
		String nuevaMateria = "Pb1";
		Date fechaInscripcion = new Date (10/04/2023);
		Date fechaFinInscripcion = new Date(29/04/2023);
		Date fechaInicio = new Date (10/05/2023);
		Date fechaFinalizacion = new Date (10/11/2023);
		Aula aula = new Aula(123, 90);
		
		Universidad unlam = new Universidad("Unlam");
		Materia materia = new Materia (1, nuevaMateria);
		CicloLectivo cicloLectivo = new CicloLectivo(15, fechaInscripcion, fechaFinInscripcion, fechaInicio, fechaFinalizacion, Cuatrimestre.primer_cuatrimestre);
		unlam.agregarMateria(materia);
		unlam.crearComision(codComision, materia, cicloLectivo, dia, turno);
		
		boolean asignacionExitosa = unlam.asignarAulaComision(codComision, aula);
		
		assertTrue(asignacionExitosa);
	}
	
	@Test
	public void inscribirUnAlumnoAComision() {
		Date fechaNacimiento = new Date (20/04/1889);
		Integer dni = 987654321;
		Integer codComision = 1000;
		Dia dia = Dia.Lunes;
		Turno turno = Turno.noche;
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
		unlam.crearComision(codComision, materia, cicloLectivo, dia, turno);
		unlam.agregarAlumno(alumno);
		
		boolean cargaExitosa = unlam.inscribirAlumnoAComision (dni,codComision);
		
		
		assertTrue(cargaExitosa);
		assertEquals(codComision, unlam.buscarComision(codComision).getCodigo());
	}

	@Test
	public void agregarUnDocenteALaComision() {
		Date fechaNacimiento = new Date (20/04/1889);
		Integer dni = 987654321;
		Integer codComision = 1002;
		Dia dia = Dia.Jueves;
		Turno turno = Turno.noche;
		String nuevaMateria = "Informatica";
		Date fechaInscripcion = new Date (10/04/2023);
		Date fechaFinInscripcion = new Date(29/04/2023);
		Date fechaInicio = new Date (10/05/2023);
		Date fechaFinalizacion = new Date (10/11/2023);
		Integer cantidadAlumnos = 70;
		
		Universidad unlam = new Universidad("Unlam");
		Profesor profesor = new Profesor("Mati", "as", fechaNacimiento, dni);
		Materia materia = new Materia (1, nuevaMateria);
		CicloLectivo cicloLectivo = new CicloLectivo(15, fechaInscripcion, fechaFinInscripcion, fechaInicio, fechaFinalizacion, Cuatrimestre.primer_cuatrimestre);
		Aula aula = new Aula(123, 90);
		unlam.agregarMateria(materia);
		unlam.agregarProfesor(profesor);
		unlam.crearComision(codComision, materia, cicloLectivo, dia, turno);
		unlam.asignarAulaComision(codComision, aula);
		unlam.asignarCantidadAlumnos(codComision, cantidadAlumnos);
		boolean asignacionExitosa = unlam.asignarProfesorAComision(codComision, profesor.getDni());
		
		assertTrue(asignacionExitosa);
		assertEquals(codComision, unlam.buscarComision(codComision).getCodigo());
	}
	
	@Test
	public void agregarUnDocenteALaComisionProfesor() {
		Date fechaNacimiento = new Date (20/04/1889);
		Integer dni = 987654321;
		Integer codComision = 1003;
		Dia dia = Dia.Lunes;
		Turno turno = Turno.mañana;
		String nuevaMateria = "Pb2";
		Date fechaInscripcion = new Date (10/04/2023);
		Date fechaFinInscripcion = new Date(29/04/2023);
		Date fechaInicio = new Date (10/05/2023);
		Date fechaFinalizacion = new Date (10/11/2023);
		
		Universidad unlam = new Universidad("Unlam");
		Profesor profesor = new Profesor("Mati", "as", fechaNacimiento, dni);
		Materia materia = new Materia (1, nuevaMateria);
		CicloLectivo cicloLectivo = new CicloLectivo(15, fechaInscripcion, fechaFinInscripcion, fechaInicio, fechaFinalizacion, Cuatrimestre.primer_cuatrimestre);
		unlam.agregarMateria(materia);
		unlam.agregarProfesor(profesor);
		unlam.crearComision(codComision, materia, cicloLectivo, dia, turno);
		
		unlam.asignarProfesorAComision(codComision, profesor.getDni());
		 
		boolean pruebaExitosa = unlam.mostrarProfesorDeLaComision(codComision);
		
		assertTrue(pruebaExitosa);
		assertEquals(codComision, unlam.buscarComision(codComision).getCodigo());
	}

}
