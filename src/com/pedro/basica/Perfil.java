package com.pedro.basica;

import com.pedro.basica.caracteristicas.CorCabelo;
import com.pedro.basica.caracteristicas.EnderecoBrasileiro;
import com.pedro.basica.caracteristicas.Genero;
import com.pedro.basica.caracteristicas.TipoCabelo;
import com.pedro.basica.caracteristicas.FormaFisica;

public class Perfil {
	private String nome;
	private String emprego;
	private String textoIdade;
	private short idade;
	private EnderecoBrasileiro endereco;
	private Genero genero;
	private CorCabelo cor;
	private TipoCabelo cabelo;
	private FormaFisica fisica;
	private String descricao;
	public Perfil(String nome, short idade, Genero genero, CorCabelo cor, TipoCabelo cabelo, FormaFisica forma) {
		this(nome, idade, genero, cor, cabelo, forma, genero == Genero.FEMININO ? "Desempregada" : "Desempregado", "Sem descrição");
	}
	public Perfil(String nome, short idade, Genero genero, CorCabelo cor, TipoCabelo cabelo, FormaFisica forma, String emprego) {
		this(nome, idade, genero, cor, cabelo, forma, emprego, "Sem descrição");
	}
	public Perfil(String nome, short idade, Genero genero, CorCabelo cor, TipoCabelo cabelo, FormaFisica forma, String emprego, String descricao) {
		this.nome = nome;
		this.idade = idade > 0 ? idade : 0;
		this.genero = genero;
		this.cabelo = cabelo;
		this.cor = cor;
		this.fisica = forma;
		this.emprego = emprego;
		this.descricao = descricao;
		this.ajustesFinais();
	}
	private void ajustesFinais() {
		if(idade>=0 && idade <5)
			this.textoIdade = "Criança Pequena";
		else if(idade>=5 && idade < 12)
			this.textoIdade = "Criança";
		else if(idade>=12 && idade < 18)
			this.textoIdade = "Adolescente";
		else if(idade>=18 && idade<30)
			this.textoIdade = genero == Genero.FEMININO ? "Jovem Adulta" : "Jovem Adulto";
		else if(idade>=30 && idade<63)
			this.textoIdade = genero == Genero.FEMININO ? "Adulta" : "Adulto";
		else if(idade>=63)
			this.textoIdade = genero == Genero.FEMININO ? "Idosa" : "Idoso";
		else
			this.textoIdade = "Indefinido";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTextoIdade() {
		return textoIdade;
	}
	public short getIdade() {
		return idade;
	}
	public void setIdade(short idade) {
		this.idade = idade > 0 ? idade : 0;
	}
	public EnderecoBrasileiro getEndereco() {
		return endereco;
	}
	public void setEndereco(EnderecoBrasileiro endereco) {
		this.endereco = endereco;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public CorCabelo getCor() {
		return cor;
	}
	public void setCor(CorCabelo cor) {
		this.cor = cor;
	}
	public TipoCabelo getCabelo() {
		return cabelo;
	}
	public void setCabelo(TipoCabelo cabelo) {
		this.cabelo = cabelo;
	}
	public FormaFisica getFisica() {
		return fisica;
	}
	public void setFisica(FormaFisica fisica) {
		this.fisica = fisica;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getEmprego() {
		return emprego;
	}
	public void setEmprego(String emprego) {
		this.emprego = emprego;
	}
	@Override
	public String toString() {
		return "Detalhes do perfil: \n" +
				"Nome: " + this.nome +
				"Idade: " + this.idade + " anos" +
				"Descrição idade: " + this.textoIdade +
				"Genero: " + this.genero +
				"Cor do cabelo:" + this.cor +
				"Forma do Cabelo: " + this.cabelo +
				"Aparência física: " + this.fisica +
				"Emprego: " + this.emprego + 
				"Detalhes da Vida:" + this.descricao;
	}
}
