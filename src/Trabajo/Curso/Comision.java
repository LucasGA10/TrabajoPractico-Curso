package Trabajo.Curso;

public class Comision {

	private static Integer nextCodigo = 1000;
	private Integer codigo;
	private Materia materia;
	private CicloLectivo cicloLectivo;

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

}
