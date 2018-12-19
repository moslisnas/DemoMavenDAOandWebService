package com.DemoMaven.multimodule;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Clase UserBackingBean demo.
 * @author moslisnas
 *
 */

@RequestScoped
@ManagedBean
public class UserBackingBean {
	private String name = "UsuarioTest";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}