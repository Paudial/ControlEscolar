package mx.com.controlEscolar.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Maestro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMaestro;
	
	@Column( length=50, nullable= false)
	private String nombre;
	
	@Column( length=50, nullable= false)
	private String aPaterno;
	
	@Column( length=50, nullable= false)
	private String aMaterno;
	
	@Column( length=10, nullable= false)
	private String sexo;
	
	@Column( length=150, nullable= false)
	private String direccion;
	
	@Column( length=10, nullable= false)
	private String telefono;
	
	@Column( length=150, nullable= false)
	private String email;
	
	@Column( length=50, nullable= false)
	private String cedula;
	
	@OneToMany(mappedBy="maestro",cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Set<Grupo> grupo ;
	
	
	/**
	 * default constructor
	 */
	public Maestro() {
		this.grupo = new HashSet<Grupo>();
	}
	
	public Maestro(int idMaestro, String nombre, String aPaterno, String aMaterno, String sexo, String direccion,
			String telefono, String email, String cedula) {
		this.idMaestro = idMaestro;
		this.nombre = nombre;
		this.aPaterno = aPaterno;
		this.aMaterno = aMaterno;
		this.sexo = sexo;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.cedula = cedula;
		this.grupo = new HashSet<Grupo>();
	}

	public Maestro(int idMaestro, String nombre, String aPaterno, String aMaterno) {
		this.idMaestro = idMaestro;
		this.nombre = nombre;
		this.aPaterno = aPaterno;
		this.aMaterno = aMaterno;
	}
	
	public int getIdMaestro() {
		return idMaestro;
	}
	public void setIdMaestro(int idMaestro) {
		this.idMaestro = idMaestro;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getaPaterno() {
		return aPaterno;
	}
	public void setaPaterno(String aPaterno) {
		this.aPaterno = aPaterno;
	}
	public String getaMaterno() {
		return aMaterno;
	}
	public void setaMaterno(String aMaterno) {
		this.aMaterno = aMaterno;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
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
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public Set<Grupo> getGrupo() {
		return grupo;
	}

	public void setGrupo(Set<Grupo> grupo) {
		this.grupo = grupo;
	}

	@Override
	public String toString() {
		return "Maestro [idMaestro=" + idMaestro + ", nombre=" + nombre + ", aPaterno=" + aPaterno + ", aMaterno="
				+ aMaterno + "]";
	}
	
	
}
