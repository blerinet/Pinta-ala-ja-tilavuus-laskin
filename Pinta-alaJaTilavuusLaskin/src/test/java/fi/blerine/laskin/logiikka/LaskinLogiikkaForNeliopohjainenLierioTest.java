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
        this.laskin = new LaskinLogiikka("lieriö", "neliö", 2, 4);
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
        assertEquals("neliö", laskin.getPohjanMuoto());
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
        assertEquals("Pinta-ala on 40.0 neliösenttimetriä.", laskin.pintaAla());
    }

    @Test
    public void tilavuusMetodiToimiiOikeinKunKyseessaNeliopohjainenLierio() {
        assertEquals("Tilavuus on 16.0 kuutiosenttimetriä.", laskin.tilavuus());
    }

    @Test
    public void pintaAlaMetodiEiToimiJosKappaleEiOleLierio() {
        LaskinLogiikka laskin = new LaskinLogiikka("aahsjhdhj", "neliö", 2, 4);
        assertEquals("Kappaleen täytyy olla joko lieriö tai kartio ja pohjan muodon joko ympyrä tai neliö.", laskin.pintaAla());
    }

    @Test
    public void tilavuusMetodiEiToimiJosKappaleEiOleLierio() {
        LaskinLogiikka laskin = new LaskinLogiikka("aahsjhdhj", "neliö", 2, 4);
        assertEquals("Kappaleen täytyy olla joko lieriö tai kartio ja pohjan muodon joko ympyrä tai neliö.", laskin.tilavuus());
    }

    @Test
    public void pintaAlaMetodiEiToimiJosPohjanMuotoEiOleNelio() {
        LaskinLogiikka laskin = new LaskinLogiikka("lieriö", "fjkfkf", 3, 4);
        assertEquals("Kappaleen täytyy olla joko lieriö tai kartio ja pohjan muodon joko ympyrä tai neliö.", laskin.pintaAla());
    }

    @Test
    public void tilavuusMetodiEiToimiJosPohjanMuotoEiOleNelio() {
        LaskinLogiikka laskin = new LaskinLogiikka("lieriö", "fjkfkf", 3, 4);
        assertEquals("Kappaleen täytyy olla joko lieriö tai kartio ja pohjan muodon joko ympyrä tai neliö.", laskin.tilavuus());
    }
}
