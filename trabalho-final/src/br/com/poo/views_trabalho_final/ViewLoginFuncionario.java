package br.com.poo.views_trabalho_final;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.com.poo.contas.Conta;
import br.com.poo.enums.PessoaEnum;
import br.com.poo.io.LeituraEscrita;
import br.com.poo.menus.MenuLogin;
import br.com.poo.pessoa.Cliente;
import br.com.poo.pessoa.Funcionario;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class ViewLoginFuncionario {

	private JFrame viewLoginFunc;
	private JTextField txtLoginFunc;
	private JPasswordField textSenhaFunc;
	public ViewMenuGerente menuGerente;
	public ViewMenuDiretor menuDiretor;
	public ViewMenuPresidente menuPresidente;
	public static boolean isFuncionario = false;
	public static boolean isCliente = false;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLoginFuncionario window = new ViewLoginFuncionario();
					window.viewLoginFunc.setVisible(true);
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
	public ViewLoginFuncionario() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @throws IOException
	 */
	private void initialize() throws IOException {
		viewLoginFunc = new JFrame();
		viewLoginFunc.getContentPane().setEnabled(false);
		viewLoginFunc.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		viewLoginFunc.setTitle("*CapyBank* - Login de funcionário");
		viewLoginFunc.setBounds(100, 100, 800, 600);
		viewLoginFunc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewLoginFunc.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("CPF:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(236, 353, 52, 14);
		viewLoginFunc.getContentPane().add(lblNewLabel);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSenha.setBounds(236, 409, 52, 14);
		viewLoginFunc.getContentPane().add(lblSenha);

		txtLoginFunc = new JTextField();
		txtLoginFunc.setBounds(292, 343, 220, 30);
		viewLoginFunc.getContentPane().add(txtLoginFunc);
		txtLoginFunc.setColumns(10);

		textSenhaFunc = new JPasswordField();
		textSenhaFunc.setColumns(10);
		textSenhaFunc.setBounds(292, 397, 220, 30);
		viewLoginFunc.getContentPane().add(textSenhaFunc);

		JButton btnLoginFunc = new JButton("Login");

		LeituraEscrita.leitor("banco.txt");

		btnLoginFunc.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLoginFunc.setBounds(348, 456, 89, 23);
		btnLoginFunc.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				verificaLogin();

			}

		});
		viewLoginFunc.getContentPane().add(btnLoginFunc);

		JButton btnSairLoginFunc = new JButton("Sair");
		btnSairLoginFunc.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSairLoginFunc.setBounds(685, 527, 89, 23);
		viewLoginFunc.getContentPane().add(btnSairLoginFunc);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\TrabalhoPOO\\telas_trabalho_final\\images\\backgroundCapyG.png"));
		lblNewLabel_1.setBounds(0, 0, 784, 561);
		viewLoginFunc.getContentPane().add(lblNewLabel_1);
	}

	public JFrame getViewLoginFunc() {
		return viewLoginFunc;
	}

	public void setViewLoginFunc(JFrame viewLoginFunc) {
		this.viewLoginFunc = viewLoginFunc;
	}

	public JTextField getTxtLoginFunc() {
		return txtLoginFunc;
	}

	public void setTxtLoginFunc(JTextField txtLoginFunc) {
		this.txtLoginFunc = txtLoginFunc;
	}

	public JPasswordField getTextSenhaFunc() {
		return textSenhaFunc;
	}

	public void setTextSenhaFunc(JPasswordField textSenhaFunc) {
		this.textSenhaFunc = textSenhaFunc;
	}
	
	public void verificaLogin() {

		String cpf = txtLoginFunc.getText();
		String senha = textSenhaFunc.getText();

		Funcionario funcionario = Funcionario.mapaFuncionarios.get(cpf);
		Cliente cliente = Cliente.mapaClientes.get(cpf);
		Conta conta = Conta.contas.get(cpf);

		if (funcionario != null) {
			isFuncionario = true;
		}

		if (cliente != null) {
			isCliente = true;
		}

		if (isFuncionario && isCliente) {
			System.out.println("Usuário é: " + funcionario.getTipoFuncionario() + " e " + cliente.getTipoUsuario());
			System.out.println("menu perguntando p onde quer ir pros 2");

		} else if (isFuncionario && !isCliente) {
			System.out.println(funcionario.getTipoFuncionario());
			if(funcionario.getTipoFuncionario().equalsIgnoreCase(PessoaEnum.GERENTE.getCargo())) {
				menuGerente = new ViewMenuGerente();
			}else if(funcionario.getTipoFuncionario().equalsIgnoreCase(PessoaEnum.DIRETOR.getCargo())) {
				menuDiretor = new ViewMenuDiretor();
			}else if(funcionario.getTipoFuncionario().equalsIgnoreCase(PessoaEnum.PRESIDENTE.getCargo())) {
				menuPresidente = new ViewMenuPresidente();
			}
			

		} else if (!isFuncionario && isCliente) {
			System.out.println("Usuário é: " + cliente.getTipoUsuario());
			System.out.println("menu cliente");
		}

		while ((funcionario != null && !(funcionario.getSenha().equals(senha)))
				|| (cliente != null && !(cliente.getSenha().equals(senha)))) {
			System.out.println("CPF e/ou Senha incorreto(s).");

			funcionario = Funcionario.mapaFuncionarios.get(cpf);
			conta = Conta.contas.get(cpf);
		}
	}

	public static boolean isFuncionario() {
		return isFuncionario;
	}

	public static boolean isCliente() {
		return isCliente;
	}
	
}