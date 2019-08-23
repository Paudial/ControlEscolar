package mx.com.controlEscolar.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CicloEscolar {

	@Id
	@Column( length=4, nullable= false)
	private String idCicloEscolar;
	
	@Column( length=9, nullable= false)
	private String cicloEscolar;
	
	@Column( nullable= false)
	private boolean actual;
	
	@OneToMany(mappedBy="cicloEscolar",cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Set<RegistroAcademico> registrosAcademicos;  
	
	/**
	 * default constructor
	 */
	public CicloEscolar() {
		this.registrosAcademicos = new HashSet<RegistroAcademico>();
	}

	public CicloEscolar(String idCicloEscolar, String cicloEscolar, boolean actual) {
		this.idCicloEscolar = idCicloEscolar;
		this.cicloEscolar = cicloEscolar;
		this.actual = actual;
		this.registrosAcademicos = new HashSet<RegistroAcademico>();
	}

	public String getIdCicloEscolar() {
		return idCicloEscolar;
	}

	public void setIdCicloEscolar(String idCicloEscolar) {
		this.idCicloEscolar = idCicloEscolar;
	}

	public String getCicloEscolar() {
		return cicloEscolar;
	}

	public void setCicloEscolar(String cicloEscolar) {
		this.cicloEscolar = cicloEscolar;
	}

	public boolean isActual() {
		return actual;
	}

	public void setActual(boolean actual) {
		this.actual = actual;
	}

	public Set<RegistroAcademico> getRegistrosAcademicos() {
		return registrosAcademicos;
	}

	public void setRegistrosAcademicos(Set<RegistroAcademico> registrosAcademicos) {
		this.registrosAcademicos = registrosAcademicos;
	}

	@Override
	public String toString() {
		return "CicloEscolar [idCicloEscolar=" + idCicloEscolar + ", cicloEscolar=" + cicloEscolar + ", actual="
				+ actual + "]";
	}
	
	
}
