package Trabajo.Curso;

public class comisionProfesor {
	
	public static Integer next_id = 0;
	private  Integer id;
	private Integer dniProfesor;
	private Integer idComision;
	
	public comisionProfesor(Integer idProfesor, Integer idComision) {
		this.dniProfesor = idProfesor;
		this.idComision = idComision;
		this.id = next_id;
		comisionProfesor.next_id++;
	}

	public Integer getDniProfesor() {
		return dniProfesor;
	}

	public void setDniProfesor(Integer idProfesor) {
		this.dniProfesor = idProfesor;
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

}
