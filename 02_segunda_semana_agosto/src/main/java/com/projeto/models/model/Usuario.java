package com.projeto.models.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "TAB_USUARIO")
public class Usuario implements Serializable{
		
	private static final long serialVersionUID = -326317825748464280L;
	
	private Long    id;
	private String  codigoUUID;
	private String  username;
	private String  password;
	private String  confirme;
	private String  email;
	private boolean ativo = Boolean.FALSE;
	private Integer falhaLogin;
	private Date    ultimaDataAcesso;
	private Date    dataVencimentoSenha;
	private String  fotoUsuario;
	private String  contentType;
	
	
	public Usuario() {
		
	}

	public Usuario(Long id, String codigoUUID, String username, String password, String confirme, String email,
			boolean ativo, Integer falhaLogin, Date ultimaDataAcesso, Date dataVencimentoSenha, String fotoUsuario,
			String contentType) {
		this.id = id;
		this.codigoUUID = codigoUUID;
		this.username = username;
		this.password = password;
		this.confirme = confirme;
		this.email = email;
		this.ativo = ativo;
		this.falhaLogin = falhaLogin;
		this.ultimaDataAcesso = ultimaDataAcesso;
		this.dataVencimentoSenha = dataVencimentoSenha;
		this.fotoUsuario = fotoUsuario;
		this.contentType = contentType;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name="CODIGO_UUID", length=100 )
	public String getCodigoUUID() {
		return codigoUUID;
	}

	public void setCodigoUUID(String codigoUUID) {
		this.codigoUUID = codigoUUID;
	}

	@Column(name="USERNAME", length=100, nullable = false )
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name="PASSWORD", length=100, nullable = false )
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name="CONFIRME", length=100, nullable = false )
	public String getConfirme() {
		return confirme;
	}

	public void setConfirme(String confirme) {
		this.confirme = confirme;
	}

	@Column(name="EMAIL", length=100, nullable = false )
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}


	@Column(name="FALHALOGIN", length=2)
	public Integer getFalhaLogin() {
		return falhaLogin;
	}

	public void setFalhaLogin(Integer falhaLogin) {
		this.falhaLogin = falhaLogin;
	}

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	@Column(name="DATACESSO" )
	public Date getUltimaDataAcesso() {
		return ultimaDataAcesso;
	}

	public void setUltimaDataAcesso(Date ultimaDataAcesso) {
		this.ultimaDataAcesso = ultimaDataAcesso;
	}

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	@Column(name="DATAVENCIMENTO" )
	public Date getDataVencimentoSenha() {
		return dataVencimentoSenha;
	}

	public void setDataVencimentoSenha(Date dataVencimentoSenha) {
		this.dataVencimentoSenha = dataVencimentoSenha;
	}

	@Column(name="FOTO")
	public String getFotoUsuario() {
		return fotoUsuario;
	}

	public void setFotoUsuario(String fotoUsuario) {
		this.fotoUsuario = fotoUsuario;
	}

	@Column(name="CONTENT_TYPE")
	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(id, other.id);
	}
	

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", codigoUUID=" + codigoUUID + ", username=" + username + ", password=" + password
				+ ", confirme=" + confirme + ", email=" + email + ", ativo=" + ativo + ", falhaLogin=" + falhaLogin
				+ ", ultimaDataAcesso=" + ultimaDataAcesso + ", dataVencimentoSenha=" + dataVencimentoSenha
				+ ", fotoUsuario=" + fotoUsuario + ", contentType=" + contentType + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
