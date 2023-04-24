import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class SaqueScreenTest {

	private JFrame frame;
	private JTextField Janela;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaqueScreenTest window = new SaqueScreenTest();
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
	public SaqueScreenTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Valor");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(199, 180, 53, 37);
		frame.getContentPane().add(lblNewLabel);
		
		Janela = new JTextField();
		Janela.setEditable(false);
		Janela.setFont(new Font("Tahoma", Font.BOLD, 14));
		Janela.setBounds(262, 171, 277, 59);
		frame.getContentPane().add(Janela);
		Janela.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(262, 255, 53, 44);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(325, 255, 53, 44);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("3");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setBounds(388, 255, 53, 44);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("cancelar");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_1.setForeground(Color.RED);
		btnNewButton_1_1_1.setBounds(451, 255, 88, 44);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.setBounds(262, 310, 53, 44);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("5");
		btnNewButton_2_1.setBounds(325, 310, 53, 44);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("6");
		btnNewButton_2_1_1.setBounds(388, 310, 53, 44);
		frame.getContentPane().add(btnNewButton_2_1_1);
		
		JButton btnNewButton_2_2 = new JButton("7");
		btnNewButton_2_2.setBounds(262, 365, 53, 44);
		frame.getContentPane().add(btnNewButton_2_2);
		
		JButton btnNewButton_2_1_2 = new JButton("8");
		btnNewButton_2_1_2.setBounds(325, 365, 53, 44);
		frame.getContentPane().add(btnNewButton_2_1_2);
		
		JButton btnNewButton_2_1_2_1 = new JButton("9");
		btnNewButton_2_1_2_1.setBounds(388, 365, 53, 44);
		frame.getContentPane().add(btnNewButton_2_1_2_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Limpar");
		btnNewButton_1_1_1_1.setBounds(451, 310, 88, 44);
		frame.getContentPane().add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("Confirmar");
		btnNewButton_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1_1_1_1_1.setBounds(451, 365, 88, 44);
		frame.getContentPane().add(btnNewButton_1_1_1_1_1);
		
		JButton btnNewButton_2_2_1 = new JButton("");
		btnNewButton_2_2_1.setBounds(262, 420, 53, 44);
		frame.getContentPane().add(btnNewButton_2_2_1);
		
		JButton btnNewButton_2_1_2_2 = new JButton("0");
		btnNewButton_2_1_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_2_1_2_2.setBounds(325, 420, 53, 44);
		frame.getContentPane().add(btnNewButton_2_1_2_2);
		
		JButton btnNewButton_2_1_2_3 = new JButton("");
		btnNewButton_2_1_2_3.setBounds(388, 420, 53, 44);
		frame.getContentPane().add(btnNewButton_2_1_2_3);
	}
}
