package Trabajo.Curso;

public class Nota {
	
	private static Integer nextId = 0;
	private Integer id;
	private Integer Nota;
	Condicion condicion;
	
	public Nota(Integer nota) {
		Nota = nota;
		asignarCondicion(nota);
		setId(nextId);
		nextId++;
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
		return Nota;
	}


	public void setNota(Integer nota) {
		Nota = nota;
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
