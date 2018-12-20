package com.DemoMaven.multimodule.rest.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * DTO class for User.
 * 
 * @author alemolin
 *
 */
@XmlRootElement
public class UserDTO {
	private String username;
	private String email;
	
	/**
	 * Constructor.
	 * 
	 * @param username The username String
	 * @param username The email String
	 */
	public UserDTO(String username, String email) {
		super();
		this.username = username;
		this.email = email;
	}
	/**
	 * Username getter.
	 * 
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 *  Username setter.
	 *  
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 *  Email getter.
	 *  
	 * @return The email String
	 */
	public String getEmail() {
		return email;
	}
	/**
	 *  Username setter.
	 *  
	 * @param email The email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}