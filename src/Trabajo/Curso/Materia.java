package Trabajo.Curso;

import java.util.ArrayList;

public class Materia {

	private Integer id;
	private String nombre;
	private ArrayList <Materia> correlativas;
	
	public Materia(Integer id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		this.correlativas = new ArrayList<>();
	}
	
	
	public boolean poseeCorrelativa() {
		if (correlativas != null) {
			return true;
		}
		return false;
	}
	
	public ArrayList <Materia> getCorrelativas() {
		return correlativas;
	}


	public void nuevaCorrelativa(Materia correlativa) {
		correlativas.add(correlativa);
	}
	
	public void quitarCorrelativa(Materia correlativa) {
		correlativas.remove(correlativa);
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
