package com.DemoMaven.multimodule.business.logic;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.DemoMaven.multimodule.dao.PostDao;

/**
 * Post management business interface class.
 * 
 * @author alemolin
 *
 */
@Stateless
public class PostBOImpl implements PostBO{
	@Inject
	PostDao postDao;
	/**
	 * Constructor.
	 */
	public PostBOImpl() {
		
	}
}