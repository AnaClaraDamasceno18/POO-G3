package br.com.poo.views_trabalho_final;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;

import br.com.poo.contas.Conta;
import br.com.poo.io.LeituraEscrita;
import br.com.poo.pessoa.Diretor;
import br.com.poo.pessoa.Funcionario;
import br.com.poo.pessoa.Gerente;
import br.com.poo.pessoa.Presidente;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class ViewMenuPresidente {

	private JFrame frmcapybankMenu;
	private String cpf;
	
	
	public ViewMenuPresidente(String cpf, Funcionario presidente, Funcionario gerente) {
		this.cpf = cpf;
		initialize(presidente, gerente);
	}

	private void initialize(Funcionario presidente, Funcionario gerente) {
		Conta conta = Conta.contas.get(cpf);
		
		frmcapybankMenu = new JFrame();
		frmcapybankMenu.setTitle("*CapyBank* - Menu do presidente");
		frmcapybankMenu.setBounds(100, 100, 800, 600);
		frmcapybankMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmcapybankMenu.getContentPane().setLayout(null);
		
		JFormattedTextField mostarRelatGer_Presid = new JFormattedTextField();
		mostarRelatGer_Presid.setText("Total de Capytal no Banco: 0.0");
		mostarRelatGer_Presid.setEnabled(false);
		mostarRelatGer_Presid.setBounds(519, 194, 210, 108);
		mostarRelatGer_Presid.setText("Total de Contas Gerenciadas: " + String.valueOf(Conta.qtdContas(gerente)));
		frmcapybankMenu.getContentPane().add(mostarRelatGer_Presid);
		
		JFormattedTextField mostarRelatDir_Presid = new JFormattedTextField();
		mostarRelatDir_Presid.setText("Total de Capytal no Banco: 0.0");
		mostarRelatDir_Presid.setEnabled(false);
		mostarRelatDir_Presid.setBounds(303, 194, 210, 108);
		mostarRelatDir_Presid.setText("Total de Capytal no Banco: " + Conta.saldoBanco(presidente));
		frmcapybankMenu.getContentPane().add(mostarRelatDir_Presid);
		
		JFormattedTextField mostarRelatPresid = new JFormattedTextField();
		mostarRelatPresid.setEnabled(false);
		mostarRelatPresid.setBounds(79, 194, 220, 108);
		mostarRelatPresid.setText("Total de Capytal no Banco: " + Conta.saldoBanco(presidente));
		frmcapybankMenu.getContentPane().add(mostarRelatPresid);
		
//		JFormattedTextField mostarRelatDiretor = new JFormattedTextField();
//		mostarRelatDiretor.setEnabled(false);
//		mostarRelatDiretor.setBounds(79, 154, 200, 100);
//		mostarRelatDiretor.setText("Total de Capytal no Banco: " + Conta.saldoBanco(presidente));
//		frmcapybankMenu.getContentPane().add(mostarRelatPresid);
//		
//		JFormattedTextField mostarRelatGerente = new JFormattedTextField();
//		mostarRelatGerente.setEnabled(false);
//		mostarRelatGerente.setBounds(79, 208, 200, 100);
//		mostarRelatGerente.setText("Total de Contas Gerenciadas: " + String.valueOf(Conta.qtdContas(gerente)));
//		frmcapybankMenu.getContentPane().add(mostarRelatPresid);
		
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
		btnGerarRelatPresid.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					LeituraEscrita.relatorioPresidente(presidente);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		frmcapybankMenu.getContentPane().add(btnGerarRelatPresid);
		
		JButton btnGerarRelatDir_Presid = new JButton("Gerar relatório do diretor");
		btnGerarRelatDir_Presid.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGerarRelatDir_Presid.setBounds(303, 400, 210, 70);
		frmcapybankMenu.getContentPane().add(btnGerarRelatDir_Presid);
		
		JButton btnGerarRelatGer_Presid = new JButton("Gerar relatório do gerente");
		btnGerarRelatGer_Presid.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGerarRelatGer_Presid.setBounds(519, 400, 210, 70);
		btnGerarRelatGer_Presid.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					LeituraEscrita.relatorioGerente(gerente);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
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
