package inlamningsuppgift;


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


    public int getTotalLines() {
        return totalLines;
    }

    public int getTotalChar() {
        return totalChar;
    }

    public int getTotalWords(){
        return totalWords;
    }


    public void useText(String text) {
        while (text.toLowerCase() != "stop")
            addWords(text);

        }

    }