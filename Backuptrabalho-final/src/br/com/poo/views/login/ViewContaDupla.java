package br.com.poo.views.login;

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
import br.com.poo.view.contas.menu.ViewMenuClienteContaCorrente;
import br.com.poo.view.contas.menu.ViewMenuClienteContaPoupanca;
import br.com.poo.view.funcionario.menu.ViewMenuDiretor;
import br.com.poo.view.funcionario.menu.ViewMenuGerente;
import br.com.poo.view.funcionario.menu.ViewMenuPresidente;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFormattedTextField;
import javax.swing.ImageIcon;

public class ViewContaDupla extends JFrame{

	public ViewMenuGerente menuGerente;
	public ViewMenuDiretor menuDiretor;
	public ViewMenuPresidente menuPresidente;
	public ViewLogin login;
	public ViewContaDupla menuCliente;
	private String cpf;
	public ViewMenuClienteContaCorrente contaC;
	public ViewMenuClienteContaPoupanca contaP;
	private JFrame viewContaDupla;

	public ViewContaDupla(String cpf) {
		this.cpf = cpf;
		initialize();
	}

	private void initialize() {
		viewContaDupla = new JFrame();
		viewContaDupla.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
		viewContaDupla.setTitle("*CapyBank* - Escolha Conta");
		viewContaDupla.setSize(800, 600);
		viewContaDupla.setLocationRelativeTo(null);
		viewContaDupla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewContaDupla.getContentPane().setLayout(null);

		JButton btnPoupanca= new JButton("Poupança");
		btnPoupanca.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPoupanca.setBounds(132, 442, 202, 60);
		btnPoupanca.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				identificaContaPoupanca(getCpf());

			}

		});
		
		JButton btnSairContaDupla = new JButton("Sair");
		btnSairContaDupla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSairContaDupla.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSairContaDupla.setBounds(10, 517, 114, 33);
		viewContaDupla.getContentPane().add(btnSairContaDupla);

		viewContaDupla.getContentPane().add(btnPoupanca);

		JButton btnCorrente = new JButton("Corrente");
		btnCorrente.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCorrente.setBounds(435, 442, 202, 60);
		btnCorrente.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				identificaContaCorrente(getCpf());

			}

		});
		viewContaDupla.getContentPane().add(btnCorrente);

		JLabel lblNewLabel_1 = new JLabel("Como deseja Logar?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(300, 386, 202, 32);
		viewContaDupla.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(
				new ImageIcon("C:\\Users\\eltin\\Downloads\\Backuptrabalho-final\\images\\backgroundCapyG.png"));
		lblNewLabel.setBounds(0, 0, 800, 600);
		viewContaDupla.getContentPane().add(lblNewLabel);
		viewContaDupla.setVisible(true);
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
