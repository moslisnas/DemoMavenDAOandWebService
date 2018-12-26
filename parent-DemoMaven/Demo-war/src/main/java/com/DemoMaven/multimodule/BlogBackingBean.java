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
 * BlogBackingBean demo class.
 * 
 * @author moslisnas
 *
 */
@RequestScoped
@ManagedBean
public class BlogBackingBean {
	@NotNull
	@NotEmpty(message="This fill can't be empty")
	@Size(min=4, max=200, message="You need to indicate a name for the blog")
	private String name;
	
	@Size(max=200, message="You can't write more than 200 characters")
	private String category;


	/**
	 *  Create a new blog.
	 *  
	 */
	public void createBlog(ComponentSystemEvent event) {
		FacesContext fc = FacesContext.getCurrentInstance();
		UIComponent components = event.getComponent();
	}
	
	/*
	 *  Name getter.
	 *  
	 * @return the name String
	 */
	public String getName() {
		return name;
	}
	/* 
	 * Name setter.
	 * 
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 *  Category getter.
	 *  
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 *  Category setter.
	 *  
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
}