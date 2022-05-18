import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        int kontostand = 0;
        int price = 2;
        boolean isoff = false;
        System.out.println("Willkommen! Was wollen Sie machen:");
        System.out.println("1. Einzahlen");
        System.out.println("2. Abheben");
        System.out.println("3. Kontostand");
        System.out.println("4. Ausrauben");
        System.out.println("5. Beenden");
        while (!isoff) {
            Scanner scanner = new Scanner(System.in);
            int auswahl = scanner.nextInt();

            if (auswahl == 1) {
                System.out.println("Wie viel Geld möchten Sie einzahla?");
                int einbe = scanner.nextInt();
                kontostand = kontostand + einbe;
                System.out.println("Geld erfolgreich eingezahlt!");
            }
            if (auswahl == 2) {
                System.out.println("Wie viel Geld möchten Sie abheben?");
                int abh = scanner.nextInt();
                System.out.println("Sind Sie sich wirklich sicher?");
                System.out.println("1. Ja");
                System.out.println("2. Nein");
                int confirm = scanner.nextInt();
                if (confirm == 1) {
                    kontostand = kontostand - abh;
                    System.out.println("Hier haben Sie ihr Geld!");
                }
                if (confirm == 2) {
                    System.out.println("Gute Entscheidung!");
                }
            }
            if (auswahl == 3) {
                System.out.println("Ihr Kontostand beträgt " + kontostand + "€");

            }
            if (auswahl == 4) {
                System.out.println("Wollen Sie wirklich den Automaten ausrauben?");
                System.out.println("1 Ja!");
                System.out.println("2 Nein");
                int auswahhl = scanner.nextInt();
                if (auswahhl == 1) {
                    System.out.println("Du bist gescheitert und wurdest verhaftet! Dein Kontostand wird auf 0 zurückgesetzt");
                    kontostand = 0;
                    isoff = true;
                }
                if (auswahhl == 2) {
                    System.out.println("Das war die richtige Entscheidung");
                    kontostand = kontostand - price;
                }
            }
            if (auswahl == 5) {
                System.out.println("Schönen Tag noch!");
                isoff = true;
            }
        }
    }
}
