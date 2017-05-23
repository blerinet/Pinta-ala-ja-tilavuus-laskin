package fi.blerine.laskin;

import fi.blerine.laskin.logiikka.YmpyralierioLogiikka;
import java.util.Scanner;

public class Main {

    private static Scanner lukija = new Scanner(System.in);

    public static void main(String[] args) {
        YmpyralierioLogiikka lierio = new YmpyralierioLogiikka(3, 4);
        System.out.println(lierio.pohjanAla());
        System.out.println(lierio.vaipanAla());
        System.out.println(lierio.pintaAla());
        System.out.println(lierio.tilavuus());
    }

}
