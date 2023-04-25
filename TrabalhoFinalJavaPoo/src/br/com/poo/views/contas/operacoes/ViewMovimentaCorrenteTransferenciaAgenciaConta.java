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
import br.com.poo.contas.ContaCorrente;
import br.com.poo.enums.ContaEnum;
import br.com.poo.pessoa.Cliente;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;

public class ViewMovimentaCorrenteTransferenciaAgenciaConta extends JFrame {

	private JFrame viewTransAgenciaConta;
	private JTextField textAgencia;
	private String cpf;
	private int contador;
	private boolean verificador = true;
	private String valorTransferencia;

	public ViewMovimentaCorrenteTransferenciaAgenciaConta(String cpf, String valorTransferencia) {
		this.cpf = cpf;
		this.valorTransferencia = valorTransferencia;
		initialize();
	}

	public void initialize() {
		ContaCorrente conta = (ContaCorrente) Conta.contas.get(getCpf());

		viewTransAgenciaConta = new JFrame();
		viewTransAgenciaConta.setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\eltin\\Downloads\\Backuptrabalho-final\\images\\CapyCoinsR_SF.png"));
		viewTransAgenciaConta.setName("*CapyBank* - Saque");
		viewTransAgenciaConta.setSize(800, 600);
		viewTransAgenciaConta.setLocationRelativeTo(null);
		viewTransAgenciaConta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewTransAgenciaConta.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Cliente:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 18, 90, 25);
		viewTransAgenciaConta.getContentPane().add(lblNewLabel);

		JLabel lblConta = new JLabel("Conta:");
		lblConta.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblConta.setBounds(222, 186, 90, 25);
		viewTransAgenciaConta.getContentPane().add(lblConta);

		JLabel lblCliente = new JLabel("Cliente:");
		lblCliente.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCliente.setBounds(222, 125, 90, 25);
		viewTransAgenciaConta.getContentPane().add(lblCliente);

		JLabel lblValor = new JLabel("Agência:");
		lblValor.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblValor.setBounds(222, 157, 90, 25);
		viewTransAgenciaConta.getContentPane().add(lblValor);

		JLabel lblSaldo = new JLabel("Saldo:");
		lblSaldo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSaldo.setBounds(467, 18, 70, 25);
		viewTransAgenciaConta.getContentPane().add(lblSaldo);

		JFormattedTextField textClienteDest = new JFormattedTextField();
		textClienteDest.setEditable(false);
		textClienteDest.setText((String) null);
		textClienteDest.setFont(new Font("Tahoma", Font.BOLD, 20));
		textClienteDest.setBounds(315, 125, 237, 25);
		viewTransAgenciaConta.getContentPane().add(textClienteDest);

		JFormattedTextField mostarSaldoCliente = new JFormattedTextField();
		mostarSaldoCliente.setEditable(false);
		mostarSaldoCliente.setFont(new Font("Tahoma", Font.BOLD, 20));
		mostarSaldoCliente.setBounds(537, 18, 172, 25);
		mostarSaldoCliente.setText(conta.getSaldo().toString());
		viewTransAgenciaConta.getContentPane().add(mostarSaldoCliente);

		JFormattedTextField mostarNomeCliente = new JFormattedTextField();
		mostarNomeCliente.setEditable(false);
		mostarNomeCliente.setFont(new Font("Tahoma", Font.BOLD, 20));
		mostarNomeCliente.setBounds(90, 18, 345, 25);
		mostarNomeCliente.setText(conta.getTitular());
		viewTransAgenciaConta.getContentPane().add(mostarNomeCliente);

		textAgencia = new JFormattedTextField();
		textAgencia.setEditable(false);
		textAgencia.setFont(new Font("Tahoma", Font.BOLD, 20));
		textAgencia.setBounds(315, 157, 237, 25);
		viewTransAgenciaConta.getContentPane().add(textAgencia);
		textAgencia.setColumns(10);

		JLabel lblValor_1 = new JLabel("Pix:");
		lblValor_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblValor_1.setBounds(86, 89, 48, 25);
		viewTransAgenciaConta.getContentPane().add(lblValor_1);

		JFormattedTextField textPix = new JFormattedTextField();
		textPix.setEditable(false);
		textPix.setFont(new Font("Tahoma", Font.BOLD, 20));
		textPix.setColumns(10);
		textPix.setBounds(136, 89, 237, 25);
		viewTransAgenciaConta.getContentPane().add(textPix);

		JFormattedTextField textConta = new JFormattedTextField();
		textConta.setEditable(false);
		textConta.setFont(new Font("Tahoma", Font.BOLD, 20));
		textConta.setColumns(10);
		textConta.setBounds(315, 186, 237, 25);
		viewTransAgenciaConta.getContentPane().add(textConta);

		Panel panel = new Panel();
		panel.setBounds(222, 485, 330, 33);
		viewTransAgenciaConta.getContentPane().add(panel);

		Label label = new Label("Taxa de Transferência: R$ 0,20");
		label.setFont(new Font("Dialog", Font.BOLD, 20));
		panel.add(label);

		Button btn1Saque = new Button("1");
		btn1Saque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPix.setText(textPix.getText() + "1");

			}
		});
		btn1Saque.setBackground(new Color(169, 169, 169));
		btn1Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn1Saque.setBounds(222, 236, 70, 60);
		viewTransAgenciaConta.getContentPane().add(btn1Saque);

		Button btn2Saque = new Button("2");
		btn2Saque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPix.setText(textPix.getText() + "2");

			}
		});

		Button btnSairSaque_1 = new Button("Buscar ");
		btnSairSaque_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String pix = textPix.getText();
				Conta contaDestino = conta.contas.get(pix);

				textClienteDest.setText(contaDestino.getTitular());
				textConta.setText(contaDestino.getNumConta());
				;
				textAgencia.setText(contaDestino.getAgencia());

			}
		});
		btnSairSaque_1.setFont(new Font("Dialog", Font.BOLD, 20));
		btnSairSaque_1.setBounds(379, 89, 114, 25);
		viewTransAgenciaConta.getContentPane().add(btnSairSaque_1);
		btn2Saque.setBackground(new Color(169, 169, 169));
		btn2Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn2Saque.setBounds(292, 236, 70, 60);
		viewTransAgenciaConta.getContentPane().add(btn2Saque);

		Button btn3Saque = new Button("3");
		btn3Saque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPix.setText(textPix.getText() + "3");
			}
		});
		btn3Saque.setBackground(new Color(169, 169, 169));
		btn3Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn3Saque.setBounds(363, 236, 70, 60);
		viewTransAgenciaConta.getContentPane().add(btn3Saque);

		Button btn4Saque = new Button("4");
		btn4Saque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPix.setText(textPix.getText() + "4");
			}
		});
		btn4Saque.setBackground(new Color(169, 169, 169));
		btn4Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn4Saque.setBounds(222, 296, 70, 60);
		viewTransAgenciaConta.getContentPane().add(btn4Saque);

		Button btn5Saque = new Button("5");
		btn5Saque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPix.setText(textPix.getText() + "5");
			}
		});
		btn5Saque.setBackground(new Color(169, 169, 169));
		btn5Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn5Saque.setBounds(292, 296, 70, 60);
		viewTransAgenciaConta.getContentPane().add(btn5Saque);

		Button btn6Saque = new Button("6");
		btn6Saque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPix.setText(textPix.getText() + "6");
			}
		});
		btn6Saque.setBackground(new Color(169, 169, 169));
		btn6Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn6Saque.setBounds(363, 296, 70, 60);
		viewTransAgenciaConta.getContentPane().add(btn6Saque);

		Button btn8Saque = new Button("8");
		btn8Saque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPix.setText(textPix.getText() + "8");
			}
		});
		btn8Saque.setBackground(new Color(169, 169, 169));
		btn8Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn8Saque.setBounds(292, 356, 70, 60);
		viewTransAgenciaConta.getContentPane().add(btn8Saque);

		Button btnCancelSaque = new Button("Cancelar");
		btnCancelSaque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewTransAgenciaConta.dispose();
			}
		});
		btnCancelSaque.setBackground(new Color(169, 169, 169));
		btnCancelSaque.setFont(new Font("Dialog", Font.BOLD, 12));
		btnCancelSaque.setBounds(432, 236, 120, 60);
		viewTransAgenciaConta.getContentPane().add(btnCancelSaque);

		Button btnLimparSaque = new Button("Limpar");
		btnLimparSaque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPix.setText("");
			}
		});
		btnLimparSaque.setBackground(new Color(169, 169, 169));
		btnLimparSaque.setFont(new Font("Dialog", Font.BOLD, 12));
		btnLimparSaque.setBounds(432, 296, 120, 60);
		viewTransAgenciaConta.getContentPane().add(btnLimparSaque);

		Button btnConfirmSaque = new Button("Confirma");
		btnConfirmSaque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int resposta = JOptionPane.showOptionDialog(null,
						"Deseja confirmar essa operação? Transferência" + "\n Agencia: " + textAgencia.getText()
								+ "\n Conta: " + textConta.getText() + "\n Valor: R$: " + getValorTransferencia(),
						"\nConfirmação de Trasnferência\n", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
						null, new Object[] { "Sim", "Não" }, "Não");

				switch (resposta) {

				case JOptionPane.YES_OPTION:

					Conta contaDestino = conta.contas.get(textPix.getText());

					// Cliente clientedestino = Cliente.mapaClientes.get(textPix.getText());

					Double valor = Double.parseDouble(getValorTransferencia());

					if ((valor > 0) && (conta.getSaldo() >= valor)) {
						conta.sacar(valor);
						contaDestino.depositar(valor);

						ContaCorrente.quantidadeTransferencia++;

						mostarSaldoCliente.setValue(conta.getSaldo() - 0.10);
					}else {
						JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
						viewTransAgenciaConta.dispose();
						
						
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
		btnConfirmSaque.setBounds(433, 356, 120, 60);
		viewTransAgenciaConta.getContentPane().add(btnConfirmSaque);

		Button btn7Saque = new Button("7");
		btn7Saque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPix.setText(textPix.getText() + "7");
			}
		});
		btn7Saque.setBackground(new Color(169, 169, 169));
		btn7Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn7Saque.setBounds(222, 356, 70, 60);
		viewTransAgenciaConta.getContentPane().add(btn7Saque);

		Button btn9Saque = new Button("9");
		btn9Saque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPix.setText(textPix.getText() + "9");
			}
		});
		btn9Saque.setBackground(new Color(169, 169, 169));
		btn9Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn9Saque.setBounds(363, 356, 70, 60);
		viewTransAgenciaConta.getContentPane().add(btn9Saque);

		Button btn0Saque = new Button("0");
		btn0Saque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPix.setText(textPix.getText() + "0");
			}
		});
		btn0Saque.setBackground(new Color(169, 169, 169));
		btn0Saque.setFont(new Font("Dialog", Font.BOLD, 12));
		btn0Saque.setBounds(292, 416, 70, 60);
		viewTransAgenciaConta.getContentPane().add(btn0Saque);

		Button btn0Saque_1 = new Button("");
		btn0Saque_1.setEnabled(false);
		btn0Saque_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btn0Saque_1.setBackground(new Color(169, 169, 169));
		btn0Saque_1.setBounds(222, 416, 70, 60);
		viewTransAgenciaConta.getContentPane().add(btn0Saque_1);

		Button btn0Saque_2 = new Button("");
		btn0Saque_2.setEnabled(false);
		btn0Saque_2.setFont(new Font("Dialog", Font.BOLD, 12));
		btn0Saque_2.setBackground(new Color(169, 169, 169));
		btn0Saque_2.setBounds(363, 416, 70, 60);
		viewTransAgenciaConta.getContentPane().add(btn0Saque_2);

		Button btnConfirmSaque_1 = new Button("");
		btnConfirmSaque_1.setEnabled(false);
		btnConfirmSaque_1.setFont(new Font("Dialog", Font.BOLD, 12));
		btnConfirmSaque_1.setBackground(new Color(169, 169, 169));
		btnConfirmSaque_1.setBounds(433, 416, 120, 60);
		viewTransAgenciaConta.getContentPane().add(btnConfirmSaque_1);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(
				new ImageIcon("C:\\Users\\eltin\\Downloads\\Backuptrabalho-final\\images\\backgroundCapyP.png"));
		lblNewLabel_2.setBounds(-16, 0, 800, 600);
		viewTransAgenciaConta.getContentPane().add(lblNewLabel_2);

		Button btnSairSaque = new Button("Sair");
		btnSairSaque.setFont(new Font("Dialog", Font.BOLD, 20));
		btnSairSaque.setBounds(660, 527, 114, 33);
		viewTransAgenciaConta.getContentPane().add(btnSairSaque);
		viewTransAgenciaConta.setVisible(true);

	}

	public String getCpf() {
		return cpf;
	}

	public String getValorTransferencia() {
		return valorTransferencia;
	}
}
