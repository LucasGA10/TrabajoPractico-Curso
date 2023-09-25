package Trabajo.Curso;

import java.util.ArrayList;

public class Comision {

	private Integer codigo;
	private Materia materia;
	private CicloLectivo cicloLectivo;
	private ArrayList <Profesor> profesores;
	private ArrayList <Alumno> alumnos;

	public Comision(Integer codigo, Materia materia, CicloLectivo cicloLectivo) {
		this.codigo = codigo;
		this.materia = materia;
		this.cicloLectivo = cicloLectivo;
		this.profesores = new ArrayList<>();
	}
	
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public CicloLectivo getCicloLectivo() {
		return cicloLectivo;
	}

	public void setCicloLectivo(CicloLectivo cicloLectivo) {
		this.cicloLectivo = cicloLectivo;
	}

}
