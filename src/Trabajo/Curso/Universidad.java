package Trabajo.Curso;

import java.util.ArrayList;

public class Universidad {

	private String nombre;
	private ArrayList <Profesor> profesores;

	public Universidad(String nombre) {
		this.nombre = nombre;
		profesores = new ArrayList <>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean registrarMateria(Materia materia) {
		return false;
	}

	public boolean registrarProfesor(Profesor profesor) {
		profesores.add(profesor);
		return true;
	}

}
