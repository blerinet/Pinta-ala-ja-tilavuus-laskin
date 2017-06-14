package fi.blerine.laskin.logiikka;

import fi.blerine.laskin.logiikka.LaskinLogiikka;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LaskinLogiikkaForYmpyralierioTest {

    private LaskinLogiikka laskin;

    public LaskinLogiikkaForYmpyralierioTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.laskin = new LaskinLogiikka("lieriö", "ympyrä", 3, 4);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void konstruktoriAsettaaOikeanKappaleenKunKyseessaLierio() {
        assertEquals("lieriö", laskin.getKappale());
    }

    @Test
    public void konstruktoriAsettaaOikeanPohjanMuodon() {
        assertEquals("ympyrä", laskin.getPohjanMuoto());
    }

    @Test
    public void konstruktoriAsettaaSateenOikein() {
        assertEquals(3.0, laskin.getSade(), 1);
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
    public void pintaAlaMetodiToimiiOikeinKunKyseessaYmpyralierio() {
        assertEquals(131.94689145077132, laskin.pintaAla(), 1);
    }

    @Test
    public void tilavuusMetodiToimiiOikeinKunKyseessaYmpyralierio() {
        assertEquals(113.09733552923255, laskin.tilavuus(), 1);
    }

    @Test
    public void pintaAlaMetodiEiToimiJosKappaleEiOleLierio() {
        LaskinLogiikka laskin = new LaskinLogiikka("aahsjhdhj", "ympyrä", 3, 4);
        assertEquals(-1000, laskin.pintaAla(), 1);
    }

    @Test
    public void tilavuusMetodiEiToimiJosKappaleEiOleLierio() {
        LaskinLogiikka laskin = new LaskinLogiikka("aahsjhdhj", "ympyrä", 3, 4);
        assertEquals(-1000, laskin.tilavuus(), 1);
    }

    @Test
    public void pintaAlaMetodiEiToimiJosPohjanMuotoEiOleYmpyra() {
        LaskinLogiikka laskin = new LaskinLogiikka("lieriö", "fjkfkf", 3, 4);
        assertEquals(-1000, laskin.pintaAla(), 1);
    }

    @Test
    public void tilavuusMetodiEiToimiJosPohjanMuotoEiOleYmpyra() {
        LaskinLogiikka laskin = new LaskinLogiikka("lieriö", "fjkfkf", 3, 4);
        assertEquals(-1000, laskin.tilavuus(), 1);
    }
}
