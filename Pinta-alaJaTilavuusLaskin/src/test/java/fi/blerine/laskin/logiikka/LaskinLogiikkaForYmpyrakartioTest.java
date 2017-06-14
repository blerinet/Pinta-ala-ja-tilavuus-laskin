package fi.blerine.laskin.logiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LaskinLogiikkaForYmpyrakartioTest {

    private LaskinLogiikka laskin;

    public LaskinLogiikkaForYmpyrakartioTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.laskin = new LaskinLogiikka(Kappale.KARTIO, PohjanMuoto.YMPYRA, 3, 4);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void konstruktoriAsettaaOikeanKappaleenKunKyseessaKartio() {
        assertEquals("KARTIO", laskin.getKappale().name());
    }

    @Test
    public void konstruktoriAsettaaOikeanPohjanMuodon() {
        assertEquals("YMPYRA", laskin.getPohjanMuoto().name());
    }

    @Test
    public void konstruktoriAsettaaKannanOikein() {
        assertEquals(2.0, laskin.getSade(), 1);
    }

    @Test
    public void konstruktoriAsettaaKorkeudenOikein() {
        assertEquals(4.0, laskin.getKorkeus(), 1);
    }

    @Test
    public void setSadeToimiiOikein() {
        laskin.setSade(7);
        assertEquals(7, laskin.getSade(), 1);
    }

    @Test
    public void setKorkeusToimiiOikein() {
        laskin.setKorkeus(8);
        assertEquals(8, laskin.getKorkeus(), 1);
    }

    @Test
    public void pintaAlaMetodiToimiiOikeinKunKyseessaYmpyrakartio() {
        assertEquals(75.39822368615503, laskin.pintaAla(), 1);
    }

    @Test
    public void tilavuusMetodiToimiiOikeinKunKyseessaYmpyrakartio() {
        assertEquals(37.69911184307752, laskin.tilavuus(), 1);
    }

//    public void pintaAlaMetodiEiToimiJosKappaleEiOleKartio() {
//        LaskinLogiikka laskin = new LaskinLogiikka("aahsjhdhj", "ympyrä", 3, 4);
//        assertEquals(-1000, laskin.tilavuus(), 1);
//    }
//
//    @Test
//    public void tilavuusMetodiEiToimiJosKappaleEiOleKartio() {
//        LaskinLogiikka laskin = new LaskinLogiikka("aahsjhdhj", "ympyrä", 3, 4);
//        assertEquals(-1000, laskin.tilavuus(), 1);
//    }
//
//    @Test
//    public void pintaAlaMetodiEiToimiJosPohjanMuotoEiOleYmpyra() {
//        LaskinLogiikka laskin = new LaskinLogiikka("kartio", "fjkfkf", 3, 4);
//        assertEquals(-1000, laskin.tilavuus(), 1);
//    }
//
//    @Test
//    public void tilavuusMetodiEiToimiJosPohjanMuotoEiOleYmpyra() {
//        LaskinLogiikka laskin = new LaskinLogiikka("kartio", "fjkfkf", 3, 4);
//        assertEquals(-1000, laskin.tilavuus(), 1);
//    }
}
