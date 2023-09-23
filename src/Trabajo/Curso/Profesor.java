package Trabajo.Curso;

import java.util.Date;

public class Profesor extends Usuario {

	private Integer id;

	public Profesor(Integer id, String nombre, String apellido, Date fechaNacimiento, Integer dni) {
		super(nombre, apellido, fechaNacimiento, dni);
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
