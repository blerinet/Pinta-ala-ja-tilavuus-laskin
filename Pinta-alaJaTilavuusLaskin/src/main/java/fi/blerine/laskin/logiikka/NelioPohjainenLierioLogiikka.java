package fi.blerine.laskin.logiikka;

public class NelioPohjainenLierioLogiikka {

    private double kanta;
    private double korkeus;

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

    public double pohjanAla() {
        return this.kanta * this.kanta;
    }

    public double vaipanAla() {
        return 4 * this.kanta * this.korkeus;
    }

    public double pintaAla() {
        return 2 * pohjanAla() + vaipanAla();
    }

    public double tilavuus() {
        return pohjanAla() * this.korkeus;
    }
}
