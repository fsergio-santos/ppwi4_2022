package com.projeto.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.projeto.models.model.Departamento;

public interface DepartamentoService {
	
	public List<Departamento> listarDepartamento();
	public Departamento findById(Long id);
	public Departamento incluirDepartamento(Departamento departamento);
	public Departamento alterarDepartamento(Departamento departamento);
	public void excluirDepartamento(Long id);
	public Page<Departamento> listarDepartamentoComPaginacao(Pageable pageable);

}
