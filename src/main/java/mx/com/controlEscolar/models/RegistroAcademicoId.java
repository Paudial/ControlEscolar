package mx.com.controlEscolar.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class RegistroAcademicoId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column( length=4)
	private String idCicloEscolar;
	@Column
	private int idAlumno;
	
	/**
	 * default constructor
	 */
	public RegistroAcademicoId() {
	}

	/**
	 * @param idCicloEscolar
	 * @param idAlumno
	 */
	public RegistroAcademicoId(String idCicloEscolar, int idAlumno) {
		this.idCicloEscolar = idCicloEscolar;
		this.idAlumno = idAlumno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idAlumno;
		result = prime * result + ((idCicloEscolar == null) ? 0 : idCicloEscolar.hashCode());
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
		RegistroAcademicoId other = (RegistroAcademicoId) obj;
		if (idAlumno != other.idAlumno)
			return false;
		if (idCicloEscolar == null) {
			if (other.idCicloEscolar != null)
				return false;
		} else if (!idCicloEscolar.equals(other.idCicloEscolar))
			return false;
		return true;
	}

	public String getIdCicloEscolar() {
		return idCicloEscolar;
	}

	public void setIdCicloEscolar(String idCicloEscolar) {
		this.idCicloEscolar = idCicloEscolar;
	}

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	@Override
	public String toString() {
		return "RegistroAcademicoId [idCicloEscolar=" + idCicloEscolar + ", idAlumno=" + idAlumno + "]";
	}
	
	
	
}
