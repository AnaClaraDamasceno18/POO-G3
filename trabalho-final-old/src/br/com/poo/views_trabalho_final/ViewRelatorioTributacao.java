package br.com.poo.views_trabalho_final;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class ViewRelatorioTributacao {
	private String cpf;
	private JFrame viewRelattrib;
		
	public ViewRelatorioTributacao(String cpf) {
		this.cpf = cpf;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		viewRelattrib = new JFrame();
		viewRelattrib.setTitle("*CapyBank* - Relatório de tributação");
		viewRelattrib.setBounds(100, 100, 800, 600);
		viewRelattrib.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewRelattrib.getContentPane().setLayout(null);
		
		JButton gerarRt = new JButton("Gerar relatório de tributação");
		gerarRt.setFont(new Font("Tahoma", Font.BOLD, 16));
		gerarRt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		gerarRt.setBounds(249, 176, 287, 71);
		viewRelattrib.getContentPane().add(gerarRt);
		
		JButton btnVoltarRt = new JButton("Voltar");
		btnVoltarRt.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVoltarRt.setBounds(641, 492, 89, 23);
		viewRelattrib.getContentPane().add(btnVoltarRt);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\lionn\\eclipse-workspace\\telas_trabalho_final\\images\\backgroundCapyP.png"));
		lblNewLabel.setBounds(-14, 0, 798, 613);
		viewRelattrib.getContentPane().add(lblNewLabel);
	}
}
