package fi.blerine.laskin.logiikka;

import fi.blerine.laskin.logiikka.LaskinLogiikka;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LaskinLogiikkaTest {

    public LaskinLogiikkaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void konstruktoriAsettaaOikeanKappaleenKunKyseessaLierio() {
        LaskinLogiikka laskin = new LaskinLogiikka("lieriö", 3, 4);
        assertEquals("lieriö", laskin.getKappale());
    }

    @Test
    public void konstruktoriAsettaaOikeanKappaleenKunKyseessaKartio() {
        LaskinLogiikka laskin = new LaskinLogiikka("kartio", 3, 4);
        assertEquals("kartio", laskin.getKappale());
    }

    @Test
    public void konstruktoriAsettaaSateenOikein() {
        LaskinLogiikka laskin = new LaskinLogiikka("lieriö", 3, 4);
        assertEquals(3.0, laskin.getSade(), 1);
    }

    @Test
    public void konstruktoriAsettaaKorkeudenOikein() {
        LaskinLogiikka laskin = new LaskinLogiikka("kartio", 3, 4);
        assertEquals(4.0, laskin.getKorkeus(), 1);
    }

    @Test
    public void pintaAlaOikeinKunKyseessaLierio() {
        LaskinLogiikka laskin = new LaskinLogiikka("lieriö", 3, 4);
        assertEquals(131.9468914507, laskin.lierioPintaAla(), 1);
    }

    @Test
    public void pintaAlaOikeinKunKyseessaKartio() {
        LaskinLogiikka laskin = new LaskinLogiikka("kartio", 3, 4);
        assertEquals(75.3982236861, laskin.kartioPintaAla(), 1);
    }

    @Test
    public void tilavuusOikeinKunKyseessaLierio() {
        LaskinLogiikka laskin = new LaskinLogiikka("lieriö", 3, 4);
        assertEquals(113.0973355292, laskin.lierioTilavuus(), 1);
    }

    @Test
    public void tilavuusOikeinKunKyseessaKartio() {
        LaskinLogiikka laskin = new LaskinLogiikka("kartio", 3, 4);
        assertEquals(37.6991118430, laskin.kartioTilavuus(), 1);
    }
}
