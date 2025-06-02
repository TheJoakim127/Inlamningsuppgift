package inlamningsuppgift;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class InlamningsuppgiftTest {

    @Test
    public void testLines() {
        InlamningsuppgiftLogik nycounter = new InlamningsuppgiftLogik();
        String text = "hello";
        nycounter.addWords(text);

        int expected = 1;

        int actual = nycounter.getTotalLines();

        assertEquals(expected, actual);

    }
    @Test
    public void testWords() {
        InlamningsuppgiftLogik nycounter = new InlamningsuppgiftLogik();
        String text = "hello";
        nycounter.addWords(text);

        int expected = 5;

        int actual = nycounter.getTotalWords();

        assertEquals(expected, actual);

    }
    @Test
    public void testTwoWords() {
        InlamningsuppgiftLogik nycounter = new InlamningsuppgiftLogik();
        String text = "Hello";
        nycounter.addWords(text);
        String text2 = "How are you";
        nycounter.addWords(text2);

        int expected = 16;

        int actual = nycounter.getTotalWords();

        assertEquals(expected, actual);

    }
    @Test
    public void testTwoLines() {
        InlamningsuppgiftLogik nycounter = new InlamningsuppgiftLogik();
        String text = "Hello";
        nycounter.addWords(text);
        String text2 = "How are you";
        nycounter.addWords(text2);

        int expected = 2;

        int actual = nycounter.getTotalLines();

        assertEquals(expected, actual);

    }


}
