package com.supera.projeto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.supera.projeto.modelo.Transferencia;
import com.supera.projeto.repository.TransferenciaRepository;

@Service
public class TransferenciaServices {
	
	@Autowired
	TransferenciaRepository repository ;
	
	public TransferenciaServices(TransferenciaRepository repository) {
		
		this.repository = repository ;
	}
	
	public List<Transferencia> listAll(){
		
		return repository.findAll();	
	}
	
	public Optional<Transferencia> buscaNome(Integer id)
	{
		return repository.findById(id);
	}
	
		
}
