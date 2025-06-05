package inlamningsuppgift;


import java.util.Scanner;

public class inlamningsuppgift {
    public static void main(String[] args) {
        System.out.println("Skriv din text, och när du är klar skriv Stop: ");
        Scanner scanner = new Scanner(System.in);

        boolean loop;
        InlamningsuppgiftLogik nycounter = new InlamningsuppgiftLogik();
        String text;

        do {
            text = scanner.nextLine();
            loop = nycounter.useText(text);

        } while (loop);

        System.out.println("Antal rader: " + nycounter.getTotalLines());
        System.out.println("Antal tecken: " + nycounter.getTotalChar());
        System.out.println("Antal ord: " + nycounter.getTotalWords());
        System.out.println("Längsta ordet är: " + nycounter.getLongestWord());
    }
}
