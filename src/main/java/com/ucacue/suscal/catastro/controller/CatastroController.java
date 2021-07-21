package com.ucacue.suscal.catastro.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/catastro")
public class CatastroController {

	@GetMapping
	public ResponseEntity<String> getCatastro() {
		return new ResponseEntity<>("Hola mundo este es un catastro", HttpStatus.OK);
	}

}
