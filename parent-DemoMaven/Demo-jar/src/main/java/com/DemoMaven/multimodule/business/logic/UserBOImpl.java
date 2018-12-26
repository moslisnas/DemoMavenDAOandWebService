package com.DemoMaven.multimodule.business.logic;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.DemoMaven.multimodule.dao.UserDao;

/**
 * User management business interface class.
 * 
 * @author alemolin
 *
 */
@Stateless
public class UserBOImpl implements UserBO{
	@Inject
	UserDao userDao;
	/**
	 * Constructor.
	 */
	public UserBOImpl() {
		
	}
	/**
	* Method which create a new user from username, password and email data.
	* 
	* @param username Nickname for login in the blog.
	* @param password Password for login in the blog.
	* @param email The email used to confirm registration process.
	*/
	public void register(String username, String password, String email) {
		//Register code at database
	}
	/**
	* Method which allows the user to go inside the blog application.
	* 
	* @param username Nickname for login in the blog.
	* @param password Password for login in the blog.
	* @return true if the login was ssuccessful, false otherwise.
	*/
	public boolean login(String username, String password) {
		boolean result = false;
		
		//Login code
		
		return result;
	}
}