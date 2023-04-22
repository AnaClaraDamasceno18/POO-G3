package br.com.poo.views_trabalho_final;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import java.awt.Panel;
import java.awt.Label;
import java.awt.Button;
import java.awt.Color;
import javax.swing.ImageIcon;

public class ViewSaque extends JFrame {

	private JPanel contentPane;
	private JTextField textValorSaque;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewSaque frame = new ViewSaque();
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
	public ViewSaque() {
		setTitle("*Capybank* - Saque");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cliente:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 13, 62, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblSaldo = new JLabel("Saldo:");
		lblSaldo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSaldo.setBounds(13, 39, 46, 14);
		contentPane.add(lblSaldo);
		
		JFormattedTextField mostarSaldoCliente = new JFormattedTextField();
		mostarSaldoCliente.setEnabled(false);
		mostarSaldoCliente.setBounds(66, 37, 257, 25);
		contentPane.add(mostarSaldoCliente);
		
		JFormattedTextField mostarNomeCliente = new JFormattedTextField();
		mostarNomeCliente.setEnabled(false);
		mostarNomeCliente.setBounds(66, 11, 257, 25);
		contentPane.add(mostarNomeCliente);
		
		textValorSaque = new JTextField();
		textValorSaque.setEnabled(false);
		textValorSaque.setBounds(294, 161, 200, 25);
		contentPane.add(textValorSaque);
		textValorSaque.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Valor:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(248, 166, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		Panel panel = new Panel();
		panel.setBounds(304, 192, 183, 33);
		contentPane.add(panel);
		
		Label label = new Label("Taxa de saque: 10%");
		label.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		panel.add(label);
		
		Button btn1Saque = new Button("1");
		btn1Saque.setBackground(new Color(169, 169, 169));
		btn1Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn1Saque.setBounds(216, 280, 70, 60);
		contentPane.add(btn1Saque);
		
		Button btn2Saque = new Button("2");
		btn2Saque.setBackground(new Color(169, 169, 169));
		btn2Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn2Saque.setBounds(286, 280, 70, 60);
		contentPane.add(btn2Saque);
		
		Button btn3Saque = new Button("3");
		btn3Saque.setBackground(new Color(169, 169, 169));
		btn3Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn3Saque.setBounds(357, 280, 70, 60);
		contentPane.add(btn3Saque);
		
		Button btn4Saque = new Button("4");
		btn4Saque.setBackground(new Color(169, 169, 169));
		btn4Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn4Saque.setBounds(216, 340, 70, 60);
		contentPane.add(btn4Saque);
		
		Button btn5Saque = new Button("5");
		btn5Saque.setBackground(new Color(169, 169, 169));
		btn5Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn5Saque.setBounds(286, 340, 70, 60);
		contentPane.add(btn5Saque);
		
		Button btn6Saque = new Button("6");
		btn6Saque.setBackground(new Color(169, 169, 169));
		btn6Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn6Saque.setBounds(357, 340, 70, 60);
		contentPane.add(btn6Saque);
		
		Button btn8Saque = new Button("8");
		btn8Saque.setBackground(new Color(169, 169, 169));
		btn8Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn8Saque.setBounds(286, 400, 70, 60);
		contentPane.add(btn8Saque);
		
		Button btnCancelSaque = new Button("Cancelar");
		btnCancelSaque.setBackground(new Color(169, 169, 169));
		btnCancelSaque.setFont(new Font("Dialog", Font.BOLD, 12));
		btnCancelSaque.setBounds(426, 280, 120, 60);
		contentPane.add(btnCancelSaque);
		
		Button btnLimparSaque = new Button("Limpar");
		btnLimparSaque.setBackground(new Color(169, 169, 169));
		btnLimparSaque.setFont(new Font("Dialog", Font.BOLD, 12));
		btnLimparSaque.setBounds(426, 340, 120, 60);
		contentPane.add(btnLimparSaque);
		
		Button btnConfirmSaque = new Button("Confirma");
		btnConfirmSaque.setBackground(new Color(169, 169, 169));
		btnConfirmSaque.setFont(new Font("Dialog", Font.BOLD, 12));
		btnConfirmSaque.setBounds(427, 400, 120, 60);
		contentPane.add(btnConfirmSaque);
		
		Button btn7Saque = new Button("7");
		btn7Saque.setBackground(new Color(169, 169, 169));
		btn7Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn7Saque.setBounds(216, 400, 70, 60);
		contentPane.add(btn7Saque);
		
		Button btn9Saque = new Button("9");
		btn9Saque.setBackground(new Color(169, 169, 169));
		btn9Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn9Saque.setBounds(357, 400, 70, 60);
		contentPane.add(btn9Saque);
		
		Button btn0Saque = new Button("0");
		btn0Saque.setBackground(new Color(169, 169, 169));
		btn0Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn0Saque.setBounds(286, 460, 70, 60);
		contentPane.add(btn0Saque);
		
		Button btn0Saque_1 = new Button("");
		btn0Saque_1.setEnabled(false);
		btn0Saque_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btn0Saque_1.setBackground(new Color(169, 169, 169));
		btn0Saque_1.setBounds(216, 460, 70, 60);
		contentPane.add(btn0Saque_1);
		
		Button btn0Saque_2 = new Button("");
		btn0Saque_2.setEnabled(false);
		btn0Saque_2.setFont(new Font("Dialog", Font.BOLD, 12));
		btn0Saque_2.setBackground(new Color(169, 169, 169));
		btn0Saque_2.setBounds(357, 460, 70, 60);
		contentPane.add(btn0Saque_2);
		
		Button btnConfirmSaque_1 = new Button("");
		btnConfirmSaque_1.setEnabled(false);
		btnConfirmSaque_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnConfirmSaque_1.setBackground(new Color(169, 169, 169));
		btnConfirmSaque_1.setBounds(427, 460, 120, 60);
		contentPane.add(btnConfirmSaque_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\lionn\\eclipse-workspace\\telas_trabalho_final\\images\\backgroundCapyP.png"));
		lblNewLabel_2.setBounds(-16, 0, 800, 600);
		contentPane.add(lblNewLabel_2);
		
		Button btnSairSaque = new Button("Sair");
		btnSairSaque.setFont(new Font("Dialog", Font.BOLD, 12));
		btnSairSaque.setBounds(685, 528, 89, 23);
		contentPane.add(btnSairSaque);
	}
}
