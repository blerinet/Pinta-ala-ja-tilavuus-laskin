package fi.blerine.laskin;

import fi.blerine.laskin.logiikka.*;
import java.util.Scanner;

public class Main {

    private static Scanner lukija = new Scanner(System.in);

    public static void main(String[] args) {
        LaskinLogiikka laskin = new LaskinLogiikka("lieriö", "ympyrä", 3, 4);
        System.out.println(laskin.pintaAla());
        System.out.println(laskin.tilavuus());
 
    }

}
