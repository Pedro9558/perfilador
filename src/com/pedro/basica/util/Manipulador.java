package com.pedro.basica.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.pedro.basica.Perfil;
import com.pedro.basica.caracteristicas.CorCabelo;
import com.pedro.basica.caracteristicas.FormaFisica;
import com.pedro.basica.caracteristicas.Genero;
import com.pedro.basica.caracteristicas.TipoCabelo;

// Manipulador de Perfis
public class Manipulador {
	private File dados;
	private String SO = System.getProperty("os.name").toLowerCase();
	private String diretorio = "";
	private Nomeador n = new Nomeador();
	private Perfilador p = new Perfilador();
	private BufferedWriter writer;
	private Log log = null;
	private int cont;
	public Manipulador() {
		try {
			preparaTudo();
		} catch (IOException e) {
			log.registra("Erro ao criar arquivo de perfil!", Log.Niveis.ERRO);
			log.registra(e);
			e.printStackTrace();
		}
	}
	private void preparaTudo() throws java.io.IOException {
		// Captura o log
		log = Log.getInstancia();
		// Cria a parte inicial do diretorio de acordo com o sistema operacional em uso
		if(SO.contains("win")) {
			diretorio = System.getenv("AppData");
		}else {
			diretorio = System.getProperty("user.home");
			diretorio += "/Library/Application Support";
		}
		log.registra("Sistema do usuário capturado: " + SO);
		String temp = "";
		String tempDir = diretorio;
		log.registra("Criando arquivo de perfil...");
		for(int i = 0; i < Integer.MAX_VALUE; i++) {
			tempDir += "/perfiler/" + "Perfis"+ i + ".txt";
			log.registra("Testando diretório: "+ tempDir);
			dados = new File(tempDir);
			if(!dados.exists()) {
				dados.createNewFile();
				temp = "Perfis" + i + ".txt";
				log.registra("Arquivo criado! Localizado em: "+ tempDir);
				break;
			}else {log.registra("Diretório ocupado! Tentando outro...",Log.Niveis.AVISO);tempDir = diretorio;}
		}
		diretorio += "/perfiler/";
		diretorio += temp;
		writer = new BufferedWriter(new FileWriter(diretorio));
	}
	/**
	 * Adiciona um perfil aos arquivos de perfis gerados
	 * @param perfil
	 * @return
	 * @throws IOException
	 */
	public boolean adicionaPerfil(Perfil perfil) throws IOException {
		if(perfil != null) {
			cont++;
			log.registra("Adicionando perfil número "+cont);
			writer.write("Perfil "+ cont + ":");
			writer.newLine();
			writer.write("Nome: " + perfil.getNome());
			writer.newLine();
			writer.write("Idade: " + perfil.getIdade());
			writer.newLine();
			writer.write("Descrição idade: " + perfil.getTextoIdade());
			writer.newLine();
			writer.write("Gênero: " + perfil.getGenero());
			writer.newLine();
			writer.write("Cor do cabelo: " + perfil.getCor());
			writer.newLine();
			writer.write("Tipo do cabelo: " + perfil.getCabelo());
			writer.newLine();
			writer.write("Aparência física: " + perfil.getFisica());
			writer.newLine();
			writer.write("Emprego: " + perfil.getEmprego());
			writer.newLine();
			writer.write("Detalhes da vida:" + perfil.getDescricao());
			writer.newLine();
			log.registra("Perfil escrito... Adicionando...");
			writer.flush();
			log.registra("Adicionado ao arquivo!");
			return true;
		}
		log.registra("Perfil passado tinha o valor nulo! Desconsiderando...", Log.Niveis.AVISO);
		return false;
	}
	/**
	 * Gera um perfil aleatório
	 * @return
	 */
	public Perfil criarPerfilAleatorio() {
		long ct = System.currentTimeMillis();
		log.registra("Criando perfil aleatório...");
		log.registra("Definindo gênero...");
		// definindo genero
		int g = (int) (Math.random() * 2);
		System.out.println("g = "+g);
		Genero ge = g == 0 ? Genero.MASCULINO : Genero.FEMININO;
		log.registra("Gênero criado! -> " + ge);
		// definindo nome
		log.registra("Definindo nome...");
		String nome = n.criarNome(ge);
		log.registra("Nome criado! -> "+ nome);
		// definindo acontecimento
		log.registra("Definindo acontecimento...");
		int i = (int)(Math.random() * 97 + 2); // idade
		System.out.println("i = " + i);
		String detalhes = p.getAcontecimento(ge, i);
		log.registra("Acontecimento criado! -> " + detalhes);
		
		// definindo forma fisica através de chances
		log.registra("Definindo forma física...");
		int c = (int)(Math.random() * 700);
		FormaFisica ff = null;
		// 0-50 = Esqueletico
		// 50-150 = Magro
		// 150-300 = Magrinho
		// 300-400 = Normal
		// 400-550 = Cheinho
		// 550-600 = Cheio
		// 600-680 = Gordo
		// 680-700 = Baleia
		if(c >= 0 && c < 50)
			ff = FormaFisica.ESQUELETICO;
		else if(c >= 50 && c < 150)
			ff = FormaFisica.MAGRO;
		else if(c >= 150 && c < 300)
			ff = FormaFisica.MAGRINHO;
		else if(c >= 300 && c < 400)
			ff = FormaFisica.NORMAL;
		else if(c >= 400 && c < 550)
			ff = FormaFisica.CHEINHO;
		else if(c >= 550 && c < 600)
			ff = FormaFisica.CHEIO;
		else if(c >= 600 && c < 680)
			ff = FormaFisica.GORDO;
		else if(c >= 680)
			ff = FormaFisica.BALEIA;
		log.registra("Forma física definida! -> " + ff);
		// definindo forma do cabelo através de chances
		TipoCabelo tc = null;
		log.registra("Definindo tipo de cabelo...");
		c = (int)(Math.random() * 700);
		/*
		 * 0-200 = Liso
		 * 200-300 = Ondulado
		 * 300-400 = Cacheado
		 * 400-550 = Crespo
		 * 550-650 = Calvo (Mulher? -> Crespo ou Liso)
		 * 650-700 = Careca
		 */
		if(c >= 0 && c < 200)
			tc = TipoCabelo.LISO;
		else if(c >= 200 && c < 300)
			tc = TipoCabelo.ONDULADO;
		else if(c >= 300 && c < 400)
			tc = TipoCabelo.CACHEADO;
		else if(c >= 400 && c < 550)
			tc = TipoCabelo.CRESPO;
		else if(c >= 550 && c < 650)
			if(ge == Genero.FEMININO)
				if(c % 2 == 0)
					tc = TipoCabelo.LISO;
				else
					tc = TipoCabelo.CRESPO;
			else if(i > 40)
				tc = TipoCabelo.CALVO;
			else
				if(c % 2 == 0)
					tc = TipoCabelo.LISO;
				else
					tc = TipoCabelo.CRESPO;
		else
			tc = TipoCabelo.CARECA;
		log.registra("Tipo de cabelo definido! -> "+ tc);
		// definindo cor do cabelo através de chances
		log.registra("Definindo cor de cabelo...");
		CorCabelo cc = null;
		c = (int)(Math.random() * 700);
		/*
		 * 0-300 = Preto
		 * 300-400 = Loiro
		 * 400-420 = Ruivo
		 * 420-620 = Castanho
		 * 620-630 = Azul
		 * 630-640 = Verde
		 * 640-650 = Rosa
		 * 650-660 = Laranja
		 * 660-670 = Roxo
		 * 670-680 = Platinado
		 */
		if(c >= 0 && c < 300)
			cc = CorCabelo.PRETO;
		else if(c >= 300 && c < 400)
			cc = CorCabelo.LOIRO;
		else if(c >= 400 && c < 420)
			cc = CorCabelo.RUIVO;
		else if(c >= 420 && c < 620)
			cc = CorCabelo.CASTANHO;
		else if(c >= 620 && c < 630)
			cc = CorCabelo.AZUL;
		else if(c >= 630 && c < 640)
			cc = CorCabelo.VERDE;
		else if(c >= 640 && c < 650)
			cc = CorCabelo.ROSA;
		else if(c >= 650 && c < 660)
			cc = CorCabelo.LARANJA;
		else if(c >= 660 && c < 670)
			cc = CorCabelo.ROXO;
		else if(c >= 670 && c < 680)
			cc = CorCabelo.ROXO;
		else
			cc = CorCabelo.CASTANHO;
		// Idoso?
		log.registra("É idoso? -> " + (i >= 60));
		if (i >= 60)
			if(c > 300)
				cc = CorCabelo.GRISALHO;
		log.registra("Cor de cabelo criado! -> " + cc);
		// definindo emprego
		log.registra("Definindo emprego...");
		String emprego = GeradorEmpregos.gerarEmprego((short)i, ge);
		log.registra("Emprego definido! -> " + emprego);
		// perfil
		log.registra("Finalizando...");
		Perfil p = new Perfil(nome, (short)i, ge, cc, tc, ff, emprego, detalhes);
		log.registra("Adicionando perfil...");
		try {
			this.adicionaPerfil(p);
		} catch (IOException e) {
			log.registra("Erro ao adicionar perfil!", Log.Niveis.ERRO);
			log.registra(e);
			e.printStackTrace();
		}
		log.registra("Pronto! " + ((System.currentTimeMillis() - ct)/1000) + "s");
		return p;
	}
}
