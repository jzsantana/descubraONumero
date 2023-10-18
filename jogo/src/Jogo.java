import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jogo{
    private Texto texto = new Texto();
    private static Panel panel = new Panel();
    int vidas = 5;
    boolean perdeu;

    public boolean testeVida(){
        // teste de vida já começa falso, entao, se vidas for igual a 0 retorna true
        if (vidas == 0){
            perdeu = true;
            return perdeu;
        } else {
            return perdeu;
        }
    }

    public Jogo() {
        Botao btn = new Botao();
        Computer comp = new Computer();
        MeuNumero number = new MeuNumero();

        int sortNum = (int) (Math.random() * 100);

        btn.addActionListener(new ActionListener() {
            int tentativas = 0; // Contador de tentativas

            @Override
            public void actionPerformed(ActionEvent e) {
                panel.add(texto);

                if (tentativas < 5) {

                    int meuNumero = Integer.parseInt(number.getText());

                    try {
                        if (meuNumero == sortNum) {
                            texto.setText("Você acertou!!!!!");
                            comp.setText(Integer.toString(sortNum));
                            panel.remove(btn);

                        } else if (meuNumero + 1 == sortNum || meuNumero + 2 == sortNum) {
                            texto.setText("Tá quase lá!");
                            vidas--;
                            testeVida();
                        } else if (meuNumero - 1 == sortNum || meuNumero - 2 == sortNum) {
                            texto.setText("Tá quase lá!");
                            vidas--;
                            testeVida();
                        } else {
                            texto.setText("Você errrrrrou!!");
                            vidas--;
                            testeVida();
                        }

                        if(vidas == 0){
                            texto.setText("Ihhhh perdeu!!!!!");
                            comp.setText(Integer.toString(sortNum));
                        }

                    } catch (NumberFormatException ex) {
                        texto.setText("Tente novamente!");
                    }
                    tentativas++;
                } else {
                    btn.setEnabled(true);
                    number.setEnabled(true);
                }
            }
        });

        panel.add(btn);
        panel.add(comp);
        panel.add(number);
    }

    public static void main(String[] args) {
        JFrame game = new JFrame("Guess the number");
        Jogo jogo = new Jogo(); // adiciona as caixas de textfields

        JPanel contentPane = new JPanel();

        game.setContentPane(contentPane); // pros itens da tela serem modificados sem que haja a necessidade de que crie varias janelas

        game.setBounds(250,250,450,700);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setVisible(true);
        game.setLayout(null);
        game.setResizable(false);

        ImageIcon imgBackground = new ImageIcon("src//GUESS.jpg");
        JLabel label = new JLabel(imgBackground);
        game.add(label);
        game.add(panel);
        label.setBounds(0,0,450,700);
    }

}