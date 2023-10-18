import javax.swing.*;
import java.awt.*;

public class Computer extends JTextField {
    public Computer(){
        this.setBounds(168,327,115,85);
        this.setBackground(Color.decode("#004AAD"));
        this.setEditable(false);
        this.setCursor(null);
        this.setFont(new Font("Arial", Font.BOLD, 50));
        this.setForeground(Color.WHITE);
        this.setBorder(null);
        this.setHorizontalAlignment(JTextField.CENTER);

    }
}
