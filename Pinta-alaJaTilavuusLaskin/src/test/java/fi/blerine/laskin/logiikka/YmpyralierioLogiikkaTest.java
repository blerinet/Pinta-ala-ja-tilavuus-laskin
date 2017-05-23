package fi.blerine.logiikka;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class YmpyralierioLogiikkaTest {

    YmpyralierioLogiikka lierio;

    public YmpyralierioLogiikkaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        lierio = new YmpyralierioLogiikka(3, 4);
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void konstruktoriAsettaaSateenOikein() {
        assertEquals(3.0, lierio.getSade(), 1);
    }

    @Test
    public void konstruktoriAsettaaKorkeudenOikein() {
        assertEquals(4.0, lierio.getKorkeus(), 1);
    }

    @Test
    public void pohjanAlaOikein() {
        assertEquals(28.2743338823, lierio.pohjanAla(), 1);
    }

    @Test
    public void VaipanAlaOikein() {
        assertEquals(75.3982236861, lierio.vaipanAla(), 1);
    }

    @Test
    public void pintaAlaOikein() {
        assertEquals(131.9468914507, lierio.pintaAla(), 1);
    }

    @Test
    public void tilavuusOikein() {
        assertEquals(113.0973355292, lierio.tilavuus(), 1);
    }
}
