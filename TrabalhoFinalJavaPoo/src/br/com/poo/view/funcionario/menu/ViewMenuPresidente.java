package br.com.poo.view.funcionario.menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;

import br.com.poo.contas.Conta;
import br.com.poo.io.LeituraEscrita;
import br.com.poo.pessoa.Funcionario;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class ViewMenuPresidente {

	private JFrame frmcapybankMenu;
	private String cpf;

	/**
	 * Create the application.
	 * @param cpf 
	 */
	public ViewMenuPresidente(String cpf, Funcionario presidente, Funcionario gerente) {
		this.cpf = cpf;
		initialize(presidente, gerente);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Funcionario presidente, Funcionario gerente) {
		Conta conta = Conta.contas.get(cpf);
		Funcionario presidente1 = Funcionario.mapaFuncionarios.get(cpf);
		
		frmcapybankMenu = new JFrame();
		frmcapybankMenu.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\eltin\\Downloads\\Backuptrabalho-final\\images\\CapyCoinsR_SF.png"));
		frmcapybankMenu.setTitle("*CapyBank* - Menu do Presidente");
		frmcapybankMenu.setSize(800, 600);
		frmcapybankMenu.setLocationRelativeTo(null);
		frmcapybankMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmcapybankMenu.getContentPane().setLayout(null);
		
		JFormattedTextField mostarRelatPresid = new JFormattedTextField();
		mostarRelatPresid.setEnabled(false);
		mostarRelatPresid.setBounds(79, 69, 633, 335);
		mostarRelatPresid.setText("Total de Capytal no Banco: " + Conta.saldoBanco(presidente));
		frmcapybankMenu.getContentPane().add(mostarRelatPresid);
		
		JFormattedTextField mostarNomePresid = new JFormattedTextField();
		mostarNomePresid.setEditable(false);
		mostarNomePresid.setFont(new Font("Tahoma", Font.PLAIN, 20));
		mostarNomePresid.setBounds(202, 33, 510, 25);
		mostarNomePresid.setText(presidente.getNome());
		frmcapybankMenu.getContentPane().add(mostarNomePresid);
		
		JLabel lblPresidente = new JLabel("Presidente:");
		lblPresidente.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPresidente.setBounds(79, 33, 128, 25);
		frmcapybankMenu.getContentPane().add(lblPresidente);
		
		JButton btnGerarRelatPresid = new JButton("<html>\r\n<center>\r\nGerar\r\n<br> \r\nRelatório Presidente\r\n</center>\r\n</html>");
		btnGerarRelatPresid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					LeituraEscrita.relatorioPresidente(presidente);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnGerarRelatPresid.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnGerarRelatPresid.setBounds(79, 415, 220, 70);
		frmcapybankMenu.getContentPane().add(btnGerarRelatPresid);
		
		JButton btnSairRelatPresid_1 = new JButton("Sair");
		btnSairRelatPresid_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSairRelatPresid_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSairRelatPresid_1.setBounds(10, 517, 114, 33);
		frmcapybankMenu.getContentPane().add(btnSairRelatPresid_1);
		
		JButton btnGerarRelatDir_Presid = new JButton("<html>\r\n<center>\r\nGerar\r\n<br> \r\nRelatório Diretor\r\n</center>\r\n</html>");
		btnGerarRelatDir_Presid.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnGerarRelatDir_Presid.setBounds(303, 415, 210, 70);
		frmcapybankMenu.getContentPane().add(btnGerarRelatDir_Presid);
		
		JButton btnGerarRelatGer_Presid = new JButton("<html>\r\n<center>\r\nGerar\r\n<br> \r\nRelatório Gerente\r\n</center>\r\n</html>");
		btnGerarRelatGer_Presid.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnGerarRelatGer_Presid.setBounds(519, 415, 193, 70);
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
		
		JButton btnVoltarRelatPresid = new JButton("Voltar");
		btnVoltarRelatPresid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmcapybankMenu.dispose();
			}
		});
		btnVoltarRelatPresid.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnVoltarRelatPresid.setBounds(660, 517, 114, 33);
		frmcapybankMenu.getContentPane().add(btnVoltarRelatPresid);
		
		JButton btnGerarSaldoTotal = new JButton("Gerar saldo total em CapyCoins");
		btnGerarSaldoTotal.setIcon(new ImageIcon("C:\\Users\\eltin\\Downloads\\Backuptrabalho-final\\images\\CapyCoinsR_SF.png"));
		btnGerarSaldoTotal.setForeground(new Color(160, 82, 45));
		btnGerarSaldoTotal.setBackground(new Color(255, 215, 0));
		btnGerarSaldoTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGerarSaldoTotal.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 20));
		btnGerarSaldoTotal.setBounds(196, 499, 405, 51);
		frmcapybankMenu.getContentPane().add(btnGerarSaldoTotal);
		
		JLabel lblNewLabel = new JLabel("*CapyBank* - Menu de Presidente");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\eltin\\Downloads\\Backuptrabalho-final\\images\\backgroundCapyP.png"));
		lblNewLabel.setBounds(-16, 0, 800, 600);
		frmcapybankMenu.getContentPane().add(lblNewLabel);
		frmcapybankMenu.setVisible(true);
	}

	public String getCpf() {
		return cpf;
	}
}
