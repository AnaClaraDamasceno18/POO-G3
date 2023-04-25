package br.com.poo.views.contas.operacoes;

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
import java.awt.Toolkit;
import java.awt.event.ActionListener;

public class ViewMovimentaPoupancaSaque extends JFrame {

	private JFrame ViewSaque;
	private JTextField textValorSaque;
	private String cpf;

	public ViewMovimentaPoupancaSaque(String cpf) {
		this.cpf = cpf;
		initialize();
	}

	public void initialize() {
		Conta conta = Conta.contas.get(getCpf());
		
		ViewSaque = new JFrame();
		ViewSaque.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\eltin\\Downloads\\Backuptrabalho-final\\images\\CapyCoinsR_SF.png"));
		ViewSaque.setName("*CapyBank* - Saque");
		ViewSaque.setSize(800, 600);
		ViewSaque.setLocationRelativeTo(null);
		ViewSaque.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ViewSaque.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cliente:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 18, 90, 25);
		ViewSaque.getContentPane().add(lblNewLabel);
		
		JLabel lblSaldo = new JLabel("Saldo:");
		lblSaldo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSaldo.setBounds(467, 18, 70, 25);
		ViewSaque.getContentPane().add(lblSaldo);
		
		JFormattedTextField mostarSaldoCliente = new JFormattedTextField();
		mostarSaldoCliente.setEnabled(false);
		mostarSaldoCliente.setBounds(537, 18, 172, 25);
		mostarSaldoCliente.setText(conta.getSaldo().toString());
		ViewSaque.getContentPane().add(mostarSaldoCliente);
		
		JFormattedTextField mostarNomeCliente = new JFormattedTextField();
		mostarNomeCliente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		mostarNomeCliente.setEnabled(false);
		mostarNomeCliente.setBounds(90, 18, 345, 25);
		mostarNomeCliente.setText(conta.getTitular());
		ViewSaque.getContentPane().add(mostarNomeCliente);
		
		textValorSaque = new JFormattedTextField();
		textValorSaque.setEnabled(false);
		textValorSaque.setBounds(294, 161, 252, 25);
		ViewSaque.getContentPane().add(textValorSaque);
		textValorSaque.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Valor:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(220, 161, 70, 25);
		ViewSaque.getContentPane().add(lblNewLabel_1);
		
		Panel panel = new Panel();
		panel.setBounds(216, 192, 330, 33);
		ViewSaque.getContentPane().add(panel);
		
		Button btn1Saque = new Button("1");
		btn1Saque.setBackground(new Color(169, 169, 169));
		btn1Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn1Saque.setBounds(216, 280, 70, 60);
		btn1Saque.addActionListener(this::btn1Saque);
		ViewSaque.getContentPane().add(btn1Saque);
		
		Button btn2Saque = new Button("2");
		btn2Saque.setBackground(new Color(169, 169, 169));
		btn2Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn2Saque.setBounds(286, 280, 70, 60);
		btn2Saque.addActionListener(this::btn2Saque);
		ViewSaque.getContentPane().add(btn2Saque);
		
		Button btn3Saque = new Button("3");
		btn3Saque.setBackground(new Color(169, 169, 169));
		btn3Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn3Saque.setBounds(357, 280, 70, 60);
		btn3Saque.addActionListener(this::btn3Saque);
		ViewSaque.getContentPane().add(btn3Saque);
		
		Button btn4Saque = new Button("4");
		btn4Saque.setBackground(new Color(169, 169, 169));
		btn4Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn4Saque.setBounds(216, 340, 70, 60);
		btn4Saque.addActionListener(this::btn4Saque);
		ViewSaque.getContentPane().add(btn4Saque);
		
		Button btn5Saque = new Button("5");
		btn5Saque.setBackground(new Color(169, 169, 169));
		btn5Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn5Saque.setBounds(286, 340, 70, 60);
		btn5Saque.addActionListener(this::btn5Saque);
		ViewSaque.getContentPane().add(btn5Saque);
		
		Button btn6Saque = new Button("6");
		btn6Saque.setBackground(new Color(169, 169, 169));
		btn6Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn6Saque.setBounds(357, 340, 70, 60);
		btn6Saque.addActionListener(this::btn6Saque);
		ViewSaque.getContentPane().add(btn6Saque);
		
		Button btn8Saque = new Button("8");
		btn8Saque.setBackground(new Color(169, 169, 169));
		btn8Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn8Saque.setBounds(286, 400, 70, 60);
		btn8Saque.addActionListener(this::btn8Saque);
		ViewSaque.getContentPane().add(btn8Saque);
		
		Button btnCancelSaque = new Button("Cancelar");
		btnCancelSaque.setBackground(new Color(169, 169, 169));
		btnCancelSaque.setFont(new Font("Dialog", Font.BOLD, 12));
		btnCancelSaque.setBounds(426, 280, 120, 60);
		btnCancelSaque.addActionListener(this::btnCancelSaque);
		ViewSaque.getContentPane().add(btnCancelSaque);
		
		Button btnLimparSaque = new Button("Limpar");
		btnLimparSaque.setBackground(new Color(169, 169, 169));
		btnLimparSaque.setFont(new Font("Dialog", Font.BOLD, 12));
		btnLimparSaque.setBounds(426, 340, 120, 60);
		btnLimparSaque.addActionListener(this::btnLimparSaque);
		ViewSaque.getContentPane().add(btnLimparSaque);
		
		Button btnConfirmSaque = new Button("Confirma");
		btnConfirmSaque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showOptionDialog(null,
						"Deseja confirmar essa operação? Depósito: R$: " + textValorSaque.getText(),
						"Confirmação de Saque", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "Sim", "Não" }, "Não");

				switch (resposta) {

				case JOptionPane.YES_OPTION:

					Double valor = Double.parseDouble(textValorSaque.getText());
					conta.sacar(valor);
					mostarSaldoCliente.setText(conta.getSaldo().toString());
					

					if ((valor > 0) && (conta.getSaldo() >= valor)) {
						conta.sacar(valor);
						mostarSaldoCliente.setValue(conta.getSaldo());
					}else {
						JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
						ViewSaque.dispose();
					}

					break;

				case JOptionPane.NO_OPTION:

					JOptionPane.showMessageDialog(null, "Operação Cancelada!");
					dispose();

					break;

				}
			}
		});
		btnConfirmSaque.setBackground(new Color(169, 169, 169));
		btnConfirmSaque.setFont(new Font("Dialog", Font.BOLD, 12));
		btnConfirmSaque.setBounds(427, 400, 120, 60);
		ViewSaque.getContentPane().add(btnConfirmSaque);
		
		Button btn7Saque = new Button("7");
		btn7Saque.setBackground(new Color(169, 169, 169));
		btn7Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn7Saque.setBounds(216, 400, 70, 60);
		btn7Saque.addActionListener(this::btn7Saque);
		ViewSaque.getContentPane().add(btn7Saque);
		
		Button btn9Saque = new Button("9");
		btn9Saque.setBackground(new Color(169, 169, 169));
		btn9Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn9Saque.setBounds(357, 400, 70, 60);
		btn9Saque.addActionListener(this::btn9Saque);
		ViewSaque.getContentPane().add(btn9Saque);
		
		Button btn0Saque = new Button("0");
		btn0Saque.setBackground(new Color(169, 169, 169));
		btn0Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn0Saque.setBounds(286, 460, 70, 60);
		btn0Saque.addActionListener(this::btn0Saque);
		ViewSaque.getContentPane().add(btn0Saque);
		
		Button btn0Saque_1 = new Button("");
		btn0Saque_1.setEnabled(false);
		btn0Saque_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btn0Saque_1.setBackground(new Color(169, 169, 169));
		btn0Saque_1.setBounds(216, 460, 70, 60);
		ViewSaque.getContentPane().add(btn0Saque_1);
		
		Button btn0Saque_2 = new Button("");
		btn0Saque_2.setEnabled(false);
		btn0Saque_2.setFont(new Font("Dialog", Font.BOLD, 12));
		btn0Saque_2.setBackground(new Color(169, 169, 169));
		btn0Saque_2.setBounds(357, 460, 70, 60);
		ViewSaque.getContentPane().add(btn0Saque_2);
		
		Button btnConfirmSaque_1 = new Button("");
		btnConfirmSaque_1.setEnabled(false);
		btnConfirmSaque_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnConfirmSaque_1.setBackground(new Color(169, 169, 169));
		btnConfirmSaque_1.setBounds(427, 460, 120, 60);
		ViewSaque.getContentPane().add(btnConfirmSaque_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\eltin\\Downloads\\Backuptrabalho-final\\images\\backgroundCapyP.png"));
		lblNewLabel_2.setBounds(-16, 0, 800, 600);
		ViewSaque.getContentPane().add(lblNewLabel_2);
		
		Button btnSairSaque = new Button("Sair");
		btnSairSaque.setFont(new Font("Dialog", Font.BOLD, 20));
		btnSairSaque.setBounds(660, 527, 114, 33);
		ViewSaque.getContentPane().add(btnSairSaque);
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

	private void btnLimparSaque(ActionEvent actionEvent) {
		textValorSaque.setText("");
			
	}
	
	private void btnCancelSaque(ActionEvent actionEvent) {
		dispose();
			
	}

	public String getCpf() {
		return cpf;
	}
}
