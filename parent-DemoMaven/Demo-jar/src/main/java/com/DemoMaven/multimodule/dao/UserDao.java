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
	//Log
	private static final Logger LOG = LogManager.getLogger();
	//Queries
	private static final String QUERY_GET_ALL = "SELECT t FROM Tarea t";

	EntityManager em = null;
	
	/**
	 * DAO constructor.
	 */
	public UserDao() {
		this.em = Persistence.createEntityManagerFactory("dao").createEntityManager();
	}

	/*
	 * Get user by id.
	 * 
	 * @param id the user id
	 * @return the user with the selected id
	 * @exception DaoException
	 * @see com.DemoMaven.multimodule.dao.IDao#getById(long)
	 */
	@Override
	public User getById(long id) throws DaoException {
		LOG.info("UserDAO.getById. Id: {}.", id);
		try {
			return em.find(User.class, id);
		} catch (Exception exception) {
			throw new DaoException(exception);
		}
	}
	/*
	 * Get all users.
	 * 
	 * @return the completed user list
	 * @exception DaoException
	 * @see com.DemoMaven.multimodule.dao.IDao#getAll()
	 */
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
	/*
	 * Add a new user.
	 * 
	 * @param instance the user instance
	 * @exception DaoException
	 * @see com.DemoMaven.multimodule.dao.IDao#add(java.lang.Object)
	 */
	@Override
	public void add(User instance) throws DaoException {
		LOG.info("UserDAO.add. {}", instance);
		try {
			em.persist(instance);
		} catch (Exception exception) {
			throw new DaoException(exception);
		}
	}
	/*
	 * Update the selected user.
	 * 
	 * @param instance the user instance
	 * @exception DaoException
	 * @see com.DemoMaven.multimodule.dao.IDao#add(java.lang.Object)
	 */
	@Override
	public void update(User instance) throws DaoException {
		LOG.info("UserDAO.update. {}.", instance);
		try {
			em.merge(instance);
		} catch (Exception exception) {
			throw new DaoException(exception);
		}
	}
	/*
	 * Deleted the selected user by id.
	 * 
	 * @param id the user id
	 * @exception DaoException
	 * @see com.DemoMaven.multimodule.dao.IDao#delete(long)
	 */
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
