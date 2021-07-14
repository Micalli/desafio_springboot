package com.desafio.FabricaDeBolo.dto;

import com.desafio.FabricaDeBolo.model.Material;
import com.desafio.FabricaDeBolo.repository.MaterialRepository;

public class PutMaterialDto {

	private Long quantity;

	private String user;

	

	public Long getQuantity() {
		return quantity;
	}

	public String getUser() {
		return user;
	}

	public  Material update(Long id, MaterialRepository repository) {
		Material material = repository.getOne(id);
		material.setQuantity(quantity);
		material.setUser(user);
		return material;
	}
}
