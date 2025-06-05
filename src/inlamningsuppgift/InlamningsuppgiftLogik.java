package inlamningsuppgift;


public class InlamningsuppgiftLogik {
    private int totalLines;
    private int totalChar;
    private int totalWords;
    private String longestWord;

    public InlamningsuppgiftLogik() {
        totalLines = 0;
        totalChar = 0;
        totalWords = 0;
        longestWord = "";
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

    public String getLongestWord() {
        return longestWord;
    }


    public boolean useText(String text) {
        if ("stop".equalsIgnoreCase(text.trim())) {
            return false;
        }

        totalLines++;
        totalChar += text.length();

        String[] words = text.split(" ");
        totalWords += words.length;

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return true;
    }

    }