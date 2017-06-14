package fi.blerine.laskin.kayttoliittyma;

import fi.blerine.laskin.logiikka.Kappale;
import fi.blerine.laskin.logiikka.LaskinLogiikka;
import fi.blerine.laskin.logiikka.PohjanMuoto;
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
            lierio.setEnabled(true);
            kartio.setEnabled(true);
            ympyra.setEnabled(false);
            nelio.setEnabled(false);
            laske.setEnabled(false);
        }
        if (e.getSource() == lierio) {
            this.kappale = Kappale.LIERIO;
            kartio.setEnabled(false);
            ympyra.setEnabled(true);
            nelio.setEnabled(true);
        }

        if (e.getSource() == kartio) {
            lierio.setEnabled(false);
            ympyra.setEnabled(true);
            nelio.setEnabled(true);
            this.kappale = Kappale.KARTIO;
        }

        if (e.getSource() == ympyra) {
            this.pohjanMuoto = PohjanMuoto.YMPYRA;
            nelio.setEnabled(false);
            laske.setEnabled(true);
        }

        if (e.getSource() == nelio) {
            ympyra.setEnabled(false);
            laske.setEnabled(true);
            this.pohjanMuoto = PohjanMuoto.NELIO;
        }

        if (e.getSource() == laske) {
            try {
                double sade = Double.parseDouble(this.sadeTaiKanta.getText());
                double korkeus = Double.parseDouble(this.korkeus.getText());
                if (sade <= 0 || korkeus <= 0) {
                    tulostuskentta.setText("Säde ja/tai korkeus eivät voi olla negatiivisia tai nolla");
                    sadeTaiKanta.setText("");
                    this.korkeus.setText("");
                } else {
                    LaskinLogiikka laskin = new LaskinLogiikka(this.kappale, this.pohjanMuoto, sade, korkeus);
                    String tulostus = "Pinta-ala on " + laskin.pintaAla() + " neliösenttimetriä. \n Tilavuus on " + laskin.tilavuus() + " kuutiosenttimetriä.";
                    tulostuskentta.setText(tulostus);
                    sadeTaiKanta.setText("");
                    this.korkeus.setText("");
                }
            } catch (Exception ex) {
                sadeTaiKanta.setText("");
                korkeus.setText("");
                tulostuskentta.setText("Anna säde ja korkeus senttimetreinä.");
            }
        }
    }

}
