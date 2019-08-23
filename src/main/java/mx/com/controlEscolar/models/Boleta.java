package mx.com.controlEscolar.models;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class Boleta {

	@EmbeddedId
	private BoletaId id;
	@Column( nullable= false)
	private int calificacion;
	
	@ManyToOne
	@MapsId("idAlumno")
	@JoinColumn (name = "idAlumno", referencedColumnName="idAlumno")
	private Alumno alumno;
	
	@ManyToOne
	@MapsId("idMateria")
	@JoinColumn (name = "idMateria", referencedColumnName="idMateria")
	private Materia materia;

	/**
	 * default constructor
	 */
	public Boleta() {
	}

	public Boleta(BoletaId id, int calificacion) {
		this.id = id;
		this.calificacion = calificacion;
	}

	public BoletaId getId() {
		return id;
	}

	public void setId(BoletaId id) {
		this.id = id;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "Boleta [id=" + id + ", calificacion=" + calificacion + ", alumno=" + alumno + ", materia=" + materia
				+ "]";
	}
	

}
