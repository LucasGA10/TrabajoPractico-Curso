package Trabajo.Curso;

public class Nota {
	
	private Integer id;
	private Integer nota;
	Condicion condicion;
	
	public Nota(Integer nota) {
		this.nota = nota;
		asignarCondicion(nota);
		this.id = nota;
	}
	
	public Condicion asignarCondicion(Integer nota) {
		if(nota >= 1 && nota <= 10) {
			if (nota >= 7) {
				return Condicion.promocion;
			}
			else {
				if (nota >= 4) {
					return Condicion.aprobado;
				}
			}
		}
		return Condicion.desaprobado;
	}

	public Integer getNota() {
		return nota;
	}


	public void setNota(Integer nota) {
		this.nota = nota;
	}


	public Condicion getCondicion() {
		return condicion;
	}


	public void setCondicion(Condicion condicion) {
		this.condicion = condicion;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
