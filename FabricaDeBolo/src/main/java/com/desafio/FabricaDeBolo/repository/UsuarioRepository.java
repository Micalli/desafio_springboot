package com.desafio.FabricaDeBolo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.desafio.FabricaDeBolo.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public List<Usuario> findAllByIdUsuarioContaining(Long idUsuario);
	
	public Optional<Usuario> findByUsuario(String usuario);
	


}
