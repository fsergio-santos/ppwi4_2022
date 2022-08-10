package com.projeto.models.dto.request;

public class UsuarioRequest {

	private String  username;
	private String  password;
	private String  confirme;
	private String  email;
	
	
	
	public UsuarioRequest() {
		super();
	}
	
	
	public UsuarioRequest(String username, String password, String confirme, String email) {
		super();
		this.username = username;
		this.password = password;
		this.confirme = confirme;
		this.email = email;
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
	public String getConfirme() {
		return confirme;
	}
	public void setConfirme(String confirme) {
		this.confirme = confirme;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
