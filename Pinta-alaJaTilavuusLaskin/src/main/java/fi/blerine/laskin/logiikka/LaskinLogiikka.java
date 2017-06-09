package fi.blerine.laskin.logiikka;

/**
 * Luokka yhdistää ympyrälieriön, -kartion, neliöpohjaisen lieriön sekä
 * pyramidin pinta-alan ja tilavuuden laskemisen yhdeksi kokonaisuudeksi, eli
 * pinta-ala ja tilavuus laskimeksi. Luokka hoitaa kuitenkin vain laskimen
 * loogisen puolen.
 */
public class LaskinLogiikka {

    private String kappale;
    private String pohjanMuoto;
    private double sade;
    private double korkeus;
    private YmpyralierioLogiikka ympyralierio;
    private YmpyrakartioLogiikka ympyrakartio;
    private NelioPohjainenLierioLogiikka nelioLierio;
    private PyramidiLogiikka pyramidi;

    /**
     * Konstruktori asettaa käyttäjän syöttämät arvot yksityisten muuttujien
     * arvoksi. Tämän lisäksi konstruktorissa luodaan valmiiksi ympyrälieriö,
     * ympyräkartio, neliöpohjainen lieriö ja pyramidi, jotka tallennetaan
     * myöskin yksityisiin muuttujiin, jotta niitä on helpompi käyttää muissa
     * metodeissa.
     *
     * @param kappale käyttäjän antama kappale
     * @param pohjanMuoto käyttäjän antama pohjan muoto
     * @param sade käyttäjän antama säteen pituus
     * @param korkeus käyttäjän antama korkeus
     *
     */
    public LaskinLogiikka(String kappale, String pohjanMuoto, double sade, double korkeus) {
        this.kappale = kappale;
        this.pohjanMuoto = pohjanMuoto;
        this.sade = sade;
        this.korkeus = korkeus;
        this.ympyralierio = new YmpyralierioLogiikka(sade, korkeus);
        this.ympyrakartio = new YmpyrakartioLogiikka(sade, korkeus);
        this.nelioLierio = new NelioPohjainenLierioLogiikka(sade, korkeus);
        this.pyramidi = new PyramidiLogiikka(sade, korkeus);
    }

    public String getKappale() {
        return kappale;
    }

    public String getPohjanMuoto() {
        return pohjanMuoto;
    }

    public double getKorkeus() {
        return korkeus;
    }

    public double getSade() {
        return sade;
    }

    public void setSade(double sade) {
        this.sade = sade;
    }

    public void setKorkeus(double korkeus) {
        this.korkeus = korkeus;
    }

    /**
     * Metodi laskee annetun kappaleen pinta-alan niin, että aluksi metodi
     * tutkii onko kappale lieriö vai kartio, tämän jälkeen tutkii onko pohjan
     * muoto ympyrä vai neliö ja sitten palauttaa halutun kappalleen pinta-alan
     * String-muodossa. Jos kappale tai pohjanmuoto eivät ole halutun laisia,
     * metodi ilmoittaa siitä.
     *
     * @return halutun kappalleen pinta-ala String-muodossa tai ilmoitus siitä
     * että kappalleen täytyy olla joko lieriö tai kartio ja pohjan muodon joko
     * ympyrä tai neliö
     */
    public String pintaAla() {
        if (kappale == "lieriö") {
            if (pohjanMuoto == "ympyrä") {
                return "Pinta-ala on " + this.ympyralierio.pintaAla() + " neliösenttimetriä.";
            } else if (pohjanMuoto == "neliö") {
                return "Pinta-ala on " + this.nelioLierio.pintaAla() + " neliösenttimetriä.";
            }
        }
        if (kappale == "kartio") {
            if (pohjanMuoto == "ympyrä") {
                return "Pinta-ala on " + this.ympyrakartio.pintaAla() + " neliösenttimetriä.";
            } else if (pohjanMuoto == "neliö") {
                return "Pinta-ala on " + this.pyramidi.pintaAla() + " neliösenttimetriä.";
            }
        }

        return "Kappaleen täytyy olla joko lieriö tai kartio ja pohjan muodon joko ympyrä tai neliö.";
    }

    /**
     * Metodi laskee annetun kappaleen tilavuuden niin, että aluksi metodi
     * tutkii onko kappale lieriö vai kartio, tämän jälkeen tutkii onko pohjan
     * muoto ympyrä vai neliö ja sitten palauttaa halutun kappalleen tilavuuden
     * String-muodossa. Jos kappale tai pohjanmuoto eivät ole halutun laisia,
     * metodi ilmoittaa siitä.
     *
     * @return halutun kappalleen tilavuus String-muodossa tai ilmoitus siitä
     * että kappalleen täytyy olla joko lieriö tai kartio ja pohjan muodon joko
     * ympyrä tai neliö
     */
    public String tilavuus() {
        if (kappale == "lieriö") {
            if (pohjanMuoto == "ympyrä") {
                return "Tilavuus on " + this.ympyralierio.tilavuus() + " kuutiosenttimetriä.";
            } else if (pohjanMuoto == "neliö") {
                return "Tilavuus on " + this.nelioLierio.tilavuus() + " kuutiosenttimetriä.";
            }
        }
        if (kappale == "kartio") {
            if (pohjanMuoto == "ympyrä") {
                return "Tilavuus on " + this.ympyrakartio.tilavuus() + " kuutiosenttimetriä.";
            } else if (pohjanMuoto == "neliö") {
                return "Tilavuus on " + this.pyramidi.tilavuus() + " kuutiosenttimetriä.";
            }
        }

        return "Kappaleen täytyy olla joko lieriö tai kartio ja pohjan muodon joko ympyrä tai neliö.";
    }
}
