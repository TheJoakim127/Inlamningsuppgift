package inlamningsuppgift;


import java.util.Scanner;

public class inlamningsuppgiftMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv din text. när du är klar skriv \"stop\" ");

        boolean loop;
        InlamningsuppgiftLogik nycounter = new InlamningsuppgiftLogik();
        String text;

        do {
            text = scanner.nextLine();
            loop = nycounter.useText(text);

        } while (loop);

        System.out.println("Antal rader: "+nycounter.getTotalLines()+"\n"+"Antal tecken: "+nycounter.getTotalChar()+"\n"+"Antal ord: "+nycounter.getTotalWords()+"\n"+"Längsta ordet är: "+nycounter.getLongestWord()+"\n"+"Programmet är nu avslutat!");
    }
}
