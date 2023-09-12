package Trabajo.Curso;

public class Curso {

	private Integer codigoMateria;
	private Dia dia;
	private Horario horario;

	public Curso(Integer codigoMateria, Dia dia, Horario horario) {
		this.codigoMateria = codigoMateria;
		this.dia = dia;
		this.horario = horario;
	}
	
	
	public boolean asignarUnAula(Aula aula) {
		// TODO Auto-generated method stub
		return true;
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
