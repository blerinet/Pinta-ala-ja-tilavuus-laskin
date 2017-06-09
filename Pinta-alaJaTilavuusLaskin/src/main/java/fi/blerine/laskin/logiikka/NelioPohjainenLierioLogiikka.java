package fi.blerine.laskin.logiikka;

/**
 * Luokka hoitaa neliöpohjaiseen lieriöön liittyvän laskennan.
 */
public class NelioPohjainenLierioLogiikka {

    private double kanta;
    private double korkeus;

    /**
     * Konstruktori asettaa käyttäjän syöttämät arvot yksityisten muuttujien
     * arvoksi.
     *
     * @param kanta käyttäjän antama kannan pituus
     * @param korkeus käyttäjän antama korkeus
     *
     */
    public NelioPohjainenLierioLogiikka(double kanta, double korkeus) {
        this.kanta = kanta;
        this.korkeus = korkeus;
    }

    public double getKanta() {
        return kanta;
    }

    public double getKorkeus() {
        return korkeus;
    }

    /**
     * Metodi laskee ja palauttaa neliöpohjaisen lieriön pohjan pinta-alan.
     *
     * @return neliöpohjaisen lieriön pohjan pinta-ala
     */
    public double pohjanAla() {
        return this.kanta * this.kanta;
    }

    /**
     * Metodi laskee ja palauttaa neliöpohjaisen lieriön vaipan pinta-alan.
     *
     * @return neliöpohjaisen lieriön vaipan pinta-ala
     */
    public double vaipanAla() {
        return 4 * this.kanta * this.korkeus;
    }

    /**
     * Metodi laskee ja palauttaa neliöpohjaisen lieriön kokonais pinta-alan.
     *
     * @return neliöpohjaisen lieriön kokonais pinta-ala
     */
    public double pintaAla() {
        return 2 * pohjanAla() + vaipanAla();
    }

    /**
     * Metodi laskee ja palauttaa neliöpohjaisen lieriön tilavuuden.
     *
     * @return neliöpohjaisen lieriön tilavuus
     */
    public double tilavuus() {
        return pohjanAla() * this.korkeus;
    }
}
