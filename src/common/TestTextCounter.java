package common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTextCounter {

    @Test
    public void testCount1Row() {
        //Arrange
        TextCounter counter = new TextCounter();
        String text = "Det här är min text";

        //Act
        counter.count(text);
        int actual = counter.getRows();
        int expected = 1;

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testCount5Row() {
        //Arrange
        TextCounter counter = new TextCounter();
        String text = "Det här är min text";

        //Act
        counter.count(text);
        counter.count(text);
        counter.count(text);
        counter.count(text);
        counter.count(text);
        int actual = counter.getRows();
        int expected = 5;

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testCount6Letters() {
        //Arrange
        TextCounter counter = new TextCounter();
        String text = "Hejsan";

        //Act
        counter.count(text);
        int actual = counter.getLetters();
        int expected = 6;

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testCount11Letters() {
        //Arrange
        TextCounter counter = new TextCounter();

        //Act
        counter.count("Hejsan");
        counter.count("Hejdå");
        int actual = counter.getLetters();
        int expected = 11;

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testCount3Words() {
        //Arrange
        TextCounter counter = new TextCounter();

        //Act
        counter.count("hejsan svejsan alla");
        int actual = counter.getWords();
        int expected = 3;

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testCount6Words() {
        //Arrange
        TextCounter counter = new TextCounter();

        //Act
        counter.count("hejsan svejsan alla nu kör vi");
        int actual = counter.getWords();
        int expected = 6;

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testIsRunning() {
        //Arrange
        TextCounter counter = new TextCounter();

        //Act
        counter.count("hejsan svejsan alla nu kör vi");
        boolean actual = counter.isRunning();
        boolean expected = true;

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testIsStopped() {
        //Arrange
        TextCounter counter = new TextCounter();

        //Act
        counter.count("hejsan svejsan alla nu kör vi");
        counter.count("stop");
        boolean actual = counter.isRunning();
        boolean expected = false;

        //Assert
        assertEquals(expected, actual);
    }


}
