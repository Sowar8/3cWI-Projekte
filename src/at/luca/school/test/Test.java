package at.luca.school.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int caffeesize = 0;
        int caffeestrength = 0;
        int wasserfüllstand = 0;
        int bohnenfüllstand = 0;
        boolean isoff = false;
        boolean status = false;

        System.out.println("Guten Tag, was möchten Sie machen ?");
        System.out.println("1. Einschalten");
        System.out.println("2. Kaffegröße wählen");
        System.out.println("3. Stärke des Kaffes wählen");
        System.out.println("4. Wasser nachfüllen");
        System.out.println("5. Bohnen nachfüllen");
        System.out.println("6. Kaffe rauslassen");
        System.out.println("7. Ausschalten");
        while (!isoff) {
            Scanner scanner = new Scanner(System.in);
            int auswahl = scanner.nextInt();

            if (auswahl == 1) {
                System.out.println("Die Kaffemaschine wurde gestartet");
                status = true;
            }
            if (auswahl == 2) {
                System.out.println("Schreiben Sie die gewünschte Kaffegröße. 40 bis 200 ml möglich.");
                caffeesize = scanner.nextInt();
                System.out.println("Kaffegröße " + caffeesize + "ml wurde gewählt");
            }
            if (auswahl == 3) {
                System.out.println("Wie stark soll der Kaffee sein? 1-10");
                caffeestrength = scanner.nextInt();
                System.out.println("Kaffee mit der Stärke " + caffeestrength + " wurde gewählt");
            }
            if (auswahl == 4) {
                System.out.println("Wasser erfolgreich nach gefüllt!");
                wasserfüllstand = 1000;
                System.out.println("Wasserfüllstand beträgt wieder " + wasserfüllstand + "ml.");
            }
            if (auswahl == 5) {
                System.out.println("Bohnen wurden erfolgreich nachgefüllt!");
                bohnenfüllstand = 100;
                System.out.println("Bohnenfüllstand beträgt wieder " + bohnenfüllstand);
            }
            if (auswahl == 6) {
                if (status == true && wasserfüllstand >= 20 && bohnenfüllstand >= 2) {
                    System.out.println("Kaffe mit "+ caffeesize + "ml wurde rausgelassen");
                    wasserfüllstand = wasserfüllstand - caffeesize;
                    bohnenfüllstand = bohnenfüllstand - caffeestrength;
                } else if (wasserfüllstand <caffeesize) {
                    System.out.println("Bitte zuerst Wasser nachfüllen");
                } else if (bohnenfüllstand <caffeestrength) {
                    System.out.println("Zu wenig Kaffeebohnen. Bitte füllen Sie Kaffebohnen nach!");

                } else if (status == false) {
                    System.out.println("Kaffemaschine wurde nicht eingeschaltet! Anfängerfehler :)");

                }


            }
            if (auswahl == 7) {
                System.out.println("Schönen Tag!");
                isoff = true;
            }
        }
    }
}
