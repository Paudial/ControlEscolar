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
public class Alumno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAlumno;
	
	@Column( length=10, nullable= false)
	private String noControl;
	
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
	
	@OneToMany(mappedBy="alumno",cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Set<RegistroAcademico> registrosAcademicos; 
	
	@OneToMany(mappedBy="alumno",cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Set<Boleta> boletas;  
	
	/**
	 * default constructor
	 */
	public Alumno() {
		this.registrosAcademicos = new HashSet<RegistroAcademico>();
		this.boletas = new HashSet<Boleta>();
	}
	
	public Alumno(int idAlumno, String noControl, String nombre, String aPaterno, String aMaterno, String sexo,
			String direccion, String telefono, String email) {
		this.idAlumno = idAlumno;
		this.noControl = noControl;
		this.nombre = nombre;
		this.aPaterno = aPaterno;
		this.aMaterno = aMaterno;
		this.sexo = sexo;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.registrosAcademicos = new HashSet<RegistroAcademico>();
		this.boletas = new HashSet<Boleta>();
	}

	public int getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}
	public String getNoControl() {
		return noControl;
	}
	public void setNoControl(String noControl) {
		this.noControl = noControl;
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
	
	public Set<RegistroAcademico> getRegistrosAcademicos() {
		return registrosAcademicos;
	}

	public void setRegistrosAcademicos(Set<RegistroAcademico> registrosAcademicos) {
		this.registrosAcademicos = registrosAcademicos;
	}
	
	public Set<Boleta> getBoletas() {
		return boletas;
	}

	public void setBoletas(Set<Boleta> boletas) {
		this.boletas = boletas;
	}

	@Override
	public String toString() {
		return "Alumno [idAlumno=" + idAlumno + ", noControl=" + noControl + ", nombre=" + nombre + ", aPaterno="
				+ aPaterno + ", aMaterno=" + aMaterno + ", sexo=" + sexo + ", direccion=" + direccion + ", telefono="
				+ telefono + ", email=" + email + "]";
	}
	
	
}
