package com.DemoMaven.multimodule.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.DemoMaven.multimodule.business.objects.Post;
import com.DemoMaven.multimodule.exceptions.DaoException;

/**
 * DAO class for Post entity.
 * 
 * @author alemolin
 *
 */
@Stateless
public class PostDao implements IDao<Post>{
	Post post;
	//Log
	private static final Logger LOG = LogManager.getLogger();
	//Queries
	private static final String QUERY_GET_ALL = "SELECT t FROM Post t";

	EntityManager em = null;
	
	/**
	 * DAO constructor.
	 */
	public PostDao() {
		this.em = Persistence.createEntityManagerFactory("postDao").createEntityManager();
	}
	
	/*
	 * Get post by id.
	 * 
	 * @param id the post id
	 * @return the post with the selected id
	 * @exception DaoException
	 * @see com.DemoMaven.multimodule.dao.IDao#getById(long)
	 */
	@Override
	public Post getById(long id) throws DaoException {
		LOG.info("PostDAO.getById. Id: {}.", id);
		try {
			return em.find(Post.class, id);
		} catch (Exception exception) {
			throw new DaoException(exception);
		}
	}
	/*
	 * Get all posts.
	 * 
	 * @return the completed post list
	 * @exception DaoException
	 * @see com.DemoMaven.multimodule.dao.IDao#getAll()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Post> getAll() throws DaoException {
		LOG.info("PostDAO.getAll.");
		try {
			return em.createQuery(QUERY_GET_ALL).getResultList();
		} catch (Exception exception) {
			throw new DaoException(exception);
		}
	}
	/*
	 * Add a new post.
	 * 
	 * @param instance the post instance
	 * @exception DaoException
	 * @see com.DemoMaven.multimodule.dao.IDao#add(java.lang.Object)
	 */
	@Override
	public void add(Post instance) throws DaoException {
		LOG.info("PostDAO.add. {}", instance);
		try {
			em.persist(instance);
		} catch (Exception exception) {
			throw new DaoException(exception);
		}
	}
	/*
	 * Update the selected post.
	 * 
	 * @param instance the post instance
	 * @exception DaoException
	 * @see com.DemoMaven.multimodule.dao.IDao#add(java.lang.Object)
	 */
	@Override
	public void update(Post instance) throws DaoException {
		LOG.info("PostDAO.update. {}.", instance);
		try {
			em.merge(instance);
		} catch (Exception exception) {
			throw new DaoException(exception);
		}
	}
	/*
	 * Deleted the selected post by id.
	 * 
	 * @param id the post id
	 * @exception DaoException
	 * @see com.DemoMaven.multimodule.dao.IDao#delete(long)
	 */
	@Override
	public void delete(long id) throws DaoException {
		LOG.info("PostDAO.delete. Id: {}.", id);
		try {
			Post instance = this.getById(id);
			em.remove(instance);
		} catch (Exception exception) {
			throw new DaoException(exception);
		}
	}
}
