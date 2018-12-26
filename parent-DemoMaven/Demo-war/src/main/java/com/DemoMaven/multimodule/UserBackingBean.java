package com.DemoMaven.multimodule;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * UserBackingBean demo class.
 * 
 * @author moslisnas
 *
 */
@RequestScoped
@ManagedBean
public class UserBackingBean {
	@NotNull
	@NotEmpty(message="This fill can't be empty")
	@Size(min=4, max=20, message="You need to indicate an username between 3 and 20 characters")
	private String username;

	@NotNull
	@NotEmpty(message="This fill can't be empty")
	@Size(min=8, max=50, message="You need to indicate a valid password: 8 characters at least")
	private String password;
	
	@NotNull
	@NotEmpty(message="This fill can't be empty")
	@Size(min=8, max=50, message="You need to indicate a valid password: 8 characters at least")
	private String confirmPassword;
	
	@NotNull
	@NotEmpty(message="This fill can't be empty")
	@Size(min=5, max=100, message="You need to indicate an email")
	@Email(message ="Email format incorrect")
	private String email;


	/**
	 *  Create a new user.
	 *  
	 */
	public void createUser(ComponentSystemEvent event) {
		FacesContext fc = FacesContext.getCurrentInstance();
		UIComponent components = event.getComponent();
	}
	
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
	 * Password getter.
	 * 
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * Password setter.
	 * 
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * ConfirmPassword getter.
	 * 
	 * @return the confirmPassword
	 */
	public String getConfirmPassword() {
		return confirmPassword;
	}
	/**
	 * ConfirmPassword setter.
	 * 
	 * @param confirmPassword the confirmPassword to set
	 */
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
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
	 *  Email setter.
	 *  
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}