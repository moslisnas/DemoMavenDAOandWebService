package com.DemoMaven.multimodule;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * UserBackingBean demo class.
 * 
 * @author moslisnas
 *
 */
@RequestScoped
@ManagedBean
public class UserBackingBean {
	private String username = "UsuarioTest";
	private String email = "UsuarioTest@t-systems.com";

	/*
	 *  Username getter.
	 *  
	 * @return the username String
	 */
	public String getUsername() {
		return username;
	}
	/* 
	 * Username setter.
	 * 
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 *  Email getter.
	 *  
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 *  Email getter.
	 *  
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 *  Create a new user.
	 *  
	 */
	public void createUser() {
	}
}