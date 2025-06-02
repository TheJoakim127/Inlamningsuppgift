package inlamningsuppgift;

public class InlamningsuppgiftLogik {
    private int totalLines = 0;
    private int totalWords = 0;

    public void addWords(String line) {
        totalLines++;
        totalWords += line.length();
    }

    public int getTotalLines() {
        return totalLines;
    }

    public int getTotalWords() {
        return totalWords;
    }
}