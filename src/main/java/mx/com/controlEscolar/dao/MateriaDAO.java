package mx.com.controlEscolar.dao;

import java.io.Serializable;
import java.util.List;

import mx.com.controlEscolar.models.Materia;

public interface MateriaDAO<T> {

	public List<Materia> selectAll(Class entityClass);
	
	public T selectById(Serializable id, Class entityClass);

	public void insert(T entity);
	
	public void update(T entity);
	
	public void delete(T entity);
	
	public List<Materia> selectByNombre(String nombre);
}
