package com.DemoMaven.multimodule.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.DemoMaven.multimodule.business.objects.Comment;
import com.DemoMaven.multimodule.exceptions.DaoException;

/**
 * DAO class for Comment entity.
 * 
 * @author alemolin
 *
 */
@Stateless
public class CommentDao implements IDao<Comment>{
	Comment comment;
	//Log
	private static final Logger LOG = LogManager.getLogger();
	//Queries
	private static final String QUERY_GET_ALL = "SELECT t FROM Comment t";

	EntityManager em = null;
	
	/**
	 * DAO constructor.
	 */
	public CommentDao() {
		this.em = Persistence.createEntityManagerFactory("commentDao").createEntityManager();
	}
	
	/*
	 * Get comment by id.
	 * 
	 * @param id the comment id
	 * @return the comment with the selected id
	 * @exception DaoException
	 * @see com.DemoMaven.multimodule.dao.IDao#getById(long)
	 */
	@Override
	public Comment getById(long id) throws DaoException {
		LOG.info("CommentDAO.getById. Id: {}.", id);
		try {
			return em.find(Comment.class, id);
		} catch (Exception exception) {
			throw new DaoException(exception);
		}
	}
	/*
	 * Get all comments.
	 * 
	 * @return the completed comment list
	 * @exception DaoException
	 * @see com.DemoMaven.multimodule.dao.IDao#getAll()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Comment> getAll() throws DaoException {
		LOG.info("CommentDAO.getAll.");
		try {
			return em.createQuery(QUERY_GET_ALL).getResultList();
		} catch (Exception exception) {
			throw new DaoException(exception);
		}
	}
	/*
	 * Add a new comment.
	 * 
	 * @param instance the comment instance
	 * @exception DaoException
	 * @see com.DemoMaven.multimodule.dao.IDao#add(java.lang.Object)
	 */
	@Override
	public void add(Comment instance) throws DaoException {
		LOG.info("CommentDAO.add. {}", instance);
		try {
			em.persist(instance);
		} catch (Exception exception) {
			throw new DaoException(exception);
		}
	}
	/*
	 * Update the selected comment.
	 * 
	 * @param instance the comment instance
	 * @exception DaoException
	 * @see com.DemoMaven.multimodule.dao.IDao#add(java.lang.Object)
	 */
	@Override
	public void update(Comment instance) throws DaoException {
		LOG.info("CommentDAO.update. {}.", instance);
		try {
			em.merge(instance);
		} catch (Exception exception) {
			throw new DaoException(exception);
		}
	}
	/*
	 * Deleted the selected comment by id.
	 * 
	 * @param id the comment id
	 * @exception DaoException
	 * @see com.DemoMaven.multimodule.dao.IDao#delete(long)
	 */
	@Override
	public void delete(long id) throws DaoException {
		LOG.info("CommentDAO.delete. Id: {}.", id);
		try {
			Comment instance = this.getById(id);
			em.remove(instance);
		} catch (Exception exception) {
			throw new DaoException(exception);
		}
	}
}
