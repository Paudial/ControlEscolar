package mx.com.controlEscolar.implement;

import java.util.List;

import org.hibernate.Query;
import org.springframework.transaction.annotation.Transactional;

import mx.com.controlEscolar.dao.AlumnoDAO;
import mx.com.controlEscolar.dao.GenericDAO;
import mx.com.controlEscolar.models.Alumno;

public class AlumnoImplement extends GenericDAO implements AlumnoDAO{

	@Transactional (readOnly = true)
	public List<Alumno> selectByNombre(String nombre){
		
		List<Alumno> alumnos = null;
		
		Query query =getSession().createQuery(
				"from Alumno a where a.nombre");
		query.setParameter("nombre", "%" + nombre + "%");
		alumnos = query.list();
		
		return alumnos;
	}
	

}
