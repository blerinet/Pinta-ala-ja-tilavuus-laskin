package fi.blerine.laskin.logiikka;

/**
 * Luokka hoitaa ympyrälieriöön liittyvän laskennan.
 */
public class YmpyralierioLogiikka {

    private final double sade;
    private final double korkeus;

    /**
     * Konstruktori asettaa käyttäjän syöttämät arvot yksityisten muuttujien
     * arvoksi.
     *
     * @param sade käyttäjän antama säteen pituus
     * @param korkeus käyttäjän antama korkeus
     *
     */
    public YmpyralierioLogiikka(double sade, double korkeus) {
        this.sade = sade;
        this.korkeus = korkeus;
    }

    public double getKorkeus() {
        return this.korkeus;
    }

    public double getSade() {
        return this.sade;
    }

    /**
     * Metodi laskee ja palauttaa ympyrälieriön pohjan pinta-alan.
     *
     * @return ympyrälieriön pohjan pinta-ala
     */
    public double pohjanAla() {
        return Math.PI * Math.pow(sade, 2);
    }

    /**
     * Metodi laskee ja palauttaa ympyrälieriön vaipan pinta-alan.
     *
     * @return ympyrälieriön vaipan pinta-ala
     */
    public double vaipanAla() {
        return 2 * Math.PI * sade * korkeus;
    }

    /**
     * Metodi laskee ja palauttaa ympyrälieriön kokonais pinta-alan.
     *
     * @return ympyrälieriön kokonais pinta-ala
     */
    public double pintaAla() {
        return this.vaipanAla() + (2 * this.pohjanAla());
    }

    /**
     * Metodi laskee ja palauttaa ympyrälieriön tilavuuden.
     *
     * @return ympyrälieriön tilavuus
     */
    public double tilavuus() {
        return korkeus * this.pohjanAla();
    }

}
