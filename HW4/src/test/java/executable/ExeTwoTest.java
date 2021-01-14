package executable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExeTwoTest {
    ExeTwo exeTwo = new ExeTwo();

    @Test
    void intToStringTest() {
        int actual = 123;
        String expected = "123";
        assertEquals(expected, exeTwo.intToString(actual));
    }
    @Test
    void intToStringTest_1() {
        int actual = -4008;
        String expected = "-4008";
        assertEquals(expected, exeTwo.intToString(actual));
    }

    @Test
    void realToStringTest() {
        double actual = 40.08;
        String expected = "40.08";
        assertEquals(expected, exeTwo.realToString(actual));
    }
    @Test
    void realToStringTest_1() {
        double actual = -0.4008;
        String expected = "-0.4008";
        assertEquals(expected, exeTwo.realToString(actual));
    }

    @Test
    void stringToIntTest() {
        String actual = "4008";
        int expected = 4008;
        assertEquals(expected, exeTwo.stringToInt(actual));
    }

    @Test
    void stringToIntTest_1() {
        String actual = "-4008";
        int expected = -4008;
        assertEquals(expected, exeTwo.stringToInt(actual));
    }

    @Test
    void stringToIntTest_2() {
        String actual = null;
        Exception exception = new Exception(assertThrows(NullPointerException.class, () -> exeTwo.stringToInt(actual)));
        assertEquals("java.lang.NullPointerException: Cannot invoke \"String.length()\" because \"str\" is null", exception.getMessage());
    }

    @Test
    void stringToDoubleTest() {
        String actual = null;
        Exception exception = new Exception(assertThrows(NullPointerException.class, () -> exeTwo.stringToDouble(actual)));
        assertEquals("java.lang.NullPointerException: Cannot invoke \"String.length()\" because \"str\" is null", exception.getMessage());
    }
    @Test
    void stringToDoubleTest_1() {
        String actual = "-40.08";
        double expected = -40.08;
        assertEquals(expected, exeTwo.stringToDouble(actual));
    }
}