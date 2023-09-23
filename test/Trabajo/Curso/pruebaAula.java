package Trabajo.Curso;

import static org.junit.Assert.*;

import org.junit.Test;

public class pruebaAula {


	@Test
	public void queSePuedaHacerUnAula() {
		Integer numeroAula = 120;
		Integer cantidadAulumnos = 45;
		Integer cantidadProfesores = 3;
		
		Aula aula = new Aula(numeroAula, cantidadAulumnos);
		
		assertNotNull(aula);
		assertEquals(cantidadProfesores, aula.getCantidadProfesores());
	}
	
	/*
	@Test
	public void queNoSePuedaCrearUnAulaConUnMismoNumero() {
		Dia dia = Dia.Miercoles;
		Turno horario = Turno.mañana;
		Materia materia = new Materia(1, "Matematica");
		
		Integer numeroAula = 120;
		Integer cantidadAulumnos = 80;
		
		
		Curso curso1 = new Curso(materia, dia, horario);
		Aula aula1 = new Aula(numeroAula, cantidadAulumnos);
		Aula aula2 = new Aula(numeroAula, 100);
		
		curso1.agregarUnAula(aula1);
		boolean noSePudoAsignoUnAula = curso1.agregarUnAula(aula2);
		
		assertFalse(noSePudoAsignoUnAula);
	}*/

}
