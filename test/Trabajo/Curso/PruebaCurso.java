package Trabajo.Curso;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaCurso {

	@Test
	public void queSepuedaCrearUnCurso() {
		
		Integer codigoMateria = 0;
		Dia dia = Dia.Miercoles;
		Horario horario = Horario.mañana;
		
		Curso curso = new Curso(codigoMateria, dia, horario);
		
		assertNotNull(curso);
	}
	
	

}
