package at.luca.school.squareGame;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Herzlich Willkommen beim Würfelspiel!");
        int mysum = 0;
        int compsum = 0;



        for (int i = 5; i >= 0; i--) {
            System.out.println("Drücken Sie '1' um das Spiel zu starten ");
            Scanner scanner = new Scanner(System.in);
            Random wuerfel = new Random();
            int spielStart = scanner.nextInt();
            if (spielStart == 1) {
                int my = 1 + wuerfel.nextInt(6);
                int comp = 1 + wuerfel.nextInt(6);
                mysum = mysum + my;
                compsum = compsum + comp;
                System.out.println("Du hast die Zahl " + my +" gewürfelt");
                System.out.println("Deine aktuelle Augensumme beträgt " + mysum);
                System.out.println("Der Computer hat die Zahl " + comp + " gewürfelt");
                System.out.println("Die aktuelle Augensumme vom Computer beträgt " + compsum);
                System.out.println("Es verbleiben dir " + i + " Runden");
            }

        }
        if (mysum > compsum) {
            System.out.println("Glückwunsch, du hast gewonnen! :)");
        } else if (mysum == compsum) {
            System.out.println("Es steht unentschieden");
        } else {
            System.out.println("Du hast verloren! Vielleicht klappts beim nächsten mal!");
        }
    }
}
