package inlamningsuppgift;


public class inlamningsuppgift {
    public static void main(String[] args) {
        System.out.println("Skriv din text, om du skriver STOP så kommer programmet avslutats");
        InlamningsuppgiftLogik nycounter = new InlamningsuppgiftLogik();

        nycounter.useText();

        System.out.println(nycounter.getTotalLines());
        System.out.println(nycounter.getTotalWords());

    }
}
