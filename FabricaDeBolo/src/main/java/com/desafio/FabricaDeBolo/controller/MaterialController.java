package com.desafio.FabricaDeBolo.controller;

import java.util.List;
import java.util.Optional;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.FabricaDeBolo.dto.MaterialDto;
import com.desafio.FabricaDeBolo.dto.PutMaterialDto;
import com.desafio.FabricaDeBolo.model.Material;
import com.desafio.FabricaDeBolo.repository.MaterialRepository;


@RestController
@RequestMapping("/rawMaterials")
@CrossOrigin("*")
public class MaterialController {

		@Autowired
		private MaterialRepository repository;
		
		@GetMapping
		public ResponseEntity<List<Material>> getByName (@RequestParam(required = false) String name, @RequestParam(required = false)  String user){
			if((name==null && user==null) || (name!=null && user!=null)) {
				return ResponseEntity.badRequest().build();
			}
			
			if(name!=null) {
				return ResponseEntity.ok(repository.findAllByNameContainingIgnoreCase(name));
			}
			
			return ResponseEntity.ok(repository.findAllByUserContainingIgnoreCase(user));
			
		}
		
		@PostMapping
		public ResponseEntity<Material> post (@RequestBody MaterialDto request){
			
			Material novoMaterial = request.toModel();			
			repository.save(novoMaterial);
			
			return ResponseEntity.status(HttpStatus.CREATED).body(novoMaterial);
		}
		
		@PutMapping("{id}/request")
		public ResponseEntity<Material> put (@PathVariable Long id, @RequestBody  PutMaterialDto request){
			
			Optional<Material> material = repository.findById(id);
			if(material.isEmpty()) return ResponseEntity.notFound().build();
			
			Material materialEncontrado = request.update(id, repository);
			
			repository.save(materialEncontrado);
			
			return ResponseEntity.ok(materialEncontrado);
			
				
		}	
}
