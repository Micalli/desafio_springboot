package com.desafio.FabricaDeBolo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.FabricaDeBolo.model.Material;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Long> {
	
	public List<Material> findAllByNameContainingIgnoreCase(String name);
	
	public List<Material> findAllByUserContainingIgnoreCase(String user);
	
	
}
