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
	@Size(min=4, max=200, message="You need to indicate the post author")
	private String author;
	
	@NotNull
	@NotEmpty(message="This fill can't be empty")
	@Size(min=3, message="You need to indicate a title")
	@Size(max=200, message="You can't write more than 200 characters as title")
	private String title;
	
	@Size(min=0, max=1000, message="You can't write more than 1000 characters as resume")
	private String resume;
	
	@NotNull
	@NotEmpty(message="This fill can't be empty")
	private String content;


	/**
	 *  Create a new blog.
	 *  
	 */
	public void createPost(ComponentSystemEvent event) {
		FacesContext fc = FacesContext.getCurrentInstance();
		UIComponent components = event.getComponent();
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
	 *  Resume getter.
	 *  
	 * @return the resume
	 */
	public String getResume() {
		return resume;
	}
	/**
	 *  Resume setter.
	 *  
	 * @param resume the resume to set
	 */
	public void setResume(String resume) {
		this.resume = resume;
	}
	/**
	 *  Content getter.
	 *  
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 *  Content setter.
	 *  
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
}