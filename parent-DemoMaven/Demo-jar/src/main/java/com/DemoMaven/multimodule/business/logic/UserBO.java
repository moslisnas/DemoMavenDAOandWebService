package com.DemoMaven.multimodule.business.logic;

import javax.ejb.Local;

/**
 * User management business interface.
 * 
 * @author alemolin
 *
 */
@Local
public interface UserBO {
	/**
	* Method which create a new user from username, password and email data.
	* 
	* @param username Nickname for login in the blog.
	* @param password Password for login in the blog.
	* @param email The email used to confirm registration process.
	*/
	public void register(String username, String password, String email);
	/**
	* Method which allows the user to go inside the blog application.
	* 
	* @param username Nickname for login in the blog.
	* @param password Password for login in the blog.
	* @return true if the login was ssuccessful, false otherwise.
	*/
	public boolean login(String username, String password);
}