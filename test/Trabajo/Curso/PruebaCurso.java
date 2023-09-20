package Trabajo.Curso;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class PruebaCurso {

	@Test
	public void queSePuedaCrearUnCurso() {
		Dia dia = Dia.Miercoles;
		Horario horario = Horario.mañana;
		Materia materia = new Materia(1, "Matematica");
		Integer id = 0;
		
		Curso curso = new Curso(id, materia, dia, horario);
		
		assertNotNull(curso);
	}
	
	
	@Test
	public void queSePuedaCrearUnAula() {
		Dia dia = Dia.Miercoles;
		Horario horario = Horario.mañana;
		Materia materia = new Materia(1, "Matematica");
		
		Integer numeroAula = 120;
		Integer cantidadAulumnos = 80;
		
		
		Curso curso1 = new Curso(materia, dia, horario);
		Aula aula = new Aula(numeroAula, cantidadAulumnos);
		
		boolean seAsignoUnAula = curso1.agregarUnAula(aula);
		
		
		assertTrue(seAsignoUnAula);
	}
	
	@Test
	public void queNoSePuedaCrearUnAulaConUnMismoNumero() {
		Dia dia = Dia.Miercoles;
		Horario horario = Horario.mañana;
		Materia materia = new Materia(1, "Matematica");
		
		Integer numeroAula = 120;
		Integer cantidadAulumnos = 80;
		
		
		Curso curso1 = new Curso(materia, dia, horario);
		Aula aula1 = new Aula(numeroAula, cantidadAulumnos);
		Aula aula2 = new Aula(numeroAula, 100);
		
		curso1.agregarUnAula(aula1);
		boolean noSePudoAsignoUnAula = curso1.agregarUnAula(aula2);
		
		assertFalse(noSePudoAsignoUnAula);
	}
	
	
	@Test
	public void queSePuedaAgregarUnaMateria() {
		Integer idMateria = 2;
		String nombreMateria = "Matematicas";
		
		
		Materia materia1 = new Materia(idMateria, nombreMateria);
		
		
		assertEquals(idMateria, materia1.getId());
	}
	
	@Test
	public void agregarUnPersona() {
		String nombre = "nicolas";
		String apellido = "manauta";
		Integer dni = 123456789;
		Date fechaNacimiento = new Date (26/03/2003);
		
		Usuario persona = new Usuario (nombre, apellido, fechaNacimiento, dni);
		
		assertEquals(dni, persona.getDni());
	}
	
	@Test
	public void agregarUnAlumno() {
		String nombre = "nicolas";
		String apellido = "manauta";
		Integer dni = 123456789;
		Date fechaIngreso = new Date (31/10/2019);
		Date fechaNacimiento = new Date (26/03/2003);
		
		Alumno alumno = new Alumno (nombre, apellido, fechaNacimiento, dni, fechaIngreso);
		
		
		assertEquals(fechaIngreso, alumno.getFechaIngreso());
	}
	
	
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
		Curso curso1 = new Curso(materia, Dia.Miercoles, Horario.mañana);
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
		Curso curso1 = new Curso(materia, Dia.Miercoles, Horario.mañana);
		curso1.agregarUnAlumno(alumno);
		boolean noSeCargo = curso1.agregarUnAlumno(alumno);
		
		
		assertFalse(noSeCargo);
	}

}
