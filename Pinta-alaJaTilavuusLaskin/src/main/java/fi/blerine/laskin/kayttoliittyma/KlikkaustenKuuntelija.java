package fi.blerine.laskin.kayttoliittyma;

import fi.blerine.laskin.logiikka.LaskinLogiikka;
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

    private LaskinLogiikka laskin;
    private JTextArea sadeTaiKanta;
    private JTextArea korkeus;
    private JButton nollaus;
    private JButton ympyralierio;
    private JButton ympyrakartio;
    private JButton nelioLierio;
    private JButton pyramidi;
    private JTextField tulostuskentta;

    /**
     * Konstruktori asettaa annetut tiedot yksityisten muuttujien arvoksi, jotta
     * niitä voidaan helposti käyttää muissakin metodeissa.
     *
     * @param sadeTaiKanta käyttöliittymässä oleva tekstikenttä johon syötetään
     * kappaleen säde tai kannan pituus
     * @param korkeus käyttöliittymässä oleva tekstikenttä johon syötetään
     * kappaleen korkeus
     * @param nollaus käyttöliittymässä oleva nollaus-nappi
     * @param ympyralierio käyttöliittymässä oleva ympyrälieriö-nappi, joka
     * laskee ympyrälieriön pinta-alan ja tilavuuden
     * @param ympyrakartio käyttöliittymässä oleva ympyräkartio-nappi, joka
     * laskee ympyräkartion pinta-alan ja tilavuuden
     * @param nelioLierio käyttöliittymässä oleva neliöpohjainen lieriö-nappi,
     * joka laskee neliöpohjaisen lieriön pinta-alan ja tilavuuden
     * @param pyramidi käyttöliittymässä oleva ypyramidi-nappi, joka laskee
     * pyramidin pinta-alan ja tilavuuden
     * @param tulostuskentta käyttöliittymässä oleva tekstikenttä, johon
     * palautetaan haluttu vastaus
     *
     */
    public KlikkaustenKuuntelija(JTextArea sadeTaiKanta, JTextArea korkeus, JButton nollaus, JButton ympyralierio, JButton ympyrakartio, JButton nelioLierio, JButton pyramidi, JTextField tulostuskentta) {
        this.sadeTaiKanta = sadeTaiKanta;
        this.korkeus = korkeus;
        this.nollaus = nollaus;
        this.ympyralierio = ympyralierio;
        this.ympyrakartio = ympyrakartio;
        this.nelioLierio = nelioLierio;
        this.pyramidi = pyramidi;
        this.tulostuskentta = tulostuskentta;
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
        }
        if (e.getSource() == ympyralierio) {
            try {
                int sade = Integer.parseInt(this.sadeTaiKanta.getText());
                int korkeus = Integer.parseInt(this.korkeus.getText());
                String kappale = "lieriö";
                String pohjanMuoto = "ympyrä";
                LaskinLogiikka laskin = new LaskinLogiikka(kappale, pohjanMuoto, sade, korkeus);
                String tulostus = laskin.pintaAla() + " " + laskin.tilavuus();
                tulostuskentta.setText(tulostus);
                sadeTaiKanta.setText("");
                this.korkeus.setText("");
            } catch (Exception ex) {
                sadeTaiKanta.setText("");
                korkeus.setText("");
                tulostuskentta.setText("Anna säde ja korkeus senttimetreinä.");
            }
        }

        if (e.getSource() == ympyrakartio) {
            try {
                int sade = Integer.parseInt(this.sadeTaiKanta.getText());
                int korkeus = Integer.parseInt(this.korkeus.getText());
                String kappale = "kartio";
                String pohjanMuoto = "ympyrä";
                LaskinLogiikka laskin = new LaskinLogiikka(kappale, pohjanMuoto, sade, korkeus);
                String tulostus = laskin.pintaAla() + " " + laskin.tilavuus();
                tulostuskentta.setText(tulostus);
                sadeTaiKanta.setText("");
                this.korkeus.setText("");
            } catch (Exception ex) {
                sadeTaiKanta.setText("");
                korkeus.setText("");
                tulostuskentta.setText("Anna säde ja korkeus senttimetreinä.");
            }
        }

        if (e.getSource() == nelioLierio) {
            try {
                int sade = Integer.parseInt(this.sadeTaiKanta.getText());
                int korkeus = Integer.parseInt(this.korkeus.getText());
                String kappale = "lieriö";
                String pohjanMuoto = "neliö";
                LaskinLogiikka laskin = new LaskinLogiikka(kappale, pohjanMuoto, sade, korkeus);
                String tulostus = laskin.pintaAla() + " " + laskin.tilavuus();
                tulostuskentta.setText(tulostus);
                sadeTaiKanta.setText("");
                this.korkeus.setText("");
            } catch (Exception ex) {
                sadeTaiKanta.setText("");
                korkeus.setText("");
                tulostuskentta.setText("Anna säde ja korkeus senttimetreinä.");
            }
        }

        if (e.getSource() == pyramidi) {
            try {
                int sade = Integer.parseInt(this.sadeTaiKanta.getText());
                int korkeus = Integer.parseInt(this.korkeus.getText());
                String kappale = "kartio";
                String pohjanMuoto = "neliö";
                LaskinLogiikka laskin = new LaskinLogiikka(kappale, pohjanMuoto, sade, korkeus);
                String tulostus = laskin.pintaAla() + " " + laskin.tilavuus();
                tulostuskentta.setText(tulostus);
                sadeTaiKanta.setText("");
                this.korkeus.setText("");
            } catch (Exception ex) {
                sadeTaiKanta.setText("");
                korkeus.setText("");
                tulostuskentta.setText("Anna säde ja korkeus senttimetreinä.");
            }
        }
    }

}
