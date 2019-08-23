package mx.com.controlEscolar.implement;

import java.util.List;

import org.hibernate.Query;
import org.springframework.transaction.annotation.Transactional;

import mx.com.controlEscolar.dao.GenericDAO;
import mx.com.controlEscolar.dao.MateriaDAO;
import mx.com.controlEscolar.models.Materia;

public class MateriaImplement extends GenericDAO implements MateriaDAO{

	@Transactional (readOnly = true)
	public List<Materia> selectByNombre(String nombre){
		
		List<Materia> materias = null;
		
		Query query =getSession().createQuery(
				"from Materia m where m.nombre");
		query.setParameter("nombre", "%" + nombre + "%");
		materias = query.list();
		
		return materias;
	}
}
