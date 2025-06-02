package inlamningsuppgift;

import java.util.Scanner;

public class inlamningsuppgift {
    public static void main(String[] args) {
        System.out.println("Skriv din text, om du skriver STOP så kommer programmet avslutats");
        Scanner scan = new Scanner(System.in);
        InlamningsuppgiftLogik nycounter = new InlamningsuppgiftLogik();

        while (true) {
            String line = scan.nextLine();
            if (line.equalsIgnoreCase("stop")) {
                break;
            }
            nycounter.addWords(line);
        }

        System.out.println(nycounter.getTotalLines());
        System.out.println(nycounter.getTotalWords());

    }
}
