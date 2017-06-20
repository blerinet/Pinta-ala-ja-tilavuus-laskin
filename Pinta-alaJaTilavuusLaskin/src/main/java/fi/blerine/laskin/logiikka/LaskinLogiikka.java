package fi.blerine.laskin.logiikka;

/**
 * Luokka yhdistää ympyrälieriön, -kartion, neliöpohjaisen lieriön sekä
 * pyramidin pinta-alan ja tilavuuden laskemisen yhdeksi kokonaisuudeksi, eli
 * pinta-ala ja tilavuus laskimeksi. Luokka hoitaa kuitenkin vain laskimen
 * loogisen puolen.
 */
public class LaskinLogiikka {

    private final Kappale kappale;
    private final PohjanMuoto pohjanMuoto;
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
    public LaskinLogiikka(Kappale kappale, PohjanMuoto pohjanMuoto, double sade, double korkeus) {
        this.kappale = kappale;
        this.pohjanMuoto = pohjanMuoto;
        this.sade = sade;
        this.korkeus = korkeus;
        this.ympyralierio = new YmpyralierioLogiikka(sade, korkeus);
        this.ympyrakartio = new YmpyrakartioLogiikka(sade, korkeus);
        this.nelioLierio = new NelioPohjainenLierioLogiikka(sade, korkeus);
        this.pyramidi = new PyramidiLogiikka(sade, korkeus);
    }

    public Kappale getKappale() {
        return kappale;
    }

    public PohjanMuoto getPohjanMuoto() {
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
     * double-muodossa.
     *
     * @return halutun kappalleen pinta-ala double-muodossa
     */
    public double pintaAla() {
        if (kappale == Kappale.LIERIO) {
            if (pohjanMuoto == PohjanMuoto.YMPYRA) {
                return this.ympyralierio.pintaAla();
            } else if (pohjanMuoto == PohjanMuoto.NELIO) {
                return this.nelioLierio.pintaAla();
            }
        }
        if (kappale == Kappale.KARTIO && this.pohjanMuoto == PohjanMuoto.YMPYRA) {
            return this.ympyrakartio.pintaAla();
        }

        return this.pyramidi.pintaAla();
    }

    /**
     * Metodi laskee annetun kappaleen tilavuuden niin, että aluksi metodi
     * tutkii onko kappale lieriö vai kartio, tämän jälkeen tutkii onko pohjan
     * muoto ympyrä vai neliö ja sitten palauttaa halutun kappalleen tilavuuden
     * double-muodossa.
     *
     * @return halutun kappalleen tilavuus double-muodossa
     */
    public double tilavuus() {
        if (kappale == Kappale.LIERIO) {
            if (pohjanMuoto == PohjanMuoto.YMPYRA) {
                return this.ympyralierio.tilavuus();
            } else if (pohjanMuoto == PohjanMuoto.NELIO) {
                return this.nelioLierio.tilavuus();
            }
        }
        if (kappale == Kappale.KARTIO && this.pohjanMuoto == PohjanMuoto.YMPYRA) {
            return this.ympyrakartio.tilavuus();
        }

        return this.pyramidi.tilavuus();
    }
}
