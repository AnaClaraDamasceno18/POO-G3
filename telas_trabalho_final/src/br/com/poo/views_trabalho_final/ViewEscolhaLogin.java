package br.com.poo.views_trabalho_final;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class ViewEscolhaLogin extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewEscolhaLogin frame = new ViewEscolhaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewEscolhaLogin() {
		setTitle("*CapyBank* - Escolha de menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSairEscolhaLogin = new JButton("Sair");
		btnSairEscolhaLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSairEscolhaLogin.setBounds(685, 527, 89, 23);
		contentPane.add(btnSairEscolhaLogin);
		
		JButton btnLogFuncEscolheCliente = new JButton("Cliente");
		btnLogFuncEscolheCliente.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogFuncEscolheCliente.setBounds(132, 442, 202, 60);
		contentPane.add(btnLogFuncEscolheCliente);
		
		JButton btnLogFuncEscolheFunc = new JButton("Funcionário");
		btnLogFuncEscolheFunc.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogFuncEscolheFunc.setBounds(435, 442, 202, 60);
		contentPane.add(btnLogFuncEscolheFunc);
		
		JLabel lblNewLabel_1 = new JLabel("Como deseja Logar?");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(300, 386, 202, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\lionn\\eclipse-workspace\\telas_trabalho_final\\images\\backgroundCapyG.png"));
		lblNewLabel.setBounds(0, 0, 800, 600);
		contentPane.add(lblNewLabel);
	}
}
