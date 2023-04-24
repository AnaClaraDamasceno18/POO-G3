package br.com.poo.views_trabalho_final;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import br.com.poo.contas.Conta;
import br.com.poo.io.LeituraEscrita;
import br.com.poo.pessoa.Diretor;
import br.com.poo.pessoa.Funcionario;
import br.com.poo.pessoa.Gerente;

import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class ViewMenuDiretor {

	private JFrame frmMenuDoDiretor;
	private String cpf;

	
	public ViewMenuDiretor(String cpf, Funcionario diretor, Funcionario gerente) throws IOException {
		this.cpf = cpf;
		initialize(diretor, gerente);
	}

	private void initialize( Funcionario diretor, Funcionario gerente) throws IOException {
		Conta conta = Conta.contas.get(cpf);
		Funcionario funcionario = Funcionario.mapaFuncionarios.get(cpf);

		frmMenuDoDiretor = new JFrame();
		frmMenuDoDiretor.setTitle("*CapyBank* - Menu do diretor");
		frmMenuDoDiretor.setBounds(100, 100, 800, 600);
		frmMenuDoDiretor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenuDoDiretor.getContentPane().setLayout(null);

		JLabel lblDiretor = new JLabel("Diretor:");
		lblDiretor.setFont(new Font("Dialog", Font.BOLD, 14));
		lblDiretor.setBounds(21, 35, 59, 14);
		frmMenuDoDiretor.getContentPane().add(lblDiretor);

		JFormattedTextField mostarNomeDiretor = new JFormattedTextField();
		mostarNomeDiretor.setEnabled(false);
		mostarNomeDiretor.setBounds(79, 32, 257, 25);
		mostarNomeDiretor.setText(conta.getTitular());
		frmMenuDoDiretor.getContentPane().add(mostarNomeDiretor);

		JFormattedTextField mostarRelatDiretor = new JFormattedTextField();
		mostarRelatDiretor.setEnabled(false);
		mostarRelatDiretor.setBounds(79, 72, 646, 335);
		mostarRelatDiretor.setText("Total de Contas Gerenciadas: " + String.valueOf(Conta.qtdContas(gerente)));
		frmMenuDoDiretor.getContentPane().add(mostarRelatDiretor);

		JButton btnGerarRelatGer_Dir = new JButton("Gerar relatório do gerente");
		btnGerarRelatGer_Dir.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGerarRelatGer_Dir.setBounds(450, 418, 257, 60);
		btnGerarRelatGer_Dir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					LeituraEscrita.relatorioGerente(gerente);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnGerarRelatGer_Dir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		frmMenuDoDiretor.getContentPane().add(btnGerarRelatGer_Dir);

		JButton btnSairRelatDiretor = new JButton("Sair");
		btnSairRelatDiretor.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSairRelatDiretor.setBounds(685, 527, 89, 23);
		frmMenuDoDiretor.getContentPane().add(btnSairRelatDiretor);

		JButton btnGerarRelatDiretor = new JButton("Gerar relatório do diretor");
		btnGerarRelatDiretor.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGerarRelatDiretor.setBounds(89, 418, 273, 60);
		frmMenuDoDiretor.getContentPane().add(btnGerarRelatDiretor);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel.setIcon(new ImageIcon("C:\\TrabalhoPOO\\telas_trabalho_final\\images\\backgroundCapyP.png"));
		lblNewLabel.setBounds(-16, 0, 800, 600);
		frmMenuDoDiretor.getContentPane().add(lblNewLabel);
		frmMenuDoDiretor.setVisible(true);
	}

	public void setVisible(boolean b) {

	}

	public String getCpf() {
		return cpf;
	}

}
