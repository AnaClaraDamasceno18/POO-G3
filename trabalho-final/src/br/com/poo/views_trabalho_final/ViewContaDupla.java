package br.com.poo.views_trabalho_final;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextPane;

import br.com.poo.contas.Conta;
import br.com.poo.enums.ContaEnum;
import br.com.poo.enums.PessoaEnum;
import br.com.poo.io.LeituraEscrita;
import br.com.poo.pessoa.Cliente;
import br.com.poo.pessoa.Diretor;
import br.com.poo.pessoa.Funcionario;
import br.com.poo.pessoa.Gerente;
import br.com.poo.pessoa.Presidente;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFormattedTextField;
import javax.swing.ImageIcon;

public class ViewContaDupla {

	public ViewMenuGerente menuGerente;
	public ViewMenuDiretor menuDiretor;
	public ViewMenuPresidente menuPresidente;
	public ViewLoginFuncionario login;
	public ViewContaDupla menuCliente;
	private String cpf;
	public ViewMenuClienteContaCorrente contaC;
	public ViewMenuClienteContaPoupanca contaP;

	private JFrame ViewEscolhaLogin;

	public ViewContaDupla(String cpf) {
		this.cpf = cpf;
		initialize();
	}

	private void initialize() {
		ViewEscolhaLogin = new JFrame();
		ViewEscolhaLogin.setTitle("*CapyBank* - Escolha Conta");
		ViewEscolhaLogin.setBounds(100, 100, 800, 600);
		ViewEscolhaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ViewEscolhaLogin.getContentPane().setLayout(null);

		JButton btnSairEscolhaLogin = new JButton("Sair");
		btnSairEscolhaLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSairEscolhaLogin.setBounds(685, 527, 89, 23);
		ViewEscolhaLogin.getContentPane().add(btnSairEscolhaLogin);

		JButton btnPoupanca= new JButton("Poupança");
		btnPoupanca.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPoupanca.setBounds(132, 442, 202, 60);
		btnPoupanca.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				identificaContaPoupanca(getCpf());

			}

		});

		ViewEscolhaLogin.getContentPane().add(btnPoupanca);

		JButton btnCorrente = new JButton("Corrente");
		btnCorrente.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCorrente.setBounds(435, 442, 202, 60);
		btnCorrente.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				identificaContaCorrente(getCpf());

			}

		});
		ViewEscolhaLogin.getContentPane().add(btnCorrente);

		JLabel lblNewLabel_1 = new JLabel("Como deseja Logar?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(300, 386, 202, 32);
		ViewEscolhaLogin.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(
				new ImageIcon("\"C:\\TrabalhoPOO\\telas_trabalho_final\\images\\backgroundCapyG.png\""));
		lblNewLabel.setBounds(0, 0, 800, 600);
		ViewEscolhaLogin.getContentPane().add(lblNewLabel);
		ViewEscolhaLogin.setVisible(true);
	}

	public void identificaContaPoupanca(String cpf) {

		Conta conta = Conta.contas.get(cpf);

		if (conta.getTipoConta().equalsIgnoreCase(ContaEnum.POUPANCA.getTipoConta())) {
			contaP = new ViewMenuClienteContaPoupanca(cpf);

		}

	}

	public void identificaContaCorrente(String cpf) {

		Conta conta = Conta.contas.get(cpf);

		if (conta.getTipoConta().equalsIgnoreCase(ContaEnum.CORRENTE.getTipoConta())) {
			contaC = new ViewMenuClienteContaCorrente(cpf);

		}

	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf2) {
		
	}

}
