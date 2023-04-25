package br.com.poo.views.contas.operacoes;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.com.poo.contas.Conta;
import br.com.poo.enums.ContaEnum;
import br.com.poo.view.contas.menu.ViewMenuClienteContaCorrente;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JRadioButton;

public class ViewMovimentaCorrenteTransferenciaValor extends JFrame {

	private JFrame ViewTransferencia;
	private JTextField textValorTransferencia;
	private String cpf;
	private int contador;
	private boolean verificador = true;

	public ViewMovimentaCorrenteTransferenciaValor(String cpf) {
		this.cpf = cpf;
		initialize();
	}

	public void initialize() {
		Conta conta = Conta.contas.get(getCpf());

		ViewTransferencia = new JFrame();
		ViewTransferencia.setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\eltin\\Downloads\\Backuptrabalho-final\\images\\CapyCoinsR_SF.png"));
		ViewTransferencia.setName("*CapyBank* - Saque");
		ViewTransferencia.setSize(800, 600);
		ViewTransferencia.setLocationRelativeTo(null);
		ViewTransferencia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ViewTransferencia.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Cliente:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 18, 90, 25);
		ViewTransferencia.getContentPane().add(lblNewLabel);

		JLabel lblValor = new JLabel("Valor:");
		lblValor.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblValor.setBounds(221, 200, 90, 25);
		ViewTransferencia.getContentPane().add(lblValor);

		JLabel lblSaldo = new JLabel("Saldo:");
		lblSaldo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSaldo.setBounds(467, 18, 70, 25);
		ViewTransferencia.getContentPane().add(lblSaldo);

		JFormattedTextField mostarSaldoCliente = new JFormattedTextField();
		mostarSaldoCliente.setFont(new Font("Tahoma", Font.BOLD, 20));
		mostarSaldoCliente.setEditable(false);
		mostarSaldoCliente.setBounds(537, 18, 172, 25);
		mostarSaldoCliente.setValue(formateSaldo(conta.getSaldo()));
		ViewTransferencia.getContentPane().add(mostarSaldoCliente);

		JFormattedTextField mostarNomeCliente = new JFormattedTextField();
		mostarNomeCliente.setEditable(false);
		mostarNomeCliente.setFont(new Font("Tahoma", Font.BOLD, 20));
		mostarNomeCliente.setBounds(90, 18, 345, 25);
		mostarSaldoCliente.setValue(formateSaldo(conta.getSaldo()));
		ViewTransferencia.getContentPane().add(mostarNomeCliente);

		textValorTransferencia = new JFormattedTextField();
		textValorTransferencia.setFont(new Font("Tahoma", Font.BOLD, 20));
		textValorTransferencia.setEditable(false);
		textValorTransferencia.setBounds(292, 200, 260, 25);
		ViewTransferencia.getContentPane().add(textValorTransferencia);
		textValorTransferencia.setColumns(10);

		Panel panel = new Panel();
		panel.setBounds(222, 485, 330, 33);
		ViewTransferencia.getContentPane().add(panel);

		Label label = new Label("Taxa de Transferência: R$ 0,20");
		label.setFont(new Font("Dialog", Font.BOLD, 20));
		panel.add(label);

		Button btn1Saque = new Button("1");
		btn1Saque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textValorTransferencia.setText(textValorTransferencia.getText()+"1");

			}
		});
		btn1Saque.setBackground(new Color(169, 169, 169));
		btn1Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn1Saque.setBounds(222, 236, 70, 60);
		ViewTransferencia.getContentPane().add(btn1Saque);

		Button btn2Saque = new Button("2");
		btn2Saque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textValorTransferencia.setText(textValorTransferencia.getText()+"2");
			}
		});
		btn2Saque.setBackground(new Color(169, 169, 169));
		btn2Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn2Saque.setBounds(292, 236, 70, 60);
		ViewTransferencia.getContentPane().add(btn2Saque);

		Button btn3Saque = new Button("3");
		btn3Saque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textValorTransferencia.setText(textValorTransferencia.getText()+"3");
			}
		});
		btn3Saque.setBackground(new Color(169, 169, 169));
		btn3Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn3Saque.setBounds(363, 236, 70, 60);
		ViewTransferencia.getContentPane().add(btn3Saque);

		Button btn4Saque = new Button("4");
		btn4Saque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textValorTransferencia.setText(textValorTransferencia.getText()+"4");
			}
		});
		btn4Saque.setBackground(new Color(169, 169, 169));
		btn4Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn4Saque.setBounds(222, 296, 70, 60);
		ViewTransferencia.getContentPane().add(btn4Saque);

		Button btn5Saque = new Button("5");
		btn5Saque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textValorTransferencia.setText(textValorTransferencia.getText()+"5");
			}
		});
		btn5Saque.setBackground(new Color(169, 169, 169));
		btn5Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn5Saque.setBounds(292, 296, 70, 60);
		ViewTransferencia.getContentPane().add(btn5Saque);

		Button btn6Saque = new Button("6");
		btn6Saque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textValorTransferencia.setText(textValorTransferencia.getText()+"6");
			}
		});
		btn6Saque.setBackground(new Color(169, 169, 169));
		btn6Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn6Saque.setBounds(363, 296, 70, 60);
		ViewTransferencia.getContentPane().add(btn6Saque);

		Button btn8Saque = new Button("8");
		btn8Saque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textValorTransferencia.setText(textValorTransferencia.getText()+"8");
			}
		});
		btn8Saque.setBackground(new Color(169, 169, 169));
		btn8Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn8Saque.setBounds(292, 356, 70, 60);
		ViewTransferencia.getContentPane().add(btn8Saque);

		Button btnCancelSaque = new Button("Cancelar");
		btnCancelSaque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ViewMenuClienteContaCorrente(getCpf());
			}
		});
		btnCancelSaque.setBackground(new Color(169, 169, 169));
		btnCancelSaque.setFont(new Font("Dialog", Font.BOLD, 12));
		btnCancelSaque.setBounds(432, 236, 120, 60);
		ViewTransferencia.getContentPane().add(btnCancelSaque);

		Button btnLimparSaque = new Button("Limpar");
		btnLimparSaque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textValorTransferencia.setText("");
			}
		});
		btnLimparSaque.setBackground(new Color(169, 169, 169));
		btnLimparSaque.setFont(new Font("Dialog", Font.BOLD, 12));
		btnLimparSaque.setBounds(432, 296, 120, 60);
		ViewTransferencia.getContentPane().add(btnLimparSaque);

		Button btnConfirmSaque = new Button("Confirma");
		btnConfirmSaque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ViewMovimentaCorrenteTransferenciaAgenciaConta(getCpf(), textValorTransferencia.getText());
			}
		});
		

		btnConfirmSaque.setBackground(new Color(169, 169, 169));
		btnConfirmSaque.setFont(new Font("Dialog", Font.BOLD, 12));
		btnConfirmSaque.setBounds(433, 356, 120, 60);
		ViewTransferencia.getContentPane().add(btnConfirmSaque);

		Button btn7Saque = new Button("7");
		btn7Saque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textValorTransferencia.setText(textValorTransferencia.getText()+"7");
			}
		});
		btn7Saque.setBackground(new Color(169, 169, 169));
		btn7Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn7Saque.setBounds(222, 356, 70, 60);
		ViewTransferencia.getContentPane().add(btn7Saque);

		Button btn9Saque = new Button("9");
		btn9Saque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textValorTransferencia.setText(textValorTransferencia.getText()+"9");
			}
		});
		btn9Saque.setBackground(new Color(169, 169, 169));
		btn9Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn9Saque.setBounds(363, 356, 70, 60);
		ViewTransferencia.getContentPane().add(btn9Saque);

		Button btn0Saque = new Button("0");
		btn0Saque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textValorTransferencia.setText(textValorTransferencia.getText()+"0");
			}
		});
		btn0Saque.setBackground(new Color(169, 169, 169));
		btn0Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn0Saque.setBounds(292, 416, 70, 60);
		ViewTransferencia.getContentPane().add(btn0Saque);

		Button btn0Saque_1 = new Button("");
		btn0Saque_1.setEnabled(false);
		btn0Saque_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btn0Saque_1.setBackground(new Color(169, 169, 169));
		btn0Saque_1.setBounds(222, 416, 70, 60);
		ViewTransferencia.getContentPane().add(btn0Saque_1);

		Button btn0Saque_2 = new Button("");
		btn0Saque_2.setEnabled(false);
		btn0Saque_2.setFont(new Font("Dialog", Font.BOLD, 12));
		btn0Saque_2.setBackground(new Color(169, 169, 169));
		btn0Saque_2.setBounds(363, 416, 70, 60);
		ViewTransferencia.getContentPane().add(btn0Saque_2);

		Button btnConfirmSaque_1 = new Button("");
		btnConfirmSaque_1.setEnabled(false);
		btnConfirmSaque_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnConfirmSaque_1.setBackground(new Color(169, 169, 169));
		btnConfirmSaque_1.setBounds(433, 416, 120, 60);
		ViewTransferencia.getContentPane().add(btnConfirmSaque_1);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setIcon(
				new ImageIcon("C:\\Users\\eltin\\Downloads\\Backuptrabalho-final\\images\\backgroundCapyP.png"));
		lblNewLabel_2.setBounds(-16, 0, 800, 600);
		ViewTransferencia.getContentPane().add(lblNewLabel_2);

		Button btnSairSaque = new Button("Sair");
		btnSairSaque.setFont(new Font("Dialog", Font.BOLD, 20));
		btnSairSaque.setBounds(660, 527, 114, 33);
		ViewTransferencia.getContentPane().add(btnSairSaque);
		ViewTransferencia.setVisible(true);

	}
	
	public String formateSaldo(Double saldo) {

		String stringValue = saldo.toString();
		double doubleValue = Double.parseDouble(stringValue);
		DecimalFormat decimalFormat = new DecimalFormat("###,###.##");
		String formattedValue = decimalFormat.format(doubleValue);

		return formattedValue;

	}

	public String getCpf() {
		return cpf;
	}
}
