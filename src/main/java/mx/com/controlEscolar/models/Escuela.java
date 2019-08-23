package mx.com.controlEscolar.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Escuela {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEscuela;
	
	@Column( length=50, nullable= false)
	private String clave;
	
	@Column( length=50, nullable= false)
	private String nombre;
	
	@Column( length=150, nullable= false)
	private String direccion;
	
	@Column( length=10, nullable= false)
	private String telefono;
	
	@Column( length=150, nullable= false)
	private String email;
	
	/**
	 * default constructor
	 */
	public Escuela() {
		
	}

	public Escuela(int idEscuela, String clave, String nombre, String direccion, String telefono, String email) {
		this.idEscuela = idEscuela;
		this.clave = clave;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}

	public int getIdEscuela() {
		return idEscuela;
	}

	public void setIdEscuela(int idEscuela) {
		this.idEscuela = idEscuela;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Escuela [idEscuela=" + idEscuela + ", clave=" + clave + ", nombre=" + nombre + ", direccion="
				+ direccion + ", telefono=" + telefono + ", email=" + email + "]";
	}
	
	
	
}
