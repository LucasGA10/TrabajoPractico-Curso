package Trabajo.Curso;

import static org.junit.Assert.*;

import org.junit.Test;

public class pruebaMateria {

	@Test
	public void queSePuedaAgregarUnaCorrelativaAUnaMateria() {
		String nombreUni = "Unlam";
		
		Integer id = 1;
		String nombreMate = "pb2";
		Integer id2 = 2;
		String nombreCorr = "pb1";
		
		
		Universidad unlam = new Universidad(nombreUni);
		Materia materiaNueva = new Materia(id, nombreMate);
		Materia materiaCorrelativa = new Materia(id2, nombreCorr);
		unlam.agregarMateria(materiaCorrelativa);
		unlam.agregarMateria(materiaNueva);
		
		boolean adicionExitosa = unlam.agregarCorrelativa(id, id2);
		
		assertTrue(adicionExitosa);
	}
	
	@Test
	public void queSePuedaQuitarUnaCorrelativaAUnaMateria() {
		String nombreUni = "Unlam";
		
		Integer id = 1;
		String nombreMate = "pb2";
		Integer id2 = 2;
		String nombreCorr = "pb1";
		
		
		Universidad unlam = new Universidad(nombreUni);
		Materia materiaNueva = new Materia(id, nombreMate);
		Materia materiaCorrelativa = new Materia(id2, nombreCorr);
		unlam.agregarMateria(materiaCorrelativa);
		unlam.agregarMateria(materiaNueva);
		
		boolean correlativaRemovida = unlam.quitarCorrelativa(id, id2);
		
		assertTrue(correlativaRemovida);
	}

}
