package Trabajo.Curso;

public class Aula {

	private Integer numeroAula;
	private Integer cantidadAlumnos;

	public Aula(Integer numeroAula, Integer cantidadAulumnos) {
		this.numeroAula = numeroAula;
		this.cantidadAlumnos = cantidadAulumnos;
	}
	

	public Integer getNumeroAula() {
		return numeroAula;
	}

	public void setNumeroAula(Integer numeroAula) {
		this.numeroAula = numeroAula;
	}

	public Integer getCantidadAlumnos() {
		return cantidadAlumnos;
	}

	public void setCantidadAlumnos(Integer cantidadAlumnos) {
		this.cantidadAlumnos = cantidadAlumnos;
	}
	

}
