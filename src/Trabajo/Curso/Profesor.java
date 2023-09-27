package Trabajo.Curso;

import java.util.Date;

public class Profesor extends Usuario {

	private static Integer next_id = 0;
	private Integer id;

	public Profesor(String nombre, String apellido, Date fechaNacimiento, Integer dni) {
		super(nombre, apellido, fechaNacimiento, dni);
		this.id = next_id;
		Profesor.next_id++;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
