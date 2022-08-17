package com.projeto.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.models.model.Departamento;
import com.projeto.models.services.DepartamentoService;

@RestController
@RequestMapping(value="/departamento")
public class DepartamentoController {

	@Autowired
	private DepartamentoService departamentoService;
	
	@ResponseBody
	@GetMapping(value="/listagem")
	public List<Departamento> listarDepartamento() {
		return departamentoService.listarDepartamento();
	}
	
	@GetMapping(value="listapaginada")
	public Page<Departamento> listarDepartamentoComPaginacao(Integer page, 
			                     Integer pageSize, 
			                     String ordem,
			                     String props) {
		
		
		Pageable pageable = gerarPaginacao(page, pageSize, ordem, props);
		
		Page<Departamento> listaDepartamento = departamentoService.listarDepartamentoComPaginacao(pageable);
		
		return listaDepartamento;
	}

	

	@ResponseBody
	@GetMapping(value="/{id}")
	public Departamento findById(@PathVariable("id") Long id) {
		return departamentoService.findById(id);
	}

	@ResponseBody
	@PostMapping(value="/incluir")
	public Departamento incluirDepartamento(@RequestBody Departamento departamento) {
		return departamentoService.incluirDepartamento(departamento);
	}

	@ResponseBody
	@PutMapping(value="/alterar/{id}")
	public Departamento alterarDepartamento(@PathVariable("id") Long id, @RequestBody Departamento departamento) {
		Departamento departamentoAtual = departamentoService.findById(id);
	    departamentoAtual.setNome(departamento.getNome());
		return departamentoService.alterarDepartamento(departamentoAtual);
	}

	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping(value="/excluir/{id}")
	public void excluirDepartamento(@PathVariable("id") Long id) {
		departamentoService.excluirDepartamento(id);
	}
	
	
	private Pageable gerarPaginacao(Integer page, Integer pageSize, String ordem, String props) {
		return PageRequest.of(page, pageSize);
	}
	
}
