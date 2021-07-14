package com.desafio.FabricaDeBolo.dto;

import com.desafio.FabricaDeBolo.model.Material;

public class MaterialDto {

	private String name;

	private Long quantity;

	private String user;

	public String getName() {
		return name;
	}

	public Long getQuantity() {
		return quantity;
	}

	public String getUser() {
		return user;
	}

	public Material toModel() {
		return new Material(name, quantity, user);
	}
}
