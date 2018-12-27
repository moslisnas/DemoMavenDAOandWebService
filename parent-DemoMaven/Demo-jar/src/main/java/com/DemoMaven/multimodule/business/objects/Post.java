package com.DemoMaven.multimodule.business.objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Post entity class.
 * 
 * @author alemolin
 *
 */
@Entity
public class Post {
	@Id
	@Column(name="Id")
	long id;
	@Size(min=3, max=200)
	@NotNull
	String title;
	@NotNull
	String message;
	@Size(min=4, max=200)
	@NotNull
	User author;
	
	/**
	 * Constructor of Post.
	 */
	public Post() {
		
	}
	/**
	 * Constructor of Post.
	 * 
	 * @param id Identifier.
	 * @param title Name.
	 * @param message Content.
	 * @param author Author.
	 */
	public Post(long id, @Size(max = 200) @NotNull String title, @NotNull String message, @Size(max = 200) @NotNull User author) {
		super();
		this.id = id;
		this.title = title;
		this.message = message;
		this.author = author;
	}
	
	/**
	 * Getter of post id.
	 * 
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * Setter of post id.
	 * 
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * Getter of title.
	 * 
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * Setter of title.
	 * 
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * Getter of message.
	 * 
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * Setter of message.
	 * 
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
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
}
