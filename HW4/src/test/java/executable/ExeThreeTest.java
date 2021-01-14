package executable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExeThreeTest {
    ExeThree exeThree = new ExeThree();

    @Test
    void stringToLength() {
        String actual = "В методах indexOf параметры типа char";
        int expected = 1;
        assertEquals(expected, exeThree.stringToLength(actual));
    }
    @Test
    void stringToLength_1() {
        String actual = "методах indexOf параметры типа char";
        int expected = 4;
        assertEquals(expected, exeThree.stringToLength(actual));
    }
    @Test
    void stringToLength_2() {
        String actual = "null";
        int expected = 4;
        assertEquals(expected, exeThree.stringToLength(actual));
    }
    @Test
    void stringToLength_3() {
        String actual = null;
        Exception exception = new Exception(assertThrows(NullPointerException.class, () -> exeThree.stringToLength(actual)));
        assertEquals("java.lang.NullPointerException: Cannot invoke \"String.length()\" because \"str\" is null", exception.getMessage());
    }
//    @Test
//    void makeMoneyFromWords(){
//        String[] actual = {"cat","car","man","git", "robot"};
//        String expected = "[$$$, $$$, $$$, $$$, robot]";
//        assertEquals(expected, exeThree.makeMoneyFromWords(actual, 3));
//    }
    @Test
    void jumpIfSeeComa(){
        String actual = "int,boolean,Object,String,etc";
        String expected = "int, boolean, Object, String, etc";
        assertEquals(expected, exeThree.jumpIfSeeComa(actual));
    }
    @Test
    void jumpIfSeeComa_1(){
        String actual = "int";
        String expected = "int";
        assertEquals(expected, exeThree.jumpIfSeeComa(actual));
    }
    @Test
    void jumpIfSeeComa_2(){
        String actual = null;
        Exception exception = new Exception(assertThrows(NullPointerException.class, () -> exeThree.jumpIfSeeComa(actual)));
        assertEquals("java.lang.NullPointerException: Cannot invoke \"String.length()\" because \"str\" is null", exception.getMessage());
    }
    @Test
    void noDuplicateTest(){
        String actual = "abcdabcdefg";
        String expected = "abcdefg";
        assertEquals(expected, exeThree.noDuplicate(actual));
    }
    @Test
    void noDuplicateTest_1(){
        String actual = "aabbcc";
        String expected = "abc";
        assertEquals(expected, exeThree.noDuplicate(actual));
    }
    @Test
    void noDuplicateTest_2(){
        String actual = "a b c";
        String expected = "a bc";
        assertEquals(expected, exeThree.noDuplicate(actual));
    }
    @Test
    void noDuplicateTest_3(){
        String actual = null;
        Exception exception = new Exception(assertThrows(NullPointerException.class, () -> exeThree.noDuplicate(actual)));
        assertEquals("java.lang.NullPointerException: Cannot invoke \"String.length()\" because \"str\" is null", exception.getMessage());
    }
    @Test
    void wordCounterTest(){
        String actual = "a b c";
        int expected = 3;
        assertEquals(expected, exeThree.wordCounter(actual));
    }
    @Test
    void wordCounterTest_1(){
        String actual = "a b c e f g";
        int expected = 6;
        assertEquals(expected, exeThree.wordCounter(actual));
    }
    @Test
    void wordCounterTest_2(){
        String actual = null;
        Exception exception = new Exception(assertThrows(NullPointerException.class, () -> exeThree.wordCounter(actual)));
        assertEquals("java.lang.NullPointerException: Cannot invoke \"String.length()\" because \"str\" is null", exception.getMessage());
    }
    @Test
    void cutTheCordTest(){
        String actual = "возвращает измененный вид типа StringBuilder, удаляя все символы от и до указанных индексов.";
        String expected = "возвращает";
        assertEquals(expected, exeThree.cutTheCord(actual, 10, actual.length()));
    }
    @Test
    void cutTheCordTest_1(){
        String actual = "возвращает измененный вид типа StringBuilder, удаляя все символы от и до указанных индексов.";
        String expected = null;
        assertEquals(expected, exeThree.cutTheCord(actual, 29, 10));
    }
    @Test
    void cutTheCordTest_2(){
        String actual = "возвращает измененный вид типа StringBuilder, удаляя все символы от и до указанных индексов.";
        String expected = null;
        assertEquals(expected, exeThree.cutTheCord(actual, 129, 130));
    }
}