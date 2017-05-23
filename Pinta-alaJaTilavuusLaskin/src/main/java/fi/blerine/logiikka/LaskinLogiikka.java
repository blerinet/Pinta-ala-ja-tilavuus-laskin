package fi.blerine.logiikka;

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

    public void pintaAla() {
        if (kappale == "lieriö") {
            lierioPintaAla();
        }
        if (kappale == "kartio") {
            kartioPintaAla();
        } else {
            System.out.println("Kappaleen täytyy olla joko lieriö tai kartio");
        }
    }

    public void tilavuus() {
        if (kappale == "lieriö") {
            lierioTilavuus();
        }
        if (kappale == "kartio") {
            kartioTilavuus();
        } else {
            System.out.println("Kappaleen täytyy olla joko lieriö tai kartio");
        }
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
