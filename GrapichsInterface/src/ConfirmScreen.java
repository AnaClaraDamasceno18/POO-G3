import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import ButtonTests;

public class ConfirmScreen extends JFrame implements ActionListener {
	private static JLabel pergunta;
	String valorSaqueTela;
	
	
	
	
	public ConfirmScreen()  {
	
	new  ButtonTests();
		
	ButtonTests valorDoSaque = new ButtonTests();
	valorSaqueTela = valorDoSaque.getSaque();	
		
		
	setVisible(true);
	setSize(800, 600);
	setTitle("SerraBank");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setResizable(false);
	setLocationRelativeTo(null);
	setLayout(null);
	
	
	pergunta = new JLabel();
	pergunta.setText("Deseja imprimir o Comprovante ?");
	add(pergunta);
	pergunta.setBounds(157, 172, 300, 78);
	pergunta.setFont(new Font("Arial", Font.BOLD, 15));
	pergunta.setForeground(new Color(0, 0, 0));
	
	
	JButton confirmar = new JButton();
	confirmar.setText("confirmar");
	add(confirmar);
	confirmar.setBounds(160, 328, 160, 78);
	confirmar.setFont(new Font("Arial", Font.BOLD, 11));
	confirmar.setForeground(new Color(0, 255, 0));
	confirmar.setBackground(Color.GRAY);

	confirmar.addActionListener(this::confirmar);
	
	
	JButton cancelar = new JButton();
	cancelar.setText("cancelar");
	add(cancelar);
	cancelar.setBounds(462, 328, 160, 78);
	cancelar.setFont(new Font("Arial", Font.BOLD, 12));
	cancelar.setForeground(new Color(255, 0, 0));
	cancelar.setBackground(Color.GRAY);
		
	
	cancelar.addActionListener(this::cancelar);
	
	
	
	
	
}
	
	
	private void confirmar(ActionEvent actionEvent) {
		
		
		
		//pergunta.setText("O valor a ser sacado é teste ");
		
		//JOptionPane.showMessageDialog(null, "o valor a ser sacado é R$: " + valorSaqueTela  );
		
		
	}

	
	private void cancelar(ActionEvent actionEvent) {
		
		
		
		//pergunta.setText("O valor a ser sacado é teste ");
		
		JOptionPane.showMessageDialog(null, "cancelar" );
		
		
	}




}