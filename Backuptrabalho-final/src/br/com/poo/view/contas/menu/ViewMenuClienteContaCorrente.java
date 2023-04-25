package br.com.poo.view.contas.menu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.poo.contas.Conta;
import br.com.poo.enums.PessoaEnum;
import br.com.poo.pessoa.Cliente;
import br.com.poo.views.contas.operacoes.ViewMovimentaCorrenteDeposito;
import br.com.poo.views.contas.operacoes.ViewMovimentaCorrenteSaque;
import br.com.poo.views.contas.operacoes.ViewMovimentaCorrenteTransferenciaValor;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class ViewMenuClienteContaCorrente extends JFrame {

	private String cpf;
	private JFrame viewMenuClienteContaCorrente;
	private ViewMovimentaCorrenteSaque saque;
	private ViewMovimentaCorrenteDeposito deposito;
	private ViewMovimentaCorrenteTransferenciaValor transi;
	private JLabel lblCliente;

	public ViewMenuClienteContaCorrente(String cpf) {
		this.cpf = cpf;
		initialize();
	}

	public void initialize() {
		
		Conta conta = Conta.contas.get(getCpf());

		viewMenuClienteContaCorrente = new JFrame("*CapyBank* - Conta Corrente");
		viewMenuClienteContaCorrente.setName("*CapyBank* - Menu Cliente Conta Corrente");
		viewMenuClienteContaCorrente.setSize(800, 600);
		viewMenuClienteContaCorrente.setLocationRelativeTo(null);
		viewMenuClienteContaCorrente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		viewMenuClienteContaCorrente.getContentPane().setLayout(null);

		JFormattedTextField mostarNomeCliente = new JFormattedTextField();
		mostarNomeCliente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		mostarNomeCliente.setEnabled(false);
		mostarNomeCliente.setBounds(90, 18, 345, 25);
		viewMenuClienteContaCorrente.getContentPane().add(mostarNomeCliente);
		mostarNomeCliente.setText(conta.getTitular());

		JFormattedTextField mostarSaldoCliente = new JFormattedTextField();
		mostarSaldoCliente.setEnabled(false);
		mostarSaldoCliente.setBounds(532, 18, 189, 25);
		viewMenuClienteContaCorrente.getContentPane().add(mostarSaldoCliente);
		mostarSaldoCliente.setText(conta.getSaldo().toString());

		JLabel lblNewLabel = new JLabel("Cliente:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 18, 90, 25);
		viewMenuClienteContaCorrente.getContentPane().add(lblNewLabel);

		JLabel lblSaldo = new JLabel("Saldo: ");
		lblSaldo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSaldo.setBounds(467, 18, 90, 25);
		viewMenuClienteContaCorrente.getContentPane().add(lblSaldo);

		JButton btnSaqueCliente = new JButton("Saque");
		btnSaqueCliente.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSaqueCliente.setBounds(75, 340, 196, 70);
		btnSaqueCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				saque = new ViewMovimentaCorrenteSaque(getCpf());
				
			}
		});
		viewMenuClienteContaCorrente.getContentPane().add(btnSaqueCliente);

		JButton btnDepositCliente = new JButton("Depósito");
		btnDepositCliente.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDepositCliente.setBounds(300, 255, 196, 70);
		btnDepositCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				deposito = new ViewMovimentaCorrenteDeposito(getCpf());
				
			}
		});
		viewMenuClienteContaCorrente.getContentPane().add(btnDepositCliente);

		JButton btnTransfCliente = new JButton("Transferência");
		btnTransfCliente.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnTransfCliente.setBounds(525, 340, 196, 70);
		btnTransfCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				transi = new ViewMovimentaCorrenteTransferenciaValor(getCpf());
				
			}
		});
		viewMenuClienteContaCorrente.getContentPane().add(btnTransfCliente);

		JButton btnRelatTributClient = new JButton("Relatório de tributação");
		btnRelatTributClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRelatTributClient.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnRelatTributClient.setBounds(250, 426, 307, 70);
		viewMenuClienteContaCorrente.getContentPane().add(btnRelatTributClient);

		JButton btnSairMenuCliente = new JButton("Sair");
		btnSairMenuCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSairMenuCliente.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSairMenuCliente.setBounds(660, 527, 114, 33);
		viewMenuClienteContaCorrente.getContentPane().add(btnSairMenuCliente);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\eltin\\Downloads\\Backuptrabalho-final\\images\\backgroundCapyG.png"));
		lblNewLabel_1.setBounds(-16, 0, 800, 600);
		viewMenuClienteContaCorrente.getContentPane().add(lblNewLabel_1);
		viewMenuClienteContaCorrente.setVisible(true);
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
