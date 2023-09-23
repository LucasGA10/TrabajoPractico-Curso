package Trabajo.Curso;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Universidad {

	private String nombre;
	private ArrayList <Materia> materias;
	private ArrayList <Profesor> profesores;
	private ArrayList <Comision> comisiones;//posiblemente sea diferente
	private ArrayList <CicloLectivo> ciclo;

	

	public Universidad(String nombre) {
		this.nombre = nombre;
		materias = new ArrayList<>();
		profesores = new ArrayList <>();
		comisiones = new ArrayList<>();
		ciclo = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean agregarMateria(Materia materia) {
		
		if (buscarMateria(materia.getId()) == null) {
			materias.add(materia);
			return true;
		}
		
		return false;
	}
	
	public boolean quitarMateria(Integer id) {
		return materias.remove(materias.get(buscarMateria(id)));
	}
	
	private Integer buscarMateria(Integer id) {
		Integer materiaBuscada = null;
		for (int i = 0; i < materias.size(); i++) {
			if (materias.get(i).getId().equals(id)) {
				materiaBuscada = i;
			}
		}
		return materiaBuscada;
	}
	
	public boolean agregarCorrelativa(Integer id, Integer id2) {
		if (buscarMateria(id)!= null && buscarMateria(id2)!= null) {
			materias.get(buscarMateria(id)).nuevaCorrelativa(materias.get(buscarMateria(id2)));
			return true;
		}
		return false;
	}
	
	public boolean quitarCorrelativa(Integer id, Integer id2) {
		if (buscarMateria(id)!= null && buscarMateria(id2)!= null) {
			materias.get(buscarMateria(id)).quitarCorrelativa(materias.get(buscarMateria(id2)));
			return true;
		}
		return false;
	}

	public boolean registrarProfesor(Profesor profesor) {
		if (buscarProfesor(profesor.getDni())== null) {
			profesores.add(profesor);
			return true;
		}
		return false; 
	}

	private Profesor buscarProfesor(Integer dni) {
		for (int i = 0; i < profesores.size(); i++) {
			if (profesores.get(i).getDni().equals(dni)) {
				return profesores.get(i);
			}
		}
		return null;
	}

	public boolean registrarNuevoAlumno(Alumno alumno) {//por terminar
		return true;
	}

	public boolean crearComision(Integer codComision, Materia materia, CicloLectivo cicloLectivo) {//por terminar
		Comision comision = new Comision(codComision, materia, cicloLectivo);
		comisiones.add(comision);
		return true;
	}

	public void agregarCicloLectivo(Integer id, Date fechaInscripcion, Date fechaFinInscripcion, Date fechaInicio,
			Date fechaFinalizacion, Cuatrimestre cuatrimestre) {
			CicloLectivo cicloLectivo = new CicloLectivo (id, fechaInscripcion, fechaFinInscripcion, fechaInicio, fechaFinalizacion, cuatrimestre);
			ciclo.add(cicloLectivo);
	}
	
	public CicloLectivo getCiclo(Integer numero) {
		return ciclo.get(numero);
	}

}
