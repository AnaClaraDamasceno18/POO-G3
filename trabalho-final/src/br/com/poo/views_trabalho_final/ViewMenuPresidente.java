package br.com.poo.views_trabalho_final;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;

import br.com.poo.contas.Conta;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class ViewMenuPresidente {

	private JFrame frmcapybankMenu;
	private String cpf;

	/**
	 * Create the application.
	 * @param cpf 
	 */
	public ViewMenuPresidente(String cpf) {
		this.cpf = cpf;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Conta conta = Conta.contas.get(cpf);
		
		frmcapybankMenu = new JFrame();
		frmcapybankMenu.setTitle("*CapyBank* - Menu do presidente");
		frmcapybankMenu.setBounds(100, 100, 800, 600);
		frmcapybankMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmcapybankMenu.getContentPane().setLayout(null);
		
		JFormattedTextField mostarRelatPresid = new JFormattedTextField();
		mostarRelatPresid.setEnabled(false);
		mostarRelatPresid.setBounds(79, 54, 646, 335);
		frmcapybankMenu.getContentPane().add(mostarRelatPresid);
		
		JFormattedTextField mostarNomePresid = new JFormattedTextField();
		mostarNomePresid.setEnabled(false);
		mostarNomePresid.setBounds(79, 18, 257, 25);
		mostarNomePresid.setText(conta.getTitular());
		frmcapybankMenu.getContentPane().add(mostarNomePresid);
		
		JLabel lblPresidente = new JLabel("Presidente:");
		lblPresidente.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPresidente.setBounds(2, 22, 78, 14);
		frmcapybankMenu.getContentPane().add(lblPresidente);
		
		JButton btnGerarRelatPresid = new JButton("Gerar relatório do presidente");
		btnGerarRelatPresid.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGerarRelatPresid.setBounds(79, 400, 220, 70);
		frmcapybankMenu.getContentPane().add(btnGerarRelatPresid);
		
		JButton btnGerarRelatDir_Presid = new JButton("Gerar relatório do diretor");
		btnGerarRelatDir_Presid.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGerarRelatDir_Presid.setBounds(303, 400, 210, 70);
		frmcapybankMenu.getContentPane().add(btnGerarRelatDir_Presid);
		
		JButton btnGerarRelatGer_Presid = new JButton("Gerar relatório do gerente");
		btnGerarRelatGer_Presid.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGerarRelatGer_Presid.setBounds(519, 400, 210, 70);
		frmcapybankMenu.getContentPane().add(btnGerarRelatGer_Presid);
		
		JButton btnSairRelatPresid = new JButton("Sair");
		btnSairRelatPresid.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSairRelatPresid.setBounds(685, 527, 89, 23);
		frmcapybankMenu.getContentPane().add(btnSairRelatPresid);
		
		JButton btnGerarSaldoTotal = new JButton("Gerar saldo total em CapyCoins");
		btnGerarSaldoTotal.setIcon(new ImageIcon("C:\\TrabalhoPOO\\telas_trabalho_final\\images\\CapyCoinsR_SF.png"));
		btnGerarSaldoTotal.setForeground(new Color(160, 82, 45));
		btnGerarSaldoTotal.setBackground(new Color(255, 215, 0));
		btnGerarSaldoTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGerarSaldoTotal.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 16));
		btnGerarSaldoTotal.setBounds(196, 480, 405, 70);
		frmcapybankMenu.getContentPane().add(btnGerarSaldoTotal);
		
		JLabel lblNewLabel = new JLabel("*CapyBank* - Menu de Presidente");
		lblNewLabel.setIcon(new ImageIcon("C:\\TrabalhoPOO\\telas_trabalho_final\\images\\backgroundCapyP.png"));
		lblNewLabel.setBounds(-16, 0, 800, 600);
		frmcapybankMenu.getContentPane().add(lblNewLabel);
		frmcapybankMenu.setVisible(true);
	}

	public String getCpf() {
		return cpf;
	}

}
