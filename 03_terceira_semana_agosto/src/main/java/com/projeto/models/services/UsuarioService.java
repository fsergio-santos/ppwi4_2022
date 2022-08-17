package com.projeto.models.services;

import java.util.List;

import com.projeto.models.dto.request.UsuarioRequest;
import com.projeto.models.dto.response.UsuarioResponse;
import com.projeto.models.model.Usuario;

public interface UsuarioService {
	
	public List<UsuarioResponse> listarUsuario();
	public UsuarioResponse findById(Long id);
	public UsuarioRequest incluirUsuario(UsuarioRequest usuarioRequest);
	public Usuario alterarUsuario(Usuario usuario);
	public void excluirUsuario(Long id);

}
