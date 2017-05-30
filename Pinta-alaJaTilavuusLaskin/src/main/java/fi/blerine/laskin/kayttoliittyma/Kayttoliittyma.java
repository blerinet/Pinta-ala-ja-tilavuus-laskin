package fi.blerine.laskin.kayttoliittyma;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
        GridLayout layout = new GridLayout(2, 1);
        container.setLayout(layout);
        
        JButton lierioNappi = new JButton("Lieriö");
        JButton kartioNappi = new JButton("Kartio");
        
        container.add(lierioNappi);
        container.add(kartioNappi);

        JLabel teksti = new JLabel("Testiä...");
        container.add(teksti);
    }

    public JFrame getFrame() {
        return frame;
    }
}
