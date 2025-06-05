package inlamningsuppgift;


public class InlamningsuppgiftLogik {
    private int totalLines = 0;
    private int totalChar = 0;
    private int totalWords = 0;
    private String longestWord = "";
    private int lengthofLongestWord = 0;
    private String text = "";


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
        if (text.equalsIgnoreCase("stop")) {
            return false;
        }

        this.text = text;
        totalLines++;
        totalChar += text.length();

        if (text.equals(""))
            return true;

        String[] words = text.split(" ");
        for (String word : words) {
            if (word.length() > lengthofLongestWord) {
                lengthofLongestWord = word.length();
                longestWord = word;
            } else if (word.length() == lengthofLongestWord) {
                if (!longestWord.contains(word)) {
                    longestWord += ", " + word;
                }
            }
        }
        totalWords += words.length;
        return true;
    }

    }