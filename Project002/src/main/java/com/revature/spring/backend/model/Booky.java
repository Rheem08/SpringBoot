package com.revature.spring.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Booky {
	@Id
	@GeneratedValue
	private Integer id;
	private String username;
	private String p_word;
	private String email;
	private String f_name;
	private String l_name;
	public Booky(Integer id, String username, String p_word, String email, String f_name, String l_name) {
		super();
		this.id = id;
		this.username = username;
		this.p_word = p_word;
		this.email = email;
		this.f_name = f_name;
		this.l_name = l_name;
	}
	public Booky() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getP_word() {
		return p_word;
	}
	public void setP_word(String p_word) {
		this.p_word = p_word;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	@Override
	public String toString() {
		return "Booky [id=" + id + ", username=" + username + ", p_word=" + p_word + ", email=" + email + ", f_name="
				+ f_name + ", l_name=" + l_name + "]";
	}
	
}
