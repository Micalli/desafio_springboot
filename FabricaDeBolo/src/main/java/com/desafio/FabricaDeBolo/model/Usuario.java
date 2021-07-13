package com.desafio.FabricaDeBolo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;


@Entity
@Table(name = "tb_usuarios")
public class Usuario {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	
	@NotNull
	private String usuario;
	
	@NotNull
	private Long RE;
	
	@OneToMany(mappedBy = "usuarioPostador", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JsonIgnoreProperties
	private List<Materiais> materiaisPostados = new ArrayList<>();


	public Long getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public Long getRE() {
		return RE;
	}


	public void setRE(Long rE) {
		RE = rE;
	}


	public List<Materiais> getMateriaisPostados() {
		return materiaisPostados;
	}


	public void setMateriaisPostados(List<Materiais> materiaisPostados) {
		this.materiaisPostados = materiaisPostados;
	}
	
	
	
}
          