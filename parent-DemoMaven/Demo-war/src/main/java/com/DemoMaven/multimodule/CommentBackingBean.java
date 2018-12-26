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
 * CommentBackingBean demo class.
 * 
 * @author moslisnas
 *
 */
@RequestScoped
@ManagedBean
public class CommentBackingBean {
	@NotNull
	@NotEmpty(message="You need to indicate a text")
	private String comment;


	/**
	 *  Create a new blog.
	 *  
	 */
	public void createComment(ComponentSystemEvent event) {
		FacesContext fc = FacesContext.getCurrentInstance();
		UIComponent components = event.getComponent();
	}
	
	/*
	 *  Comment getter.
	 *  
	 * @return the comment String
	 */
	public String getComment() {
		return comment;
	}
	/* 
	 * Comment setter.
	 * 
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
}