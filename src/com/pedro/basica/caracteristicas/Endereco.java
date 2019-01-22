package com.pedro.basica.caracteristicas;

public abstract class Endereco {
	private String nomeRua;
	public abstract String getRua();
	public Endereco(String nome) {
		this.nomeRua = nome;
	}
	public String getNomeRua() {
		return this.nomeRua;
	}
}
