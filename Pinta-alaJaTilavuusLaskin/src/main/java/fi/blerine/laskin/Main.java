package fi.blerine.laskin;

import fi.blerine.laskin.logiikka.*;
import fi.blerine.laskin.kayttoliittyma.*;
import java.util.Scanner;
import javax.swing.SwingUtilities;

public class Main {

    private static Scanner lukija = new Scanner(System.in);

    public static void main(String[] args) {
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma();
        SwingUtilities.invokeLater(kayttoliittyma);

    }

}
