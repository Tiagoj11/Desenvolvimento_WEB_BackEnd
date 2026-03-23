package com.example.balloons_now_rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer quantidade;
	private long clienteID;
	private long produtoID;
	
	// Construtores
	public Pedido(Long id, long clienteID, long produtoID, Integer quantidade) {
		super();
		this.id = id;
		this.clienteID = clienteID;
		this.produtoID = produtoID;
		this.quantidade = quantidade;
	}		
	
	public Pedido() {
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
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public long getClienteID() {
		return clienteID;
	}
	public void setClienteID(long clienteID) {
		this.clienteID = clienteID;
	}
	public long getProdutoID() {
		return produtoID;
	}
	public void setProdutoID(long produtoID) {
		this.produtoID = produtoID;
	}
	
}
