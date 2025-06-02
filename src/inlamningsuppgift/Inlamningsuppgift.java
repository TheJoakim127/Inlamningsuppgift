package inlamningsuppgift;

import java.util.Scanner;

public class Inlamningsuppgift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv din text, om du skriver STOP så kommer programmet avslutats:");
        int antalTecken = 0;
        int antalRader = 0;

        while (true) {
            String text = scan.nextLine();

            if (text.equalsIgnoreCase("stop")) {
                break;
            }
            antalTecken += text.length();
            antalRader++;
        }

        System.out.println("Antal rader: " + antalRader);
        System.out.println("Antal tecken: " + antalTecken);

    }
}
