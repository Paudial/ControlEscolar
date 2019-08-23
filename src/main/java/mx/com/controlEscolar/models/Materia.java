package mx.com.controlEscolar.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Materia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMateria;
	
	@Column( length=100, nullable= false)
	private String nombre;
	
	@Column( length=10, nullable= false)
	private String clave;
	
	@ManyToOne
	@JoinColumn (name = "idGrado", referencedColumnName="idGrado")
	private Grado grado;
	
	
	/**
	 * default constructor
	 */
	public Materia() {
	}


	/**
	 * @param idMateria
	 * @param nombre
	 * @param clave
	 * @param grado
	 */
	public Materia(int idMateria, String nombre, String clave, Grado grado) {
		this.idMateria = idMateria;
		this.nombre = nombre;
		this.clave = clave;
		this.grado = grado;
	}


	public int getIdMateria() {
		return idMateria;
	}


	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}


	public Grado getGrado() {
		return grado;
	}


	public void setGrado(Grado grado) {
		this.grado = grado;
	}


	@Override
	public String toString() {
		return "Materia [idMateria=" + idMateria + ", nombre=" + nombre + ", clave=" + clave + ", grado=" + grado + "]";
	}

	
	
	
}
