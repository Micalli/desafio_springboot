package com.desafio.FabricaDeBolo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.FabricaDeBolo.model.Materiais;
import com.desafio.FabricaDeBolo.repository.MaterialRepository;

@RestController
@RequestMapping("/materiais")
@CrossOrigin("*")
public class MaterialController {

		@Autowired
		private MaterialRepository repository;
		
		
		@GetMapping
		public ResponseEntity<List<Materiais>> getAll()
		{
			return ResponseEntity.ok(repository.findAll());
		}
		
		@GetMapping("/nome/{nome}")
		public ResponseEntity<List<Materiais>> getByName (@PathVariable String nome){
			return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
		}
		
		@PostMapping("/cadastrar")
		public ResponseEntity<Materiais> post (@RequestBody String nome, @RequestBody Long quantidade, @RequestBody String usuario ){
			Materiais materias = new Materiais();
			materias.setNome(nome)
			materias.setQuantidade(quantidade)
			materias.set(usuario)
			return  ResponseEntity.status(HttpStatus.CREATED)
						.body(repository.save(materiais));
		}
		
		
		@PutMapping
		public ResponseEntity<Materiais> put (@RequestBody Materiais materiais  ){
			
			return ResponseEntity.ok(repository.save(materiais));
			
			
		}
	
		
}
