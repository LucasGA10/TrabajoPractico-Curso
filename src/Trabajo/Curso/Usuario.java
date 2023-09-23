package Trabajo.Curso;

import java.util.Date;

public abstract class Usuario{

	private String nombre;
	private String apellido;
	private Integer dni;
	private Date fechaNacimiento;

	

	public Usuario(String nombre, String apellido, Date fechaNacimiento, Integer dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getNacimiento() {
		return fechaNacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		this.fechaNacimiento = nacimiento;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

}
