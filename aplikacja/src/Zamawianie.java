import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Zamawianie extends JFrame {
    private JPanel drugi;
    private JPanel drzewo;
    private JTextField zabieg;
    private JTextField lekarz;
    private JTextField cena;
    private JButton zamówButton;
    private JButton koszykButton;
    private JTree zabiegi;

    public static void main(String[] args) {
        Zamawianie zamawianie = new Zamawianie();
        zamawianie.setVisible(true);
    }
    public Zamawianie() {
        super("Salon Kosmetyczny");
        this.setContentPane(this.drugi);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 500);
        zabiegi.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                DefaultMutableTreeNode root = (DefaultMutableTreeNode) zabiegi.getSelectionPath().getLastPathComponent();
                String nazwaZabiegu = root.getUserObject().toString();
                zabieg.setText(nazwaZabiegu);
                if(nazwaZabiegu == "Mikrodermabrazja") cena.setText("200 zł");
                if(nazwaZabiegu == "Mikrodermabrazja") lekarz.setText("lek. Agata Sołęcka");
                if(nazwaZabiegu == "Mezoterapia") cena.setText("1300 zł");
                if(nazwaZabiegu == "Mezoterapia") lekarz.setText("lek. medycyny estetycznej Kamila Nowak");
                if(nazwaZabiegu == "Sonoforeza") cena.setText("70 zł");
                if(nazwaZabiegu == "Sonoforeza") lekarz.setText("lek. Mariusz Adamczyk");
                if(nazwaZabiegu == "Akupresura") cena.setText("1800 zł");
                if(nazwaZabiegu == "Akupresura") lekarz.setText("lek. Maja Trzewik");
                if(nazwaZabiegu == "Masaż antycelluitowy") cena.setText("200 zł");
                if(nazwaZabiegu == "Masaż antycelluitowy") lekarz.setText("lek. Aleksander Czerwik");
                if(nazwaZabiegu == "Body wrapping") cena.setText("350 zł");
                if(nazwaZabiegu == "Body wrapping") lekarz.setText("lek. Jowita Wysocka");
                if(nazwaZabiegu == "Depilacja laserowa ciała") cena.setText("2500 zł");
                if(nazwaZabiegu == "Depilacja laserowa ciała") lekarz.setText("lek. Agata Sołęcka");
                if(nazwaZabiegu == "Dermabrazja") cena.setText("90 zł");
                if(nazwaZabiegu == "Dermabrazja") lekarz.setText("lek. Filip Sołęcki");
                if(nazwaZabiegu == "Oczyszczanie skóry") cena.setText("290 zł");
                if(nazwaZabiegu == "Oczyszczanie skóry") lekarz.setText("lek. Arkadiusz Pawlik");
                if(nazwaZabiegu == "Pielęgnacja") cena.setText("6000");
                if(nazwaZabiegu == "Pielęgnacja") lekarz.setText("lek. Agata Sołęcka");
                if(nazwaZabiegu == "Drenaż limfatyczny") cena.setText("70 zł");
                if(nazwaZabiegu == "Drenaż limfatyczny") lekarz.setText("lek. Jowita Wysocka");
                if(nazwaZabiegu == "Infuzja tlenowa") cena.setText("250 zł");
                if(nazwaZabiegu == "Infuzja tlenowa") lekarz.setText("lek. medycyny estetycznej Kamila Nowak");
                if(nazwaZabiegu == "Mezoterapia igłowa") cena.setText("1300 zł");
                if(nazwaZabiegu == "Mezoterapia igłowa") lekarz.setText("lek. Mariusz Adamczyk");
            }
        });
        koszykButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Koszyk koszyk = new Koszyk();
                koszyk.setVisible(true);
                dispose();
            }
        });
        zamówButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!zabieg.getText().equals(""))
                    Koszyk.Dodane(zabieg.getText());
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        //root
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("ZABIEGI");
        //cialo
        DefaultMutableTreeNode ZabiegiCialo= new DefaultMutableTreeNode("Zabiegi na ciało");
        DefaultMutableTreeNode ZC1 = new DefaultMutableTreeNode("Mikrodermabrazja");
        DefaultMutableTreeNode ZC2= new DefaultMutableTreeNode("Mezoterapia");
        DefaultMutableTreeNode ZC3= new DefaultMutableTreeNode("Sonoforeza");
        DefaultMutableTreeNode ZC4= new DefaultMutableTreeNode("Akupresura");
        DefaultMutableTreeNode ZC5= new DefaultMutableTreeNode("Masaż antycelluitowy");
        DefaultMutableTreeNode ZC6= new DefaultMutableTreeNode("Body wrapping");
        DefaultMutableTreeNode ZC7= new DefaultMutableTreeNode("Depilacja laserowa ciała");
        ZabiegiCialo.add(ZC1);
        ZabiegiCialo.add(ZC2);
        ZabiegiCialo.add(ZC3);
        ZabiegiCialo.add(ZC4);
        ZabiegiCialo.add(ZC5);
        ZabiegiCialo.add(ZC6);
        ZabiegiCialo.add(ZC7);
        //twarz
        DefaultMutableTreeNode ZabiegiTwarz = new DefaultMutableTreeNode("Zabiegi na twarz");
        DefaultMutableTreeNode ZT1= new DefaultMutableTreeNode("Dermabrazja");
        DefaultMutableTreeNode ZT2= new DefaultMutableTreeNode("Oczyszczanie skóry");
        DefaultMutableTreeNode ZT3= new DefaultMutableTreeNode("Pielęgnacja");
        DefaultMutableTreeNode ZT4= new DefaultMutableTreeNode("Drenaż limfatyczny");
        DefaultMutableTreeNode ZT5= new DefaultMutableTreeNode("Infuzja tlenowa");
        DefaultMutableTreeNode ZT6= new DefaultMutableTreeNode("Mezoterapia igłowa");
        ZabiegiTwarz.add(ZT1);
        ZabiegiTwarz.add(ZT2);
        ZabiegiTwarz.add(ZT3);
        ZabiegiTwarz.add(ZT4);
        ZabiegiTwarz.add(ZT5);
        ZabiegiTwarz.add(ZT6);
        root.add(ZabiegiCialo);
        root.add(ZabiegiTwarz);
        DefaultTreeModel myModel = new DefaultTreeModel(root);


        zabiegi = new JTree(myModel);
    }
}