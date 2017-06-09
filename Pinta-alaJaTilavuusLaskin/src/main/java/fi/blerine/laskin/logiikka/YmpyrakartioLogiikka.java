package fi.blerine.laskin.logiikka;

/**
 * Luokka hoitaa ympyräkartioon liittyvän laskennan.
 */
public class YmpyrakartioLogiikka {

    private double sade;
    private double korkeus;

    /**
     * Konstruktori asettaa käyttäjän syöttämät arvot yksityisten muuttujien
     * arvoksi.
     *
     * @param sade käyttäjän antama säteen pituus
     * @param korkeus käyttäjän antama korkeus
     *
     */
    public YmpyrakartioLogiikka(double sade, double korkeus) {
        this.sade = sade;
        this.korkeus = korkeus;
    }

    public double getKorkeus() {
        return korkeus;
    }

    public double getSade() {
        return sade;
    }

    /**
     * Metodi laskee ja palauttaa ympyräkartion sivujanan pituuden.
     *
     * @return ympyräkartion sivujanan pituus
     */
    public double sivujana() {
        double summa = Math.pow(sade, 2) + Math.pow(korkeus, 2);
        return Math.sqrt(summa);
    }

    /**
     * Metodi laskee ja palauttaa ympyräkartion pohjan pinta-alan.
     *
     * @return ympyräkartion pohjan pinta-ala
     */
    public double pohjanAla() {
        return Math.PI * Math.pow(sade, 2);
    }

    /**
     * Metodi laskee ja palauttaa ympyräkartion vaipan pinta-alan.
     *
     * @return ympyräkartion vaipan pinta-ala
     */
    public double vaipanAla() {
        return Math.PI * sade * this.sivujana();
    }

    /**
     * Metodi laskee ja palauttaa ympyräkartion kokonais pinta-alan.
     *
     * @return ympyräkartion kokonais pinta-ala
     */
    public double pintaAla() {
        return this.vaipanAla() + this.pohjanAla();
    }

    /**
     * Metodi laskee ja palauttaa ympyräkartion tilavuuden.
     *
     * @return ympyräkartion tilavuus
     */
    public double tilavuus() {
        return (korkeus * this.pohjanAla()) / 3;
    }

}
