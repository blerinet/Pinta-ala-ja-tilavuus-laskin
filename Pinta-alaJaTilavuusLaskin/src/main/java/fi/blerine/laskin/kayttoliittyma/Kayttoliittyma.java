package fi.blerine.laskin.kayttoliittyma;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 * Luokka hoitaa projektin käyttöliittymä puolen, eli luo halutun alustan sekä
 * tarvittavat napit ja tekstikentät. Luokassa hahmotellaan siis koko
 * käyttöliittymän ulkonäkö ja lisäksi lisätään napeille tapahtumien
 * käsittelijät.
 */
public class Kayttoliittyma implements Runnable {

    private JFrame frame;

    public Kayttoliittyma() {
    }

    /**
     * Metodi luo uuden alustan käyttöliittymälle, asettaa sen koko
     * halutunlaiseksi ja hallitsee sitö, koska käyttöliittymä sammutetaan.
     */
    @Override
    public void run() {
        frame = new JFrame("Pinta-ala ja tilavuus laskin");
        frame.setPreferredSize(new Dimension(1000, 500));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    /**
     * Metodi luo halutut komponentit, eli napit ja tekstikentät, päättää niiden
     * järjestyksestä ja lisää napeille tapahtumien käsittelijät.
     *
     * @param container komponenttipohja, johon voidaan asettaa haluttu
     * käyttöliittymäasettelija
     *
     */
    private void luoKomponentit(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        JPanel kappalePaneeli = new JPanel(new GridLayout(2, 2));
        JButton ympyralierio = new JButton("Ympyrälieriö");
        JButton ympyrakartio = new JButton("Ympyräkartio");
        JButton nelioLierio = new JButton("Neliöpohjainen lieriö");
        JButton pyramidi = new JButton("Pyramidi");
        JPanel sadeJaKorkeusPaneeli = new JPanel(new GridLayout(2, 2));
        JPanel paneeli = new JPanel(new GridLayout(1, 2));
        JLabel sadeTaiKantaTeksti = new JLabel("Säde/Kanta senttimetreinä: ");
        JTextArea sadeTaiKanta = new JTextArea();
        JLabel korkeusTeksti = new JLabel("Korkeus senttimetreinä: ");
        JTextArea korkeus = new JTextArea();
        JButton nollaus = new JButton("Nollaa kaikki");
        JTextField tulostuskentta = new JTextField("0");

        ympyralierio.addActionListener(new KlikkaustenKuuntelija(sadeTaiKanta, korkeus, nollaus, ympyralierio, ympyrakartio, nelioLierio, pyramidi, tulostuskentta));
        ympyrakartio.addActionListener(new KlikkaustenKuuntelija(sadeTaiKanta, korkeus, nollaus, ympyralierio, ympyrakartio, nelioLierio, pyramidi, tulostuskentta));
        nelioLierio.addActionListener(new KlikkaustenKuuntelija(sadeTaiKanta, korkeus, nollaus, ympyralierio, ympyrakartio, nelioLierio, pyramidi, tulostuskentta));
        pyramidi.addActionListener(new KlikkaustenKuuntelija(sadeTaiKanta, korkeus, nollaus, ympyralierio, ympyrakartio, nelioLierio, pyramidi, tulostuskentta));
        nollaus.addActionListener(new KlikkaustenKuuntelija(sadeTaiKanta, korkeus, nollaus, ympyralierio, ympyrakartio, nelioLierio, pyramidi, tulostuskentta));

        kappalePaneeli.add(ympyralierio);
        kappalePaneeli.add(ympyrakartio);
        kappalePaneeli.add(nelioLierio);
        kappalePaneeli.add(pyramidi);
        sadeJaKorkeusPaneeli.add(sadeTaiKantaTeksti);
        sadeJaKorkeusPaneeli.add(sadeTaiKanta);
        sadeJaKorkeusPaneeli.add(korkeusTeksti);
        sadeJaKorkeusPaneeli.add(korkeus);
        paneeli.add(sadeJaKorkeusPaneeli);
        paneeli.add(nollaus);
        container.add(paneeli);
        container.add(kappalePaneeli);
        container.add(tulostuskentta);

    }

    public JFrame getFrame() {
        return frame;
    }
}
