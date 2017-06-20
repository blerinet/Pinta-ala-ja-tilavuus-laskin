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
 * käsittelijä.
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
        frame.setPreferredSize(new Dimension(1500, 500));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    /**
     * Metodi luo halutut komponentit, eli napit ja tekstikentät, päättää niiden
     * järjestyksestä ja lisää napeille tapahtumien käsittelijän.
     *
     * @param container komponenttipohja, johon voidaan asettaa haluttu
     * käyttöliittymäasettelija
     *
     */
    private void luoKomponentit(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        JPanel kappalePaneeli = new JPanel(new GridLayout(2, 2));
        JButton lierio = new JButton("Lieriö");
        JButton kartio = new JButton("Kartio");
        JButton ympyra = new JButton("Ympyrä");
        JButton nelio = new JButton("Neliö");
        JPanel sadeJaKorkeusPaneeli = new JPanel(new GridLayout(2, 2));
        JPanel paneeli = new JPanel(new GridLayout(1, 2));
        JLabel sadeTaiKantaTeksti = new JLabel("Säde/Kanta senttimetreinä: ");
        JTextArea sadeTaiKanta = new JTextArea();
        JLabel korkeusTeksti = new JLabel("Korkeus senttimetreinä: ");
        JTextArea korkeus = new JTextArea();
        JButton nollaus = new JButton("Nollaa kaikki");
        JPanel tulostus = new JPanel(new GridLayout(1, 2));
        JButton laske = new JButton("Laske pinta-ala ja tilavuus");
        JTextField tulostuskentta = new JTextField("0");

        KlikkaustenKuuntelija kuuntelija = new KlikkaustenKuuntelija(sadeTaiKanta, korkeus, nollaus, lierio, kartio, ympyra, nelio, tulostuskentta, laske);
        lierio.addActionListener(kuuntelija);
        kartio.addActionListener(kuuntelija);
        ympyra.addActionListener(kuuntelija);
        nelio.addActionListener(kuuntelija);
        nollaus.addActionListener(kuuntelija);
        laske.addActionListener(kuuntelija);

        kappalePaneeli.add(lierio);
        kappalePaneeli.add(kartio);
        kappalePaneeli.add(ympyra);
        kappalePaneeli.add(nelio);
        sadeJaKorkeusPaneeli.add(sadeTaiKantaTeksti);
        sadeJaKorkeusPaneeli.add(sadeTaiKanta);
        sadeJaKorkeusPaneeli.add(korkeusTeksti);
        sadeJaKorkeusPaneeli.add(korkeus);
        paneeli.add(sadeJaKorkeusPaneeli);
        tulostus.add(laske);
        tulostus.add(tulostuskentta);
        paneeli.add(nollaus);
        container.add(kappalePaneeli);
        container.add(paneeli);
        container.add(tulostus);
    }

    public JFrame getFrame() {
        return frame;
    }
}
