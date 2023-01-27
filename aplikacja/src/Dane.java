import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dane extends JFrame {
    private JPanel czwarty;
    private JTextField imie;
    private JTextField nazwisko;
    private JTextField godzina;
    private JTextField nr_telefonu;
    private JTextField email;
    private JButton zamówWizytęButton;
    private JButton wyczyśćPoleButton;

    public static void main(String[] args) {
        Dane dane = new Dane();
        dane.setVisible(true);
    }

    public Dane() {
        super("Salon Kosmetyczny");
        this.setContentPane(this.czwarty);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        wyczyśćPoleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imie.setText("");
                nazwisko.setText("");
                godzina.setText("");
                nr_telefonu.setText("");
                email.setText("");
            }
        });
        zamówWizytęButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Operacja została wykonana!");
                dispose();
            }
        });
    }
}


