package inlamningsuppgift;

import java.util.Scanner;

public class InlamningsuppgiftLogik {
    private int totalLines = 0;
    private int totalWords = 0;
    private int totalChar;
    public void addWords(String text) {
        totalLines++;
        totalWords += text.length();
    }

    public int getTotalLines() {
        return totalLines;
    }

    public int getTotalWords() {
        return totalWords;
    }
    public void useText() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            String text = scan.nextLine();
            if (text.equalsIgnoreCase("stop")) {
                break;
            }
            addWords(text);
        }

    }
}