package com.supera.projeto.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.supera.projeto.modelo.Transferencia;


@Repository
public interface TransferenciaRepository extends JpaRepository<Transferencia, Integer>{
	
	
}
