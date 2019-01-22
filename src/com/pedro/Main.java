package com.pedro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.*;

import com.pedro.basica.Perfil;
import com.pedro.basica.util.Log;
import com.pedro.basica.util.Manipulador;

public class Main implements WindowListener,ActionListener {
	Log registrador = null;
	JFrame frame = new JFrame("Perfilador");
	JLabel titulo = new JLabel("                 Perfilador V0.1");
	Font fonte = new Font("Arial", Font.BOLD, 48);
	Manipulador m = new Manipulador();
	JButton main = new JButton("Criar perfis!");
	JButton arrowLeft = new JButton("<");
	JButton arrowRight = new JButton(">");
	JPanel perfil = new JPanel();
	JPanel central = new JPanel();
	JPanel esquerda = new JPanel();
	JPanel direita = new JPanel();
	JLabel[] labels = new JLabel[11];
	JTextField[] textos = new JTextField[9];
	private ArrayList<Perfil> perfis;
	private int index;
	public Main() {
		try {
			registrador = Log.getInstancia();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		registrador.registra("Programa iniciado...");
		registrador.registra("Gerador de perfis! by Pedro9558");
		frame.setSize(800, 600);
		perfil.setLayout(new GridLayout(11,2));
		frame.setLocationRelativeTo(null);
		titulo.setFont(fonte);
		central.setLayout(null);
		central.add(arrowLeft);
		central.add(arrowRight);
		main.addActionListener(this);
		arrowLeft.setBounds(0, 70, 100, 200);
		arrowRight.setBounds(660, 70, 100, 200);
		arrowLeft.setFont(new Font("Arial",Font.BOLD,52));
		arrowRight.setFont(new Font("Arial",Font.BOLD,52));
		arrowLeft.setVisible(false);
		arrowRight.setVisible(false);
		central.add(main);
		main.setBounds(200, 120, 400, 120);
		main.setBackground(Color.GREEN);
		main.setForeground(Color.black);
		main.setFont(new Font("Arial",Font.BOLD,48));
		frame.add(central, BorderLayout.CENTER);
		frame.add(perfil, BorderLayout.PAGE_END);
		frame.add(titulo, BorderLayout.NORTH);
		frame.add(esquerda, BorderLayout.LINE_START);
		frame.add(direita, BorderLayout.LINE_END);
		this.l();
		titulo.setForeground(Color.BLUE);
		frame.setVisible(true);
		frame.addWindowListener(this);
		frame.setResizable(false);
	}
	private void l() {
		labels[0] = new JLabel("                                              Detalhes do perfil");
		labels[1] = new JLabel();
		labels[2] = new JLabel("Nome: ");
		textos[0] = new JTextField(100);
		labels[3] = new JLabel("Idade: ");
		textos[1] = new JTextField(3);
		labels[4] = new JLabel("Descrição da idade: ");
		textos[2] = new JTextField(20);
		labels[5] = new JLabel("Gênero: ");
		textos[3] = new JTextField(20);
		labels[6] = new JLabel("Cor do cabelo: ");
		textos[4] = new JTextField(13);
		labels[7] = new JLabel("Forma do cabelo: ");
		textos[5] = new JTextField(17);
		labels[8] = new JLabel("Aparência física: ");
		textos[6] = new JTextField(15);
		labels[9] = new JLabel("Emprego: ");
		textos[7] = new JTextField(50);
		labels[10] = new JLabel("Detalhes da vida: ");
		textos[8] = new JTextField(200);
		perfil.add(labels[0]);
		perfil.add(labels[1]);
		perfil.add(labels[2]);
		labels[0].setFont(new Font("Arial",Font.BOLD,18));
		labels[2].setFont(new Font("Arial",Font.BOLD,15));
		int x = 3;
		int y = 0;
		for(int i = 3; i <= labels.length+8;i++) {
			if(i % 2 == 0) {
				perfil.add(labels[x]);
				labels[x].setFont(new Font("Arial",Font.BOLD,15));
				x++;
			}else {
				perfil.add(textos[y]);
				textos[y].setFont(new Font("Arial",Font.BOLD,15));
				textos[y].setEditable(false);
				y++;
			}
		}
	}
	public static void main(String[] args) {
		new Main();
	}
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		registrador.registra("Obrigado por usar! :)");
		System.exit(0);
		
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	private void atualizar(Perfil p) {
		textos[0].setText(p.getNome());
		textos[1].setText(String.valueOf(p.getIdade()));
		textos[2].setText(p.getTextoIdade());
		textos[3].setText(p.getGenero().name());
		textos[4].setText(p.getCor().name());
		textos[5].setText(p.getCabelo().name());
		textos[6].setText(p.getFisica().name());
		textos[7].setText(p.getEmprego());
		textos[8].setText(p.getDescricao());
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == main) {
			// Botão principal é apertado, desabilita-o
			main.setEnabled(false);
			// Preparando-se para criar os perfis
			registrador.registra("Criando perfis...");
			main.setText("Criando...");
			main.setBackground(Color.LIGHT_GRAY);
			registrador.registra("Capturando quantidade a ser criada...");
			// Pede a quantidade de perfis a ser criada
			String s=JOptionPane.showInputDialog("Informe quantos perfis você quer gerar?");
			int p = 0;
			boolean continuar = true;
			registrador.registra("Input: "+ (s == null ? "Cancelar operação" : s));
			// Realiza alguns testes para saber se o input é válido
			do {
				try {
				p = Integer.parseInt(s);
				}catch(Exception e) {
					// Input nulo?
					if(s == null) {
						registrador.registra("Operação cancelada: gerar perfis");
						continuar = false;
						break;
					}
					// Input de texto
					p = 0;
					registrador.registra("Input inválido! Requisitando novo...", Log.Niveis.ERRO);
					JOptionPane.showMessageDialog(null, "Coloque um número inteiro!","Erro!",0);
				}
				if(p > 100000) {
					registrador.registra("Input muito alto! Requisitando novo...", Log.Niveis.ERRO);
					JOptionPane.showMessageDialog(null, "Valor muito alto! Tente um valor menor que 100000!","Erro!",0);
					p = 0;
				}
				if(p == 0) {
				s=JOptionPane.showInputDialog("Tente de novo!");
				registrador.registra("Input: "+ (s == null ? "Cancelar operação" : s));
				}
			}while(p == 0);
			if (continuar) {
				perfis = new ArrayList<Perfil>(p+1);
				main.setText("Aguarde...");
				for(int i = 0; i < p; i++) {
					perfis.add(m.criarPerfilAleatorio());
				}
				main.setText("Pronto!");
				arrowLeft.setVisible(true);
				arrowRight.setVisible(true);
				arrowLeft.addActionListener(this);
				arrowRight.addActionListener(this);
				this.atualizar(perfis.get(0));
			}else {
				main.setText("Criar perfis!");
				main.setEnabled(true);
				main.setBackground(Color.GREEN);
			}
		}else if(arg0.getSource() == arrowLeft) {
			if(index > 0) {
				index--;
				this.atualizar(perfis.get(index));
			}
		}else if(arg0.getSource() == arrowRight) {
			if(index < perfis.size() - 1) {
				index++;
				this.atualizar(perfis.get(index));
			}
		}
		
	}
}
