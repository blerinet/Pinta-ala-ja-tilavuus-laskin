package fi.blerine.laskin.logiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LaskinLogiikkaForPyramidiTest {

    private LaskinLogiikka laskin;

    public LaskinLogiikkaForPyramidiTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.laskin = new LaskinLogiikka(Kappale.KARTIO, PohjanMuoto.NELIO, 2, 4);
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
        assertEquals("NELIO", laskin.getPohjanMuoto().name());
    }

    @Test
    public void konstruktoriAsettaaSateenOikein() {
        assertEquals(2.0, laskin.getSade(), 1);
    }

    @Test
    public void konstruktoriAsettaaKorkeudenOikein() {
        assertEquals(4.0, laskin.getKorkeus(), 1);
    }

    @Test
    public void pintaAlaMetodiToimiiOikeinKunKyseessaPyramidi() {
        assertEquals(20.492422502470642, laskin.pintaAla(), 1);
    }

    @Test
    public void tilavuusMetodiToimiiOikeinKunKyseessaPyramidi() {
        assertEquals(5.333333333333333, laskin.tilavuus(), 1);
    }

//    public void pintaAlaMetodiEiToimiJosKappaleEiOleKartio() {
//        LaskinLogiikka laskin = new LaskinLogiikka("aahsjhdhj", "neliö", 3, 4);
//        assertEquals(-1000, laskin.tilavuus(), 1);
//    }
//
//    @Test
//    public void tilavuusMetodiEiToimiJosKappaleEiOleKartio() {
//        LaskinLogiikka laskin = new LaskinLogiikka("aahsjhdhj", "neliö", 3, 4);
//        assertEquals(-1000, laskin.tilavuus(), 1);
//    }
//
//    @Test
//    public void pintaAlaMetodiEiToimiJosPohjanMuotoEiOleNelio() {
//        LaskinLogiikka laskin = new LaskinLogiikka("kartio", "fjkfkf", 3, 4);
//        assertEquals(-1000, laskin.tilavuus(), 1);
//    }
//
//    @Test
//    public void tilavuusMetodiEiToimiJosPohjanMuotoEiOleNelio() {
//        LaskinLogiikka laskin = new LaskinLogiikka("kartio", "fjkfkf", 3, 4);
//        assertEquals(-1000, laskin.tilavuus(), 1);
//    }
}
