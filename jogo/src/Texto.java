import javax.swing.*;
import java.awt.*;

public class Texto extends JTextField {
    public Texto(){
        this.setBounds(92,450,265,35);
        this.setBackground(Color.WHITE);
        this.setEditable(false);
        this.setHorizontalAlignment(JTextField.CENTER);
        this.setBorder(null);
        setCursor(null);
        setFont(new Font("Arial", Font.BOLD, 15));
    }
}
