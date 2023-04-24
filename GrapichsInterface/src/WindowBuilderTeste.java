import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class WindowBuilderTeste {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBuilderTeste window = new WindowBuilderTeste();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WindowBuilderTeste() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 255, 0));
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Saque");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setBounds(72, 267, 140, 67);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Deposito");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.setBounds(318, 267, 140, 67);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Transferencia");
		btnNewButton_1_1.setBackground(Color.GRAY);
		btnNewButton_1_1.setBounds(559, 267, 140, 67);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("Tributação");
		btnNewButton_2.setBackground(Color.GRAY);
		btnNewButton_2.setBounds(72, 398, 140, 67);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Poupança");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1.setBackground(Color.GRAY);
		btnNewButton_2_1.setBounds(318, 398, 140, 67);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JLabel lblNewLabel = new JLabel("Cliente : Joao Sem Bra\u00E7o");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 209, 49);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblSaldo = new JLabel("Saldo: 100,00");
		lblSaldo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSaldo.setBounds(634, 11, 140, 49);
		frame.getContentPane().add(lblSaldo);
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
