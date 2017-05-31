package fi.blerine.laskin.kayttoliittyma;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class Kayttoliittyma implements Runnable {

    private JFrame frame;

    public Kayttoliittyma() {
    }

    @Override
    public void run() {
        frame = new JFrame("Pinta-ala ja tilavuus laskin");
        frame.setPreferredSize(new Dimension(500, 1000));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentit(Container container) {
        GridLayout layout = new GridLayout(3, 2);
        container.setLayout(layout);
        
        JButton lierioNappi = new JButton("Lieriö");
        JButton kartioNappi = new JButton("Kartio");
        JButton ympyraNappi = new JButton("Ympyrä");
        JButton nelioNappi = new JButton("Neliö");
        JTextArea sadeTaiKantaTeksti = new JTextArea("Säde/Kanta senttimetreinä: \n");
        JTextArea korkeusTeksti = new JTextArea("Korkeus senttimetreinä: \n");
        
        container.add(lierioNappi);
        container.add(kartioNappi);
        container.add(ympyraNappi);
        container.add(nelioNappi);
        container.add(sadeTaiKantaTeksti);
        container.add(korkeusTeksti);
        

 
    }

    public JFrame getFrame() {
        return frame;
    }
}
