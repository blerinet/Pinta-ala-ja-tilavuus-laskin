package fi.blerine.logiikka;

public class YmpyralierioLogiikka {

    private double sade;
    private double korkeus;

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

    public double pohjanAla() {
        return Math.PI * Math.pow(sade, 2);
    }

    public double vaipanAla() {
        return 2 * Math.PI * sade * korkeus;
    }

    public double pintaAla() {
        return this.vaipanAla() + (2 * this.pohjanAla());
    }

    public double tilavuus() {
        return korkeus * this.pohjanAla();
    }

}
