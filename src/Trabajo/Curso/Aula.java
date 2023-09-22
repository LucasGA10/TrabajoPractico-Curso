package Trabajo.Curso;

public class Aula {

	private Integer numeroAula;
	private Integer cantidadAlumnos;
	private Integer cantidadProfesores;

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
	
	public Integer getCantidadProfesores() {
		return cantidadProfesores;
	}
	
	public void setCantidadProfesores(Integer cantidadProfesores) {
		this.cantidadProfesores = cantidadProfesores;
	}

}
