package com.example.demo.model;

import java.io.IOException;
import java.io.Serializable;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class User implements Serializable {
	// private int id;
	private String username;
	private String password;
	// private String name;

	// public User(int id, String username, String password, String name) {
	// super();
	// this.id = id;
	// this.username = username;
	// this.password = password;
	// this.name = name;
	// }

	// public User (String username, String password) {
	// this(0, username, password, null);
	// }

	/*
	 * public int getId() { return id; }
	 * 
	 * public void setId(int id) { this.id = id; }
	 */

	public String getUsername() {
		return username;
	}

	public User() {
		super();
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
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

	// public String getName() {
	// return name;
	// }
	//
	// public void setName(String name) {
	// this.name = name;
	// }
	//
	// @Override
	// public String toString() {
	// return "User [id=" + id + ", username=" + username + ", password=" + password
	// + ", name=" + name + "]";
	// }
	
	
	
	public static void main(String[] args) throws IOException {
		User user = new User("test", "1234");
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(mapper.writeValueAsString(user));
		String str = mapper.writeValueAsString(user);
		User user1 = mapper.readValue(str, User.class);
		System.out.println(user1.toString());
//	 {"username":"hadkad","password":"12345"}
//	 {"username":"test","password":"1234"}
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}

}
