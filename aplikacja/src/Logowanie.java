import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Logowanie extends JFrame {
    private JTextField txtlogin;
    private JButton zalogujSięButton;
    private JButton wyjdźButton;
    private JPanel pierwszy;
    private JPasswordField txthaslo;

    public static void main(String[] args) {
        Logowanie testExample = new Logowanie();
        testExample.setVisible(true);
    }

    public Logowanie() {
        super("Salon Kosmetyczny");
        this.setContentPane(this.pierwszy);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);

        wyjdźButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        zalogujSięButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String login = txtlogin.getText();
                String haslo = new String(txthaslo.getPassword());

                if (login.equals(Administrator.prawdziwylogin)&& haslo.equals(Administrator.prawdziwyhaslo))
                {
                    JOptionPane.showMessageDialog(Logowanie.this, "Udało się zalogować!");
                    Zamawianie zamawianie = new Zamawianie();
                    zamawianie.setVisible(true);
                    dispose();
                }
                else if (login.equals(Administrator.prawdziwylogin) && !haslo.equals(Administrator.prawdziwyhaslo))
                    JOptionPane.showMessageDialog(Logowanie.this, "Podałeś złe hasło. Spróbuj ponownie!");
                else if (!login.equals(Administrator.prawdziwylogin) && haslo.equals(Administrator.prawdziwyhaslo))
                    JOptionPane.showMessageDialog(Logowanie.this, "Podałeś zły login. Sprónuj ponownie!");
            }
        });
    }
}