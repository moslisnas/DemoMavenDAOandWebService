package com.DemoMaven.multimodule.business.logic;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.DemoMaven.multimodule.dao.CommentDao;

/**
 * Comment management business interface class.
 * 
 * @author alemolin
 *
 */
@Stateless
public class CommentBOImpl implements CommentBO{
	@Inject
	CommentDao commentDao;
	/**
	 * Constructor.
	 */
	public CommentBOImpl() {
		
	}
}