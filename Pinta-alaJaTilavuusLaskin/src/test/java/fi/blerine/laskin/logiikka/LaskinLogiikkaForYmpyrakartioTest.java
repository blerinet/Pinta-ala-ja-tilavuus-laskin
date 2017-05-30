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
        this.laskin = new LaskinLogiikka("kartio", "ympyrä", 3, 4);
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
    public void pintaAlaOikeinKunKyseessaKartio() {
        assertEquals(75.3982236861, laskin.ympyrakartioPintaAla(), 1);
    }

    @Test
    public void tilavuusOikeinKunKyseessaKartio() {
        assertEquals(37.6991118430, laskin.ympyrakartioTilavuus(), 1);
    }

    @Test
    public void pintaAlaMetodiToimiiOikeinKunKyseessaYmpyrakartio() {
        assertEquals("Pinta-ala on 75.39822368615503 neliösenttimetriä.", laskin.pintaAla());
    }

    @Test
    public void tilavuusMetodiToimiiOikeinKunKyseessaYmpyrakartio() {
        assertEquals("Tilavuus on 37.69911184307752 kuutiosenttimetriä.", laskin.tilavuus());
    }

    public void pintaAlaMetodiEiToimiJosKappaleEiOleKartio() {
        LaskinLogiikka laskin = new LaskinLogiikka("aahsjhdhj", "ympyrä", 3, 4);
        assertEquals("Kappaleen täytyy olla joko lieriö tai kartio ja pohjan muodon joko ympyrä tai neliö.", laskin.pintaAla());
    }

    @Test
    public void tilavuusMetodiEiToimiJosKappaleEiOleKartio() {
        LaskinLogiikka laskin = new LaskinLogiikka("aahsjhdhj", "ympyrä", 3, 4);
        assertEquals("Kappaleen täytyy olla joko lieriö tai kartio ja pohjan muodon joko ympyrä tai neliö.", laskin.tilavuus());
    }

    @Test
    public void pintaAlaMetodiEiToimiJosPohjanMuotoEiOleYmpyra() {
        LaskinLogiikka laskin = new LaskinLogiikka("kartio", "fjkfkf", 3, 4);
        assertEquals("Kappaleen täytyy olla joko lieriö tai kartio ja pohjan muodon joko ympyrä tai neliö.", laskin.pintaAla());
    }

    @Test
    public void tilavuusMetodiEiToimiJosPohjanMuotoEiOleYmpyra() {
        LaskinLogiikka laskin = new LaskinLogiikka("kartio", "fjkfkf", 3, 4);
        assertEquals("Kappaleen täytyy olla joko lieriö tai kartio ja pohjan muodon joko ympyrä tai neliö.", laskin.tilavuus());
    }
}
