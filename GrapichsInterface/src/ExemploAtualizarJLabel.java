import javax.swing.*;

public class ExemploAtualizarJLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo Atualizar JLabel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        setResizable(false);
        
        
        JLabel label = new JLabel("Valor Inicial");
        frame.add(label);

        JButton button = new JButton("Atualizar");
        button.addActionListener(e -> {
            label.setText("Novo Valor"); // Altera o texto da JLabel
        });
        frame.add(button);

        frame.pack();
        frame.setVisible(true);
    }
}
