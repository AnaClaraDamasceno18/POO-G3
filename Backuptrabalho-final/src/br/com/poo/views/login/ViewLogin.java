package br.com.poo.views.login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.com.poo.contas.Conta;
import br.com.poo.contas.ContaCorrente;
import br.com.poo.enums.ContaEnum;
import br.com.poo.enums.PessoaEnum;
import br.com.poo.io.LeituraEscrita;
import br.com.poo.menus.MenuLogin;
import br.com.poo.pessoa.Cliente;
import br.com.poo.pessoa.Funcionario;
import br.com.poo.view.contas.menu.ViewMenuClienteContaCorrente;
import br.com.poo.view.contas.menu.ViewMenuClienteContaPoupanca;
import br.com.poo.view.funcionario.menu.ViewMenuDiretor;
import br.com.poo.view.funcionario.menu.ViewMenuGerente;
import br.com.poo.view.funcionario.menu.ViewMenuPresidente;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class ViewLogin {

	private JFrame viewLogin;
	private JTextField txtLogin;
	private JPasswordField textSenha;
	public ViewMenuGerente menuGerente;
	public ViewMenuDiretor menuDiretor;
	public ViewMenuPresidente menuPresidente;
	public ViewEscolhaLogin loginDuplo;
	public ViewMenuClienteContaCorrente menuCorrente;
	public ViewMenuClienteContaPoupanca menuPoupanca;
	public ViewContaDupla contaDupla;
	public static boolean isFuncionario = false;
	public static boolean isCliente = false;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLogin window = new ViewLogin();
					window.viewLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Create the application.
	 * 
	 * @throws IOException
	 */
	public ViewLogin() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @throws IOException
	 */
	private void initialize() throws IOException {
		viewLogin = new JFrame();
		viewLogin.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\eltin\\Downloads\\Backuptrabalho-final\\images\\CapyCoinsR_SF.png"));
		viewLogin.getContentPane().setEnabled(false);
		viewLogin.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		viewLogin.setTitle("*CapyBank* - Login");
		viewLogin.setSize(800, 600);
		viewLogin.setLocationRelativeTo(null);
		viewLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewLogin.getContentPane().setLayout(null);
		viewLogin.setResizable(false);

		JLabel lblNewLabel = new JLabel("CPF:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(236, 353, 52, 14);
		viewLogin.getContentPane().add(lblNewLabel);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSenha.setBounds(236, 409, 52, 14);
		viewLogin.getContentPane().add(lblSenha);

		txtLogin = new JTextField();
		txtLogin.setBounds(292, 343, 220, 30);
		viewLogin.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);

		textSenha = new JPasswordField();
		textSenha.setColumns(10);
		textSenha.setBounds(292, 397, 220, 30);
		viewLogin.getContentPane().add(textSenha);

		JButton btnLoginFunc = new JButton("Login");

		LeituraEscrita.leitor("banco.txt");

		btnLoginFunc.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLoginFunc.setBounds(348, 456, 89, 23);
		btnLoginFunc.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				verificaLogin();

			}

		});
		viewLogin.getContentPane().add(btnLoginFunc);

		JButton btnSairLoginFunc = new JButton("Sair");
		btnSairLoginFunc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewLogin.dispose();

			}
		});
		btnSairLoginFunc.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSairLoginFunc.setBounds(674, 527, 100, 23);
		viewLogin.getContentPane().add(btnSairLoginFunc);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setIcon(
				new ImageIcon("C:\\Users\\eltin\\Downloads\\Backuptrabalho-final\\images\\backgroundCapyG.png"));
		lblNewLabel_1.setBounds(0, 0, 784, 561);
		viewLogin.getContentPane().add(lblNewLabel_1);
	}

	public JFrame getViewLogin() {
		return viewLogin;
	}

	public void setViewLogin(JFrame viewLogin) {
		this.viewLogin = viewLogin;
	}

	public JTextField getTxtLogin() {
		return txtLogin;
	}

	public void setTxtLogin(JTextField txtLogin) {
		this.txtLogin = txtLogin;
	}

	public JPasswordField getTextSenhaFunc() {
		return textSenha;
	}

	public void setTextSenha(JPasswordField textSenha) {
		this.textSenha = textSenha;
	}

	public void verificaLogin() {

		String cpf = txtLogin.getText();
		String senha = textSenha.getText();

		Funcionario funcionario = Funcionario.mapaFuncionarios.get(cpf);
		Cliente cliente = Cliente.mapaClientes.get(cpf);
		Conta cc = Conta.contas.get(cpf);
		Conta cp = Conta.contas.get(cpf);

		if (funcionario != null) {
			isFuncionario = true;
		}

		if (cliente != null) {
			isCliente = true;
		}

		if (isFuncionario && isCliente) {
			loginDuplo = new ViewEscolhaLogin(cpf);

		} else if (isFuncionario) {
			if (funcionario.getTipoFuncionario().equalsIgnoreCase(PessoaEnum.GERENTE.getCargo())) {
				menuGerente = new ViewMenuGerente(cpf, funcionario);
			} else if (funcionario.getTipoFuncionario().equalsIgnoreCase(PessoaEnum.DIRETOR.getCargo())) {
				menuDiretor = new ViewMenuDiretor(cpf, funcionario, funcionario);
			} else if (funcionario.getTipoFuncionario().equalsIgnoreCase(PessoaEnum.PRESIDENTE.getCargo())) {
				menuPresidente = new ViewMenuPresidente(cpf, funcionario, funcionario);
			}
		} else if (isCliente) {

			cliente.getTipoUsuario().equalsIgnoreCase(PessoaEnum.CLIENTE.getCargo());

			if (cc != null) {
				if (cc.getTipoConta().equalsIgnoreCase(ContaEnum.CORRENTE.getTipoConta())) {
					menuCorrente = new ViewMenuClienteContaCorrente(cpf);
					System.out.println("corrente");
				} else if (cc.getTipoConta().equalsIgnoreCase(ContaEnum.POUPANCA.getTipoConta())) {
					menuPoupanca = new ViewMenuClienteContaPoupanca(cpf);
					System.out.println("poupança");
				}

			}
		} else {
			JOptionPane.showMessageDialog(null, "        ACESSO NEGADO!\nCPF e/ou Senha inválido(s)\n", "CapBank\n",JOptionPane.ERROR_MESSAGE);
		}

	}

	public static boolean isFuncionario() {
		return isFuncionario;
	}

	public static boolean isCliente() {
		return isCliente;
	}

}