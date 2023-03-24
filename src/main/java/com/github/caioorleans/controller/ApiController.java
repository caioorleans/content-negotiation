package com.github.caioorleans.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.caioorleans.model.Contato;

@RestController
@RequestMapping("/contatos")
public class ApiController {
	
	private List<Contato> contatos = new ArrayList<Contato>();
	
	public ApiController() {
		contatos.add(new Contato("Fulano de Tal", "85 0000 0000"));
		contatos.add(new Contato("Fulano de Tal", "85 0000 0000"));
		contatos.add(new Contato("Fulano de Tal", "85 0000 0000"));
	}
	
	@GetMapping(produces= {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public List<Contato> getAll(){
		return contatos;
	}
	
	@PostMapping(
			produces= {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
			consumes= {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public Contato save(@RequestBody Contato c) {
		contatos.add(c);
		return c;
	}
	
	

}
