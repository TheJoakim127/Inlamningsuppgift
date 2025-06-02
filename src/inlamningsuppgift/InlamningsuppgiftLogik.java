package inlamningsuppgift;

public class InlamningsuppgiftLogik {
    private int totalLines = 0;
    private int totalWords = 0;

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
}