package com.DemoMaven.multimodule.exceptions;

/**
 * Generic exception of DAO layer.
 * 
 * @author alemolin
 *
 */
public class DaoException extends Exception {
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor.
	 */
	public DaoException(Exception exception) {
		super(exception.getMessage(), exception);
	}
}