import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;

public class ConfimScreenLayout  extends JFrame {

	private JFrame frame ;

	
	public  ConfimScreenLayout() {
		
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Deseja imprimir o comprovante?");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(280, 172, 251, 78);
		frame.getContentPane().add(lblNewLabel);
		
		JButton confirmar = new JButton("Confirmar");
		confirmar.setBounds(160, 328, 160, 78);
		frame.getContentPane().add(confirmar);
		
		confirmar.addActionListener(this::Confirmar);
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.setBounds(462, 328, 160, 78);
		frame.getContentPane().add(cancelar);
		
		cancelar.addActionListener(this::cancelar);
		
		
	}
	
	private void Confirmar(ActionEvent actionEvent) {
		
	}
	
	
	private void cancelar(ActionEvent actionEvent) {
		
	}
	
}
