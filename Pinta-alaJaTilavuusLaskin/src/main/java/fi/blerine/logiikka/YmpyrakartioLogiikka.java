
package fi.blerine.logiikka;


public class YmpyrakartioLogiikka {
    private double sade;
    private double korkeus;

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

    public double sivujana() {
        double summa = Math.pow(sade, 2) + Math.pow(korkeus, 2);
        return Math.sqrt(summa);
    }
    
    public double pohjanAla() {
        return Math.PI*Math.pow(sade, 2);
    }
    
    public double vaipanAla() {
        return Math.PI*sade*this.sivujana();
    }
    
    public double pintaAla() {
        return this.vaipanAla() + this.pohjanAla();
    }
    
    public double tilavuus() {
        return (korkeus*this.pohjanAla())/3;
    }
    
    
}
