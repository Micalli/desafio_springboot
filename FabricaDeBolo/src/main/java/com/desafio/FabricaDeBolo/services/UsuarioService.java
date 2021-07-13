package com.desafio.FabricaDeBolo.services;



import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.desafio.FabricaDeBolo.model.Usuario;
import com.desafio.FabricaDeBolo.model.UsuarioLogin;
import com.desafio.FabricaDeBolo.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired private UsuarioRepository repository;

	
	public Usuario CadastrarUsuario(Usuario usuario) {

		return repository.save(usuario);
	}
	
	public Optional<UsuarioLogin> Logar(Optional<UsuarioLogin> user ) {

		
		Optional<Usuario> usuario = repository.findByUsuario(user.get().getUsuario());
		
		

		if (usuario.isPresent()) {
			
			
			user.get().setIdUsuario(usuario.get().getIdUsuario());
			user.get().setRE(usuario.get().getRE());
			user.get().setUsuario(usuario.get().getUsuario());
			
			
				return user;
		}
		return null;
	}
	
	
}
