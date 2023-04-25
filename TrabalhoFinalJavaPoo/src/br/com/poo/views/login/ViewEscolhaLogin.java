package br.com.poo.views.login;

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
import java.awt.Toolkit;

public class ViewEscolhaLogin {

	public ViewMenuGerente menuGerente;
	public ViewMenuDiretor menuDiretor;
	public ViewMenuPresidente menuPresidente;
	public ViewLogin login;
	public ViewContaDupla menuContaDupla;
	private String cpf;
	private String titular;
	private JFrame viewEscolhaLogin;

	public ViewEscolhaLogin(String cpf) {
		this.cpf = cpf;
		initialize();
	}

	private void initialize() {
		viewEscolhaLogin = new JFrame();
		viewEscolhaLogin.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\eltin\\Downloads\\Backuptrabalho-final\\images\\CapyCoinsR_SF.png"));
		viewEscolhaLogin.setTitle("*CapyBank* - Escolha Login");
		viewEscolhaLogin.setSize(800, 600);
		viewEscolhaLogin.setLocationRelativeTo(null);
		viewEscolhaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewEscolhaLogin.getContentPane().setLayout(null);

		JButton btnVoltarEscolhaLogin = new JButton("Voltar");
		btnVoltarEscolhaLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				viewEscolhaLogin.dispose();
				
			}
		});
		btnVoltarEscolhaLogin.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnVoltarEscolhaLogin.setBounds(660, 517, 114, 33);
		viewEscolhaLogin.getContentPane().add(btnVoltarEscolhaLogin);

		JButton btnLogFuncEscolheCliente = new JButton("Cliente");
		btnLogFuncEscolheCliente.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLogFuncEscolheCliente.setBounds(132, 442, 202, 60);
		btnLogFuncEscolheCliente.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				indentificaCliente(getCpf());

			}

		});
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSair.setBounds(10, 517, 114, 33);
		viewEscolhaLogin.getContentPane().add(btnSair);

		viewEscolhaLogin.getContentPane().add(btnLogFuncEscolheCliente);

		JButton btnLogFuncEscolheFunc = new JButton("Funcionário");
		btnLogFuncEscolheFunc.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLogFuncEscolheFunc.setBounds(435, 442, 202, 60);
		btnLogFuncEscolheFunc.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				escolhaFuncionario(getCpf());

			}

		});
		viewEscolhaLogin.getContentPane().add(btnLogFuncEscolheFunc);

		JLabel lblNewLabel_1 = new JLabel("Como deseja Logar?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(300, 386, 202, 32);
		viewEscolhaLogin.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\eltin\\Downloads\\Backuptrabalho-final\\images\\backgroundCapyG.png"));
		lblNewLabel.setBounds(0, 0, 800, 600);
		viewEscolhaLogin.getContentPane().add(lblNewLabel);
		viewEscolhaLogin.setVisible(true);
	}

	public void escolhaFuncionario(String cpf) {

		Funcionario funcionario = Funcionario.mapaFuncionarios.get(cpf);
		if (funcionario.getTipoFuncionario().equalsIgnoreCase(PessoaEnum.GERENTE.getCargo())) {
			menuGerente = new ViewMenuGerente(cpf, funcionario);
		} else if (funcionario.getTipoFuncionario().equalsIgnoreCase(PessoaEnum.DIRETOR.getCargo())) {
			menuDiretor = new ViewMenuDiretor(cpf, funcionario, funcionario);
		} else if (funcionario.getTipoFuncionario().equalsIgnoreCase(PessoaEnum.PRESIDENTE.getCargo())) {
			menuPresidente = new ViewMenuPresidente(cpf, funcionario, funcionario);
		}
	}

	public void indentificaCliente(String cpf) {

		menuContaDupla = new ViewContaDupla(cpf);

	}

	public String getCpf() {
		return cpf;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
}
