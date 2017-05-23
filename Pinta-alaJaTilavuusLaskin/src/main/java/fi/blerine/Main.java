
package fi.blerine;
import fi.blerine.logiikka.*;
import java.util.Scanner;


public class Main {
    private static Scanner lukija = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Mikä kappale? (lieriö vai kartio)" );
        String kappale = lukija.nextLine();
        System.out.println("Kappaleen säde senttimetreinä? ");
        double sade = lukija.nextDouble();
        System.out.println("Kappaleen korkeus senttimetreinä? ");
        double korkeus = lukija.nextDouble();
        LaskinLogiikka laskin = new LaskinLogiikka(kappale, sade, korkeus);
        laskin.pintaAla();
  
    }
    
}
