package Trabajo.Curso;

import java.util.Date;

public class CicloLectivo {

	private Date fechaIscripcion;
	private Date fechaFinInscripcion;
	private Date fechaInicio;
	private Date fechaFinalizacion;
	
	public CicloLectivo(Date fechaIscripcion, Date fechaFinInscripcion, Date fechaInicio, Date fechaFinalizacion) {
		this.fechaIscripcion = fechaIscripcion;
		this.fechaFinInscripcion = fechaFinInscripcion;
		this.fechaInicio = fechaInicio;
		this.fechaFinalizacion = fechaFinalizacion;
		
	}
	
	public Date getFechaIscripcion() {
		return fechaIscripcion;
	}

	public void setFechaIscripcion(Date fechaIscripcion) {
		this.fechaIscripcion = fechaIscripcion;
	}
	
	public Date getFechaFinInscripcion() {
		return fechaFinInscripcion;
	}

	public void setFechaFinInscripcion(Date fechaFinInscripcion) {
		this.fechaFinInscripcion = fechaFinInscripcion;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFinalizacion() {
		return fechaFinalizacion;
	}

	public void setFechaFinalizacion(Date fechaFinalizacion) {
		this.fechaFinalizacion = fechaFinalizacion;
	}

}
