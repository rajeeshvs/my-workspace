package com.email.model;

import java.io.Serializable;

public class Email implements Serializable{
	
	private String emailSubject;

	@Override
	public String toString() {
		return "Email [emailSubject=" + emailSubject + "]";
	}

	public String getName() {
		return emailSubject;
	}

	public void setName(String name) {
		this.emailSubject = name;
	}

}
