package com.DemoMaven.multimodule.business.objects;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Blog entity class.
 * 
 * @author alemolin
 *
 */
@Entity
public class Blog {
	@Id
	@Column(name="Id")
	long id;
	@Size(min=4, max=200)
	@NotNull
	User author;
	@Size(min=4, max=200)
	@NotNull
	String name;
	//TO DO --> MANY TO ONE
	List<Post> posts;
	
	/**
	 * Constructor of Blog.
	 */
	public Blog() {
		
	}
	/**
	 * Constructor of Blog.
	 * 
	 * @param id Identifier.
	 * @param author Author.
	 * @param title Name.
	 */
	public Blog(long id, @Size(max = 200) @NotNull User author, @Size(max = 200) @NotNull String name) {
		super();
		this.id = id;
		this.author = author;
		this.name = name;
		this.posts = null;
	}
	
	/**
	 * Getter of blog id.
	 * 
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * Setter of blog id.
	 * 
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * Getter of author user.
	 * 
	 * @return the author
	 */
	public User getAuthor() {
		return author;
	}
	/**
	 * Setter of author user.
	 * 
	 * @param author the author user to set
	 */
	public void setAuthor(User author) {
		this.author = author;
	}
	/**
	 * Getter of name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Setter of name.
	 * 
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Getter of post list.
	 * 
	 * @return the post list
	 */
	public List<Post> getPosts() {
		return posts;
	}
	/**
	 * Setter of post list.
	 * 
	 * @param posts the post list to set
	 */
	public void setId(List<Post> posts) {
		this.posts = posts;
	}
}
