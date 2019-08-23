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
public class Grado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idGrado;
	
	@Column( length=50, nullable= false)
	private String grado;
	
	@OneToMany(mappedBy="grado",cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Set<Materia> materias;
	
	@OneToMany(mappedBy="grado",cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Set<Grupo> grupos;
	
	
	/**
	 * default constructor
	 */
	public Grado() {
		this.materias =  new HashSet<Materia>();
		this.grupos = new HashSet<Grupo>();
	}
	
	/**
	 * @param idGrado
	 * @param grado
	 */
	public Grado(int idGrado, String grado) {
		this.idGrado = idGrado;
		this.grado = grado;
		this.materias =  new HashSet<Materia>();
		this.grupos = new HashSet<Grupo>();
	}

	public int getIdGrado() {
		return idGrado;
	}
	public void setIdGrado(int idGrado) {
		this.idGrado = idGrado;
	}
	public String getGrado() {
		return grado;
	}
	public void setGrado(String grado) {
		this.grado = grado;
	}

	public Set<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(Set<Materia> materias) {
		this.materias = materias;
	}

	public Set<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(Set<Grupo> grupos) {
		this.grupos = grupos;
	}

	@Override
	public String toString() {
		return "Grado [idGrado=" + idGrado + ", grado=" + grado + "]";
	}
	
	
	
}
