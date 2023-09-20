package Trabajo.Curso;

import java.util.Date;

public class Alumno extends Usuario{

	private Date fechaIngreso;

	public Alumno(String nombre, String apellido, Date nacimiento, Integer dni, Date fechaIngreso) {
		super(nombre, apellido, nacimiento, dni);
		this.fechaIngreso = fechaIngreso;
		
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

}
