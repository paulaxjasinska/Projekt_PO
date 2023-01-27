import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Koszyk extends JFrame {
    private JPanel trzeci;
    private JList zamowione;
    private JButton wprowadźDaneButton;
    private JButton wyczyśćKoszykButton;
    private JButton wsteczButton;
    private  static DefaultListModel koszyk =new DefaultListModel();

    public static void main(String[] args) {
        Koszyk koszyk = new Koszyk();
        koszyk.setVisible(true);
    }

    public static void Dodane(String zabiegi){
        koszyk.addElement(zabiegi);
    }

    public Koszyk() {
        super("Salon Kosmetyczny");
        this.setContentPane(this.trzeci);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        zamowione.setModel(koszyk);
        wyczyśćKoszykButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                koszyk.removeAllElements();
            }
        });
        wprowadźDaneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Dane dane = new Dane();
                dane.setVisible(true);
                dispose();
            }
        });
        wsteczButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Zamawianie zamawianie = new Zamawianie();
                zamawianie.setVisible(true);
                dispose();
            }
        });
    }
}
