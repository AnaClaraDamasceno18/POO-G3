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
import javax.swing.text.MaskFormatter;

import br.com.poo.contas.Conta;
import br.com.poo.contas.ContaCorrente;
import br.com.poo.view.contas.menu.ViewMenuClienteContaCorrente;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.ParseException;

public class ViewMovimentaCorrenteDeposito extends JFrame {

	private JFrame viewDeposito;
	private JTextField textValorDeposito;
	private String cpf;

	public ViewMovimentaCorrenteDeposito(String cpf) {
		this.cpf = cpf;
		initialize();
	}

	public void initialize() {
		
		Conta conta = Conta.contas.get(getCpf());
		viewDeposito = new JFrame();
		viewDeposito.setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Serratec\\POO\\workspace\\POO-G3\\trabalho-final\\images\\CapyCoinsR_SF.png"));
		viewDeposito.setName("*CapyBank* - Conta Corrente - Deposito ");
		viewDeposito.setSize(800, 600);
		viewDeposito.setLocationRelativeTo(null);
		viewDeposito.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewDeposito.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Cliente:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 18, 90, 25);
		viewDeposito.getContentPane().add(lblNewLabel);

		JLabel lblSaldo = new JLabel("Saldo:");
		lblSaldo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSaldo.setBounds(467, 18, 70, 25);
		viewDeposito.getContentPane().add(lblSaldo);

		JFormattedTextField mostarSaldoCliente = new JFormattedTextField();
		mostarSaldoCliente.setFont(new Font("Tahoma", Font.BOLD, 20));
		mostarSaldoCliente.setEditable(false);
		mostarSaldoCliente.setBounds(537, 18, 172, 25);
		mostarSaldoCliente.setValue(formateSaldo(conta.getSaldo()));
		viewDeposito.getContentPane().add(mostarSaldoCliente);

		JFormattedTextField mostarNomeCliente = new JFormattedTextField();
		mostarNomeCliente.setEditable(false);
		mostarNomeCliente.setFont(new Font("Tahoma", Font.BOLD, 20));
		mostarNomeCliente.setBounds(90, 18, 345, 25);
		mostarNomeCliente.setText(conta.getTitular());
		viewDeposito.getContentPane().add(mostarNomeCliente);

		textValorDeposito = new JFormattedTextField();
		textValorDeposito.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textValorDeposito.setEditable(false);
		textValorDeposito.setBounds(294, 161, 252, 25);
		viewDeposito.getContentPane().add(textValorDeposito);
		textValorDeposito.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Valor:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(220, 161, 70, 25);
		viewDeposito.getContentPane().add(lblNewLabel_1);

		Panel panel = new Panel();
		panel.setBounds(216, 192, 330, 33);
		viewDeposito.getContentPane().add(panel);

		Label label = new Label("Taxa de Depósito: R$ 0,10");
		label.setFont(new Font("Dialog", Font.BOLD, 20));
		panel.add(label);

		Button btn1Deposito = new Button("1");
		btn1Deposito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textValorDeposito.setText(textValorDeposito.getText() + "1");

			}
		});

		btn1Deposito.setBackground(new Color(169, 169, 169));
		btn1Deposito.setFont(new Font("Dialog", Font.BOLD, 12));
		btn1Deposito.setBounds(216, 280, 70, 60);

		viewDeposito.getContentPane().add(btn1Deposito);

		Button btn2Deposito = new Button("2");
		btn2Deposito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textValorDeposito.setText(textValorDeposito.getText() + "2");
			}
		});

		Button btnSairSaque = new Button("Sair");
		btnSairSaque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSairSaque.setFont(new Font("Dialog", Font.BOLD, 20));
		btnSairSaque.setBounds(10, 517, 114, 33);
		viewDeposito.getContentPane().add(btnSairSaque);
		btn2Deposito.setBackground(new Color(169, 169, 169));
		btn2Deposito.setFont(new Font("Dialog", Font.BOLD, 12));
		btn2Deposito.setBounds(286, 280, 70, 60);
		viewDeposito.getContentPane().add(btn2Deposito);

		Button btn3SaqueDeposito = new Button("3");
		btn3SaqueDeposito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textValorDeposito.setText(textValorDeposito.getText() + "3");

			}
		});
		btn3SaqueDeposito.setBackground(new Color(169, 169, 169));
		btn3SaqueDeposito.setFont(new Font("Dialog", Font.BOLD, 12));
		btn3SaqueDeposito.setBounds(357, 280, 70, 60);
		viewDeposito.getContentPane().add(btn3SaqueDeposito);

		Button btn4Deposito = new Button("4");
		btn4Deposito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textValorDeposito.setText(textValorDeposito.getText() + "0");
			}
		});
		btn4Deposito.setBackground(new Color(169, 169, 169));
		btn4Deposito.setFont(new Font("Dialog", Font.BOLD, 12));
		btn4Deposito.setBounds(216, 340, 70, 60);
		viewDeposito.getContentPane().add(btn4Deposito);

		Button btn5Saque = new Button("5");
		btn5Saque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textValorDeposito.setText(textValorDeposito.getText() + "5");
			}
		});
		btn5Saque.setBackground(new Color(169, 169, 169));
		btn5Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn5Saque.setBounds(286, 340, 70, 60);
		viewDeposito.getContentPane().add(btn5Saque);

		Button btn6Deposito = new Button("6");
		btn6Deposito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textValorDeposito.setText(textValorDeposito.getText() + "6");
			}
		});
		btn6Deposito.setBackground(new Color(169, 169, 169));
		btn6Deposito.setFont(new Font("Dialog", Font.BOLD, 12));
		btn6Deposito.setBounds(357, 340, 70, 60);
		viewDeposito.getContentPane().add(btn6Deposito);

		Button btn8Saque = new Button("8");
		btn8Saque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textValorDeposito.setText(textValorDeposito.getText() + "8");
			}
		});
		btn8Saque.setBackground(new Color(169, 169, 169));
		btn8Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn8Saque.setBounds(286, 400, 70, 60);
		viewDeposito.getContentPane().add(btn8Saque);

		Button btnCancelaDeposito = new Button("Cancelar");
		btnCancelaDeposito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ViewMenuClienteContaCorrente(getCpf());
			}
		});
		btnCancelaDeposito.setBackground(new Color(169, 169, 169));
		btnCancelaDeposito.setFont(new Font("Dialog", Font.BOLD, 12));
		btnCancelaDeposito.setBounds(426, 280, 120, 60);
		viewDeposito.getContentPane().add(btnCancelaDeposito);

		Button btnLimparDeposito = new Button("Limpar");
		btnLimparDeposito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textValorDeposito.setText("");
			}
		});
		btnLimparDeposito.setBackground(new Color(169, 169, 169));
		btnLimparDeposito.setFont(new Font("Dialog", Font.BOLD, 12));
		btnLimparDeposito.setBounds(426, 340, 120, 60);
		viewDeposito.getContentPane().add(btnLimparDeposito);

		Button btnConfirmaDeposito = new Button("Confirma");
		btnConfirmaDeposito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int resposta = JOptionPane.showOptionDialog(null,
						"Deseja confirmar essa operação? Depósito: R$: " + textValorDeposito.getText(),
						"Confirmação de depósito", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
						new Object[] { "Sim", "Não" }, "Não");

				switch (resposta) {

				case JOptionPane.YES_OPTION:

					Double valor = Double.parseDouble(textValorDeposito.getText());
					conta.depositar(valor);
					mostarSaldoCliente.setText(conta.getSaldo().toString());

					break;

				case JOptionPane.NO_OPTION:

					JOptionPane.showMessageDialog(null, "Operação Cancelada!");
					dispose();

					break;

				}

			}
		});
		btnConfirmaDeposito.setBackground(new Color(169, 169, 169));
		btnConfirmaDeposito.setFont(new Font("Dialog", Font.BOLD, 12));
		btnConfirmaDeposito.setBounds(427, 400, 120, 60);
		viewDeposito.getContentPane().add(btnConfirmaDeposito);

		Button btn7Deposito = new Button("7");
		btn7Deposito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textValorDeposito.setText(textValorDeposito.getText() + "7");

			}
		});
		btn7Deposito.setBackground(new Color(169, 169, 169));
		btn7Deposito.setFont(new Font("Dialog", Font.BOLD, 12));
		btn7Deposito.setBounds(216, 400, 70, 60);
		viewDeposito.getContentPane().add(btn7Deposito);

		Button btn9Deposito = new Button("9");
		btn9Deposito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textValorDeposito.setText(textValorDeposito.getText() + "9");
			}
		});
		btn9Deposito.setBackground(new Color(169, 169, 169));
		btn9Deposito.setFont(new Font("Dialog", Font.BOLD, 12));
		btn9Deposito.setBounds(357, 400, 70, 60);

		viewDeposito.getContentPane().add(btn9Deposito);
		Button btn0Deposito = new Button("0");
		btn0Deposito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textValorDeposito.setText(textValorDeposito.getText() + "0");
			}
		});
		btn0Deposito.setBackground(new Color(169, 169, 169));
		btn0Deposito.setFont(new Font("Dialog", Font.BOLD, 12));
		btn0Deposito.setBounds(286, 460, 70, 60);
		viewDeposito.getContentPane().add(btn0Deposito);

		Button btn0Deposito_3 = new Button("");
		btn0Deposito_3.setEnabled(false);
		btn0Deposito_3.setFont(new Font("Dialog", Font.BOLD, 12));
		btn0Deposito_3.setBackground(new Color(169, 169, 169));
		btn0Deposito_3.setBounds(216, 460, 70, 60);
		viewDeposito.getContentPane().add(btn0Deposito_3);

		Button btn0Deposito2 = new Button("");
		btn0Deposito2.setEnabled(false);
		btn0Deposito2.setFont(new Font("Dialog", Font.BOLD, 12));
		btn0Deposito2.setBackground(new Color(169, 169, 169));
		btn0Deposito2.setBounds(357, 460, 70, 60);
		viewDeposito.getContentPane().add(btn0Deposito2);

		Button btnConfirmSaque_1 = new Button("");
		btnConfirmSaque_1.setEnabled(false);
		btnConfirmSaque_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnConfirmSaque_1.setBackground(new Color(169, 169, 169));
		btnConfirmSaque_1.setBounds(427, 460, 120, 60);
		viewDeposito.getContentPane().add(btnConfirmSaque_1);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(
				new ImageIcon("C:\\Serratec\\POO\\workspace\\POO-G3\\trabalho-final\\images\\backgroundCapyP.png"));
		lblNewLabel_2.setBounds(-16, 0, 800, 600);
		viewDeposito.getContentPane().add(lblNewLabel_2);
		viewDeposito.setVisible(true);

	}

	public String getCpf() {
		return cpf;
	}

	public String formateSaldo(Double saldo) {

		String stringValue = saldo.toString();
		double doubleValue = Double.parseDouble(stringValue);
		DecimalFormat decimalFormat = new DecimalFormat("###,###.##");
		String formattedValue = decimalFormat.format(doubleValue);

		return formattedValue;

	}

}
