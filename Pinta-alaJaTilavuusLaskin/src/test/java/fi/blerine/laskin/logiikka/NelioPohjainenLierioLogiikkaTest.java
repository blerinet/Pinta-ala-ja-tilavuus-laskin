package fi.blerine.laskin.logiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class NelioPohjainenLierioLogiikkaTest {

    NelioPohjainenLierioLogiikka lierio;

    public NelioPohjainenLierioLogiikkaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.lierio = new NelioPohjainenLierioLogiikka(2, 4);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void konstruktoriAsettaaKannanOikein() {
        assertEquals(2.0, lierio.getKanta(), 1);
    }

    @Test
    public void konstruktoriAsettaaKorkeudenOikein() {
        assertEquals(4.0, lierio.getKorkeus(), 1);
    }

    @Test
    public void pohjanAlaOikein() {
        assertEquals(4.0, lierio.pohjanAla(), 1);
    }

    @Test
    public void VaipanAlaOikein() {
        assertEquals(32.0, lierio.vaipanAla(), 1);
    }

    @Test
    public void pintaAlaOikein() {
        assertEquals(40.0, lierio.pintaAla(), 1);
    }

    @Test
    public void tilavuusOikein() {
        assertEquals(16.0, lierio.tilavuus(), 1);
    }
}
