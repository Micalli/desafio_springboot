package com.desafio.FabricaDeBolo.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_materiais")
public class Material {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMaterial;
	
	@NotNull
	private String name;
	
	@NotNull
	private Long quantity;
	
	@NotNull
	private String user;
	
	@CreationTimestamp
	private LocalDateTime createdDate;
	
	public Material(String name, Long quantity,String user) {
		this.name = name;
		this.quantity = quantity;
		this.user = user;
	}

	public Material() {}
	
	public Long getIdMaterial() {
		return idMaterial;
	}

	public String getName() {
		return name;
	}

	public Long getQuantity() {
		return quantity;
	}

	public String getUser() {
		return user;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String  getCreatedDate() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		return this.createdDate.format(formatter) ;
	}
	
}
