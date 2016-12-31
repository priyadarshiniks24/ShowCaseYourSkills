package com.priya.web.dao;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.priya.web.validation.ValidEmail;

public class User {
	
	@NotBlank
	@Size(min=5, max=20)
	@Pattern(regexp = "^\\w+$")
	private String username;
	
	@NotBlank
	@Size(min=8, max=15)
	@Pattern(regexp="^\\S*$")
	private String password;
	
	@ValidEmail
	private String email;
	private boolean enabled = false;
	private String authority;

	public User() {
	}

	public User(String username, String password, String email,
			boolean enabled, String authority) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.enabled = enabled;
		this.authority = authority;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
