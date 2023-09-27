package Trabajo.Curso;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Universidad {

	private String nombre;
	private ArrayList <Materia> materias;
	private ArrayList <Profesor> profesores;
	private ArrayList <Alumno> alumnos;
	private ArrayList <Comision> comisiones;
	private ArrayList <CicloLectivo> ciclo;
	private ArrayList <comisionProfesor> comisionProfe;
	private ArrayList <comisionAlumno> comisionAlum;
	private ArrayList<Nota> nota;
	

	public Universidad(String nombre) {
		this.nombre = nombre;
		materias = new ArrayList<>();
		profesores = new ArrayList <>();
		comisiones = new ArrayList<>();
		ciclo = new ArrayList<>();
		alumnos = new ArrayList<>();
		comisionProfe = new ArrayList<>();
		comisionAlum = new ArrayList<>();
		nota = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//materia-------------------------------------------------------------------------

	public boolean agregarMateria(Materia materia) {
		
		if (buscarIdMateria(materia.getId()) == null) {
			materias.add(materia);
			return true;
		}
		
		return false;
	}
	
	public boolean quitarMateria(Integer id) {
		return materias.remove(materias.get(buscarIdMateria(id)));
	}
	
	private Materia buscarMateria(Integer id) {
		Materia materiaBuscada = null;
		for (int i = 0; i < materias.size(); i++) {
			if (materias.get(i).getId().equals(id)) {
				materiaBuscada = materias.get(i);
			}
		}
		return materiaBuscada;
	}
	
	private Integer buscarIdMateria(Integer id) {
		Integer materiaBuscada = null;
		for (int i = 0; i < materias.size(); i++) {
			if (materias.get(i).getId().equals(id)) {
				materiaBuscada = i;
			}
		}
		return materiaBuscada;
	}
	
	public boolean agregarCorrelativa(Integer id, Integer id2) {
		if (buscarIdMateria(id)!= null && buscarIdMateria(id2)!= null) {
			materias.get(buscarIdMateria(id)).nuevaCorrelativa(buscarMateria(id2));
			return true;
		}
		return false;
	}
	
	public boolean quitarCorrelativa(Integer id, Integer id2) {
		if (buscarMateria(id)!= null && buscarMateria(id2)!= null) {
			materias.get(buscarIdMateria(id)).quitarCorrelativa(buscarMateria(id2));
			return true;
		}
		return false;
	}
	
	//Profesor y alumno-------------------------------------------------------------------------------

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
	
	//Comision----------------------------------------------------------------------------

	public boolean crearComision(Materia materia, CicloLectivo cicloLectivo) {//por terminar
		Comision comision = new Comision(materia, cicloLectivo);
		if (comisiones.contains(comision)) {
			return false;
		}
		comisiones.add(comision);
		return true;
	}
	

	public void asignarAulaComision(Integer codComision, Aula aula) {
		if (buscarComision(codComision) != null) {
			buscarComision(codComision).setAula(aula);
		}
		
	}
	
	public boolean asignarDocentesAComision(Integer codComision, Integer dni) {
		if(buscarComision(codComision) != null) {
			if (buscarComision(codComision).getCantidadMaxProfesores() >= buscarComision(codComision).getCantidadprofesores()) {
				if (buscarProfesor(dni) != null) {
					comisionProfesor comision = new comisionProfesor(dni, codComision);
					comisionProfe.add(comision);
					return true;
				}
			}
		}
		return false;
	}

	public Comision buscarComision(Integer codComision) {//hice esto public
		for (int i = 0; i < comisiones.size(); i++) {
			if (comisiones.get(i).getCodigo().equals(codComision)) {
				return comisiones.get(i);
			}
		}
		return null;
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
	
	private comisionAlumno buscarComisionAlumno(Integer codComision, Integer dni) {
		for (int i = 0; i < comisionAlum.size(); i++) {
			if(comisionAlum.get(i).getIdComision().equals(codComision) && comisionAlum.get(i).getDniAlumno().equals(dni)) {
				return comisionAlum.get(i);
			}
		}
		return null;
	}
	
	//nota--------------------------------------------------------------------------------------------

	public boolean registrarNota1erParcial(Integer codComision, Integer dni, Integer nota) {
		if (buscarComisionAlumno(codComision, dni) != null && nota >= 1 && nota <= 10) {
			if (buscarComision(codComision).getMateria().poseeCorrelativa() == false) {
				buscarComisionAlumno(codComision, dni).setIdNotaPrimerParcial(asignarNota(nota).getId());
				return true;
			}else {
				for (int i = 0; i < comisiones.size(); i++) {
					Integer aux = buscarNotaCorrelativa(buscarComision(codComision).getMateria().idCorrelativas(i), dni);
					if (aux < 4) {
						return false;
					}
				}
			}
		}
		return false;
	}

	private Integer buscarNotaCorrelativa(Integer idCorrelativas, Integer dni) {
		for (int i = 0; i < comisiones.size(); i++) {
			if (buscarIdMateria(idCorrelativas) != null) {
				buscarComisionAlumno(buscarIdMateria(idCorrelativas), dni).getIdNotaFinal();
			}
			
		}
		return null;
	}

	public boolean registrarNota2doParcial(Integer codComision, Integer dni, Integer nota) {
		if(buscarComisionAlumno(codComision, dni) != null && nota >= 1 && nota <= 10) {
			if (buscarComisionAlumno(codComision, dni).getIdNotaPrimerParcial() != null) {
				buscarComisionAlumno(codComision, dni).setIdNotaSegundoParcial(asignarNota(nota).getId());
				return true;
			}
		}
		return false;
	}
	
	public boolean registrarNotaRecuperatorio1erParcial(Integer codComision, Integer dni, Integer nota) {
		if(buscarComisionAlumno(codComision, dni)!= null && buscarComisionAlumno(codComision, dni).getIdNotaPrimerParcial() <= 3) {
			if(buscarComisionAlumno(codComision, dni).getIdNotaPrimerParcial() != null) {
				buscarComisionAlumno(codComision, dni).setIdNotaRecuperatorio1erParcial(asignarNota(nota).getId());
				return true;
			}
		}
		return false;
	}
	
	public boolean registrarNotaRecuperatorio2doParcial(Integer codComision, Integer dni, Integer nota) {
		if(buscarComisionAlumno(codComision, dni)!= null && buscarComisionAlumno(codComision, dni).getIdNotaPrimerParcial() <= 3) {
			if(buscarComisionAlumno(codComision, dni).getIdNotaPrimerParcial() != null) {
				buscarComisionAlumno(codComision, dni).setIdNotaRecuperatorio2doParcial(asignarNota(nota).getId());
				return true;
			}
		}
		return false;
	}

	private Nota asignarNota(Integer nuevaNota) {
		for (int i = 0; i < nota.size(); i++) {
			if (nota.get(i).getNota().equals(nuevaNota)) {
				return nota.get(i);
			}
		}
		Nota agregarNota = new Nota(nuevaNota);
		nota.add(agregarNota);
		return agregarNota;
	}
	
	
}
