package com.projeto.models.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.models.dto.request.UsuarioRequest;
import com.projeto.models.dto.response.UsuarioResponse;
import com.projeto.models.model.Usuario;
import com.projeto.models.repository.UsuarioRepository;
import com.projeto.models.services.UsuarioService;

@Transactional
@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	@Override
	public List<UsuarioResponse> listarUsuario() {
		
		List<UsuarioResponse> usuariosResponse = new ArrayList<>();
		List<Usuario> usuarios = usuarioRepository.findAll();
		
		for (Usuario usuario:usuarios) {
			UsuarioResponse usuarioResponse = new UsuarioResponse();
		    usuarioResponse.setUsername(usuario.getUsername());
		    usuarioResponse.setEmail(usuario.getEmail());
		    usuariosResponse.add(usuarioResponse);
		}
		
        return usuariosResponse; 
	}

	@Override
	public UsuarioResponse findById(Long id) {
		Usuario usuario =  usuarioRepository.getById(id);
		UsuarioResponse usuarioResponse = new UsuarioResponse();
		
		usuarioResponse.setEmail(usuario.getEmail());
		usuarioResponse.setUsername(usuario.getUsername());
		
		return usuarioResponse;
		
	}

	@Override
	public UsuarioRequest incluirUsuario(UsuarioRequest usuarioRequest) {
		
		Usuario usuario = new Usuario();
		
		usuario.setEmail(usuarioRequest.getEmail());
		usuario.setUsername(usuarioRequest.getUsername());
		usuario.setPassword(usuarioRequest.getPassword());
		usuario.setConfirme(usuarioRequest.getConfirme());
		
		usuario = usuarioRepository.save(usuario);
						
		return usuarioRequest; 
	}

	@Override
	public Usuario alterarUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	@Override
	public void excluirUsuario(Long id) {
		usuarioRepository.deleteById(id);
		
	}

	

}
