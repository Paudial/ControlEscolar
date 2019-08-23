package mx.com.controlEscolar.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Grupo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idGrupo;
	
	@Column ( length=2)
	private String grupo;
	
	@ManyToOne
	@JoinColumn (name = "idGrado", referencedColumnName="idGrado")
	private Grado grado;
	
	@ManyToOne
	@JoinColumn (name = "idMaestro", referencedColumnName="idMaestro")
	private Maestro maestro;
	
	@OneToMany(mappedBy="grupo",cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Set<RegistroAcademico> registrosAcademicos ;
	
	/**
	 * default constructor
	 */
	public Grupo() {
		this.registrosAcademicos = new HashSet<RegistroAcademico>();
	}

	/**
	 * @param idGrupo
	 * @param grupo
	 * @param grado
	 * @param maestro
	 */
	public Grupo(int idGrupo, String grupo, Grado grado, Maestro maestro) {
		this.idGrupo = idGrupo;
		this.grupo = grupo;
		this.grado = grado;
		this.maestro = maestro;
		this.registrosAcademicos = new HashSet<RegistroAcademico>();
	}

	public int getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public Grado getGrado() {
		return grado;
	}

	public void setGrado(Grado grado) {
		this.grado = grado;
	}

	public Maestro getMaestro() {
		return maestro;
	}

	public void setMaestro(Maestro maestro) {
		this.maestro = maestro;
	}

	public Set<RegistroAcademico> getRegistrosAcademicos() {
		return registrosAcademicos;
	}

	public void setRegistrosAcademicos(Set<RegistroAcademico> registrosAcademicos) {
		this.registrosAcademicos = registrosAcademicos;
	}

	@Override
	public String toString() {
		return "Grupo [idGrupo=" + idGrupo + ", grupo=" + grupo + ", grado=" + grado + ", maestro=" + maestro + "]";
	}

	

	}
