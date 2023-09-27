package Trabajo.Curso;

public class Comision {

	private static Integer nextCodigo = 1000;
	private Integer codigo;
	private Materia materia;
	private CicloLectivo cicloLectivo;
	private Aula aula;// hay que hacer que se pueda elegir en un menu las aulas disponibles desde la universidad
	private Integer cantidadAlumnos;
	private Integer cantidadprofesores;
	private Integer cantidadMaxProfesores;
	

	public Comision(Materia materia, CicloLectivo cicloLectivo) {
		this.materia = materia;
		this.cicloLectivo = cicloLectivo;
		this.codigo = nextCodigo;
		nextCodigo++;
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
	
	public Integer getCantidadAlumnos() {
		return cantidadAlumnos;
	}

	public void setCantidadAlumnos(Integer cantidadAlumnos) {
		this.cantidadAlumnos = cantidadAlumnos;
		this.cantidadMaxProfesores = (int) Math.ceil(getCantidadAlumnos() / 20.0);
	}

	public Integer getCantidadMaxProfesores() {
		return cantidadMaxProfesores;
	}


	public void setCantidadMaxProfesores(Integer cantidadMaxProfesores) {
		this.cantidadMaxProfesores = cantidadMaxProfesores;
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

	public Integer getCantidadprofesores() {
		return cantidadprofesores;
	}

	public void setCantidadprofesores(Integer cantidadprofesores) {
		this.cantidadprofesores = cantidadprofesores;
	}

}
