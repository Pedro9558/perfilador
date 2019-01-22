package com.pedro.basica.util;

import com.pedro.basica.caracteristicas.Genero;

public class GeradorEmpregos {
	private static String[] empregos = {"Desempregad$",
			"Zelador&", 
			"Programador&",
			"Atendente",
			"Segurança",
			"Entregador& de Pizza",
			"Entregador& de Comida Chinesa",
			"Entregador& de Correspondências",
			"Motorista de Uber",
			"Taxista",
			"Professor&",
			"Veterinári$",
			"Médic$",
			"Policial",
			"Bombeir$",
			"Tester",
			"Encanador&",
			"Mecânic$",
			"Estagiári$",
			"Ator&",
			"Cantor&",
			"Barista",
			"Consultor&",
			"Cabeleireir$",
			"Engenheir$ Civil",
			"Engenheir$ Mecânic$",
			"Vendedor& de Rua",
			"Caixa de Supermercado",
			"Cozinheir$",
			"Designer",
			"Empregad$",
			"Babá"};
	private static final int rangeMax = 480;
	// Valores usados para determinar as chances de um determinado emprego ser gerado
	private static int[] ranges = {0 , // Desempregado - Valor não utilizado
			45, // Zelador
			11, // Programador
			29, // Atendente
			37, // Segurança
			40, // Entregador da Pizza
			21, // Entregador de Comida Chinesa
			41, // Entregador de Correspondências
			57, // Uber
			51, // Taxista
			66, // Professor
			14, // Veterinário
			5, // Médico
			28, // Policial
			17, // Bombeiro
			4, // Tester
			32, // Encanador
			12, // Mecânico
			75, // Estagiário
			2, // Ator
			13, // Cantor
			11, // Barista
			8, // Consultor
			24, // Cabeleireiro
			11, // Engenheiro Civil
			11, // Engenheiro Mecânico
			24, // Vendedor de Rua
			46, // Caixa de Supermercado
			22, // Cozinheiro
			22, // Designer
			33, // Empregado
			30, // Babá (32)
			};
	public static String gerarEmprego(short idade, Genero genero) {
		if(idade>=18) {
			int a = (int)(Math.random()*rangeMax);
			if(idade>=60) {
				if(a%5 != 0) {
					return genero == Genero.FEMININO ? "Aposentada" : "Aposentado";
				}
			}
			if(a < ranges[1])
				return formatarEmprego(empregos[1], genero);
			else if(a >= ranges[1] && a < ranges[2])
				return formatarEmprego(empregos[2], genero);
			else if(a >= ranges[2] && a < ranges[3])
				return formatarEmprego(empregos[3], genero);
			else if(a >= ranges[3] && a < ranges[4])
				return formatarEmprego(empregos[4], genero);
			else if(a >= ranges[4] && a < ranges[5])
				return formatarEmprego(empregos[5], genero);
			else if(a >= ranges[5] && a < ranges[6])
				return formatarEmprego(empregos[6], genero);
			else if(a >= ranges[6] && a < ranges[7])
				return formatarEmprego(empregos[7], genero);
			else if(a >= ranges[7] && a < ranges[8])
				return formatarEmprego(empregos[8], genero);
			else if(a >= ranges[8] && a < ranges[9])
				return formatarEmprego(empregos[9], genero);
			else if(a >= ranges[9] && a < ranges[10])
				return formatarEmprego(empregos[10], genero);
			else if(a >= ranges[10] && a < ranges[11])
				return formatarEmprego(empregos[11], genero);
			else if(a >= ranges[11] && a < ranges[12])
				return formatarEmprego(empregos[12], genero);
			else if(a >= ranges[12] && a < ranges[13])
				return formatarEmprego(empregos[13], genero);
			else if(a >= ranges[13] && a < ranges[14])
				return formatarEmprego(empregos[14], genero);
			else if(a >= ranges[14] && a < ranges[15])
				return formatarEmprego(empregos[15], genero);
			else if(a >= ranges[15] && a < ranges[16])
				return formatarEmprego(empregos[16], genero);
			else if(a >= ranges[16] && a < ranges[17])
				return formatarEmprego(empregos[17], genero);
			else if(a >= ranges[17] && a < ranges[18])
				return formatarEmprego(empregos[18], genero);
			else if(a >= ranges[18] && a < ranges[19])
				return formatarEmprego(empregos[19], genero);
			else if(a >= ranges[19] && a < ranges[20])
				return formatarEmprego(empregos[20], genero);
			else if(a >= ranges[20] && a < ranges[21])
				return formatarEmprego(empregos[21], genero);
			else if(a >= ranges[21] && a < ranges[22])
				return formatarEmprego(empregos[22], genero);
			else if(a >= ranges[22] && a < ranges[23])
				return formatarEmprego(empregos[23], genero);
			else if(a >= ranges[23] && a < ranges[24])
				return formatarEmprego(empregos[24], genero);
			else if(a >= ranges[24] && a < ranges[25])
				return formatarEmprego(empregos[25], genero);
			else if(a >= ranges[25] && a < ranges[26])
				return formatarEmprego(empregos[26], genero);
			else if(a >= ranges[26] && a < ranges[27])
				return formatarEmprego(empregos[27], genero);
			else if(a >= ranges[27] && a < ranges[28])
				return formatarEmprego(empregos[28], genero);
			else if(a >= ranges[28] && a < ranges[29])
				return formatarEmprego(empregos[29], genero);
			else if(a >= ranges[29] && a < ranges[30])
				return formatarEmprego(empregos[30], genero);
			else if(a >= ranges[30] && a < ranges[31])
				return formatarEmprego(empregos[31], genero);
			
		}
		return formatarEmprego(empregos[0], genero);
	}
	private static String formatarEmprego(String emprego, Genero genero) {
		if(emprego.contains("$"))
			if(genero == Genero.FEMININO)
				return emprego.replace("$", "a");
			else
				return emprego.replace("$", "o");
		else if(emprego.contains("&"))
			if(genero == Genero.FEMININO)
				return emprego.replace("&", "a");
			else 
				return emprego.replace("&", "");
					
		return emprego;
	}
}
