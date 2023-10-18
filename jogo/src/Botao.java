import javax.swing.*;
import java.awt.*;

public class Botao extends JButton {
    public Botao(){
        this.setText("OK");
        this.setBounds(174,584,100,42);
        this.setBackground(Color.decode("#004AAD"));
        this.setForeground(Color.WHITE);
        this.setFont(new Font("Arial", Font.BOLD, 15));
        setVisible(true);
        setBorder(null);
    }
}
