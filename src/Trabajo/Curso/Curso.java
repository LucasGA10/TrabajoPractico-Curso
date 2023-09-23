package Trabajo.Curso;

import java.util.ArrayList;

public class Curso {

	private Integer id;
	private Comision comision;
	private Dia dia;
	private Turno turno;
	private Aula aula;// hay que hacer que se pueda elegir en un menu las aulas disponibles desde la universidad
	//private Profesor profesores;
	//private ArrayList <Alumno> alumnos;

	public Curso(Integer id, Comision comision, Dia dia, Turno turno) {
		this.id = id;
		this.comision = comision;
		this.dia = dia;
		this.turno = turno;
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Comision getComision() {
		return comision;
	}

	public void setComision(Comision comision) {
		this.comision = comision;
	}

	public Dia getDia() {
		return dia;
	}

	public void setDia(Dia dia) {
		this.dia = dia;
	}

	public Turno getTurno() {
		return turno;
	}

	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

	
	
}
