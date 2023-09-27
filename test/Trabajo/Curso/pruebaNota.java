package Trabajo.Curso;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class pruebaNota {

	@Test
	public void registrarNota1erParcialAUnAlumno() {
		Date fechaNacimiento = new Date (20/04/1889);
		Integer dni = 987654321;
		Integer codComision = 1001;
		Dia dia = Dia.Miercoles;
		Turno turno = Turno.tarde;
		String nuevaMateria = "Filosofia";
		Date fechaInscripcion = new Date (10/04/2023);
		Date fechaFinInscripcion = new Date(29/04/2023);
		Date fechaInicio = new Date (10/05/2023);
		Date fechaFinalizacion = new Date (10/11/2023);
		Universidad unlam = new Universidad("Unlam");
		Materia materia = new Materia (1, nuevaMateria);
		CicloLectivo cicloLectivo = new CicloLectivo(15, fechaInscripcion, fechaFinInscripcion, fechaInicio, fechaFinalizacion, Cuatrimestre.primer_cuatrimestre);
		Alumno alumno = new Alumno("Eva", "Fort", fechaNacimiento, dni, fechaInicio);
		Integer nota = 4;
		
		unlam.agregarMateria(materia);
		unlam.crearComision(codComision, materia, cicloLectivo, dia, turno);
		unlam.agregarAlumno(alumno);
		unlam.inscribirAlumnoAComision (dni,codComision);
		boolean registroExitoso = unlam.registrarNota1erParcial (codComision, alumno.getDni(), nota);
		
		assertTrue(registroExitoso);
	}
	
	@Test
	public void registrarNota2doParcialAUnAlumno() {
		Date fechaNacimiento = new Date (20/04/1889);
		Integer dni = 987654321;
		Integer codComision = 1002;
		Dia dia = Dia.Miercoles;
		Turno turno = Turno.tarde;
		String nuevaMateria = "Matematica";
		Date fechaInscripcion = new Date (10/04/2023);
		Date fechaFinInscripcion = new Date(29/04/2023);
		Date fechaInicio = new Date (10/05/2023);
		Date fechaFinalizacion = new Date (10/11/2023);
		Universidad unlam = new Universidad("Unlam");
		Materia materia = new Materia (1, nuevaMateria);
		CicloLectivo cicloLectivo = new CicloLectivo(15, fechaInscripcion, fechaFinInscripcion, fechaInicio, fechaFinalizacion, Cuatrimestre.primer_cuatrimestre);
		Alumno alumno = new Alumno("Eva", "Fort", fechaNacimiento, dni, fechaInicio);
		Integer nota = 4;
		Integer nota2 = 7;
		
		unlam.agregarMateria(materia);
		unlam.agregarCorrelativa(2, 1);
		unlam.crearComision(codComision, materia, cicloLectivo, dia, turno);
		unlam.agregarAlumno(alumno);
		unlam.inscribirAlumnoAComision (dni,codComision);
		
		
		boolean registroExitoso = unlam.registrarNota1erParcial (codComision, alumno.getDni(), nota);
		boolean registroExitoso2 = unlam.registrarNota2doParcial (codComision, alumno.getDni(), nota2);
		
		assertTrue(registroExitoso);
		assertTrue(registroExitoso2);
	}
	
	@Test
	public void registrarNotaRecuperatorio2doParcialAUnAlumno() {
		Date fechaNacimiento = new Date (20/04/1889);
		Integer dni = 987654321;
		Integer codComision = 1003;
		Dia dia = Dia.Miercoles;
		Turno turno = Turno.tarde;
		String nuevaMateria = "Informatica";
		Date fechaInscripcion = new Date (10/04/2023);
		Date fechaFinInscripcion = new Date(29/04/2023);
		Date fechaInicio = new Date (10/05/2023);
		Date fechaFinalizacion = new Date (10/11/2023);
		Universidad unlam = new Universidad("Unlam");
		Materia materia = new Materia (1, nuevaMateria);
		CicloLectivo cicloLectivo = new CicloLectivo(15, fechaInscripcion, fechaFinInscripcion, fechaInicio, fechaFinalizacion, Cuatrimestre.primer_cuatrimestre);
		Alumno alumno = new Alumno("Eva", "Fort", fechaNacimiento, dni, fechaInicio);
		Integer nota = 6;
		Integer nota2 = 2;
		Integer notaRecuperatorio = 7;
		
		unlam.agregarMateria(materia);
		unlam.agregarCorrelativa(2, 1);
		unlam.crearComision(codComision, materia, cicloLectivo, dia, turno);
		unlam.agregarAlumno(alumno);
		unlam.inscribirAlumnoAComision (dni,codComision);
		
		
		boolean registroExitoso = unlam.registrarNota1erParcial (codComision, alumno.getDni(), nota);
		boolean registroExitoso2 = unlam.registrarNota2doParcial (codComision, alumno.getDni(), nota2);
		unlam.registrarNotaRecuperatorio2doParcial (codComision, alumno.getDni(), notaRecuperatorio);
		
		assertTrue(registroExitoso);
		assertTrue(registroExitoso2);
		assertEquals(unlam.verNota(unlam.buscarComisionAlumno(codComision, dni).getIdNotaRecuperatorio()), notaRecuperatorio);
		assertEquals(unlam.verNota(unlam.buscarComisionAlumno(codComision, dni).getIdNotaSegundoParcial()), notaRecuperatorio);
	}
	
	@Test
	public void registrarNotaFinalAUnAlumno() {
		Date fechaNacimiento = new Date (20/04/1889);
		Integer dni = 987654321;
		Integer codComision = 1000;
		Dia dia = Dia.Miercoles;
		Turno turno = Turno.tarde;
		String nuevaMateria = "Matematica";
		Date fechaInscripcion = new Date (10/04/2023);
		Date fechaFinInscripcion = new Date(29/04/2023);
		Date fechaInicio = new Date (10/05/2023);
		Date fechaFinalizacion = new Date (10/11/2023);
		Universidad unlam = new Universidad("Unlam");
		Materia materia = new Materia (1, nuevaMateria);
		CicloLectivo cicloLectivo = new CicloLectivo(15, fechaInscripcion, fechaFinInscripcion, fechaInicio, fechaFinalizacion, Cuatrimestre.primer_cuatrimestre);
		Alumno alumno = new Alumno("Eva", "Fort", fechaNacimiento, dni, fechaInicio);
		Integer nota = 7;
		Integer nota2 = 8;
		Integer notaFinal = 8;
		
		unlam.agregarMateria(materia);
		unlam.agregarCorrelativa(2, 1);
		unlam.crearComision(codComision, materia, cicloLectivo, dia, turno);
		unlam.agregarAlumno(alumno);
		unlam.inscribirAlumnoAComision (dni,codComision);
		
		
		unlam.registrarNota1erParcial (codComision, alumno.getDni(), nota);
		unlam.registrarNota2doParcial (codComision, alumno.getDni(), nota2);
		boolean registroExitoso = unlam.registrarNotaFinal (codComision, alumno.getDni(), notaFinal);
				
		assertTrue(registroExitoso);
		assertEquals(unlam.verNota(unlam.buscarComisionAlumno(codComision, dni).getIdNotaFinal()), notaFinal);
	}
	
	@Test
	public void registrarNota1erParcialAUnAlumnoEnUnaMateriaConCorrelativa() {
		Date fechaNacimiento = new Date (20/04/1889);
		Integer dni = 987654321;
		Integer codComision = 1004;
		Integer codComision2 = 1000;
		Dia dia = Dia.Miercoles;
		Turno turno = Turno.tarde;
		Dia dia2 = Dia.Viernes;
		Turno turno2 = Turno.noche;
		String nuevaMateria = "Matematica";
		String nuevaMateria2 = "Matematica2";
		Date fechaInscripcion = new Date (10/04/2023);
		Date fechaFinInscripcion = new Date(29/04/2023);
		Date fechaInicio = new Date (10/05/2023);
		Date fechaFinalizacion = new Date (10/11/2023);
		Universidad unlam = new Universidad("Unlam");
		Materia materia = new Materia (1, nuevaMateria);
		Materia materia2 = new Materia(2, nuevaMateria2);
		CicloLectivo cicloLectivo = new CicloLectivo(15, fechaInscripcion, fechaFinInscripcion, fechaInicio, fechaFinalizacion, Cuatrimestre.primer_cuatrimestre);
		Alumno alumno = new Alumno("Eva", "Fort", fechaNacimiento, dni, fechaInicio);
		Integer nota = 7;
		Integer nota2 = 7;
		Integer notaFinal = 7;
		Integer notaCor = 5;
		
		unlam.agregarMateria(materia);
		unlam.agregarMateria(materia2);
		unlam.agregarCorrelativa(2, 1);
		unlam.crearComision(codComision, materia, cicloLectivo, dia, turno);
		unlam.crearComision(codComision2, materia2, cicloLectivo, dia2, turno2);
		unlam.agregarAlumno(alumno);
		unlam.inscribirAlumnoAComision (dni,codComision);
		
		unlam.registrarNota1erParcial (codComision, alumno.getDni(), nota);
		unlam.registrarNota2doParcial (codComision, alumno.getDni(), nota2);
		unlam.registrarNotaFinal (codComision, alumno.getDni(), notaFinal);
		
		boolean registroExitoso = unlam.registrarNota1erParcial (codComision2, alumno.getDni(), notaCor);
		
		assertTrue(registroExitoso);
	}

}
