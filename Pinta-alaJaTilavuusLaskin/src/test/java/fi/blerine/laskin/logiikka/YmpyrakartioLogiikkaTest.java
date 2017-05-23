package fi.blerine.laskin.logiikka;

import fi.blerine.laskin.logiikka.YmpyrakartioLogiikka;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class YmpyrakartioLogiikkaTest {

    YmpyrakartioLogiikka kartio;

    public YmpyrakartioLogiikkaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        kartio = new YmpyrakartioLogiikka(3, 4);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void konstruktoriAsettaaSateenOikein() {
        assertEquals(3.0, kartio.getSade(), 1);
    }

    @Test
    public void konstruktoriAsettaaKorkeudenOikein() {
        assertEquals(4.0, kartio.getKorkeus(), 1);
    }

    @Test
    public void sivujanaOikein() {
        assertEquals(5.0, kartio.sivujana(), 1);
    }

    @Test
    public void pohjanAlaOikein() {
        assertEquals(28.2743338823, kartio.pohjanAla(), 1);
    }

    @Test
    public void VaipanAlaOikein() {
        assertEquals(47.1238898038, kartio.vaipanAla(), 1);
    }

    @Test
    public void pintaAlaOikein() {
        assertEquals(75.3982236861, kartio.pintaAla(), 1);
    }

    @Test
    public void tilavuusOikein() {
        assertEquals(37.6991118430, kartio.tilavuus(), 1);
    }
}
