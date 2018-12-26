package com.DemoMaven.multimodule.business.objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * User entity class.
 * 
 * @author alemolin
 *
 */
@Entity
public class User {
	@Id
	@Column(name="Id")
	long id;
	@Size(max=50)
	@NotNull
	String username;
	@Size(max=50)
	@NotNull
	String password;
	@Size(max=300)
	@NotNull
	String email;
	
	/**
	 * Constructor of User.
	 */
	public User() {
		
	}
	/**
	 * Constructor of User.
	 * 
	 * @param id Identificator.
	 * @param username Username.
	 * @param password Password.
	 * @param email Email.
	 */
	public User(long id, @Size(max = 50) @NotNull String username, @Size(max = 50) @NotNull String password, @Size(max = 300) @NotNull String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	/**
	 * Getter of user id.
	 * 
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * Setter of user id.
	 * 
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * Getter of user username.
	 * 
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * Setter of user username.
	 * 
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * Getter of user password.
	 * 
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * Setter of user password.
	 * 
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * Getter of user email.
	 * 
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * Setter of user email.
	 * 
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}