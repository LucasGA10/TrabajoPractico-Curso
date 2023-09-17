package Trabajo.Curso;

import java.util.ArrayList;

public class Curso {

	private Materia materia;
	private Dia dia;
	private Horario horario;
	private ArrayList <Aula> aulas; 

	public Curso(Materia materia, Dia dia, Horario horario) {
		this.materia = materia;
		this.dia = dia;
		this.horario = horario;
		aulas = new ArrayList <>();
	}
	
	
	public boolean agregarUnAula(Aula aula) {
		if(buscarAula(aula.getNumeroAula()) == null) {
			aulas.add(aula);
			return true;
		}
		return false;
	}
	
	private Object buscarAula(Integer numeroAula) {
		Aula aulabuscada = null;
		for (int i = 0; i < aulas.size(); i++) {
			if(aulas.get(i).getNumeroAula() == numeroAula) {
				aulabuscada = aulas.get(i);
			}
		}
		return aulabuscada;
	}


	public Materia getCodigoMateria() {
		return materia;
	}

	public void setCodigoMateria(Materia materia) {
		this.materia = materia;
	}

	public Dia getDia() {
		return dia;
	}

	public void setDia(Dia dia) {
		this.dia = dia;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}
	
	
}
