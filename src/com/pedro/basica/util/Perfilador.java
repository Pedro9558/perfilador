package com.pedro.basica.util;

import com.pedro.basica.caracteristicas.Genero;

public class Perfilador {
	private String[] acontecimentos = {"Adquiriu AIDS recentemente","Viciad$ em video-games",
			"Tem herpes","Parente faleceu recentemente","Seus pais se divorciaram",
			"N�o fuma h� %n anos","Aprendeu a dirigir com %n anos", "Sofre de Sindrome de P�nico",
			"Campe�& de Xadrez","Adora Filosofia","Adora Matem�tica","Adora Hist�ria",
			"Est� devendo ao banco","Fumante conhecido","S� bebe �gua","N�o bebe cerveja",
			"Adotou ao veganismo","Incendiou a pr�pria casa","Torcedor& de Futebol",
			"Adora jogos de golfe","Intolerante a gl�ten","Intolerante a lactose",
			"Peida mais do que o normal","Sofre de miopia","Sofre de hipermetropia",
			"Sofre de daltonismo","Coleciona selos","Coleciona moedas","Coleciona livros",
			"Joga lixo na rua","Frequentador& de igrejas","J� pisou em chiclete",
			"J� inundou a pr�pria casa","Ama gatos","Ama cachorros","Odeia gatos",
			"Odeia cachorros","Ama o ar livre","Odeia o ar livre","Sempre gentil com todos",
			"Recebe bolsa fam�lia","Desenvolve jogos nos tempos livres", "Largou tudo pra seguir seu sonho",
			"Ama muito os pais","Odeia os pais", "Sortud&","Azarad$","Odeia calor","Ama calor",
			"Odeia frio","Ama frio","Est� acima do peso","N�o v� os pais � %n anos",
			"Compartilha fake news","Viaja muito","Era $ mais burr$ da escola","Era $ mais inteligente da escola",
			"Tem uma casa de praia","Tem pais ricos","Assiste anime","Adora arte moderna",
			"Odeia arte moderna", "Odeia anime","Adora funk","Odeia funk","Adora fazer poesias",
			"Aposta muito na loteria","Acredita em fantasmas","Decendente de franceses",
			"Decendente de russos","Decendente de alem�es","J� foi na Disney","Usa lentes de contato",
			"J� doou um rim","J� doou sangue","J� foi pres$","Comediante sem gra�a","Adora coisas m�rbidas",
			"Adora manh�s","Odeia manh�s","Adora noites","Odeia noites","Acredita em OVNIs",
			"Celebridade famosa","Recebeu multa recentemente","Se envolveu em briga de bar",
			"Rouba doce de crian�a","� al�rgic$ � gatos","� al�rgic$ � cachorros","� al�rgic$ � poeira",
			"Apresenta glicose alta","Apresenta glicose baixa","Odeia internet","Jogador& profissional de LOL",
			"Jogador& profissional de campo minado","Jogador& profissional de WOW","Jogador& profissional de Dota",
			"Jogador& profissional de Minecraft","Toca viol�o","Toca piano","Toca viola",
			"Faz parte de um grupo de pagode","Faz parte de um grupo funk","Faz parte de uma banda de rock",
			"Faz parte de uma banda de reggae","J� foi expuls& da escola","Adora Lady Gaga",
			"Odeia Lady Gaga","Adora Britney Spears","Odeia Britney Spears","Veio de uma fam�lia pobre",
			"� descendente de monarcas","� descendente de escravos","� descendente de amebas",
			"N�o acredita em sonhos","J� vandalizou patrim�nio p�blico","Viciad$ em jogos de cartas",
			"� racista","Mata formigas por divers�o","Bebe sangue","� infantil",
			"Vive em paz consigo mesm$","J� comprou %n revistas da Playboy","Adora empinar pipa",
			"Acredita estar sendo observad$","Acredita que a terra � plana","Ganhou um celular novo",
			"Esqueceu do anivers�rio da m�e", "Esqueceu do anivers�rio do pai",
			"J� vendeu drogas","J� vendeu entorpecentes","Possui dupla personalidade",
			"Faz parte de uma gangue de traficantes", "Faz parte de uma gangue de motoqueiros",
			"Faz aeromodelismo", "Faz plasticomodelismo","Fez cirurgias pl�sticas recentemente",
			"Ganhou em uma aposta recente","Perdeu em uma aposta recente",
			"Adora pintar","Adora literaturas cl�ssicas","D� comida para os pombos",
			"Acredita na fada dos dentes","Acredita no coelho da p�scoa",
			"Odeia gato preto","Operou o dente recentemente","Fala consigo mesm$ no espelho",
			"Quase afogou-se na piscina","Frequenta muito brech�s","Frequentador& de bar",
			"� viciad$ em estalar dedos","J� ficou 4 dias sem tomar banho","Usa a escova de dentes dos outros",
			"Adora postar sobre sua vida no Facebook","Odeia praia","Adora praia","J� foi picad$ por abelha",
			"Adora mel","Odeia mel","Ouve m�sica alta sem fones","J� caiu em pegadinha",
			"Spammer profissional","Acredita em tudo que ouve","Acredita em tudo que v�",
			"Adora bagun�a","Odeia bagun�a","Tem medo da pr�pria sombra",
			"Faz o melhor bolo da vizinhan�a","O carro quebrou recentemente",
			"N�o sabe dirigir","Sempre vota em branco nas elei��es",
			"Nunca foi �s urnas","Adora s�ries de com�dia","Odeia s�ries de com�dia",
			"Adora s�ries de drama","Odeia s�ries de drama","Adora s�ries de terror",
			"Odeia s�ries de terror","Tem %n irm�os e irm�s","Adora frutas",
			"Odeia frutas","Adotou ao Capitalismo","Adotou ao Comunismo",
			"Adotou ao Socialismo","� um& neonazista","Acredita em vida em Marte",
			"Lava sempre os pratos","Sempre lava as roupas","Odeia anivers�rios",
			"Adora anivers�rios","Odeia f�rias","Adora f�rias","J� invadiu a casa dos outros",
			"Arranha o carro dos outros","� bastante rabugent$","Beijou pela primeira vez aos %n anos",
			"Teve o seu primeiro amor aos %n anos","Tem vergonha do pr�prio corpo",
			"Sofre de TOC","J� mijou no meio da rua","J� cagou no meio da rua",
			"Sofre de ins�nia","J� se cortou com papel","Sofre de Claustrofobia",
			"Sofre de Agorafobia","Sofre de desvio de septo","Se estressa com facilidade",
			"Adora comer meleca de nariz","Jogador& de t�nis","J� engoliu objetos estranhos",
			"Viciad$ em apostas","Recuperou-se de um trauma","Sofreu um trauma na inf�ncia",
			"M�gico amador","Comediante amador","Odeia truques de m�gica","Bastante fotog�nic$",
			"Foi tra�d$ recentemente","Separou-se recentemente","Est� solteir$ fazem %n anos",
			"Adora armas","Ambientalista","Coleciona conchas","J� deixou o celular cair na privada",
			"J� perdeu as chaves %n vezes","Usa �culos","Usa �culos com lente colorida",
			"J� perdeu o celular %n vezes","Adora comer insetos","Tem %n amigos e amigas",
			"Desativou suas redes sociais recentemente","J� viajou para %n lugares",
			"J� bebeu �gua do mar","Coloca feij�o em pote de sorvete","Adora fazer trilhas",
			"Toca obo�","Toca flauta","Toca gaita","Faz parte de uma oposi��o contra o governo",
			"� parente de uma pessoa importante","� parente de uma celebridade","� um& diplomata",
			"Est� no programa de prote��o a testemunha","Usa tornozeleira eletr�nica",
			"Mente muito","Sempre fala a verdade","Sempre fala o que pensa","Nunca andou de metr�",
			"Nunca andou de �nibus","Nunca andou de bicicleta","Nunca andou de avi�o",
			"S� anda de bicicleta","S� anda de �nibus","Mora de baixo de uma ponte",
			"Mora ao lado de um riacho","Tem uma paix�o por n�meros","Tem um imagin�rio forte",
			"Apresenta um sexto sentido","J� quebrou um recorde mundial","Sempre fica se desafiando"};
	public String getAcontecimento(Genero genero, int idade) {
		if(idade >= 18) {
			int n = (int)(Math.random()*acontecimentos.length);
			int i = (int)(Math.random() * idade + 2);
			System.out.println("n = "+ n);
			System.out.println("i2 = " + i);
			if(genero == Genero.FEMININO) {
				return acontecimentos[n].replace("$", "a").replace("&", "a").replace("%n", ""+i);
			}else {
				return acontecimentos[n].replace("$", "o").replace("&", "").replace("%n", ""+i);
			}
		}
		return "Sem informa��es";
	}
}
