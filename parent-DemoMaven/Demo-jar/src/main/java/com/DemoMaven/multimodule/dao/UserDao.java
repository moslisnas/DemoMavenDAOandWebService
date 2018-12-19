package com.DemoMaven.multimodule.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.DemoMaven.multimodule.business.objects.User;
import com.DemoMaven.multimodule.exceptions.DaoException;

/**
 * DAO class for User entity.
 * 
 * @author alemolin
 *
 */
@Stateless
public class UserDao implements IDao<User> {
	
	private static final Logger LOG = LogManager.getLogger();

	private static final String QUERY_GET_ALL = "SELECT t FROM Tarea t";

	EntityManager em = null;
	
	/**
	 * DAO constructor.
	 */
	public UserDao() {
		this.em = Persistence.createEntityManagerFactory("dao").createEntityManager();
	}

	@Override
	public User getById(long id) throws DaoException {
		LOG.info("UserDAO.getById. Id: {}.", id);
		try {
			return em.find(User.class, id);
		} catch (Exception exception) {
			throw new DaoException(exception);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAll() throws DaoException {
		LOG.info("UserDAO.getAll.");
		try {
			return em.createQuery(QUERY_GET_ALL).getResultList();
		} catch (Exception exception) {
			throw new DaoException(exception);
		}
	}

	@Override
	public void add(User instance) throws DaoException {
		LOG.info("UserDAO.add. {}", instance);
		try {
			em.persist(instance);
		} catch (Exception exception) {
			throw new DaoException(exception);
		}
	}

	@Override
	public void update(User instance) throws DaoException {
		LOG.info("UserDAO.update. {}.", instance);
		try {
			em.merge(instance);
		} catch (Exception exception) {
			throw new DaoException(exception);
		}
	}

	@Override
	public void delete(long id) throws DaoException {
		LOG.info("UserDAO.delete. Id: {}.", id);
		try {
			User instance = this.getById(id);
			em.remove(instance);
		} catch (Exception exception) {
			throw new DaoException(exception);
		}
	}

}