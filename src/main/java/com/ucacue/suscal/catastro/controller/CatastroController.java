package com.ucacue.suscal.catastro.controller;


import com.ucacue.suscal.catastro.entity.Catastro;
import com.ucacue.suscal.catastro.service.impl.CatastroServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;


@RestController
@RequestMapping("/catastro")
public class CatastroController {

	@Autowired
	CatastroServiceImpl catastroService;

	@GetMapping
	public ResponseEntity<List<Catastro>> getCatastro() {
		return new ResponseEntity<>(catastroService.list(), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Object> setCatastro( @Valid @RequestBody Catastro catastro) {
		Catastro pac = catastroService.save(catastro);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(pac.getClave())
				.toUri();
		return ResponseEntity.created(location).build();
	}
}
