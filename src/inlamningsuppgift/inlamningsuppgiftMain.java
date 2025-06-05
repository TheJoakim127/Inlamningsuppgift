package inlamningsuppgift;


import java.util.Scanner;

public class inlamningsuppgiftMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv din text. när du är klar skriv stop: ");

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
        System.out.println("Programmet är nu avslutat!");
    }
}
