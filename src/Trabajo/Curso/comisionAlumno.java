package Trabajo.Curso;

public class comisionAlumno {
	
	public static Integer next_id = 0;
	private  Integer id;
	private Integer dniAlumno;
	private Integer idComision;
	private Integer idNotaPrimerParcial;
	private Integer idNotaSegundoParcial;
	private Integer idNotaRecuperatorio;
	private Integer idNotaFinal;
	
	
	public comisionAlumno(Integer dniAlumno, Integer idComision) {
		this.dniAlumno = dniAlumno;
		this.idComision = idComision;
		this.id = next_id;
		next_id++;
	}

	public Integer getDniAlumno() {
		return dniAlumno;
	}

	public void setDniAlumno(Integer dniAlumno) {
		this.dniAlumno = dniAlumno;
	}

	public Integer getIdComision() {
		return idComision;
	}

	public void setIdComision(Integer idComision) {
		this.idComision = idComision;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdNotaPrimerParcial() {
		return idNotaPrimerParcial;
	}

	public void setIdNotaPrimerParcial(Integer idNotaPrimerParcial) {
		this.idNotaPrimerParcial = idNotaPrimerParcial;
	}

	public Integer getIdNotaSegundoParcial() {
		return idNotaSegundoParcial;
	}

	public void setIdNotaSegundoParcial(Integer idNotaSegundoParcial) {
		this.idNotaSegundoParcial = idNotaSegundoParcial;
	}

	public Integer getIdNotaRecuperatorio() {
		return idNotaRecuperatorio;
	}

	public void setIdNotaRecuperatorio1erParcial(Integer idNotaRecuperatorio) {
		this.idNotaRecuperatorio = idNotaRecuperatorio;
		this.idNotaPrimerParcial = idNotaRecuperatorio;
	}
	
	public void setIdNotaRecuperatorio2doParcial(Integer idNotaRecuperatorio) {
		this.idNotaRecuperatorio = idNotaRecuperatorio;
		this.idNotaSegundoParcial = idNotaRecuperatorio;
	}

	public Integer getIdNotaFinal() {
		return idNotaFinal;
	}

	public void setIdNotaFinal(Integer idNotaFinal) {
		this.idNotaFinal = idNotaFinal;
	}

}
