package fi.blerine.laskin.logiikka;

public class LaskinLogiikka {

    private String kappale;
    private String pohjanMuoto;
    private double sade;
    private double korkeus;

    public LaskinLogiikka(String kappale, String pohjanMuoto, double sade, double korkeus) {
        this.kappale = kappale;
        this.pohjanMuoto = pohjanMuoto;
        this.sade = sade;
        this.korkeus = korkeus;
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

    public String pintaAla() {
        if (kappale == "lieriö") {
            if (pohjanMuoto == "ympyrä") {
                return "Pinta-ala on " + ympyralierioPintaAla() + " neliösenttimetriä.";
            } else if (pohjanMuoto == "neliö") {
                return "Pinta-ala on " + nelioPohjainenLierioPintaAla() + " neliösenttimetriä.";
            }
        }
        if (kappale == "kartio") {
            if (pohjanMuoto == "ympyrä") {
                return "Pinta-ala on " + ympyrakartioPintaAla() + " neliösenttimetriä.";
            } else if (pohjanMuoto == "neliö") {
                return "Pinta-ala on " + pyramidiPintaAla() + " neliösenttimetriä.";
            }
        }
        
        return "Kappaleen täytyy olla joko lieriö tai kartio ja pohjan muodon joko ympyrä tai neliö.";
    }

    public String tilavuus() {
        if (kappale == "lieriö") {
            if (pohjanMuoto == "ympyrä") {
                return "Tilavuus on " + ympyralierioTilavuus() + " kuutiosenttimetriä.";
            } else if (pohjanMuoto == "neliö") {
                return "Tilavuus on " + nelioPohjainenLierioTilavuus() + " kuutiosenttimetriä.";
            }
        }
        if (kappale == "kartio") {
            if (pohjanMuoto == "ympyrä") {
                return "Tilavuus on " + ympyrakartioTilavuus() + " kuutiosenttimetriä.";
            } else if (pohjanMuoto == "neliö") {
                return "Tilavuus on " + pyramidiTilavuus() + " kuutiosenttimetriä.";
            }
        }
        
        return "Kappaleen täytyy olla joko lieriö tai kartio ja pohjan muodon joko ympyrä tai neliö.";
    }

    public double ympyralierioPintaAla() {
        YmpyralierioLogiikka lierio = new YmpyralierioLogiikka(sade, korkeus);
        return lierio.pintaAla();
    }

    public double ympyrakartioPintaAla() {
        YmpyrakartioLogiikka kartio = new YmpyrakartioLogiikka(sade, korkeus);
        return kartio.pintaAla();
    }

    public double ympyralierioTilavuus() {
        YmpyralierioLogiikka lierio = new YmpyralierioLogiikka(sade, korkeus);
        return lierio.tilavuus();
    }

    public double ympyrakartioTilavuus() {
        YmpyrakartioLogiikka kartio = new YmpyrakartioLogiikka(sade, korkeus);
        return kartio.tilavuus();
    }

    public double nelioPohjainenLierioPintaAla() {
        NelioPohjainenLierioLogiikka lierio = new NelioPohjainenLierioLogiikka(sade, korkeus);
        return lierio.pintaAla();
    }

    public double nelioPohjainenLierioTilavuus() {
        NelioPohjainenLierioLogiikka lierio = new NelioPohjainenLierioLogiikka(sade, korkeus);
        return lierio.tilavuus();
    }

    public double pyramidiPintaAla() {
        PyramidiLogiikka pyramidi = new PyramidiLogiikka(sade, korkeus);
        return pyramidi.pintaAla();
    }

    public double pyramidiTilavuus() {
        PyramidiLogiikka pyramidi = new PyramidiLogiikka(sade, korkeus);
        return pyramidi.tilavuus();
    }
}
