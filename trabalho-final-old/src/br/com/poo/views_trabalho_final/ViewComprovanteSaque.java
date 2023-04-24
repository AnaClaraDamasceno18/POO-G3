package br.com.poo.views_trabalho_final;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Panel;
import javax.swing.JButton;
import java.awt.Button;
import javax.swing.JTextPane;

public class ViewComprovanteSaque extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewComprovanteSaque frame = new ViewComprovanteSaque();
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
	public ViewComprovanteSaque() {
		setTitle("*CapyBank* - Comprovante de Saque");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setEnabled(false);
		textPane.setBounds(169, 60, 443, 298);
		contentPane.add(textPane);
		
		JButton btnImprimeComprovSaque = new JButton("Sim");
		btnImprimeComprovSaque.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnImprimeComprovSaque.setBounds(169, 449, 145, 43);
		contentPane.add(btnImprimeComprovSaque);
		
		Panel panel = new Panel();
		panel.setBounds(169, 370, 443, 35);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Deseja imprimir o comprovante de saque?");
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnNãoImprimeComprovSaque = new JButton("Não");
		btnNãoImprimeComprovSaque.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNãoImprimeComprovSaque.setBounds(467, 449, 145, 43);
		contentPane.add(btnNãoImprimeComprovSaque);
		
		Button btnSairComprovSaque = new Button("Sair");
		btnSairComprovSaque.setFont(new Font("Dialog", Font.BOLD, 12));
		btnSairComprovSaque.setBounds(688, 529, 89, 23);
		contentPane.add(btnSairComprovSaque);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\lionn\\eclipse-workspace\\telas_trabalho_final\\images\\backgroundCapyP.png"));
		lblNewLabel_1.setBounds(-11, 0, 800, 600);
		contentPane.add(lblNewLabel_1);
	}
}
