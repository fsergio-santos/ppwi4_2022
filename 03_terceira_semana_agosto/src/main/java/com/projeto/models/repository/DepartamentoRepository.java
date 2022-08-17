package com.projeto.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.models.model.Departamento;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Long>{

}
