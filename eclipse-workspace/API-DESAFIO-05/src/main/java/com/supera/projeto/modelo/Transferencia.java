package com.supera.projeto.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table
public class Transferencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id ;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date data_transferencia;
	
	@Column(nullable = false)
	private double valor ;
	
	@Column(nullable = false)
	private String nome_operador_transacao ;
	
	private String tipo ;
	
	@ManyToOne
	@JoinColumn(name = "conta_id")
	private Conta conta ;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id_transferencia) {
		this.id = id_transferencia;
	}

	public Date getData_transferencia() {
		return data_transferencia;
	}

	public void setData_transferencia(Date data_transferencia) {
		this.data_transferencia = data_transferencia;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNome_operador_transacao() {
		return nome_operador_transacao;
	}

	public void setNome_operador_transacao(String nome_operador_transacao) {
		this.nome_operador_transacao = nome_operador_transacao;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	

}
