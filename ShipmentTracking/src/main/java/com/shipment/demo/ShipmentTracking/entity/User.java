package com.shipment.demo.ShipmentTracking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class User {

	@Id
	@Column(name = "username")
	private Integer username;

	@Column(name = "name")
	private String name;

	@Column(name = "password")
	private String password;

	@Column(name = "role")
	private String role;

	@Column(name = "token")
	private String token;

	public User(Integer username, String name, String password, String role, String token) {
		super();
		this.username = username;
		this.name = name;
		this.password = password;
		this.role = role;
		this.token = token;
	}

	public User() {

	}

	public Integer getUsername() {
		return username;
	}

	public void setUsername(Integer username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
