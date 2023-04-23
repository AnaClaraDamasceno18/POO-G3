package br.com.poo.views_trabalho_final;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextPane;

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

public class ViewEscolhaLogin {

	public ViewMenuGerente menuGerente;
	public ViewMenuDiretor menuDiretor;
	public ViewMenuPresidente menuPresidente;
	public ViewLoginFuncionario login;
	public ViewMenuClienteContaCorrente menuCliente;
	private String cpf;
	private String titular;
	private JFrame ViewEscolhaLogin;

	public ViewEscolhaLogin() {
		initialize();
	}

	private void initialize() {
		ViewEscolhaLogin = new JFrame();
		ViewEscolhaLogin.setTitle("*CapyBank* - Escolha Login");
		ViewEscolhaLogin.setBounds(100, 100, 800, 600);
		ViewEscolhaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ViewEscolhaLogin.setLayout(null);

		JButton btnSairEscolhaLogin = new JButton("Sair");
		btnSairEscolhaLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSairEscolhaLogin.setBounds(685, 527, 89, 23);
		ViewEscolhaLogin.add(btnSairEscolhaLogin);

		JButton btnLogFuncEscolheCliente = new JButton("Cliente");
		btnLogFuncEscolheCliente.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogFuncEscolheCliente.setBounds(132, 442, 202, 60);
		btnLogFuncEscolheCliente.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				indentificaCliente(getCpf());

			}

		});

		ViewEscolhaLogin.add(btnLogFuncEscolheCliente);

		JButton btnLogFuncEscolheFunc = new JButton("Funcionário");
		btnLogFuncEscolheFunc.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogFuncEscolheFunc.setBounds(435, 442, 202, 60);
		btnLogFuncEscolheFunc.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				escolhaFuncionario(getCpf());

			}

		});
		ViewEscolhaLogin.add(btnLogFuncEscolheFunc);

		JLabel lblNewLabel_1 = new JLabel("Como deseja Logar?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(300, 386, 202, 32);
		ViewEscolhaLogin.add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\TrabalhoPOO\\telas_trabalho_final\\images\\backgroundCapyG.png"));
		lblNewLabel.setBounds(0, 0, 800, 600);
		ViewEscolhaLogin.add(lblNewLabel);
		ViewEscolhaLogin.setVisible(true);
	}

	public void escolhaFuncionario(String cpf) {

		Funcionario funcionario = Funcionario.mapaFuncionarios.get(cpf);
		if (funcionario.getTipoFuncionario().equalsIgnoreCase(PessoaEnum.GERENTE.getCargo())) {
			menuGerente = new ViewMenuGerente(cpf);
		} else if (funcionario.getTipoFuncionario().equalsIgnoreCase(PessoaEnum.DIRETOR.getCargo())) {
			menuDiretor = new ViewMenuDiretor(cpf);
		} else if (funcionario.getTipoFuncionario().equalsIgnoreCase(PessoaEnum.PRESIDENTE.getCargo())) {
			menuPresidente = new ViewMenuPresidente(cpf);
		}

	}

	public void indentificaCliente(String cpf) {
		Cliente cliente = Cliente.mapaClientes.get(cpf);
		if (cliente.getTipoUsuario().equalsIgnoreCase(PessoaEnum.CLIENTE.getCargo())) {
			menuCliente = new ViewMenuClienteContaCorrente(cpf);
		}

	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

}
