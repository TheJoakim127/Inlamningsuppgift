package inlamningsuppgift;

import java.util.Scanner;

public class InlamningsuppgiftLogik {
    private int totalLines = 0;
    private int totalChar = 0;
    private int totalWords = 0;

    public void addWords(String text) {
        totalLines++;
        totalChar += text.length();
        totalWords += countWords(text);
    }

    public int countWords(String text) {
        String[] words = text.trim().split(" ");
        return words.length;
    }

    public int countLongestWord(String text) {
        String[] words = text.trim().split(" ");
        return words.length;
    }


    public int getTotalLines() {
        return totalLines;
    }

    public int getTotalChar() {
        return totalChar;
    }

    public int getTotalWords(){
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