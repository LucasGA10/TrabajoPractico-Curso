package Trabajo.Curso;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class PruebaCicloLectivo {

	@Test
	public void crearUnCicloLectivo() {
		Date fechaInscripcion = new Date (10/04/2023);
		Date fechaFinInscripcion = new Date(29/04/2023);
		Date fechaInicio = new Date (10/05/2023);
		Date fechaFinalizacion = new Date (10/11/2023);
		Cuatrimestre cuatrimestre = Cuatrimestre.primer_cuatrimestre;
		
		CicloLectivo cicloLectivo = new CicloLectivo (fechaInscripcion, fechaFinInscripcion, fechaInicio, fechaFinalizacion, cuatrimestre);
		
		assertEquals(fechaInscripcion, cicloLectivo.getFechaIscripcion());
	}

}
