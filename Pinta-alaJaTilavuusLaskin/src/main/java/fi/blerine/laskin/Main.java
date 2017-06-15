package fi.blerine.laskin;

import fi.blerine.laskin.logiikka.*;
import fi.blerine.laskin.kayttoliittyma.*;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma();
        SwingUtilities.invokeLater(kayttoliittyma);

    }

}
