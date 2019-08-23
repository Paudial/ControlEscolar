package mx.com.controlEscolar.implement;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.springframework.transaction.annotation.Transactional;

import mx.com.controlEscolar.dao.GenericDAO;
import mx.com.controlEscolar.dao.MaestroDAO;
import mx.com.controlEscolar.models.Maestro;

public class MaestroImplement extends GenericDAO implements MaestroDAO {

	@Transactional(readOnly = true)
	public List<Maestro> selectByNombre(String nombre) {

		List<Maestro> maestros = null;

		Query query = getSession().createQuery(
				"from Maestro m where m.nombre LIKE :nombre");
		query.setParameter("nombre", "%" + nombre + "%");
		maestros = query.list();

		return maestros;
	}
	
	@Transactional(readOnly = true)
	public List<Maestro> selectPaginated(Integer number, boolean isAscending) {

		List<Maestro> maestros = null;
		String order = isAscending?"asc":"desc";
		try {
			Query query = getSession()
					.createQuery("from Maestro m ORDER BY m.nombre " + order);
				    query.setMaxResults(number);
				    maestros = query.list();
		} catch (HibernateException he) {
			handleException(he);
		}

		return maestros;
	}

	
}
