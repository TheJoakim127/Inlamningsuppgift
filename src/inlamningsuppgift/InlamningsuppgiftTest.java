package inlamningsuppgift;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class InlamningsuppgiftTest {

    @Test
    public void testLines() {
        InlamningsuppgiftLogik nycounter = new InlamningsuppgiftLogik();
        String text = "Hello";
        nycounter.useText(text);

        int expected = 1;

        int actual = nycounter.getTotalLines();

        assertEquals(expected, actual);

    }
    @Test
    public void testChar() {
        InlamningsuppgiftLogik nycounter = new InlamningsuppgiftLogik();
        String text = "Hello";
        nycounter.useText(text);

        int expected = 5;

        int actual = nycounter.getTotalChar();

        assertEquals(expected, actual);

    }
    @Test
    public void testTwoChar() {
        InlamningsuppgiftLogik nycounter = new InlamningsuppgiftLogik();
        String text = "Hello";
        nycounter.useText(text);
        String text2 = "How are you?";
        nycounter.useText(text2);

        int expected = 17;

        int actual = nycounter.getTotalChar();

        assertEquals(expected, actual);

    }
    @Test
    public void testTwoLines() {
        InlamningsuppgiftLogik nycounter = new InlamningsuppgiftLogik();
        String text = "Hello";
        nycounter.useText(text);
        String text2 = "How are you?";
        nycounter.useText(text2);

        int expected = 2;

        int actual = nycounter.getTotalLines();

        assertEquals(expected, actual);

    }
    @Test
    public void testWords() {
        InlamningsuppgiftLogik nycounter = new InlamningsuppgiftLogik();
        String text = "Hello";
        nycounter.useText(text);
        String text2 = "How are you?";
        nycounter.useText(text2);

        int expected = 4;

        int actual = nycounter.getTotalWords();

        assertEquals(expected, actual);

    }
    @Test
    public void testLongestWord() {
        InlamningsuppgiftLogik nycounter = new InlamningsuppgiftLogik();
        String text = "Hello";
        nycounter.useText(text);
        String text2 = "How are you?";
        nycounter.useText(text2);
        String text3 = "impossible to answer!";
        nycounter.useText(text3);

        String expected = "impossible";

        String actual = nycounter.getLongestWord();

        assertEquals(expected, actual);

    }

}
