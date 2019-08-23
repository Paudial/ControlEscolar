package mx.com.controlEscolar.dao;

import java.io.Serializable;
import java.util.List;

import mx.com.controlEscolar.models.Alumno;

public interface AlumnoDAO<T> {
	
	public List<Alumno> selectAll(Class entityClass);
	
	public T selectById(Serializable id, Class entityClass);

	public void insert(T entity);
	
	public void update(T entity);
	
	public void delete(T entity);
	
	public List<Alumno> selectByNombre(String nombre);
}
