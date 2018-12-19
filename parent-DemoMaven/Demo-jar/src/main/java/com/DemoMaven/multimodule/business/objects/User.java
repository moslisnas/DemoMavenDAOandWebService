package com.DemoMaven.multimodule.business.objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
	
	public User() {
		
	}
	/**
	 * Constructor of User.
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
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}