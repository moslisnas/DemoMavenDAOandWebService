package com.DemoMaven.multimodule;

import javax.enterprise.inject.Produces;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * NavigationBackingBean demo class.
 * 
 * @author moslisnas
 * 
 */
@RequestScoped
@ManagedBean
public class NavigationBackingBean {
	private final String createUserHtmlPath = "http://localhost:8080/demoUser/userCreation.xhtml";
	private final String createBlogHtmlPath = "http://localhost:8080/demoUser/blogCreation.xhtml";
	private final String createPostHtmlPath = "http://localhost:8080/demoUser/postCreation.xhtml";
	private final String createCommentHtmlPath = "http://localhost:8080/demoUser/commentCreation.xhtml";
	/*
	 * Getter of create user path.
	 * 
	 * @return the creation user path
	 */
	public String goToCreateUser() {
		return createUserHtmlPath;
	}
	/*
	 * Getter of create blog path.
	 * 
	 * @return the creation blog path
	 */
	public String goToCreateBlog() {
		return createBlogHtmlPath;
	}
	/*
	 * Getter of create post path.
	 * 
	 * @return the creation post path
	 */
	public String goToCreatePost() {
		return createPostHtmlPath;
	}
	/*
	 * Getter of create comment path.
	 * 
	 * @return the creation comment path
	 */
	public String goToCreateComment() {
		return createCommentHtmlPath;
	}
}