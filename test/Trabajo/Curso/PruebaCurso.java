package Trabajo.Curso;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaCurso {

	@Test
	public void queSePuedaCrearUnCurso() {
		Dia dia = Dia.Miercoles;
		Horario horario = Horario.mañana;
		Materia materia = new Materia(1, "Matematica");
		
		Curso curso = new Curso(materia, dia, horario);
		
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

}
