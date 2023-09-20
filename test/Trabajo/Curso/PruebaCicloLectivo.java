package Trabajo.Curso;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class PruebaCicloLectivo {

	@Test
	public void test() {
		
		Date fechaInicio = new Date (10/05/2023);
		Date fechaFinalizacion = new Date (10/11/2023);
		Date fechaIscripcion = new Date (10/04/2023);
		
		CicloLectivo cicloLectivo = new CicloLectivo (fechaIscripcion, fechaInicio, fechaFinalizacion);
		
	}

}
