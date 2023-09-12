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
	public void queSePuedaAsignarUnAulaAUnCurso() {
		Integer codigoMateria = 0;
		Dia dia = Dia.Miercoles;
		Horario horario = Horario.mañana;
		
		Integer numeroAula = 120;
		Integer cantidadMaxAulumnos = 80;
		
		
		Curso curso1 = new Curso(codigoMateria, dia, horario);
		Aula aula = new Aula(numeroAula, cantidadMaxAulumnos);
		
		boolean seAsignoUnAula = curso1.asignarUnAula(aula);
		
		
		assertTrue(seAsignoUnAula);
	}
	

}
