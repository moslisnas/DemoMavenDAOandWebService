package com.DemoMaven.multimodule.dao;

import java.util.List;
import com.DemoMaven.multimodule.exceptions.DaoException;

/**
 * Generic DAO interface.
 * 
 * @author alemolin
 *
 */
public interface IDao<K> {
	/**
	 * Method that get an entity instance from its id.
	 * 
	 * @param id Identifier of the entity.
	 * @return Instance.
	 * @throws DaoException Exception.
	 */
	K getById(long id) throws DaoException;

	/**
	 * Method that get all the entity instances.
	 * 
	 * @return List of instances.
	 * @throws DaoException Exception.
	 */
	List<K> getAll() throws DaoException;

	/**
	 * Method which insert an entity instance.
	 * 
	 * @param instance Instance to insert.
	 * @throws DaoException Exception.
	 */
	void add(K instance) throws DaoException;

	/**
	 * Method which update an entity instance.
	 * 
	 * @param instance Instance to update.
	 * @throws DaoException Exception.
	 */
	void update(K instance) throws DaoException;

	/**
	 * Method which delete an entity instance.
	 * 
	 * @param id Identifier of the entity.
	 * @throws DaoException Exception.
	 */
	void delete(long id) throws DaoException;

}
