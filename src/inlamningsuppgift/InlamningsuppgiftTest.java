package inlamningsuppgift;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class InlamningsuppgiftTest {

    @Test
    public void testLines() {
        InlamningsuppgiftLogik nycounter = new InlamningsuppgiftLogik();
        nycounter.useText("Hello");

        int expected = 1;

        int actual = nycounter.getTotalLines();

        assertEquals(expected, actual);

    }
    @Test
    public void testChar() {
        InlamningsuppgiftLogik nycounter = new InlamningsuppgiftLogik();
        nycounter.useText("Hello");

        int expected = 5;

        int actual = nycounter.getTotalChar();

        assertEquals(expected, actual);

    }

    @Test
    public void teststop() {
        InlamningsuppgiftLogik nycounter = new InlamningsuppgiftLogik();
        nycounter.useText("Hello");
        nycounter.useText("Good day");
        nycounter.useText("Stop");
        int expected = 2;

        int actual = nycounter.getTotalLines();

        assertEquals(expected, actual);

    }

    @Test
    public void testBadSpellingStop() {
        InlamningsuppgiftLogik nycounter = new InlamningsuppgiftLogik();
        nycounter.useText("Hello");
        nycounter.useText("Good day");
        nycounter.useText("Good morning");
        nycounter.useText("sToP");
        int expected = 3;

        int actual = nycounter.getTotalLines();

        assertEquals(expected, actual);

    }

    @Test
    public void testTwoChar() {
        InlamningsuppgiftLogik nycounter = new InlamningsuppgiftLogik();
        nycounter.useText("Hello");
        nycounter.useText("How are you?");

        int expected = 17;

        int actual = nycounter.getTotalChar();

        assertEquals(expected, actual);

    }
    @Test
    public void testTwoLines() {
        InlamningsuppgiftLogik nycounter = new InlamningsuppgiftLogik();
        nycounter.useText("Hello");
        nycounter.useText("How are you?");

        int expected = 2;

        int actual = nycounter.getTotalLines();

        assertEquals(expected, actual);

    }
    @Test
    public void testWords() {
        InlamningsuppgiftLogik nycounter = new InlamningsuppgiftLogik();
        nycounter.useText("Hello");
        nycounter.useText("How are you?");

        int expected = 4;

        int actual = nycounter.getTotalWords();

        assertEquals(expected, actual);

    }
    @Test
    public void testLongestWord() {
        InlamningsuppgiftLogik nycounter = new InlamningsuppgiftLogik();
        nycounter.useText("Hello");
        nycounter.useText("How are you?");
        nycounter.useText("impossible to answer!");

        String expected = "impossible";

        String actual = nycounter.getLongestWord();

        assertEquals(expected, actual);

    }


}
