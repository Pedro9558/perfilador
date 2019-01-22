package com.pedro.basica.util;
import java.io.*;
import java.util.Calendar;
import java.util.Locale;
public class Log {
	private File arquivoLog;
	private Calendar tempo;
	private static Log Instancia;
	private String diretorio;
	private BufferedWriter registrador;
	private final String ANSI_RESET = "\u001B[0m";
	private final String ANSI_BLACK = "\u001B[30m";
	private final String ANSI_RED = "\u001B[31m";
	private final String ANSI_GREEN = "\u001B[32m";
	private final String ANSI_YELLOW = "\u001B[33m";
	private final String ANSI_BLUE = "\u001B[34m";
	private final String ANSI_PURPLE = "\u001B[35m";
	private final String ANSI_CYAN = "\u001B[36m";
	private final String ANSI_WHITE = "\u001B[37m";
	/*private final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	private final String ANSI_RED_BACKGROUND = "\u001B[41m";
	private final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	private final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	private final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	private final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	private final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	private final String ANSI_WHITE_BACKGROUND = "\u001B[47m";*/
	public static Log getInstancia() throws IOException {
		if(Instancia == null)
			Instancia = new Log();
		return Instancia;
	}
	private Log() throws IOException {
		tempo = Calendar.getInstance(Locale.getDefault());
		String SO = System.getProperty("os.name").toLowerCase();
		if(SO.contains("win")) {
			diretorio = System.getenv("AppData");
		}else {
			diretorio = System.getProperty("user.home");
			diretorio += "/Library/Application Support";
		}
		// Cria diretorio
		new File(diretorio + "/perfiler/logs").mkdirs();
		diretorio += "/perfiler/logs/Perfiler_" + tempo.get(Calendar.DAY_OF_MONTH) + "_" + (tempo.get(Calendar.MONTH)+1) + "_" + tempo.get(Calendar.YEAR) + " " + tempo.get(Calendar.HOUR_OF_DAY) + "-" + tempo.get(Calendar.MINUTE) + "-" + tempo.get(Calendar.SECOND) + ".txt";
		arquivoLog = new File(diretorio);
		arquivoLog.createNewFile();
		registrador = new BufferedWriter(new FileWriter(arquivoLog));
	}
	public boolean registra(String texto) {
		tempo = Calendar.getInstance();
		try {
			registrador.write("[INFO] " + tempo.get(Calendar.DAY_OF_MONTH) + "_" + (tempo.get(Calendar.MONTH)+1) + "_" + tempo.get(Calendar.YEAR) + " " + tempo.get(Calendar.HOUR_OF_DAY) + "-" + tempo.get(Calendar.MINUTE) + "-" + tempo.get(Calendar.SECOND) + ": "+ texto);
			registrador.newLine();
			registrador.flush();
			System.out.println(ANSI_BLUE + "[INFO] " + tempo.get(Calendar.DAY_OF_MONTH) + "_" + (tempo.get(Calendar.MONTH)+1) + "_" + tempo.get(Calendar.YEAR) + " " + tempo.get(Calendar.HOUR_OF_DAY) + "-" + tempo.get(Calendar.MINUTE) + "-" + tempo.get(Calendar.SECOND) + ": "+ texto);
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public boolean registra(String texto, Niveis nivel) {
		tempo = Calendar.getInstance();
		String prefix ="[INFO] ";
		String prefixCmd = ANSI_BLUE + "[INFO] ";
		if(nivel == Niveis.AVISO) {
			prefix ="[AVISO] ";
			prefixCmd =  ANSI_YELLOW + "[AVISO] ";
		}else {
			prefix ="[ERRO]";
			prefixCmd =  ANSI_RED + "[ERRO] ";
		}
		try {
			registrador.write(prefix + tempo.get(Calendar.DAY_OF_MONTH) + "_" + (tempo.get(Calendar.MONTH)+1) + "_" + tempo.get(Calendar.YEAR) + " " + tempo.get(Calendar.HOUR_OF_DAY) + "-" + tempo.get(Calendar.MINUTE) + "-" + tempo.get(Calendar.SECOND) + ": "+ texto);
			registrador.newLine();
			registrador.flush();
			System.out.println(prefixCmd + tempo.get(Calendar.DAY_OF_MONTH) + "_" + (tempo.get(Calendar.MONTH)+1) + "_" + tempo.get(Calendar.YEAR) + " " + tempo.get(Calendar.HOUR_OF_DAY) + "-" + tempo.get(Calendar.MINUTE) + "-" + tempo.get(Calendar.SECOND) + ": "+ texto);
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public boolean registra(Exception erro) {
		return this.registra(erro.toString(), Niveis.ERRO);
	}
	public enum Niveis {
		INFO, AVISO, ERRO
	}
	
}
