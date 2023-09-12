package Trabajo.Curso;

public class Curso {

	private Integer codigoMateria;
	private CicloLectivo cicloLectivo;
	private Dia dia;
	private Horario horario;

	public Curso(Integer codigoMateria, CicloLectivo cicloLectivo, Dia dia, Horario horario) {
		this.codigoMateria = codigoMateria;
		this.cicloLectivo = cicloLectivo;
		this.dia = dia;
		this.horario = horario;
	}
	
	
	public Integer getCodigoMateria() {
		return codigoMateria;
	}

	public void setCodigoMateria(Integer codigoMateria) {
		this.codigoMateria = codigoMateria;
	}

	public CicloLectivo getCicloLectivo() {
		return cicloLectivo;
	}

	public void setCicloLectivo(CicloLectivo cicloLectivo) {
		this.cicloLectivo = cicloLectivo;
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
