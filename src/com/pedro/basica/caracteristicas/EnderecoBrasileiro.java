package com.pedro.basica.caracteristicas;

public class EnderecoBrasileiro extends Endereco {
	private String bairro;
	private String cidade;
	private int numero;
	private SiglasEstados estado;
	public EnderecoBrasileiro(String nome, int numero, String bairro, String cidade, SiglasEstados estado) {
		super(nome);
		this.numero = numero;
		this.bairro = bairro;
		this.estado = estado;
	}
	@Override
	public String getRua() {
		return this.getNomeRua() + ", " + this.numero + "\n" +
				this.bairro + "\n"+
				this.cidade + " - " + this.estado;
	}
	@Override
	public String toString() {
		return this.getRua();
	}
	enum SiglasEstados {
		AP,AM,AL,AC,BA,CE,DF,ES,GO,MA,MT,MS,MG,PA,PB,PR,PE,PI,RJ,RN,RS,RO,RR,SC,SP,SE,TO
	}
}
