

package br.com.poo.views_trabalho_final;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.poo.contas.Conta;
import br.com.poo.enums.PessoaEnum;
import br.com.poo.pessoa.Cliente;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class ViewMenuClientePoupanca extends JFrame {

	private String cpf;
	private JFrame ViewMenuCliente;
	private ViewMovimentaCorrenteSaque saque;
	private ViewMovimentaCorrenteSaque deposito;
	private ViewMovimentaPoupanca poupanca;
	private ViewTransi transi;
	private ViewMenuCliente menuCliente;
	private JLabel lblCliente;

	public ViewMenuClientePoupanca(String cpf) {
		this.cpf = cpf;
		initialize();
	}

	public void initialize() {
		Conta conta = Conta.contas.get(cpf);

		ViewMenuCliente = new JFrame();
		ViewMenuCliente.setName("*CapyBank* - Menu Cliente");
		ViewMenuCliente.setBounds(100, 100, 800, 600);
		ViewMenuCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ViewMenuCliente.getContentPane().setLayout(null);

		JLabel mostarNomeCliente = new JLabel();
		mostarNomeCliente.setFont(new Font("Tahoma", Font.BOLD, 13));
		mostarNomeCliente.setBounds(66, 18, 257, 25);
		ViewMenuCliente.getContentPane().add(mostarNomeCliente);
		mostarNomeCliente.setText(conta.getTitular());
		
		

		//Label Mostrar Saldo cliente
		JLabel mostarSaldoCliente = new JLabel();
		mostarSaldoCliente.setFont(new Font("Tahoma", Font.BOLD, 13));
		mostarSaldoCliente.setBounds(66, 40, 257, 25);
		ViewMenuCliente.getContentPane().add(mostarSaldoCliente);
		mostarSaldoCliente.setText(conta.getSaldo().toString());
		

		JLabel lblNewLabel = new JLabel("Usuário: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 20, 62, 14);
		ViewMenuCliente.getContentPane().add(lblNewLabel);

		JLabel lblSaldo = new JLabel("Saldo: ");
		lblSaldo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSaldo.setBounds(13, 46, 46, 14);
		ViewMenuCliente.getContentPane().add(lblSaldo);

		JButton btnSaqueCliente = new JButton("Saque");
		btnSaqueCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSaqueCliente.setBounds(38, 192, 196, 70);
		btnSaqueCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new ViewMovimentaPoupanca(cpf);
				ViewMenuCliente.dispose();
			}
		});
		ViewMenuCliente.getContentPane().add(btnSaqueCliente);

		JButton btnDepositCliente = new JButton("Depósito");
		btnDepositCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDepositCliente.setBounds(306, 192, 196, 70);
		btnDepositCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				deposito = new ViewMovimentaCorrenteSaque(cpf);
				ViewMenuCliente.dispose();
			}
		});
		ViewMenuCliente.getContentPane().add(btnDepositCliente);

		JButton btnTransfCliente = new JButton("Transferência");
		btnTransfCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnTransfCliente.setBounds(564, 192, 196, 70);
		btnTransfCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				transi = new ViewTransi();
				ViewMenuCliente.dispose();
			}
		});
		ViewMenuCliente.getContentPane().add(btnTransfCliente);

		JButton btnSairMenuCliente = new JButton("Sair");
		btnSairMenuCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSairMenuCliente.setBounds(685, 527, 89, 23);
		ViewMenuCliente.getContentPane().add(btnSairMenuCliente);

		JButton btnSimulRendPoup = new JButton("Simular rendimento de poupança");
		btnSimulRendPoup.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSimulRendPoup.setBounds(293, 342, 228, 70);
		ViewMenuCliente.getContentPane().add(btnSimulRendPoup);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(
				"C:\\Users\\lionn\\eclipse-workspace\\telas_trabalho_final\\images\\backgroundCapyP.png"));
		lblNewLabel_1.setBounds(-16, -13, 800, 600);
		ViewMenuCliente.getContentPane().add(lblNewLabel_1);
		ViewMenuCliente.setVisible(true);
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
