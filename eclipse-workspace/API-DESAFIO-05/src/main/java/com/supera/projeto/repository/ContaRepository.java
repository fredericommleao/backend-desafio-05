package com.supera.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.supera.projeto.modelo.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Integer> {

}
