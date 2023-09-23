package Trabajo.Curso;

import java.util.Date;

public class CicloLectivo {

	private Date fechaIscripcion;
	private Date fechaFinInscripcion;
	private Date fechaInicio;
	private Date fechaFinalizacion;
	private Cuatrimestre cuatrimestre;
	
	public CicloLectivo(Date fechaIscripcion, Date fechaFinInscripcion, Date fechaInicio, Date fechaFinalizacion, Cuatrimestre cuatrimestre) {
		this.fechaIscripcion = fechaIscripcion;
		this.fechaFinInscripcion = fechaFinInscripcion;
		this.fechaInicio = fechaInicio;
		this.fechaFinalizacion = fechaFinalizacion;
		this.cuatrimestre = cuatrimestre;
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

	public Cuatrimestre getCuatrimestre() {
		return cuatrimestre;
	}

	public void setCuatrimestre(Cuatrimestre cuatrimestre) {
		this.cuatrimestre = cuatrimestre;
	}

}
