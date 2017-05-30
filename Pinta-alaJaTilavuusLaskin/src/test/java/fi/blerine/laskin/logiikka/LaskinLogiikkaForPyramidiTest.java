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
        this.laskin = new LaskinLogiikka("kartio", "neliö", 2, 4);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void konstruktoriAsettaaOikeanKappaleenKunKyseessaKartio() {
        assertEquals("kartio", laskin.getKappale());
    }

    @Test
    public void konstruktoriAsettaaOikeanPohjanMuodon() {
        assertEquals("neliö", laskin.getPohjanMuoto());
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
    public void pintaAlaOikeinKunKyseessaPyramidi() {
        assertEquals(20.492422502470642, laskin.pyramidiPintaAla(), 1);
    }

    @Test
    public void tilavuusOikeinKunKyseessaPyramidi() {
        assertEquals(5.333333333333333, laskin.pyramidiTilavuus(), 1);
    }

    @Test
    public void pintaAlaMetodiToimiiOikeinKunKyseessaPyramidi() {
        assertEquals("Pinta-ala on 20.492422502470642 neliösenttimetriä.", laskin.pintaAla());
    }

    @Test
    public void tilavuusMetodiToimiiOikeinKunKyseessaPyramidi() {
        assertEquals("Tilavuus on 5.333333333333333 kuutiosenttimetriä.", laskin.tilavuus());
    }

    public void pintaAlaMetodiEiToimiJosKappaleEiOleKartio() {
        LaskinLogiikka laskin = new LaskinLogiikka("aahsjhdhj", "neliö", 3, 4);
        assertEquals("Kappaleen täytyy olla joko lieriö tai kartio ja pohjan muodon joko ympyrä tai neliö.", laskin.pintaAla());
    }

    @Test
    public void tilavuusMetodiEiToimiJosKappaleEiOleKartio() {
        LaskinLogiikka laskin = new LaskinLogiikka("aahsjhdhj", "neliö", 3, 4);
        assertEquals("Kappaleen täytyy olla joko lieriö tai kartio ja pohjan muodon joko ympyrä tai neliö.", laskin.tilavuus());
    }

    @Test
    public void pintaAlaMetodiEiToimiJosPohjanMuotoEiOleNelio() {
        LaskinLogiikka laskin = new LaskinLogiikka("kartio", "fjkfkf", 3, 4);
        assertEquals("Kappaleen täytyy olla joko lieriö tai kartio ja pohjan muodon joko ympyrä tai neliö.", laskin.pintaAla());
    }

    @Test
    public void tilavuusMetodiEiToimiJosPohjanMuotoEiOleNelio() {
        LaskinLogiikka laskin = new LaskinLogiikka("kartio", "fjkfkf", 3, 4);
        assertEquals("Kappaleen täytyy olla joko lieriö tai kartio ja pohjan muodon joko ympyrä tai neliö.", laskin.tilavuus());
    }
}
