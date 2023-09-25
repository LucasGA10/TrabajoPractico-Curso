package Trabajo.Curso;

public class comisionAlumno {
	
	public static Integer next_id = 0;
	private  Integer id;
	private Integer dniAlumno;
	private Integer idComision;
	private Integer idNota;
	
	public comisionAlumno(Integer dniAlumno, Integer idComision) {
		this.dniAlumno = dniAlumno;
		this.idComision = idComision;
		this.id = next_id;
	}

	public Integer getIdNota() {
		return idNota;
	}

	public void setIdNota(Integer idNota) {
		this.idNota = idNota;
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

}
