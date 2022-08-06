package com.projeto.models.services.impl;

import org.springframework.stereotype.Service;

import com.projeto.models.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Override
	public String listarUsuario() {
		return "programando com Spring";
	}

}
