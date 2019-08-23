package mx.com.controlEscolar.dao;

import java.io.Serializable;
import java.util.List;

import mx.com.controlEscolar.models.Maestro;

public interface MaestroDAO<T> {
	
	public List<Maestro> selectAll(Class entityClass);
	
	public T selectById(Serializable id, Class entityClass);
	
	public void insert(T entity);
	
	public void update(T entity);
	
	public void delete(T entity);
	
	public List<Maestro> selectByNombre(String nombre);
	
	public List<Maestro> selectPaginated(Integer number, boolean isAscending);
}
