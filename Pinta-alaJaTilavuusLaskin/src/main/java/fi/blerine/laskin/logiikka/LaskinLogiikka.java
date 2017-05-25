package fi.blerine.laskin.logiikka;

public class LaskinLogiikka {

    private String kappale;
    private double sade;
    private double korkeus;

    public LaskinLogiikka(String kappale, double sade, double korkeus) {
        this.kappale = kappale;
        this.sade = sade;
        this.korkeus = korkeus;
    }

    public String getKappale() {
        return kappale;
    }

    public double getKorkeus() {
        return korkeus;
    }

    public double getSade() {
        return sade;
    }

    public String pintaAla() {
        if (kappale == "lieriö") {
            double lierioAla = lierioPintaAla();
            return "Pinta-ala on " + lierioAla + " neliösenttimetriä.";
        }
        if (kappale == "kartio") {
            double kartioAla = kartioPintaAla();
            return "Pinta-ala on " + kartioAla + " neliösenttimetriä.";
        }
        return "Kappaleen täytyy olla joko lieriö tai kartio";

    }

    public String tilavuus() {
        if (kappale == "lieriö") {
            double tilavuus = lierioTilavuus();
            return "Tilavuus on " + tilavuus + " kuutiosenttimetriä";
        }
        if (kappale == "kartio") {
            double tilavuus = kartioTilavuus();
            return "Tilavuus on " + tilavuus + " kuutiosenttimetriä";
        }
        return "Kappaleen täytyy olla joko lieriö tai kartio";

    }

    public double lierioPintaAla() {
        YmpyralierioLogiikka lierio = new YmpyralierioLogiikka(sade, korkeus);
        return lierio.pintaAla();
    }

    public double kartioPintaAla() {
        YmpyrakartioLogiikka kartio = new YmpyrakartioLogiikka(sade, korkeus);
        return kartio.pintaAla();
    }

    public double lierioTilavuus() {
        YmpyralierioLogiikka lierio = new YmpyralierioLogiikka(sade, korkeus);
        return lierio.tilavuus();
    }

    public double kartioTilavuus() {
        YmpyrakartioLogiikka kartio = new YmpyrakartioLogiikka(sade, korkeus);
        return kartio.tilavuus();
    }
}
