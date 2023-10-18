import javax.swing.*;
import java.awt.*;

public class MeuNumero extends JTextField {
    public MeuNumero(){
        this.setBounds(135,513,180,50);
        this.setFont(new Font("Arial", Font.BOLD, 20));
        this.setBackground(Color.BLACK);
        this.setOpaque(false);
        this.setBorder(null);
        this.setHorizontalAlignment(JTextField.CENTER);
    }
}