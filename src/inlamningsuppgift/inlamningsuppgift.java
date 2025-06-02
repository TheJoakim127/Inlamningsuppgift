package inlamningsuppgift;


import java.util.Scanner;

public class inlamningsuppgift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv din text, om du skriver STOP så kommer programmet avslutats");
        InlamningsuppgiftLogik nycounter = new InlamningsuppgiftLogik();

        nycounter.useText(scan.nextLine());

        System.out.println(nycounter.getTotalLines());
        System.out.println(nycounter.getTotalChar());
        System.out.println(nycounter.getTotalWords());

    }
}
