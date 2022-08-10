package com.projeto.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.models.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

}
