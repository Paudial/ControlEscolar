package mx.com.controlEscolar.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

public class GenericDAO<T> {

	protected SessionFactory sessionFactory;
	
	protected Session getSession() {

		return sessionFactory.getCurrentSession();
	}
	
	protected void handleException(HibernateException he) {
		System.err.println("Hibernate Exception: " + he.getMessage());
	}
	
	@Transactional
	public void insert(T entity) {
		getSession().persist(entity);
		getSession().flush();
	}
	
	@Transactional
	public void update(T entity) throws HibernateException {
		getSession().merge(entity);
		getSession().flush();
	}
	
	
	@Transactional(readOnly = true)
	public T selectById(Serializable id, Class<T> entityClass)
			throws HibernateException {
		
		T obj = (T) getSession().get(entityClass, id);

		return obj;
	}
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<T> selectAll(Class<T> entityClass) throws HibernateException {
		List<T> result = null;

			result = getSession().createQuery(
					"FROM " + entityClass.getSimpleName()).list();
			
		return result;
	}
	
	@Transactional
	public void delete(T entity) throws HibernateException {	
			getSession().delete(entity);
			getSession().flush();
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
}
