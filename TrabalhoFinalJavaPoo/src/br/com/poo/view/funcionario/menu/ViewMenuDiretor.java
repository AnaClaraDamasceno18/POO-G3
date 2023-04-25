package br.com.poo.view.funcionario.menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import br.com.poo.contas.Conta;
import br.com.poo.io.LeituraEscrita;
import br.com.poo.pessoa.Funcionario;

import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class ViewMenuDiretor {

	private JFrame frmMenuDoDiretor;
	private String cpf;

	/**
	 * Create the application.
	 * 
	 * @param cpf
	 */
	public ViewMenuDiretor(String cpf, Funcionario diretor, Funcionario gerente) {
		this.cpf = cpf;
		initialize(diretor, gerente);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Funcionario diretor, Funcionario gerente) {
		Conta conta = Conta.contas.get(cpf);
		Funcionario diretor1 = Funcionario.mapaFuncionarios.get(getCpf());

		frmMenuDoDiretor = new JFrame();
		frmMenuDoDiretor.setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\eltin\\Downloads\\Backuptrabalho-final\\images\\CapyCoinsR_SF.png"));
		frmMenuDoDiretor.setTitle("*CapyBank* - Menu do Diretor");
		frmMenuDoDiretor.setSize(800, 600);
		frmMenuDoDiretor.setLocationRelativeTo(null);
		frmMenuDoDiretor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenuDoDiretor.getContentPane().setLayout(null);

		JLabel lblDiretor = new JLabel("Diretor:");
		lblDiretor.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDiretor.setBounds(79, 34, 100, 25);
		frmMenuDoDiretor.getContentPane().add(lblDiretor);

		JFormattedTextField mostarNomeDiretor = new JFormattedTextField();
		mostarNomeDiretor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		mostarNomeDiretor.setEnabled(false);
		mostarNomeDiretor.setBounds(163, 32, 549, 28);
		mostarNomeDiretor.setText(conta.getTitular());
		frmMenuDoDiretor.getContentPane().add(mostarNomeDiretor);

		JFormattedTextField mostarRelatDiretor = new JFormattedTextField();
		mostarRelatDiretor.setEnabled(false);
		mostarRelatDiretor.setBounds(79, 69, 633, 335);
		frmMenuDoDiretor.getContentPane().add(mostarRelatDiretor);

		JButton btnGerarRelatGer_Dir = new JButton("Gerar relatório do gerente");
		btnGerarRelatGer_Dir.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnGerarRelatGer_Dir.setBounds(415, 415, 297, 63);
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
		frmMenuDoDiretor.getContentPane().add(btnGerarRelatGer_Dir);

		JButton btnSairRelatDiretor_1 = new JButton("Sair");
		btnSairRelatDiretor_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSairRelatDiretor_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSairRelatDiretor_1.setBounds(10, 517, 114, 33);
		frmMenuDoDiretor.getContentPane().add(btnSairRelatDiretor_1);

		JButton btnSairRelatDiretor = new JButton("Voltar");
		btnSairRelatDiretor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMenuDoDiretor.dispose();
			}
		});
		btnSairRelatDiretor.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSairRelatDiretor.setBounds(660, 517, 114, 33);
		frmMenuDoDiretor.getContentPane().add(btnSairRelatDiretor);

		JButton btnGerarRelatDiretor = new JButton("Gerar relatório do diretor");
		btnGerarRelatDiretor.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnGerarRelatDiretor.setBounds(79, 415, 297, 63);
		frmMenuDoDiretor.getContentPane().add(btnGerarRelatDiretor);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel.setIcon(
				new ImageIcon("C:\\Users\\eltin\\Downloads\\Backuptrabalho-final\\images\\backgroundCapyP.png"));
		lblNewLabel.setBounds(-16, 0, 800, 600);
		frmMenuDoDiretor.getContentPane().add(lblNewLabel);
		frmMenuDoDiretor.setVisible(true);
	}

	public String getCpf() {
		return cpf;
	}

}
