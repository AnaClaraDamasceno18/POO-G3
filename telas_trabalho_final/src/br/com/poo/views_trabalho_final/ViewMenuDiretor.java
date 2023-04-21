package br.com.poo.views_trabalho_final;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class ViewMenuDiretor {

	private JFrame frmMenuDoDiretor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewMenuDiretor window = new ViewMenuDiretor();
					window.frmMenuDoDiretor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewMenuDiretor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
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
		frmMenuDoDiretor.getContentPane().add(mostarNomeDiretor);
		
		JFormattedTextField mostarRelatDiretor = new JFormattedTextField();
		mostarRelatDiretor.setEnabled(false);
		mostarRelatDiretor.setBounds(79, 72, 646, 335);
		frmMenuDoDiretor.getContentPane().add(mostarRelatDiretor);
		
		JButton btnGerarRelatGer_Dir = new JButton("Gerar relatório do gerente");
		btnGerarRelatGer_Dir.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGerarRelatGer_Dir.setBounds(450, 418, 257, 60);
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
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\lionn\\eclipse-workspace\\telas_trabalho_final\\images\\backgroundCapyP.png"));
		lblNewLabel.setBounds(-16, 0, 800, 600);
		frmMenuDoDiretor.getContentPane().add(lblNewLabel);
	}

}
