package com.desafio.FabricaDeBolo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.FabricaDeBolo.model.Materiais;

@Repository
public interface MaterialRepository extends JpaRepository<Materiais, Long> {

	public List<Materiais> findAllByIdMaterialContaining(Long idMaterial);
	
	public List<Materiais> findAllByNomeContainingIgnoreCase(String nome);
	
}
