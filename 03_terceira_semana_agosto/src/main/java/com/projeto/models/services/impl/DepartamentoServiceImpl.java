package com.projeto.models.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.models.model.Departamento;
import com.projeto.models.repository.DepartamentoRepository;
import com.projeto.models.services.DepartamentoService;
import com.projeto.models.services.execption.EntidadeNaoEncontrada;

@Service
@Transactional
public class DepartamentoServiceImpl implements DepartamentoService {
	
    @Autowired
	private DepartamentoRepository departamentoRepositoy;

	@Override
	@Transactional(readOnly = true)
	public List<Departamento> listarDepartamento() {
		return departamentoRepositoy.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Departamento findById(Long id) {
		return departamentoRepositoy.findById(id)
				                    .orElseThrow(()-> new EntidadeNaoEncontrada("Registro não localizado"));
	}

	@Override
	public Departamento incluirDepartamento(Departamento departamento) {
		return departamentoRepositoy.saveAndFlush(departamento);
	}

	@Override
	public Departamento alterarDepartamento(Departamento departamento) {
		return departamentoRepositoy.saveAndFlush(departamento);
	}

	@Override
	public void excluirDepartamento(Long id) {
		departamentoRepositoy.deleteById(id);
	}

	@Override
	public Page<Departamento> listarDepartamentoComPaginacao(Pageable pageable) {
		return departamentoRepositoy.findAll(pageable);
	}

}
