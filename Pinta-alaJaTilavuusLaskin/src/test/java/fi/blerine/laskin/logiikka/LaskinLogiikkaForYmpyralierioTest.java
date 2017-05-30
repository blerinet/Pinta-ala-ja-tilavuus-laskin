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
    public void pintaAlaOikeinKunKyseessaLierio() {
        assertEquals(131.9468914507, laskin.ympyralierioPintaAla(), 1);
    }

    @Test
    public void tilavuusOikeinKunKyseessaLierio() {
        assertEquals(113.0973355292, laskin.ympyralierioTilavuus(), 1);
    }

    @Test
    public void pintaAlaMetodiToimiiOikeinKunKyseessaYmpyralierio() {
        assertEquals("Pinta-ala on 131.94689145077132 neliösenttimetriä.", laskin.pintaAla());
    }

    @Test
    public void tilavuusMetodiToimiiOikeinKunKyseessaYmpyralierio() {
        assertEquals("Tilavuus on 113.09733552923255 kuutiosenttimetriä.", laskin.tilavuus());
    }

    @Test
    public void pintaAlaMetodiEiToimiJosKappaleEiOleLierio() {
        LaskinLogiikka laskin = new LaskinLogiikka("aahsjhdhj", "ympyrä", 3, 4);
        assertEquals("Kappaleen täytyy olla joko lieriö tai kartio ja pohjan muodon joko ympyrä tai neliö.", laskin.pintaAla());
    }

    @Test
    public void tilavuusMetodiEiToimiJosKappaleEiOleLierio() {
        LaskinLogiikka laskin = new LaskinLogiikka("aahsjhdhj", "ympyrä", 3, 4);
        assertEquals("Kappaleen täytyy olla joko lieriö tai kartio ja pohjan muodon joko ympyrä tai neliö.", laskin.tilavuus());
    }

    @Test
    public void pintaAlaMetodiEiToimiJosPohjanMuotoEiOleYmpyra() {
        LaskinLogiikka laskin = new LaskinLogiikka("lieriö", "fjkfkf", 3, 4);
        assertEquals("Kappaleen täytyy olla joko lieriö tai kartio ja pohjan muodon joko ympyrä tai neliö.", laskin.pintaAla());
    }

    @Test
    public void tilavuusMetodiEiToimiJosPohjanMuotoEiOleYmpyra() {
        LaskinLogiikka laskin = new LaskinLogiikka("lieriö", "fjkfkf", 3, 4);
        assertEquals("Kappaleen täytyy olla joko lieriö tai kartio ja pohjan muodon joko ympyrä tai neliö.", laskin.tilavuus());
    }
}
