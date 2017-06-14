package fi.blerine.laskin.logiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LaskinLogiikkaForNeliopohjainenLierioTest {

    private LaskinLogiikka laskin;

    public LaskinLogiikkaForNeliopohjainenLierioTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.laskin = new LaskinLogiikka(Kappale.LIERIO, PohjanMuoto.NELIO, 2, 4);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void konstruktoriAsettaaOikeanKappaleenKunKyseessaLierio() {
        assertEquals("LIERIO", laskin.getKappale().name());
    }

    @Test
    public void konstruktoriAsettaaOikeanPohjanMuodon() {
        assertEquals("NELIO", laskin.getPohjanMuoto().name());
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
    public void pintaAlaMetodiToimiiOikeinKunKyseessaNeliopohjainenLierio() {
        assertEquals(40.0, laskin.pintaAla(), 1);
    }

    @Test
    public void tilavuusMetodiToimiiOikeinKunKyseessaNeliopohjainenLierio() {
        assertEquals(16.0, laskin.tilavuus(), 1);
    }

//    @Test
//    public void pintaAlaMetodiEiToimiJosKappaleEiOleLierio() {
//        LaskinLogiikka laskin = new LaskinLogiikka("aahsjhdhj", "neliö", 2, 4);
//        assertEquals(-1000, laskin.tilavuus(), 1);
//    }
//
//    @Test
//    public void tilavuusMetodiEiToimiJosKappaleEiOleLierio() {
//        LaskinLogiikka laskin = new LaskinLogiikka("aahsjhdhj", "neliö", 2, 4);
//        assertEquals(-1000, laskin.tilavuus(), 1);
//    }
//
//    @Test
//    public void pintaAlaMetodiEiToimiJosPohjanMuotoEiOleNelio() {
//        LaskinLogiikka laskin = new LaskinLogiikka("lieriö", "fjkfkf", 3, 4);
//        assertEquals(-1000, laskin.tilavuus(), 1);
//    }
//
//    @Test
//    public void tilavuusMetodiEiToimiJosPohjanMuotoEiOleNelio() {
//        LaskinLogiikka laskin = new LaskinLogiikka("lieriö", "fjkfkf", 3, 4);
//        assertEquals(-1000, laskin.tilavuus(), 1);
//    }
}
