package com.DemoMaven.multimodule.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.DemoMaven.multimodule.business.objects.Blog;
import com.DemoMaven.multimodule.exceptions.DaoException;

/**
 * DAO class for Blog entity.
 * 
 * @author alemolin
 *
 */
@Stateless
public class BlogDao implements IDao<Blog> {
	Blog blog;
	//Log
	private static final Logger LOG = LogManager.getLogger();
	//Queries
	private static final String QUERY_GET_ALL = "SELECT t FROM Blog t";

	EntityManager em = null;
	
	/**
	 * DAO constructor.
	 */
	public BlogDao() {
		this.em = Persistence.createEntityManagerFactory("blogDao").createEntityManager();
	}

	/*
	 * Get blog by id.
	 * 
	 * @param id the blog id
	 * @return the blog with the selected id
	 * @exception DaoException
	 * @see com.DemoMaven.multimodule.dao.IDao#getById(long)
	 */
	@Override
	public Blog getById(long id) throws DaoException {
		LOG.info("BlogDAO.getById. Id: {}.", id);
		try {
			return em.find(Blog.class, id);
		} catch (Exception exception) {
			throw new DaoException(exception);
		}
	}
	/*
	 * Get all blogs.
	 * 
	 * @return the completed blog list
	 * @exception DaoException
	 * @see com.DemoMaven.multimodule.dao.IDao#getAll()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Blog> getAll() throws DaoException {
		LOG.info("BlogDAO.getAll.");
		try {
			return em.createQuery(QUERY_GET_ALL).getResultList();
		} catch (Exception exception) {
			throw new DaoException(exception);
		}
	}
	/*
	 * Add a new blog.
	 * 
	 * @param instance the blog instance
	 * @exception DaoException
	 * @see com.DemoMaven.multimodule.dao.IDao#add(java.lang.Object)
	 */
	@Override
	public void add(Blog instance) throws DaoException {
		LOG.info("BlogDAO.add. {}", instance);
		try {
			em.persist(instance);
		} catch (Exception exception) {
			throw new DaoException(exception);
		}
	}
	/*
	 * Update the selected blog.
	 * 
	 * @param instance the blog instance
	 * @exception DaoException
	 * @see com.DemoMaven.multimodule.dao.IDao#add(java.lang.Object)
	 */
	@Override
	public void update(Blog instance) throws DaoException {
		LOG.info("BlogDAO.update. {}.", instance);
		try {
			em.merge(instance);
		} catch (Exception exception) {
			throw new DaoException(exception);
		}
	}
	/*
	 * Deleted the selected blog by id.
	 * 
	 * @param id the blog id
	 * @exception DaoException
	 * @see com.DemoMaven.multimodule.dao.IDao#delete(long)
	 */
	@Override
	public void delete(long id) throws DaoException {
		LOG.info("BlogDAO.delete. Id: {}.", id);
		try {
			Blog instance = this.getById(id);
			em.remove(instance);
		} catch (Exception exception) {
			throw new DaoException(exception);
		}
	}
}