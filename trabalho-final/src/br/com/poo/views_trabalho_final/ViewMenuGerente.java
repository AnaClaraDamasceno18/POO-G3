package br.com.poo.views_trabalho_final;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextPane;

import br.com.poo.contas.Conta;
import br.com.poo.io.LeituraEscrita;
import br.com.poo.pessoa.Funcionario;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFormattedTextField;
import javax.swing.ImageIcon;

public class ViewMenuGerente {

	private JFrame viewMenuGerente;
	private String cpf;
	Funcionario func = Funcionario.mapaFuncionarios.get(cpf);

	public ViewMenuGerente(String cpf) {
		this.cpf = cpf;
		initialize();
	}

	private void initialize() {
		Conta conta = Conta.contas.get(cpf);
		
		viewMenuGerente = new JFrame();
		viewMenuGerente.setTitle("*CapyBank* - Escolha seu Login");
		viewMenuGerente.setBounds(100, 100, 800, 600);
		viewMenuGerente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewMenuGerente.getContentPane().setLayout(null);

		JButton btnGerarRelatGerente = new JButton("Gerar relatório do gerente");
		btnGerarRelatGerente.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGerarRelatGerente.setBounds(261, 415, 287, 71);
		btnGerarRelatGerente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

			//arquivo de leitura escrita
				
			}
		});
		viewMenuGerente.getContentPane().add(btnGerarRelatGerente);

		JFormattedTextField mostarNomeGerente = new JFormattedTextField();
		mostarNomeGerente.setEnabled(false);
		mostarNomeGerente.setBounds(79, 35, 257, 25);
		mostarNomeGerente.setText(conta.getTitular());
		viewMenuGerente.getContentPane().add(mostarNomeGerente);

		JLabel lblNewLabel = new JLabel("Gerente:");
		lblNewLabel.setBounds(10, 38, 74, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		viewMenuGerente.getContentPane().add(lblNewLabel);

		JFormattedTextField mostarRelatGerente = new JFormattedTextField();
		mostarRelatGerente.setEnabled(false);
		mostarRelatGerente.setBounds(79, 69, 646, 335);
		viewMenuGerente.getContentPane().add(mostarRelatGerente);

		JButton btnSairRelatGerente = new JButton("Sair");
		btnSairRelatGerente.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSairRelatGerente.setBounds(685, 527, 89, 23);
		viewMenuGerente.getContentPane().add(btnSairRelatGerente);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\TrabalhoPOO\\telas_trabalho_final\\images\\backgroundCapyP.png"));
		lblNewLabel_1.setBounds(-16, 0, 800, 600);
		viewMenuGerente.getContentPane().add(lblNewLabel_1);
		viewMenuGerente.setVisible(true);
	}
	
	public void imprimir() throws IOException {
		LeituraEscrita.relatorioGerente(func);
	}

	public String getCpf() {
		return cpf;
	}
}
