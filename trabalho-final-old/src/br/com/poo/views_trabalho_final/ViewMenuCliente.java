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
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class ViewMenuCliente extends JFrame {

	private String cpf;
	private JFrame ViewMenuCliente;
	private ViewMovimentaCorrenteSaque saque;
	private ViewMovimentaCorrenteSaque deposito;
	private ViewMovimentaPoupanca poupanca;
	private ViewTransi transi;
	private ViewMenuCliente menuCliente;
	private JLabel lblCliente;

	public ViewMenuCliente(String cpf) {
		this.cpf = cpf;
		initialize();
	}

	public void initialize() {
		Conta conta = Conta.contas.get(cpf);
		
		ViewMenuCliente = new JFrame();
		//Mudanca de setnome para setTittle
		ViewMenuCliente.setTitle("*CapyBank* - Menu Cliente");
		ViewMenuCliente.setBounds(100, 100, 800, 600);
		ViewMenuCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ViewMenuCliente.setLayout(null);

//		JFormattedTextField mostarNomeCliente = new JFormattedTextField();
//		mostarNomeCliente.setEnabled(false);
//		mostarNomeCliente.setBounds(66, 18, 257, 25);
//		ViewMenuCliente.add(mostarNomeCliente);
//		mostarNomeCliente.setText(conta.getTitular());
		
		//Label do Nome do Cliente
		JLabel mostarNomeCliente = new JLabel();
		mostarNomeCliente.setFont(new Font("Tahoma", Font.BOLD, 13));
		mostarNomeCliente.setBounds(66, 15, 257, 25);
		ViewMenuCliente.getContentPane().add(mostarNomeCliente);
		mostarNomeCliente.setText(conta.getTitular());
		

//		JFormattedTextField mostarSaldoCliente = new JFormattedTextField();
//		mostarSaldoCliente.setEnabled(false);
//		mostarSaldoCliente.setBounds(66, 44, 257, 25);
//		ViewMenuCliente.add(mostarSaldoCliente);
//		mostarSaldoCliente.setText(conta.getSaldo().toString());
		
		//Label Mostrar Saldo cliente
		JLabel mostarSaldoCliente = new JLabel();
		mostarSaldoCliente.setFont(new Font("Tahoma", Font.BOLD, 13));
		mostarSaldoCliente.setBounds(66, 40, 257, 25);
		ViewMenuCliente.getContentPane().add(mostarSaldoCliente);
		mostarSaldoCliente.setText(conta.getSaldo().toString());
		
		
		
		

		JLabel lblNewLabel = new JLabel("Usuário: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 20, 62, 14);
		ViewMenuCliente.add(lblNewLabel);

		JLabel lblSaldo = new JLabel("Saldo: ");
		lblSaldo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSaldo.setBounds(13, 46, 46, 14);
		ViewMenuCliente.add(lblSaldo);

		JButton btnSaqueCliente = new JButton("Saque");
		btnSaqueCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSaqueCliente.setBounds(38, 192, 196, 70);
		btnSaqueCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				saque = new ViewMovimentaCorrenteSaque(cpf);
				ViewMenuCliente.dispose();
			}
		});
		ViewMenuCliente.add(btnSaqueCliente);

		JButton btnDepositCliente = new JButton("Depósito");
		btnDepositCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDepositCliente.setBounds(306, 192, 196, 70);
		btnDepositCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				deposito = new ViewMovimentaCorrenteSaque(cpf);
				ViewMenuCliente.dispose();
			}
		});
		ViewMenuCliente.add(btnDepositCliente);

		JButton btnTransfCliente = new JButton("Transferência");
		btnTransfCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnTransfCliente.setBounds(564, 192, 196, 70);
		btnTransfCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				transi = new ViewTransi();
				ViewMenuCliente.dispose();
			}
		});
		ViewMenuCliente.add(btnTransfCliente);

		JButton btnRelatTributClient = new JButton("Relatório de tributação");
		btnRelatTributClient.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRelatTributClient.setBounds(137, 341, 228, 70);
		ViewMenuCliente.add(btnRelatTributClient);

		JButton btnSairMenuCliente = new JButton("Sair");
		btnSairMenuCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSairMenuCliente.setBounds(685, 527, 89, 23);
		ViewMenuCliente.add(btnSairMenuCliente);
		
		
		btnRelatTributClient.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				//Fecha a tela de MenuCliente pelo botao sair-----
				JOptionPane.showConfirmDialog(null, "Deseja Sacar R$: ");
				ViewMenuCliente.dispose();
				

			}

		});
		
		
		

		JButton btnSimulRendPoup = new JButton("Simular rendimento de poupança");
		btnSimulRendPoup.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSimulRendPoup.setBounds(437, 341, 228, 70);
		ViewMenuCliente.add(btnSimulRendPoup);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(
				"C:\\Users\\lionn\\eclipse-workspace\\telas_trabalho_final\\images\\backgroundCapyP.png"));
		lblNewLabel_1.setBounds(-16, 0, 800, 600);
		ViewMenuCliente.add(lblNewLabel_1);
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
