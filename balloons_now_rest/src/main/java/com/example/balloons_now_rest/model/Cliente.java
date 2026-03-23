package com.example.balloons_now_rest.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private LocalDate dataInclusao;

	// Construtores
	public Cliente(Long id, String nome, LocalDate dataInclusao) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataInclusao = dataInclusao;
	}		
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	// getter e setters
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
	public LocalDate getDataInclusao() {
		return dataInclusao;
	}
	public void setDataInclusao(LocalDate dataInclusao) {
		this.dataInclusao = dataInclusao;
	}
	
}
