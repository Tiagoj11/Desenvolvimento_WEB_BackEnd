package com.example.balloons_now_rest.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private BigDecimal preco;
	private Boolean estoque;

	// Construtores
	public Produto(Long id, String nome, BigDecimal preco, Boolean estoque) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
	}	
	
	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}

	// getters e setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getpreco() {
		return preco;
	}
	public void setpreco(BigDecimal preco) {
		this.preco = preco;
	}
	public Boolean getEstoque() {
		return estoque;
	}
	public void setEstoque(Boolean estoque) {
		this.estoque = estoque;
	}		
	
}
