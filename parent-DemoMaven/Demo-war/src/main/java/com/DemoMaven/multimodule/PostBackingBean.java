package com.DemoMaven.multimodule;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * PostBackingBean demo class.
 * 
 * @author moslisnas
 *
 */
@RequestScoped
@ManagedBean
public class PostBackingBean {	
	@NotNull
	@NotEmpty(message="This fill can't be empty")
	@Size(min=3, message="You need to indicate a title")
	@Size(max=200, message="You can't write more than 200 characters as title")
	private String title;
	
	@NotNull
	@NotEmpty(message="This fill can't be empty")
	private String message;
	
	@NotNull
	@NotEmpty(message="This fill can't be empty")
	@Size(min=4, max=200, message="You need to indicate the post author")
	private String author;

	/**
	 *  Create a new post.
	 *  
	 */
	public void createPost(ComponentSystemEvent event) {
		FacesContext fc = FacesContext.getCurrentInstance();
		UIComponent components = event.getComponent();
	}
	
	/*
	 *  Title getter.
	 *  
	 * @return the title String
	 */
	public String getTitle() {
		return title;
	}
	/* 
	 * Title setter.
	 * 
	 * @param title the name to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 *  Message getter.
	 *  
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 *  Message setter.
	 *  
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/*
	 *  Author getter.
	 *  
	 * @return the author String
	 */
	public String getAuthor() {
		return author;
	}
	/* 
	 * Author setter.
	 * 
	 * @param author the name to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
}