package br.com.poo.view.contas.menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.poo.contas.Conta;
import br.com.poo.enums.PessoaEnum;
import br.com.poo.pessoa.Cliente;
import br.com.poo.views.contas.operacoes.ViewMovimentaPoupancaDeposito;
import br.com.poo.views.contas.operacoes.ViewMovimentaPoupancaSaque;
import br.com.poo.views.contas.operacoes.ViewMovimentaPoupancaTransferenciaValor;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class ViewMenuClienteContaPoupanca extends JFrame {

	private String cpf;
	private JFrame viewMenuClienteContaPoupanca;
	private ViewMovimentaPoupancaSaque saque;
	private ViewMovimentaPoupancaDeposito deposito;
	private ViewMovimentaPoupancaTransferenciaValor transi;
	private JLabel lblCliente;

	public ViewMenuClienteContaPoupanca(String cpf) {
		this.cpf = cpf;
		initialize();
	}

	public void initialize() {
		
		Conta conta = Conta.contas.get(cpf);

		viewMenuClienteContaPoupanca = new JFrame("*CapyBank* - Conta Corrente");
		viewMenuClienteContaPoupanca.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\eltin\\Downloads\\Backuptrabalho-final\\images\\CapyCoinsR_SF.png"));
		viewMenuClienteContaPoupanca.setTitle("*CapyBank* - Conta Poupança");
		viewMenuClienteContaPoupanca.setName("*CapyBank* - Menu Cliente ");
		viewMenuClienteContaPoupanca.setSize(800, 600);
		viewMenuClienteContaPoupanca.setLocationRelativeTo(null);
		viewMenuClienteContaPoupanca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewMenuClienteContaPoupanca.getContentPane().setLayout(null);

		JFormattedTextField mostarNomeCliente = new JFormattedTextField();
		mostarNomeCliente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		mostarNomeCliente.setEnabled(false);
		mostarNomeCliente.setBounds(90, 18, 345, 25);
		viewMenuClienteContaPoupanca.getContentPane().add(mostarNomeCliente);
		mostarNomeCliente.setText(conta.getTitular());

		JFormattedTextField mostarSaldoCliente = new JFormattedTextField();
		mostarSaldoCliente.setEnabled(false);
		mostarSaldoCliente.setBounds(532, 18, 189, 25);
		viewMenuClienteContaPoupanca.getContentPane().add(mostarSaldoCliente);
		mostarSaldoCliente.setText(conta.getSaldo().toString());

		JLabel lblNewLabel = new JLabel("Cliente:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 18, 90, 25);
		viewMenuClienteContaPoupanca.getContentPane().add(lblNewLabel);

		JLabel lblSaldo = new JLabel("Saldo: ");
		lblSaldo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSaldo.setBounds(467, 18, 90, 25);
		viewMenuClienteContaPoupanca.getContentPane().add(lblSaldo);

		JButton btnSaqueCliente = new JButton("Saque");
		btnSaqueCliente.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSaqueCliente.setBounds(75, 340, 196, 70);
		btnSaqueCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				saque = new ViewMovimentaPoupancaSaque(getCpf());
				
			}
		});
		viewMenuClienteContaPoupanca.getContentPane().add(btnSaqueCliente);

		JButton btnDepositCliente = new JButton("Depósito");
		btnDepositCliente.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDepositCliente.setBounds(300, 255, 196, 70);
		btnDepositCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				deposito = new ViewMovimentaPoupancaDeposito(getCpf());
				
			}
		});
		viewMenuClienteContaPoupanca.getContentPane().add(btnDepositCliente);

		JButton btnTransfCliente = new JButton("Transferência");
		btnTransfCliente.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnTransfCliente.setBounds(525, 340, 196, 70);
		btnTransfCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				transi = new ViewMovimentaPoupancaTransferenciaValor(getCpf());
				
			}
		});
		viewMenuClienteContaPoupanca.getContentPane().add(btnTransfCliente);

		JButton btnRelatTributClient = new JButton("<html>\r\n<center>\r\nSimular<br> Rendimento <br> Poupança\r\n</center>\r\n</html>");
		btnRelatTributClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRelatTributClient.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRelatTributClient.setBounds(250, 431, 307, 77);
		viewMenuClienteContaPoupanca.getContentPane().add(btnRelatTributClient);

		JButton btnSairMenuCliente = new JButton("Sair");
		btnSairMenuCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSairMenuCliente.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSairMenuCliente.setBounds(660, 517, 114, 33);
		viewMenuClienteContaPoupanca.getContentPane().add(btnSairMenuCliente);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\eltin\\Downloads\\Backuptrabalho-final\\images\\backgroundCapyG.png"));
		lblNewLabel_1.setBounds(-16, 0, 800, 600);
		viewMenuClienteContaPoupanca.getContentPane().add(lblNewLabel_1);
		viewMenuClienteContaPoupanca.setVisible(true);
	}

	public void indentificaCliente(String nome) {

	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
