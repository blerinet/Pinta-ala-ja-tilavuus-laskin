package fi.blerine.laskin.logiikka;

/**
 * Luokka hoitaa pyramidiin liittyvän laskennan.
 */
public class PyramidiLogiikka {

    private final double kanta;
    private final double korkeus;

    /**
     * Konstruktori asettaa käyttäjän syöttämät arvot yksityisten muuttujien
     * arvoksi.
     *
     * @param kanta käyttäjän antama kannan pituus
     * @param korkeus käyttäjän antama korkeus
     *
     */
    public PyramidiLogiikka(double kanta, double korkeus) {
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
     * Metodi laskee ja palauttaa pyramidin sivutahkon korkeuden.
     *
     * @return pyramidin sivutahkon korkeus
     */
    public double sivutahkonKorkeus() {
        double summa = Math.pow((kanta / 2), 2) + Math.pow(korkeus, 2);
        return Math.sqrt(summa);
    }

    /**
     * Metodi laskee ja palauttaa pyramidin pohjan pinta-alan.
     *
     * @return pyramidin pohjan pinta-ala
     */
    public double pohjanAla() {
        return this.kanta * this.kanta;
    }

    /**
     * Metodi laskee ja palauttaa pyramidin vaipan pinta-alan.
     *
     * @return pyramidin vaipan pinta-ala
     */
    public double vaipanAla() {
        double sivutahkonAla = (this.kanta * sivutahkonKorkeus()) / 2;
        return 4 * sivutahkonAla;
    }

    /**
     * Metodi laskee ja palauttaa pyramidin kokonais pinta-alan.
     *
     * @return pyramidin kokonais pinta-ala
     */
    public double pintaAla() {
        return pohjanAla() + vaipanAla();
    }

    /**
     * Metodi laskee ja palauttaa pyramidin tilavuuden.
     *
     * @return pyramidin tilavuus
     */
    public double tilavuus() {
        return (pohjanAla() * this.korkeus) / 3;
    }
}
