package fi.blerine.laskin.logiikka;

public class PyramidiLogiikka {

    private double kanta;
    private double korkeus;

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

    public double sivutahkonKorkeus() {
        double summa = Math.pow((kanta / 2), 2) + Math.pow(korkeus, 2);
        return Math.sqrt(summa);
    }

    public double pohjanAla() {
        return this.kanta * this.kanta;
    }

    public double vaipanAla() {
        double sivutahkonAla = (this.kanta * sivutahkonKorkeus()) / 2;
        return 4 * sivutahkonAla;
    }

    public double pintaAla() {
        return pohjanAla() + vaipanAla();
    }

    public double tilavuus() {
        return (pohjanAla() * this.korkeus) / 3;
    }
}
