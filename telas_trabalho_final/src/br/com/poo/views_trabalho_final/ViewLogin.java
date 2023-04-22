package br.com.poo.views_trabalho_final;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class ViewLogin {

	private JFrame viewLoginFunc;
	private JTextField txtLoginFunc;
	private JPasswordField textSenhaFunc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLogin window = new ViewLogin();
					window.viewLoginFunc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
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
		btnLoginFunc.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLoginFunc.setBounds(348, 456, 89, 23);
		viewLoginFunc.getContentPane().add(btnLoginFunc);
		
		JButton btnSairLoginFunc = new JButton("Sair");
		btnSairLoginFunc.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSairLoginFunc.setBounds(685, 527, 89, 23);
		viewLoginFunc.getContentPane().add(btnSairLoginFunc);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\lionn\\eclipse-workspace\\telas_trabalho_final\\images\\backgroundCapyG.png"));
		lblNewLabel_1.setBounds(0, 0, 784, 561);
		viewLoginFunc.getContentPane().add(lblNewLabel_1);
	}

}
