package com.pedro.basica.util;

import com.pedro.basica.caracteristicas.Genero;

public class Perfilador {
	private String[] acontecimentos = {"Adquiriu AIDS recentemente","Viciad$ em video-games",
			"Tem herpes","Parente faleceu recentemente","Seus pais se divorciaram",
			"Não fuma há %n anos","Aprendeu a dirigir com %n anos", "Sofre de Sindrome de Pânico",
			"Campeã& de Xadrez","Adora Filosofia","Adora Matemática","Adora História",
			"Está devendo ao banco","Fumante conhecido","Só bebe água","Não bebe cerveja",
			"Adotou ao veganismo","Incendiou a própria casa","Torcedor& de Futebol",
			"Adora jogos de golfe","Intolerante a glúten","Intolerante a lactose",
			"Peida mais do que o normal","Sofre de miopia","Sofre de hipermetropia",
			"Sofre de daltonismo","Coleciona selos","Coleciona moedas","Coleciona livros",
			"Joga lixo na rua","Frequentador& de igrejas","Já pisou em chiclete",
			"Já inundou a própria casa","Ama gatos","Ama cachorros","Odeia gatos",
			"Odeia cachorros","Ama o ar livre","Odeia o ar livre","Sempre gentil com todos",
			"Recebe bolsa família","Desenvolve jogos nos tempos livres", "Largou tudo pra seguir seu sonho",
			"Ama muito os pais","Odeia os pais", "Sortud&","Azarad$","Odeia calor","Ama calor",
			"Odeia frio","Ama frio","Está acima do peso","Não vê os pais à %n anos",
			"Compartilha fake news","Viaja muito","Era $ mais burr$ da escola","Era $ mais inteligente da escola",
			"Tem uma casa de praia","Tem pais ricos","Assiste anime","Adora arte moderna",
			"Odeia arte moderna", "Odeia anime","Adora funk","Odeia funk","Adora fazer poesias",
			"Aposta muito na loteria","Acredita em fantasmas","Decendente de franceses",
			"Decendente de russos","Decendente de alemães","Já foi na Disney","Usa lentes de contato",
			"Já doou um rim","Já doou sangue","Já foi pres$","Comediante sem graça","Adora coisas mórbidas",
			"Adora manhãs","Odeia manhãs","Adora noites","Odeia noites","Acredita em OVNIs",
			"Celebridade famosa","Recebeu multa recentemente","Se envolveu em briga de bar",
			"Rouba doce de criança","É alérgic$ à gatos","É alérgic$ à cachorros","É alérgic$ à poeira",
			"Apresenta glicose alta","Apresenta glicose baixa","Odeia internet","Jogador& profissional de LOL",
			"Jogador& profissional de campo minado","Jogador& profissional de WOW","Jogador& profissional de Dota",
			"Jogador& profissional de Minecraft","Toca violão","Toca piano","Toca viola",
			"Faz parte de um grupo de pagode","Faz parte de um grupo funk","Faz parte de uma banda de rock",
			"Faz parte de uma banda de reggae","Já foi expuls& da escola","Adora Lady Gaga",
			"Odeia Lady Gaga","Adora Britney Spears","Odeia Britney Spears","Veio de uma família pobre",
			"É descendente de monarcas","É descendente de escravos","É descendente de amebas",
			"Não acredita em sonhos","Já vandalizou patrimônio público","Viciad$ em jogos de cartas",
			"É racista","Mata formigas por diversão","Bebe sangue","É infantil",
			"Vive em paz consigo mesm$","Já comprou %n revistas da Playboy","Adora empinar pipa",
			"Acredita estar sendo observad$","Acredita que a terra é plana","Ganhou um celular novo",
			"Esqueceu do aniversário da mãe", "Esqueceu do aniversário do pai",
			"Já vendeu drogas","Já vendeu entorpecentes","Possui dupla personalidade",
			"Faz parte de uma gangue de traficantes", "Faz parte de uma gangue de motoqueiros",
			"Faz aeromodelismo", "Faz plasticomodelismo","Fez cirurgias plásticas recentemente",
			"Ganhou em uma aposta recente","Perdeu em uma aposta recente",
			"Adora pintar","Adora literaturas clássicas","Dá comida para os pombos",
			"Acredita na fada dos dentes","Acredita no coelho da páscoa",
			"Odeia gato preto","Operou o dente recentemente","Fala consigo mesm$ no espelho",
			"Quase afogou-se na piscina","Frequenta muito brechós","Frequentador& de bar",
			"É viciad$ em estalar dedos","Já ficou 4 dias sem tomar banho","Usa a escova de dentes dos outros",
			"Adora postar sobre sua vida no Facebook","Odeia praia","Adora praia","Já foi picad$ por abelha",
			"Adora mel","Odeia mel","Ouve música alta sem fones","Já caiu em pegadinha",
			"Spammer profissional","Acredita em tudo que ouve","Acredita em tudo que vê",
			"Adora bagunça","Odeia bagunça","Tem medo da própria sombra",
			"Faz o melhor bolo da vizinhança","O carro quebrou recentemente",
			"Não sabe dirigir","Sempre vota em branco nas eleições",
			"Nunca foi às urnas","Adora séries de comédia","Odeia séries de comédia",
			"Adora séries de drama","Odeia séries de drama","Adora séries de terror",
			"Odeia séries de terror","Tem %n irmãos e irmãs","Adora frutas",
			"Odeia frutas","Adotou ao Capitalismo","Adotou ao Comunismo",
			"Adotou ao Socialismo","É um& neonazista","Acredita em vida em Marte",
			"Lava sempre os pratos","Sempre lava as roupas","Odeia aniversários",
			"Adora aniversários","Odeia férias","Adora férias","Já invadiu a casa dos outros",
			"Arranha o carro dos outros","É bastante rabugent$","Beijou pela primeira vez aos %n anos",
			"Teve o seu primeiro amor aos %n anos","Tem vergonha do próprio corpo",
			"Sofre de TOC","Já mijou no meio da rua","Já cagou no meio da rua",
			"Sofre de insônia","Já se cortou com papel","Sofre de Claustrofobia",
			"Sofre de Agorafobia","Sofre de desvio de septo","Se estressa com facilidade",
			"Adora comer meleca de nariz","Jogador& de tênis","Já engoliu objetos estranhos",
			"Viciad$ em apostas","Recuperou-se de um trauma","Sofreu um trauma na infância",
			"Mágico amador","Comediante amador","Odeia truques de mágica","Bastante fotogênic$",
			"Foi traíd$ recentemente","Separou-se recentemente","Está solteir$ fazem %n anos",
			"Adora armas","Ambientalista","Coleciona conchas","Já deixou o celular cair na privada",
			"Já perdeu as chaves %n vezes","Usa óculos","Usa óculos com lente colorida",
			"Já perdeu o celular %n vezes","Adora comer insetos","Tem %n amigos e amigas",
			"Desativou suas redes sociais recentemente","Já viajou para %n lugares",
			"Já bebeu água do mar","Coloca feijão em pote de sorvete","Adora fazer trilhas",
			"Toca oboé","Toca flauta","Toca gaita","Faz parte de uma oposição contra o governo",
			"É parente de uma pessoa importante","É parente de uma celebridade","É um& diplomata",
			"Está no programa de proteção a testemunha","Usa tornozeleira eletrônica",
			"Mente muito","Sempre fala a verdade","Sempre fala o que pensa","Nunca andou de metrô",
			"Nunca andou de ônibus","Nunca andou de bicicleta","Nunca andou de avião",
			"Só anda de bicicleta","Só anda de ônibus","Mora de baixo de uma ponte",
			"Mora ao lado de um riacho","Tem uma paixão por números","Tem um imaginário forte",
			"Apresenta um sexto sentido","Já quebrou um recorde mundial","Sempre fica se desafiando"};
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
		return "Sem informações";
	}
}
