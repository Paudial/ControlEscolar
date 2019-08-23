package mx.com.controlEscolar.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class RegistroAcademico {

	@EmbeddedId
	private RegistroAcademicoId id;

	@Temporal (TemporalType.TIMESTAMP)
	private Date fechaRegistro;
	
	@ManyToOne
	@MapsId("idCicloEscolar")
	@JoinColumn (name = "idCicloEscolar", referencedColumnName="idCicloEscolar")
	private CicloEscolar cicloEscolar;
	
	@ManyToOne
	@MapsId("idAlumno")
	@JoinColumn (name = "idAlumno", referencedColumnName="idAlumno")
	private Alumno alumno;
	
	@ManyToOne
	@JoinColumn (name = "idGrupo", referencedColumnName="idGrupo")
	private Grupo grupo;
	
	
	/**
	 * default constructor
	 */
	public RegistroAcademico() {
	}

	/**
	 * @param id
	 * @param idGrupo
	 * @param fechaRegistro
	 * @param grupo
	 */
	public RegistroAcademico(RegistroAcademicoId id, Date fechaRegistro, Grupo grupo) {
		this.id = id;
		this.fechaRegistro = fechaRegistro;
		this.grupo = grupo;
	}

	public RegistroAcademicoId getId() {
		return id;
	}

	public void setId(RegistroAcademicoId id) {
		this.id = id;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public CicloEscolar getCicloEscolar() {
		return cicloEscolar;
	}

	public void setCicloEscolar(CicloEscolar cicloEscolar) {
		this.cicloEscolar = cicloEscolar;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	@Override
	public String toString() {
		return "RegistroAcademico [id=" + id + ", fechaRegistro=" + fechaRegistro + ", cicloEscolar=" + cicloEscolar
				+ ", alumno=" + alumno + ", grupo=" + grupo + "]";
	}

	
	
}
