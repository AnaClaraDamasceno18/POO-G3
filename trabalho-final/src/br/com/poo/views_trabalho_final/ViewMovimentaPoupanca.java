package br.com.poo.views_trabalho_final;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.com.poo.contas.Conta;

public class ViewMovimentaPoupanca extends JFrame {

	private String cpf;
	private JFrame ViewSaque;
	private JTextField textValorSaque;

	public ViewMovimentaPoupanca(String cpf) {
		this.cpf = cpf;
		initialize();
	}

	public void initialize() {
		Conta conta = Conta.contas.get(cpf);
		
		ViewSaque = new JFrame();
		ViewSaque.setName("*CapyBank* - poupança");
		ViewSaque.setBounds(100, 100, 800, 600);
		ViewSaque.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ViewSaque.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cliente:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 13, 62, 14);
		ViewSaque.add(lblNewLabel);
		
		JLabel lblSaldo = new JLabel("Saldo:");
		lblSaldo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSaldo.setBounds(13, 39, 46, 14);
		ViewSaque.add(lblSaldo);
		
		JFormattedTextField mostarSaldoCliente = new JFormattedTextField();
		mostarSaldoCliente.setEnabled(false);
		mostarSaldoCliente.setBounds(66, 37, 257, 25);
		mostarSaldoCliente.setText(conta.getSaldo().toString());
		ViewSaque.add(mostarSaldoCliente);
		
		JFormattedTextField mostarNomeCliente = new JFormattedTextField();
		mostarNomeCliente.setEnabled(false);
		mostarNomeCliente.setBounds(66, 11, 257, 25);
		mostarNomeCliente.setText(conta.getTitular());
		ViewSaque.add(mostarNomeCliente);
		
		textValorSaque = new JFormattedTextField();
		textValorSaque.setEnabled(false);
		textValorSaque.setBounds(294, 161, 200, 25);
		ViewSaque.add(textValorSaque);
		textValorSaque.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Valor:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(248, 166, 46, 14);
		ViewSaque.add(lblNewLabel_1);
		
		Button btn1Saque = new Button("1");
		btn1Saque.setBackground(new Color(169, 169, 169));
		btn1Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn1Saque.setBounds(216, 280, 70, 60);
		btn1Saque.addActionListener(this::btn1Saque);
		ViewSaque.add(btn1Saque);
		
		Button btn2Saque = new Button("2");
		btn2Saque.setBackground(new Color(169, 169, 169));
		btn2Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn2Saque.setBounds(286, 280, 70, 60);
		btn2Saque.addActionListener(this::btn2Saque);
		ViewSaque.add(btn2Saque);
		
		Button btn3Saque = new Button("3");
		btn3Saque.setBackground(new Color(169, 169, 169));
		btn3Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn3Saque.setBounds(357, 280, 70, 60);
		btn3Saque.addActionListener(this::btn3Saque);
		ViewSaque.add(btn3Saque);
		
		Button btn4Saque = new Button("4");
		btn4Saque.setBackground(new Color(169, 169, 169));
		btn4Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn4Saque.setBounds(216, 340, 70, 60);
		btn4Saque.addActionListener(this::btn4Saque);
		ViewSaque.add(btn4Saque);
		
		Button btn5Saque = new Button("5");
		btn5Saque.setBackground(new Color(169, 169, 169));
		btn5Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn5Saque.setBounds(286, 340, 70, 60);
		btn5Saque.addActionListener(this::btn5Saque);
		ViewSaque.add(btn5Saque);
		
		Button btn6Saque = new Button("6");
		btn6Saque.setBackground(new Color(169, 169, 169));
		btn6Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn6Saque.setBounds(357, 340, 70, 60);
		btn6Saque.addActionListener(this::btn6Saque);
		ViewSaque.add(btn6Saque);
		
		Button btn8Saque = new Button("8");
		btn8Saque.setBackground(new Color(169, 169, 169));
		btn8Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn8Saque.setBounds(286, 400, 70, 60);
		btn8Saque.addActionListener(this::btn8Saque);
		ViewSaque.add(btn8Saque);
		
		Button btnCancelSaque = new Button("Cancelar");
		btnCancelSaque.setBackground(new Color(169, 169, 169));
		btnCancelSaque.setFont(new Font("Dialog", Font.BOLD, 12));
		btnCancelSaque.setBounds(426, 280, 120, 60);
		btnCancelSaque.addActionListener(this::btnCancelSaque);
		ViewSaque.add(btnCancelSaque);
		
		Button btnLimparSaque = new Button("Limpar");
		btnLimparSaque.setBackground(new Color(169, 169, 169));
		btnLimparSaque.setFont(new Font("Dialog", Font.BOLD, 12));
		btnLimparSaque.setBounds(426, 340, 120, 60);
		btnLimparSaque.addActionListener(this::btnLimparSaque);
		ViewSaque.add(btnLimparSaque);
		
		Button btnConfirmSaque = new Button("Confirma");
		btnConfirmSaque.setBackground(new Color(169, 169, 169));
		btnConfirmSaque.setFont(new Font("Dialog", Font.BOLD, 12));
		btnConfirmSaque.setBounds(427, 400, 120, 60);
		ViewSaque.add(btnConfirmSaque);
		
		Button btn7Saque = new Button("7");
		btn7Saque.setBackground(new Color(169, 169, 169));
		btn7Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn7Saque.setBounds(216, 400, 70, 60);
		btn7Saque.addActionListener(this::btn7Saque);
		ViewSaque.add(btn7Saque);
		
		Button btn9Saque = new Button("9");
		btn9Saque.setBackground(new Color(169, 169, 169));
		btn9Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn9Saque.setBounds(357, 400, 70, 60);
		btn9Saque.addActionListener(this::btn9Saque);
		ViewSaque.add(btn9Saque);
		
		Button btn0Saque = new Button("0");
		btn0Saque.setBackground(new Color(169, 169, 169));
		btn0Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn0Saque.setBounds(286, 460, 70, 60);
		btn0Saque.addActionListener(this::btn0Saque);
		ViewSaque.add(btn0Saque);
		
		Button btn0Saque_1 = new Button("");
		btn0Saque_1.setEnabled(false);
		btn0Saque_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btn0Saque_1.setBackground(new Color(169, 169, 169));
		btn0Saque_1.setBounds(216, 460, 70, 60);
		ViewSaque.add(btn0Saque_1);
		
		Button btn0Saque_2 = new Button("");
		btn0Saque_2.setEnabled(false);
		btn0Saque_2.setFont(new Font("Dialog", Font.BOLD, 12));
		btn0Saque_2.setBackground(new Color(169, 169, 169));
		btn0Saque_2.setBounds(357, 460, 70, 60);
		ViewSaque.add(btn0Saque_2);
		
		Button btnConfirmSaque_1 = new Button("");
		btnConfirmSaque_1.setEnabled(false);
		btnConfirmSaque_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnConfirmSaque_1.setBackground(new Color(169, 169, 169));
		btnConfirmSaque_1.setBounds(427, 460, 120, 60);
		ViewSaque.add(btnConfirmSaque_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\TrabalhoPOO\\telas_trabalho_final\\images\\backgroundCapyP.png"));
		lblNewLabel_2.setBounds(-16, 0, 800, 600);
		ViewSaque.add(lblNewLabel_2);
		
		Button btnSairSaque = new Button("Sair");
		btnSairSaque.setFont(new Font("Dialog", Font.BOLD, 12));
		btnSairSaque.setBounds(685, 528, 89, 23);
		ViewSaque.add(btnSairSaque);
		ViewSaque.setVisible(true);

	}
	
	private void btn0Saque(ActionEvent actionEvent) {
		textValorSaque.setText(textValorSaque.getText() + "0");
			
	}
		
	
	private void btn1Saque(ActionEvent actionEvent) {
		textValorSaque.setText(textValorSaque.getText() + "1");
			
	}
		
	private void btn2Saque(ActionEvent actionEvent) {
		textValorSaque.setText(textValorSaque.getText() + "2");
			
	}
		
	private void btn3Saque(ActionEvent actionEvent) {
		textValorSaque.setText(textValorSaque.getText() + "3");
			
	}
	
	private void btn4Saque(ActionEvent actionEvent) {
		textValorSaque.setText(textValorSaque.getText() + "4");
			
	}
	
	
	private void btn5Saque(ActionEvent actionEvent) {
		textValorSaque.setText(textValorSaque.getText() + "5");
			
	}
	
	private void btn6Saque(ActionEvent actionEvent) {
		textValorSaque.setText(textValorSaque.getText() + "6");
			
	}
	
	private void btn7Saque(ActionEvent actionEvent) {
		textValorSaque.setText(textValorSaque.getText() + "7");
			
	}
	
	private void btn8Saque(ActionEvent actionEvent) {
		textValorSaque.setText(textValorSaque.getText() + "8");
			
	}
	
	private void btn9Saque(ActionEvent actionEvent) {
		textValorSaque.setText(textValorSaque.getText() + "9");
			
	}
	
	private void confirma(ActionEvent actionEvent) {
		//textValorSaque.setText(textValorSaque.getText() + "Confirma");
		//valorsacado = Double.parseDouble(textValorSaque.getText());
		
		
//		valorsacado = textValorSaque.getText();	
//		valorSacadoNum = Double.parseDouble(valorsacado);
//		saldoDaContaNum = Double.parseDouble(saldoCliente.getText());
//		somaDosValores = saldoDaContaNum - valorSacadoNum;
//		valorConvertido = somaDosValores.toString();
//		JOptionPane.showMessageDialog(null, "o valor a ser sacado é R$: " + valorsacado);
//		saldoCliente.setText(valorConvertido);
		
//		int resposta = JOptionPane.showConfirmDialog(null, "Deseja Sacar R$: " + textValorSaque.getText());
//			
//		switch (resposta) {
//			case 0:
//				getSaque();
//				new ConfirmScreen();
//				dispose();
//				break;
//				
//				
//			case 1:
//				JOptionPane.showMessageDialog(null, "Saque nao efetuado");
//				break;
//			
//			case 2:
//				JOptionPane.showMessageDialog(null, "Saque cancelado");
//				break;
//		}
		
		
		//dispose();
		
		
		//new ConfirmScreen();
		
	}
	
	



	private void btnLimparSaque(ActionEvent actionEvent) {
		textValorSaque.setText("");
			
	}
	
	private void btnCancelSaque(ActionEvent actionEvent) {
		//textValorSaque.setText(textValorSaque.getText() + "cancelar");
		dispose();
			
	}

	public String getCpf() {
		return cpf;
	}
	
	
}
