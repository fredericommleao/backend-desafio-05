package com.supera.projeto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supera.projeto.modelo.Transferencia;
import com.supera.projeto.services.TransferenciaServices;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class Api {
	
	TransferenciaServices services ;
	
	public Api(TransferenciaServices services)
	{
		this.services = services ;
	}
	
	@GetMapping("/lista")
	public List<Transferencia> listaAll(){
		
		return services.listAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Transferencia> buscaId(@PathVariable("id") Integer id){
		return services.buscaNome(id);
	}
	
	
}
