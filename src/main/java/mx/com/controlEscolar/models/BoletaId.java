package mx.com.controlEscolar.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BoletaId implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Column
	private int idAlumno;
	@Column
	private int idMateria;
	
	/**
	 * default constructor
	 */
	public BoletaId() {
	}

	public BoletaId(int idAlumno, int idMateria) {
		this.idAlumno = idAlumno;
		this.idMateria = idMateria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idAlumno;
		result = prime * result + idMateria;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BoletaId other = (BoletaId) obj;
		if (idAlumno != other.idAlumno)
			return false;
		if (idMateria != other.idMateria)
			return false;
		return true;
	}
	
	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public int getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}

	@Override
	public String toString() {
		return "BoletaId [idAlumno=" + idAlumno + ", idMateria=" + idMateria + "]";
	}

		
}
