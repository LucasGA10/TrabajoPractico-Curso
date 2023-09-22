package Trabajo.Curso;

import java.util.ArrayList;
import java.util.Iterator;

public class Universidad {

	private String nombre;
	private ArrayList <Materia> materias;
	private ArrayList <Profesor> profesores;
	private ArrayList <Comision> comisiones;//posiblemente sea diferente

	public Universidad(String nombre) {
		this.nombre = nombre;
		materias = new ArrayList<>();
		profesores = new ArrayList <>();
		comisiones = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean agregarMateria(Materia materia) {
		materias.add(materia);
		return true;
	}
	
	public boolean quitarMateria(Integer id) {
		return materias.remove(buscarMateria(id));
	}
	
	private Materia buscarMateria(Integer id) {
		Materia materiaBuscada = null;
		for (int i = 0; i < materias.size(); i++) {
			if (materias.get(i).getId() == id) {
				materiaBuscada = materias.get(i);
			}
		}
		return materiaBuscada;
	}

	public boolean registrarProfesor(Profesor profesor) {//por terminar
		profesores.add(profesor);
		return true;
	}

	public boolean registrarNuevoAlumno(Alumno alumno) {//por terminar
		// TODO Auto-generated method stub
		return true;
	}

	public boolean crearComision(Integer codComision, Materia materia, CicloLectivo cicloLectivo) {//por terminar
		Comision comision = new Comision(codComision, materia, cicloLectivo);
		comisiones.add(comision);
		return true;
	}

	

}
