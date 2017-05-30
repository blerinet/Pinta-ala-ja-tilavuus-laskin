package fi.blerine.laskin.logiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PyramidiLogiikkaTest {

    PyramidiLogiikka pyramidi;

    public PyramidiLogiikkaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.pyramidi = new PyramidiLogiikka(2, 4);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void konstruktoriAsettaaKannanOikein() {
        assertEquals(2.0, pyramidi.getKanta(), 1);
    }

    @Test
    public void konstruktoriAsettaaKorkeudenOikein() {
        assertEquals(4.0, pyramidi.getKorkeus(), 1);
    }

    @Test
    public void sivutahkonKorkeusOikein() {
        assertEquals(4.123105625617661, pyramidi.sivutahkonKorkeus(), 1);
    }

    @Test
    public void pohjanAlaOikein() {
        assertEquals(4.0, pyramidi.pohjanAla(), 1);
    }

    @Test
    public void VaipanAlaOikein() {
        assertEquals(16.492422502470642, pyramidi.vaipanAla(), 1);
    }

    @Test
    public void pintaAlaOikein() {
        assertEquals(20.492422502470642, pyramidi.pintaAla(), 1);
    }

    @Test
    public void tilavuusOikein() {
        assertEquals(5.333333333333333, pyramidi.tilavuus(), 1);
    }
}
