package com.priya.web.dao;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.priya.web.validation.ValidEmail;

public class Offer {
	private int id;
	
	@NotNull
	@Size(min=5, max=100, message="Name must be between 5 and 100 characters")
	private String name;
	
	@NotNull
	@ValidEmail
//	@Pattern(regexp=".*\\@.*\\.*", message="This does not appear to be a valid email address")
	private String email;
	
	@NotNull
	@Size(min=4, max=100, message="Name must be between 20 and 100 characters")
	private String text;

	@Override
	public String toString() {
		return "Offer [id=" + id + ", name=" + name + ", email=" + email
				+ ", text=" + text + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Offer() {
	}

	public Offer(String name, String email, String text) {
		this.name = name;
		this.email = email;
		this.text = text;
	}

	public Offer(int id, String name, String email, String text) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.text = text;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
