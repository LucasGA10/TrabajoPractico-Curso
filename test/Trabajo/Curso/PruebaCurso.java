package Trabajo.Curso;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaCurso {

	@Test
	public void queSePuedaCrearUnCurso() {
		Integer codigoMateria = 0;
		Dia dia = Dia.Miercoles;
		Horario horario = Horario.mañana;
		
		Curso curso = new Curso(codigoMateria, dia, horario);
		
		assertNotNull(curso);
	}
	
	
	@Test
	public void queSePuedaCrearUnAula() {
		Integer codigoMateria = 0;
		Dia dia = Dia.Miercoles;
		Horario horario = Horario.mañana;
		
		Integer numeroAula = 120;
		Integer cantidadAulumnos = 80;
		
		
		Curso curso1 = new Curso(codigoMateria, dia, horario);
		Aula aula = new Aula(numeroAula, cantidadAulumnos);
		
		boolean seAsignoUnAula = curso1.agregarUnAula(aula);
		
		
		assertTrue(seAsignoUnAula);
	}
	
	@Test
	public void queNoSePuedaCrearUnAulaConUnMismoNumero() {
		Integer codigoMateria = 0;
		Dia dia = Dia.Miercoles;
		Horario horario = Horario.mañana;
		
		Integer numeroAula = 120;
		Integer cantidadAulumnos = 80;
		
		
		Curso curso1 = new Curso(codigoMateria, dia, horario);
		Aula aula1 = new Aula(numeroAula, cantidadAulumnos);
		Aula aula2 = new Aula(numeroAula, 100);
		
		curso1.agregarUnAula(aula1);
		boolean noSePudoAsignoUnAula = curso1.agregarUnAula(aula2);
		
		assertFalse(noSePudoAsignoUnAula);
	}

}
