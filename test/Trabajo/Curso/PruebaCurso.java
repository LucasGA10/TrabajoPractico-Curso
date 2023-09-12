package Trabajo.Curso;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaCurso {

	@Test
	public void queSepuedaCrearUnCurso() {
		Integer codigoMateria = 0;
		Dia dia = Dia.Miercoles;
		Horario horario = Horario.mañana; 
		CicloLectivo cicloLectivo = CicloLectivo.primer_cuatrimestre; 
		
		Curso curso = new Curso(codigoMateria, cicloLectivo, dia, horario);
		
		assertNotNull(curso);
		
		
	}

}
