package br.com.poo.views_trabalho_final;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.ImageIcon;

public class ViewMenuGerente {

	private JFrame viewMenuGerente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewMenuGerente window = new ViewMenuGerente();
					window.viewMenuGerente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewMenuGerente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		viewMenuGerente = new JFrame();
		viewMenuGerente.setTitle("*CapyBank* - Menu do gerente");
		viewMenuGerente.setBounds(100, 100, 800, 600);
		viewMenuGerente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewMenuGerente.getContentPane().setLayout(null);
		
		JButton btnGerarRelatGerente = new JButton("Gerar relatório do gerente");
		btnGerarRelatGerente.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGerarRelatGerente.setBounds(261, 415, 287, 71);
		viewMenuGerente.getContentPane().add(btnGerarRelatGerente);
		
		JFormattedTextField mostarNomeGerente = new JFormattedTextField();
		mostarNomeGerente.setEnabled(false);
		mostarNomeGerente.setBounds(79, 35, 257, 25);
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
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\lionn\\eclipse-workspace\\telas_trabalho_final\\images\\backgroundCapyP.png"));
		lblNewLabel_1.setBounds(-16, 0, 800, 600);
		viewMenuGerente.getContentPane().add(lblNewLabel_1);
	}
}
