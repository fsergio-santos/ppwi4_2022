package com.projeto.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.models.dto.request.UsuarioRequest;
import com.projeto.models.dto.response.UsuarioResponse;
import com.projeto.models.services.UsuarioService;

@RestController
@RequestMapping(value="/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value="/listagem")	
	public List<UsuarioResponse> listarUsuario() {
		return usuarioService.listarUsuario();
	}
	
	
	@GetMapping(value="listapaginada")
	public void listarUsuarioComPaginacao(Integer page, 
			                     Integer pageSize, 
			                     String ordem,
			                     String props) {
		
		
		Pageable pageable = gerarPaginacao(page, pageSize, ordem, props);
		
		
		
	}
	
		
	private Pageable gerarPaginacao(Integer page, Integer pageSize, String ordem, String props) {
		// TODO Auto-generated method stub
		return null;
	}


	@GetMapping(value="/{id}")
	public UsuarioResponse findById(@PathVariable("id") Long id) {
		return usuarioService.findById(id);
	}
	
	@PostMapping(value="/incluir")
	public UsuarioRequest incluirUsuario(@RequestBody UsuarioRequest usuarioRequest) {
		return usuarioService.incluirUsuario(usuarioRequest);
	}
	
	
	
	
	
	
	
	

}
