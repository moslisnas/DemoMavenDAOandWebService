package com.DemoMaven.multimodule.business.logic;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.DemoMaven.multimodule.dao.BlogDao;

/**
 * Blog management business interface class.
 * 
 * @author alemolin
 *
 */
@Stateless
public class BlogBOImpl implements BlogBO{
	@Inject
	BlogDao blogDao;
	/**
	 * Constructor.
	 */
	public BlogBOImpl() {
		
	}
}