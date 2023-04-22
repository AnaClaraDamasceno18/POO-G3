package br.com.poo.views_trabalho_final;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class ViewMenuCliente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewMenuCliente frame = new ViewMenuCliente();
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
	public ViewMenuCliente() {
		setTitle("*Capybank* - Menu de cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JFormattedTextField mostarNomeCliente = new JFormattedTextField();
		mostarNomeCliente.setEnabled(false);
		mostarNomeCliente.setBounds(66, 18, 257, 25);
		contentPane.add(mostarNomeCliente);
		
		JFormattedTextField mostarSaldoCliente = new JFormattedTextField();
		mostarSaldoCliente.setEnabled(false);
		mostarSaldoCliente.setBounds(66, 44, 257, 25);
		contentPane.add(mostarSaldoCliente);
		
		JLabel lblNewLabel = new JLabel("Cliente:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 20, 62, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblSaldo = new JLabel("Saldo:");
		lblSaldo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSaldo.setBounds(13, 46, 46, 14);
		contentPane.add(lblSaldo);
		
		JButton btnSaqueCliente = new JButton("Saque");
		btnSaqueCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSaqueCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSaqueCliente.setBounds(38, 192, 196, 70);
		contentPane.add(btnSaqueCliente);
		
		JButton btnDepositCliente = new JButton("Depósito");
		btnDepositCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDepositCliente.setBounds(306, 192, 196, 70);
		contentPane.add(btnDepositCliente);
		
		JButton btnTransfCliente = new JButton("Transferência");
		btnTransfCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnTransfCliente.setBounds(564, 192, 196, 70);
		contentPane.add(btnTransfCliente);
		
		JButton btnRelatTributClient = new JButton("Relatório de tributação");
		btnRelatTributClient.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnRelatTributClient.setBounds(137, 341, 228, 70);
		contentPane.add(btnRelatTributClient);
		
		JButton btnSairMenuCliente = new JButton("Sair");
		btnSairMenuCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSairMenuCliente.setBounds(685, 527, 89, 23);
		contentPane.add(btnSairMenuCliente);
		
		JButton btnSimulRendPoup = new JButton("Simular rendimento de poupança");
		btnSimulRendPoup.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSimulRendPoup.setBounds(437, 341, 228, 70);
		contentPane.add(btnSimulRendPoup);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\lionn\\eclipse-workspace\\telas_trabalho_final\\images\\backgroundCapyP.png"));
		lblNewLabel_1.setBounds(-16, 0, 800, 600);
		contentPane.add(lblNewLabel_1);
	}
}
