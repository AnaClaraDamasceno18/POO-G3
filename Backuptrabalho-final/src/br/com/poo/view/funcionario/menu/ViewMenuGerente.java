package br.com.poo.view.funcionario.menu;

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
import java.awt.Color;
import java.awt.Toolkit;

public class ViewMenuGerente {

	private JFrame viewMenuGerente;
	private String cpf;
	Funcionario func = Funcionario.mapaFuncionarios.get(cpf);

	public ViewMenuGerente(String cpf, Funcionario func) {
		this.cpf = cpf;
		initialize(func);
	}

	private void initialize(Funcionario func) {
		Conta conta = Conta.contas.get(cpf);
		Funcionario gerente = Funcionario.mapaFuncionarios.get(getCpf());

		viewMenuGerente = new JFrame();
		viewMenuGerente.setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\eltin\\Downloads\\Backuptrabalho-final\\images\\CapyCoinsR_SF.png"));
		viewMenuGerente.setTitle("*CapyBank* - Menu do Gerente");
		viewMenuGerente.setSize(800, 600);
		viewMenuGerente.setLocationRelativeTo(null);
		viewMenuGerente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewMenuGerente.getContentPane().setLayout(null);

		JButton btnGerarRelatGerente = new JButton("Gerar relatório do gerente");
		btnGerarRelatGerente.setBackground(Color.WHITE);
		btnGerarRelatGerente.setForeground(Color.BLACK);
		btnGerarRelatGerente.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnGerarRelatGerente.setBounds(225, 430, 339, 52);
		btnGerarRelatGerente.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					LeituraEscrita.relatorioGerente(func);
				} catch (IOException e1) {
					e1.printStackTrace();
				}

			}
		});
		viewMenuGerente.getContentPane().add(btnGerarRelatGerente);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSair.setBounds(10, 517, 114, 33);
		viewMenuGerente.getContentPane().add(btnSair);

		JLabel lblNewLabel = new JLabel("Gerente:");
		lblNewLabel.setBounds(79, 33, 100, 25);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		viewMenuGerente.getContentPane().add(lblNewLabel);

		JFormattedTextField mostarNomeGerente = new JFormattedTextField();
		mostarNomeGerente.setEditable(false);
		mostarNomeGerente.setBounds(174, 33, 538, 25);
		mostarNomeGerente.setText(gerente.getNome());
		mostarNomeGerente.setFont(new Font("Tahoma", Font.BOLD, 20));
		viewMenuGerente.getContentPane().add(mostarNomeGerente);

		JFormattedTextField mostarRelatGerente = new JFormattedTextField();
		mostarRelatGerente.setEnabled(false);
		mostarRelatGerente.setBounds(79, 69, 633, 335);
		mostarRelatGerente.setText("Total de Contas Gerenciadas: " + String.valueOf(Conta.qtdContas(func)));
		viewMenuGerente.getContentPane().add(mostarRelatGerente);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewMenuGerente.dispose();
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnVoltar.setBounds(660, 517, 114, 33);
		viewMenuGerente.getContentPane().add(btnVoltar);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setIcon(
				new ImageIcon("C:\\Users\\eltin\\Downloads\\Backuptrabalho-final\\images\\backgroundCapyP.png"));
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

	public void buscarGerente() {

	}
}
