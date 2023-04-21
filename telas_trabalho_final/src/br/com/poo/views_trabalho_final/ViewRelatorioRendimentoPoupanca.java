package br.com.poo.views_trabalho_final;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;

public class ViewRelatorioRendimentoPoupanca {

	private JFrame viewRendPoup;
	private JTextField txtValorPoup;
	private JTextField txtDiasValorPoup;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewRelatorioRendimentoPoupanca window = new ViewRelatorioRendimentoPoupanca();
					window.viewRendPoup.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewRelatorioRendimentoPoupanca() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		viewRendPoup = new JFrame();
		viewRendPoup.getContentPane().setBackground(new Color(255, 255, 255));
		viewRendPoup.setTitle("*CapyBank* - Rendimento de poupança");
		viewRendPoup.setBounds(100, 100, 800, 600);
		viewRendPoup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewRendPoup.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Valor:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(111, 174, 46, 14);
		viewRendPoup.getContentPane().add(lblNewLabel);
		
		JLabel lblDias = new JLabel("Dias:");
		lblDias.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDias.setBounds(423, 174, 46, 14);
		viewRendPoup.getContentPane().add(lblDias);
		
		txtValorPoup = new JTextField();
		txtValorPoup.setBounds(152, 168, 214, 30);
		viewRendPoup.getContentPane().add(txtValorPoup);
		txtValorPoup.setColumns(10);
		
		txtDiasValorPoup = new JTextField();
		txtDiasValorPoup.setColumns(10);
		txtDiasValorPoup.setBounds(456, 168, 214, 30);
		viewRendPoup.getContentPane().add(txtDiasValorPoup);
		
		JButton btnSimulValorPoup = new JButton("Simular");
		btnSimulValorPoup.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSimulValorPoup.setBounds(139, 280, 229, 52);
		viewRendPoup.getContentPane().add(btnSimulValorPoup);
		
		JButton btnAplicarValorPoup = new JButton("Aplicar");
		btnAplicarValorPoup.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAplicarValorPoup.setBounds(440, 280, 229, 52);
		viewRendPoup.getContentPane().add(btnAplicarValorPoup);
		
		JButton btnVoltarRendPolp = new JButton("Voltar");
		btnVoltarRendPolp.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVoltarRendPolp.setBounds(646, 508, 89, 23);
		viewRendPoup.getContentPane().add(btnVoltarRendPolp);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\lionn\\eclipse-workspace\\telas_trabalho_final\\images\\backgroundCapyP.png"));
		lblNewLabel_1.setBounds(-16, 0, 800, 600);
		viewRendPoup.getContentPane().add(lblNewLabel_1);
	}
}
