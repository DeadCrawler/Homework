package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrTest {
    Arr arr = new Arr();

    @Test
    void minimalArrayCharTest() {
        int[] actual = {24, 15, 148, 42, 32, 7};
        int expected = 7;
        assertEquals(expected, arr.minimalArrayChar(actual));
    }
    @Test
    void minimalArrayCharTest_1() {
        int[] actual = {24, 15, -3, 42, 0, 7};
        int expected = -3;
        assertEquals(expected, arr.minimalArrayChar(actual));
    }
    @Test
    void minimalArrayCharTest_2() {
        int[] actual = {0,0,0,0,0};
        int expected = 0;
        assertEquals(expected, arr.minimalArrayChar(actual));
    }
    @Test
    void minimalArrayCharTest_3() {
        int[] actual = null;
        Exception exception = new Exception(assertThrows(NullPointerException.class, () -> arr.minimalArrayChar(actual)));
        assertEquals("java.lang.NullPointerException: Cannot load from int array because \"arr\" is null", exception.getMessage());
    }
//////////////////////////////////////////////////////////////////
    @Test
    void maximalArrayCharTest() {
        int[] actual = {24, 15, 148, 42, 32, 7};
        int expected = 148;
        assertEquals(expected, arr.maximalArrayChar(actual));
    }
    @Test
    void maximalArrayCharTest_1() {
        int[] actual = {-24, -15, -148, -42, -32, -7};
        int expected = -7;
        assertEquals(expected, arr.maximalArrayChar(actual));
    }
    @Test
    void maximalArrayCharTest_2() {
        int[] actual = null;
        Exception exception = new Exception(assertThrows(NullPointerException.class, () -> arr.maximalArrayChar(actual)));
        assertEquals("java.lang.NullPointerException: Cannot load from int array because \"arr\" is null", exception.getMessage());
    }
///////////////////////////////////////////////////////////////////
    @Test
    void idMinimalArrayCharTest() {
        int[] actual = {24, 15, 148, 42, 32, 7};
        int expected = 5;
        assertEquals(expected, arr.idMinimalArrayChar(actual));
    }
    @Test
    void idMinimalArrayCharTest_1() {
        int[] actual = {-24, -15, -148, -42, -32, -7};
        int expected = 2;
        assertEquals(expected, arr.idMinimalArrayChar(actual));
    }
    @Test
    void idMinimalArrayCharTest_2() {
        int[] actual = null;
        Exception exception = new Exception(assertThrows(NullPointerException.class, () -> arr.idMinimalArrayChar(actual)));
        assertEquals("java.lang.NullPointerException: Cannot load from int array because \"arr\" is null", exception.getMessage());
    }
//////////////////////////////////////////////////////////////////////
    @Test
    void idMaximalArrayCharTest() {
        int[] actual = {24, 15, 148, 42, 32, 7};
        int expected = 2;
        assertEquals(expected, arr.idMaximalArrayChar(actual));
    }
    @Test
    void idMaximalArrayCharTest_1() {
        int[] actual = {-24, -15, -148, -42, -32, -7};
        int expected = 5;
        assertEquals(expected, arr.idMaximalArrayChar(actual));
    }
    @Test
    void idMaximalArrayCharTest_2(){
        int[] actual = null;
        Exception exception = new Exception(assertThrows(NullPointerException.class, () -> arr.idMaximalArrayChar(actual)));
        assertEquals("java.lang.NullPointerException: Cannot load from int array because \"arr\" is null", exception.getMessage());
    }
///////////////////////////////////////////////////////////////////////
    @Test
    void countOfOddTest() {
        int[] actual = {24, 15, 148, 42, 32, 7};
        int expected = 64;
        assertEquals(expected, arr.countOfOdd(actual));
    }
    @Test
    void countOfOddTest_1() {
        int[] actual = {-24, -15, -148, -42, -32, -7};
        int expected = -64;
        assertEquals(expected, arr.countOfOdd(actual));
    }
    @Test
    void countOfOddTest_2() {
        int[] actual = null;
        Exception exception = new Exception(assertThrows(NullPointerException.class, () -> arr.countOfOdd(actual)));
        assertEquals("java.lang.NullPointerException: Cannot read the array length because \"arr\" is null", exception.getMessage());
    }
//////////////////////////////////////////////////////////////////////////////////
    @Test
    void yarrA_Test() {
        int[] actual = {24, 15, 148, 42, 32, 7};
        String expected = "[7, 32, 42, 148, 15, 24]";
        assertEquals(expected, arr.yarrA(actual));
    }
    @Test
    void yarrA_Test_1() {
        int[] actual = {-24, -15, -148, -42, -32, -7};
        String expected = "[-7, -32, -42, -148, -15, -24]";
        assertEquals(expected, arr.yarrA(actual));
    }
    @Test
    void yarrA_Test_2() {
        int[] actual = null;
        Exception exception = new Exception(assertThrows(NullPointerException.class, () -> arr.yarrA(actual)));
        assertEquals("java.lang.NullPointerException: Cannot read the array length because \"arr\" is null", exception.getMessage());
    }
//////////////////////////////////////////////////////////////////
    @Test
    void countOfNumOfOdd_Test() {
        int[] actual = {24, 15, 148, 42, 32, 7};
        int expected = 2;
        assertEquals(expected, arr.countOfNumOfOdd(actual));
    }
    @Test
    void countOfNumOfOdd_Test_1() {
        int[] actual = {-24, -15, -148, -42, -32, -7, 241, 325};
        int expected = 4;
        assertEquals(expected, arr.countOfNumOfOdd(actual));
    }
    @Test
    void countOfNumOfOdd_Test_2() {
        int[] actual = null;
        Exception exception = new Exception(assertThrows(NullPointerException.class, () -> arr.countOfNumOfOdd(actual)));
        assertEquals("java.lang.NullPointerException: Cannot read the array length because \"arr\" is null", exception.getMessage());
    }
//////////////////////////////////////////////////////////////////////////////
    @Test
    void ayrAr_Test() {
        int[] actual = {24, 15, 148, 42, 32, 7};
        String expected = "[42, 32, 7, 24, 15, 148]";
        assertEquals(expected, arr.ayrAr(actual));
    }
    @Test
    void ayrAr_Test_1() {
        int[] actual = {24, 15, 148, 42, 32};
        String expected = "[42, 32, 148, 24, 15]";
        assertEquals(expected, arr.ayrAr(actual));
    }
    @Test
    void ayrAr_Test_2() {
        int[] actual = null;
        Exception exception = new Exception(assertThrows(NullPointerException.class, () -> arr.ayrAr(actual)));
        assertEquals("java.lang.NullPointerException: Cannot read the array length because \"arr\" is null", exception.getMessage());
    }
///////////////////////////////////////////////////////////////////////////
    @Test
    void arrBubbleSort() {

    }

    @Test
    void arrSelectionSort() {
    }

    @Test
    void arrInsertSort() {
    }
}