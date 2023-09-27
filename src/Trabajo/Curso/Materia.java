package Trabajo.Curso;

import java.util.ArrayList;

public class Materia {

	private Integer id;
	private String nombre;
	private ArrayList <Materia> idCorrelativas;
	
	public Materia(Integer id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		this.idCorrelativas = new ArrayList<>();
	}
	
	
	public boolean poseeCorrelativa() {
		if (idCorrelativas != null) {
			return true;
		}
		return false;
	}
	
	public Integer idCorrelativas(Integer posicion) {
		return idCorrelativas.get(posicion).getId();
	}

	public void nuevaCorrelativa(Materia idCorrelativa) {
		idCorrelativas.add(idCorrelativa);
	}
	
	public void quitarCorrelativa(Materia correlativa) {
		idCorrelativas.remove(correlativa);
	}
	
	public Integer cantidadCorrelativas() {
		return idCorrelativas.size();
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
