package Trabajo.Curso;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Universidad {

	private String nombre;
	private ArrayList <Materia> materias;
	private ArrayList <Profesor> profesores;
	private ArrayList <Alumno> alumnos;
	private ArrayList <Comision> comisiones;//posiblemente sea diferente
	private ArrayList <CicloLectivo> ciclo;
	private ArrayList <comisionProfesor> comisionProfe;
	private ArrayList <comisionAlumno> comisionAlum;
	

	public Universidad(String nombre) {
		this.nombre = nombre;
		materias = new ArrayList<>();
		profesores = new ArrayList <>();
		comisiones = new ArrayList<>();
		ciclo = new ArrayList<>();
		alumnos = new ArrayList<>();
		comisionProfe = new ArrayList<>();
		comisionAlum = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//materia-------------------------------------------------------------------------

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
	
	//Profesor-------------------------------------------------------------------------------

	public boolean agregarProfesor(Profesor profesor) {
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

	public boolean agregarAlumno(Alumno alumno) {
		if(buscarAlumno(alumno.getDni()) == null) {
			alumnos.add(alumno);
			return true;
		}
		return false;
	}
	

	private Alumno buscarAlumno(Integer dni) {
		for (int i = 0; i < alumnos.size(); i++) {
			if(alumnos.get(i).getDni().equals(dni)) {
				return alumnos.get(i);
			}
		}
		return null;
	}
	
	//Comision----------------------------------------------------------------------------

	public boolean crearComision(Integer codComision, Materia materia, CicloLectivo cicloLectivo) {//por terminar
		Comision comision = new Comision(codComision, materia, cicloLectivo);
		comisiones.add(comision);
		return true;
	}
	
	public boolean asignarDocentesAComision(Integer codComision, Integer dni) {//esto talvez valla en un posible "comisionProfe"
		if(buscarComision(codComision) != null) {
			if (buscarProfesor(dni) != null) {
				comisionProfesor comision = new comisionProfesor(dni, codComision);
				comisionProfe.add(comision);
				return true;
			}
		}
		return false;
	}

	private Comision buscarComision(Integer codComision) {
		for (int i = 0; i < comisiones.size(); i++) {
			if (comisiones.get(i).getCodigo().equals(codComision)) {
				return comisiones.get(i);
			}
		}
		return null;
	}
	
	//cicloLectivo---------------------------------------------------------------------------------------

	public void agregarCicloLectivo(Integer id, Date fechaInscripcion, Date fechaFinInscripcion, Date fechaInicio,
			Date fechaFinalizacion, Cuatrimestre cuatrimestre) {
			CicloLectivo cicloLectivo = new CicloLectivo (id, fechaInscripcion, fechaFinInscripcion, fechaInicio, fechaFinalizacion, cuatrimestre);
			ciclo.add(cicloLectivo);
	}
	
	public CicloLectivo getCiclo(Integer numero) {
		return ciclo.get(numero);
	}

	public boolean mostrarProfesorDeLaComision(Integer idComision) {
		if (buscarComisionProfesor(idComision) != null) {
			if (buscarProfesor(buscarComisionProfesor(idComision).getDniProfesor()) != null) {
			return true;	
			}	
		}
		return false;
	}

	private comisionProfesor buscarComisionProfesor(Integer idComision) {
		for (int i = 0; i < comisionProfe.size(); i++) {
			if (comisionProfe.get(i).getIdComision().equals(idComision)) {
				return comisionProfe.get(i);
			}
		}
		return null;
	}

	public boolean inscribirAlumnoAComision(Integer dni, Integer codComision) {
		if(buscarComision(codComision) != null) {
			if (buscarAlumno(dni) != null) {
				comisionAlumno comision = new comisionAlumno(dni, codComision);
				comisionAlum.add(comision);
				return true;
			}
		}
		return false;
	}

	public void registrarNota(Integer codComision, Integer dni, Integer nota) {
		if(nota >= 1 && nota <= 10) {
			if(buscarComision(codComision) != null && buscarAlumno(dni) != null) {
				if (buscarComision(codComision).getMateria().poseeCorrelativa() == true) {
					
				}
				else {
					if (nota <= 3) {
						
					}
					
				}
			}
		}
		
	}

}
