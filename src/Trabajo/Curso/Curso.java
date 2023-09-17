package Trabajo.Curso;

import java.util.ArrayList;

public class Curso {

	private Integer codigoMateria;
	private Dia dia;
	private Horario horario;
	private ArrayList <Aula> aulas; 

	public Curso(Integer codigoMateria, Dia dia, Horario horario) {
		this.codigoMateria = codigoMateria;
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


	public Integer getCodigoMateria() {
		return codigoMateria;
	}

	public void setCodigoMateria(Integer codigoMateria) {
		this.codigoMateria = codigoMateria;
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
