import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ButtonTests  extends JFrame implements ActionListener {
	private JTextField textField;
	private static JLabel saldoCliente;
	String operacoes;
	String valorsacado;
	String saldoDaConta;
	Double valorSacadoNum;
	Double saldoDaContaNum;
	Double somaDosValores;
	String valorConvertido;
	Double novoSaldo;
	int resposta;
	
	public ButtonTests() {
	
		
	setVisible(true);
	setSize(800, 600);
	setTitle("SerraBank");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setResizable(false);
	setLocationRelativeTo(null);
	setLayout(null);
	
	
	JButton jButton1 = new JButton();
	jButton1.setText("0");
	add(jButton1);
	jButton1.setBounds(325, 420, 53, 44);
	jButton1.setFont(new Font("Arial", Font.BOLD, 12));
	jButton1.setForeground(new Color(0, 0, 0));
	jButton1.setBackground(Color.GRAY);
		
	
	jButton1.addActionListener(this::botao1);
	
	

	JButton jButton2 = new JButton();
	jButton2.setText("1");
	add(jButton2);
	jButton2.setBounds(262, 255, 53, 44);
	jButton2.setFont(new Font("Arial", Font.BOLD, 12));
	jButton2.setForeground(new Color(0, 0, 0));
	jButton2.setBackground(Color.GRAY);
	
	
	jButton2.addActionListener(this::botao2);
	
	
	
	JButton jButton3 = new JButton();
	jButton3.setText("2");
	add(jButton3);
	jButton3.setBounds(325, 255, 53, 44);
	jButton3.setFont(new Font("Arial", Font.BOLD, 12));
	jButton3.setForeground(new Color(0, 0, 0));
	jButton3.setBackground(Color.GRAY);
		
	
	jButton3.addActionListener(this::botao3);
	
	
	JButton jButton4 = new JButton();
	jButton4.setText("3");
	add(jButton4);
	jButton4.setBounds(388, 255, 53, 44);
	jButton4.setFont(new Font("Arial", Font.BOLD, 12));
	jButton4.setForeground(new Color(0, 0, 0));
	jButton4.setBackground(Color.GRAY);
		
	
	jButton4.addActionListener(this::botao4);
	
	
	JButton jButton5 = new JButton();
	jButton5.setText("4");
	add(jButton5);
	jButton5.setBounds(262, 310, 53, 44);
	jButton5.setFont(new Font("Arial", Font.BOLD, 12));
	jButton5.setForeground(new Color(0, 0, 0));
	jButton5.setBackground(Color.GRAY);
		
	
	jButton5.addActionListener(this::botao5);
	
	
	JButton jButton6 = new JButton();
	jButton6.setText("5");
	add(jButton6);
	jButton6.setBounds(325, 310, 53, 44);
	jButton6.setFont(new Font("Arial", Font.BOLD, 12));
	jButton6.setForeground(new Color(0, 0, 0));
	jButton6.setBackground(Color.GRAY);
		
	
	jButton6.addActionListener(this::botao6);
	
	
	JButton jButton7 = new JButton();
	jButton7.setText("6");
	add(jButton7);
	jButton7.setBounds(388, 310, 53, 44);
	jButton7.setFont(new Font("Arial", Font.BOLD, 12));
	jButton7.setForeground(new Color(0, 0, 0));
	jButton7.setBackground(Color.GRAY);
		
	
	jButton7.addActionListener(this::botao7);
	
	
	JButton jButton8 = new JButton();
	jButton8.setText("7");
	add(jButton8);
	jButton8.setBounds(262, 365, 53, 44);
	jButton8.setFont(new Font("Arial", Font.BOLD, 12));
	jButton8.setForeground(new Color(0, 0, 0));
	jButton8.setBackground(Color.GRAY);
		
	
	jButton8.addActionListener(this::botao8);
	
	
	JButton jButton9 = new JButton();
	jButton9.setText("8");
	add(jButton9);
	jButton9.setBounds(325, 365, 53, 44);
	jButton9.setFont(new Font("Arial", Font.BOLD, 12));
	jButton9.setForeground(new Color(0, 0, 0));
	jButton9.setBackground(Color.GRAY);
		
	
	jButton9.addActionListener(this::botao9);
	
	
	JButton jButton10 = new JButton();
	jButton10.setText("9");
	add(jButton10);
	jButton10.setBounds(388, 365, 53, 44);
	jButton10.setFont(new Font("Arial", Font.BOLD, 12));
	jButton10.setForeground(new Color(0, 0, 0));
	jButton10.setBackground(Color.GRAY);
		
	
	jButton10.addActionListener(this::botao10);
	
	
	JButton confirma = new JButton();
	confirma.setText("confirmar");
	add(confirma);
	confirma.setBounds(451, 365, 88, 44);
	confirma.setFont(new Font("Arial", Font.BOLD, 11));
	confirma.setForeground(new Color(0, 255, 0));
	confirma.setBackground(Color.GRAY);
		
	
	confirma.addActionListener(this::confirma);
	
	
	JButton limpar = new JButton();
	limpar.setText("limpar");
	add(limpar);
	limpar.setBounds(451, 310, 88, 44);
	limpar.setFont(new Font("Arial", Font.BOLD, 12));
	limpar.setForeground(new Color(0, 0, 0));
	limpar.setBackground(Color.GRAY);
		
	
	limpar.addActionListener(this::limpar);
	
	
	JButton cancelar = new JButton();
	cancelar.setText("cancelar");
	add(cancelar);
	cancelar.setBounds(451, 255, 88, 44);
	cancelar.setFont(new Font("Arial", Font.BOLD, 12));
	cancelar.setForeground(new Color(255, 0, 0));
	cancelar.setBackground(Color.GRAY);
		
	
	cancelar.addActionListener(this::cancelar);
	
	
	
	
	
	//--textField--
	
	textField = new JTextField();
	textField.setEditable(false);
	textField.setBounds(262, 171, 277, 59);
	getContentPane().add(textField);
	textField.setColumns(10);
	textField.setFont(new Font("Arial", Font.BOLD, 15));
	
	
	//--jlabel--
	
	JLabel nomeCliente = new JLabel();
	nomeCliente.setText("valor");
	add(nomeCliente);
	nomeCliente.setBounds(199, 180, 209, 49);
	nomeCliente.setFont(new Font("Arial", Font.BOLD, 15));
	nomeCliente.setForeground(new Color(0, 0, 0));
	
	
	saldoCliente = new JLabel();
	saldoCliente.setText("1000");
	saldoDaConta = saldoCliente.getText();
	
	add(saldoCliente);
	saldoCliente.setBounds(10, 10, 70, 37);
	saldoCliente.setFont(new Font("Arial", Font.BOLD, 15));
	saldoCliente.setForeground(new Color(0, 0, 0));
	
	
	
	
}
	
	public String getSaque() {
		return textField.getText();
	}
	
	private void botao1(ActionEvent actionEvent) {
		textField.setText(textField.getText() + "0");
			
	}
		
	
	private void botao2(ActionEvent actionEvent) {
		textField.setText(textField.getText() + "1");
			
	}
		
	private void botao3(ActionEvent actionEvent) {
		textField.setText(textField.getText() + "2");
			
	}
		
	private void botao4(ActionEvent actionEvent) {
		textField.setText(textField.getText() + "3");
			
	}
	
	private void botao5(ActionEvent actionEvent) {
		textField.setText(textField.getText() + "4");
			
	}
	
	
	private void botao6(ActionEvent actionEvent) {
		textField.setText(textField.getText() + "5");
			
	}
	
	private void botao7(ActionEvent actionEvent) {
		textField.setText(textField.getText() + "6");
			
	}
	
	private void botao8(ActionEvent actionEvent) {
		textField.setText(textField.getText() + "7");
			
	}
	
	private void botao9(ActionEvent actionEvent) {
		textField.setText(textField.getText() + "8");
			
	}
	
	private void botao10(ActionEvent actionEvent) {
		textField.setText(textField.getText() + "9");
			
	}
	
	private void confirma(ActionEvent actionEvent) {
		//textField.setText(textField.getText() + "Confirma");
		//valorsacado = Double.parseDouble(textField.getText());
		
		
//		valorsacado = textField.getText();	
//		valorSacadoNum = Double.parseDouble(valorsacado);
//		saldoDaContaNum = Double.parseDouble(saldoCliente.getText());
//		somaDosValores = saldoDaContaNum - valorSacadoNum;
//		valorConvertido = somaDosValores.toString();
//		JOptionPane.showMessageDialog(null, "o valor a ser sacado é R$: " + valorsacado);
//		saldoCliente.setText(valorConvertido);
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja Sacar R$: " + textField.getText());
			
		switch (resposta) {
			case 0:
				getSaque();
				new ConfimScreenLayout();
				dispose();
				break;
				
				
			case 1:
				JOptionPane.showMessageDialog(null, "Saque nao efetuado");
				break;
			
			case 2:
				JOptionPane.showMessageDialog(null, "Saque cancelado");
				break;
		}
		
		
		//dispose();
		
		
		//new ConfirmScreen();
		
	}
	
	



	private void limpar(ActionEvent actionEvent) {
		textField.setText("");
			
	}
	
	private void cancelar(ActionEvent actionEvent) {
		//textField.setText(textField.getText() + "cancelar");
		dispose();
			
	}
	
	
	
	
	
	
	
public static void main (String[] args) {
	
	new ButtonTests();
	
}

}