package fi.blerine.laskin.kayttoliittyma;

import fi.blerine.laskin.logiikka.Kappale;
import fi.blerine.laskin.logiikka.LaskinLogiikka;
import fi.blerine.laskin.logiikka.PohjanMuoto;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Luokka hoitaa tapahtumien käsittelyn käyttöliittymässä.
 */
public class KlikkaustenKuuntelija implements ActionListener {

    private Kappale kappale;
    private PohjanMuoto pohjanMuoto;
    private JTextArea sadeTaiKanta;
    private JTextArea korkeus;
    private JButton nollaus;
    private JButton lierio;
    private JButton kartio;
    private JButton ympyra;
    private JButton nelio;
    private JTextField tulostuskentta;
    private JButton laske;

    /**
     * Konstruktori asettaa annetut tiedot yksityisten muuttujien arvoksi, jotta
     * niitä voidaan helposti käyttää muissakin metodeissa.
     *
     * @param sadeTaiKanta käyttöliittymässä oleva tekstikenttä johon syötetään
     * kappaleen säde tai kannan pituus
     * @param korkeus käyttöliittymässä oleva tekstikenttä johon syötetään
     * kappaleen korkeus
     * @param nollaus käyttöliittymässä oleva nollaus-nappi
     * @param lierio käyttöliittymässä oleva lierio-nappi, joka valitsee
     * kappaleen muodoksi lieriön
     * @param kartio käyttöliittymässä oleva kartio-nappi, joka valitsee
     * kappaleen muodoksi kartion
     * @param ympyra käyttöliittymässä oleva ympyra-nappi, joka valitsee
     * kappaleen pohjaksi ympyrän
     * @param nelio käyttöliittymässä oleva nelio-nappi, joka valitsee kappaleen
     * pohjaksi neliön
     * @param tulostuskentta käyttöliittymässä oleva tekstikenttä, johon
     * palautetaan haluttu vastaus
     * @param laske käyttöliittymässä oleva nappi joka laskee halutun kappaleen
     * pinta-alan ja tilavuuden
     *
     */
    public KlikkaustenKuuntelija(JTextArea sadeTaiKanta, JTextArea korkeus, JButton nollaus, JButton lierio, JButton kartio, JButton ympyra, JButton nelio, JTextField tulostuskentta, JButton laske) {
        this.sadeTaiKanta = sadeTaiKanta;
        this.korkeus = korkeus;
        this.nollaus = nollaus;
        this.lierio = lierio;
        this.kartio = kartio;
        this.ympyra = ympyra;
        this.nelio = nelio;
        this.tulostuskentta = tulostuskentta;
        this.laske = laske;
    }

    /**
     * Metodi hoitaa tapahtumien käsittelyn, eli määrää mitä tehdään kutakin
     * nappia painattaessa.
     *
     * @param e tapahtumasta kertova ActionEvent-olio
     *
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nollaus) {
            sadeTaiKanta.setText("");
            korkeus.setText("");
            tulostuskentta.setText("0");
            this.kappale = null;
            this.pohjanMuoto = null;
            this.lierio.setBackground(Color.LIGHT_GRAY);
            this.kartio.setBackground(Color.LIGHT_GRAY);
            this.ympyra.setBackground(Color.LIGHT_GRAY);
            this.nelio.setBackground(Color.LIGHT_GRAY);
        }
        if (e.getSource() == lierio) {
            this.kappale = Kappale.LIERIO;
            this.lierio.setBackground(Color.GRAY);
            this.kartio.setBackground(Color.LIGHT_GRAY);
        }

        if (e.getSource() == kartio) {
            this.kappale = Kappale.KARTIO;
            this.kartio.setBackground(Color.GRAY);
            this.lierio.setBackground(Color.LIGHT_GRAY);
        }

        if (e.getSource() == ympyra) {
            this.pohjanMuoto = PohjanMuoto.YMPYRA;
            this.ympyra.setBackground(Color.GRAY);
            this.nelio.setBackground(Color.LIGHT_GRAY);
        }

        if (e.getSource() == nelio) {
            this.pohjanMuoto = PohjanMuoto.NELIO;
            this.nelio.setBackground(Color.GRAY);
            this.ympyra.setBackground(Color.LIGHT_GRAY);
        }

        if (e.getSource() == laske) {
            try {
                double sade = Double.parseDouble(this.sadeTaiKanta.getText().trim());
                double korkeus = Double.parseDouble(this.korkeus.getText().trim());
                if (this.kappale == null || this.pohjanMuoto == null) {
                    tulostuskentta.setText("Valitse sekä kappale, että pohjan muoto.");
                } else if (sade <= 0 || korkeus <= 0) {
                    tulostuskentta.setText("Säde ja/tai korkeus eivät voi olla negatiivisia tai nolla");
                    sadeTaiKanta.setText("");
                    this.korkeus.setText("");
                } else {
                    LaskinLogiikka laskin = new LaskinLogiikka(this.kappale, this.pohjanMuoto, sade, korkeus);
                    String tulostus = "Pinta-ala on " + laskin.pintaAla() + " neliösenttimetriä. \n Tilavuus on " + laskin.tilavuus() + " kuutiosenttimetriä.";
                    tulostuskentta.setText(tulostus);
                }
            } catch (Exception ex) {
                sadeTaiKanta.setText("");
                korkeus.setText("");
                tulostuskentta.setText("Anna säde ja korkeus senttimetreinä.");
            }
        }
    }

}
