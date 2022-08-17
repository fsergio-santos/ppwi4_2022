package com.projeto.models.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TAB_DEPARTAMENTO")
public class Departamento implements Serializable {

	private static final long serialVersionUID = 6198323535114398331L;

	private Long id;
	private String nome;
	
	public Departamento() {

	}

	public Departamento(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "DEPARTAMENTO_ID")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "DEPARTAMENTO_NOME",length = 50, nullable = false )
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
		Departamento other = (Departamento) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Departamento [id=" + id + ", nome=" + nome + "]";
	}
	
	
	
	
	
	

}
