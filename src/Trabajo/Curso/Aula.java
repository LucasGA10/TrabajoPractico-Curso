package Trabajo.Curso;

public class Aula {

	private Integer numeroAula;
	private Integer cantidadMaxAlumnos;

	public Aula(Integer numeroAula, Integer cantidadMaxAlumnos) {
		this.numeroAula = numeroAula;
		this.cantidadMaxAlumnos = cantidadMaxAlumnos;
	}
	

	public Integer getNumeroAula() {
		return numeroAula;
	}

	public void setNumeroAula(Integer numeroAula) {
		this.numeroAula = numeroAula;
	}

	public Integer getCantidadMaxAlumnos() {
		return cantidadMaxAlumnos;
	}

	public void setCantidadMaxAlumnos(Integer cantidadAlumnos) {
		this.cantidadMaxAlumnos = cantidadAlumnos;
	}

}
