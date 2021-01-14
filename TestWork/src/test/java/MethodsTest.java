import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.opentest4j.AssertionFailedError;

import static org.junit.jupiter.api.Assertions.*;

class MethodsTest {
    Methods methods = new Methods();

    @Test
    void bubbleSort_1(){
        String expected = "[1, 2, 3, 4, 5, 6, 7, 8, 9]";
        int[] actual = {9,8,7,6,5,4,3,2,1};
        assertNotNull(actual);
        assertEquals(expected, methods.bubbleSort(actual));
    }

    @Test
    void bubbleSort_2(){
        String expected = "[0, 0, 0, 0, 0, 0, 0, 0, 0]";
        int[] actual = {0,0,0,0,0,0,0,0,0};
        assertNotNull(actual);
        assertEquals(expected, methods.bubbleSort(actual));
    }
    @Test()
    void bubbleSort_3(){
        int[] actual = null;
        Exception exception = new Exception(assertThrows(NullPointerException.class, () -> methods.bubbleSort(actual)));
        assertEquals("java.lang.NullPointerException: Cannot read the array length because \"arr\" is null", exception.getMessage());
    }
    @Test
    void binarySort_1(){
        int[] actual = {1,2,3,4,5};
        int expected = 1;
        assertEquals(expected, methods.binarySearch(actual, 2));
    }

    @Test
    void binarySort_2(){
        int[] actual = {1,5,3,4,5};
        int expected = -1;
        assertEquals(expected, methods.binarySearch(actual, 2));
    }
    @Test
    void binarySort_3(){
        int[] actual = null;
        Exception exception = new Exception(assertThrows(NullPointerException.class, () -> methods.binarySearch(actual, 1)));
        assertEquals("java.lang.NullPointerException: Cannot read the array length because \"arr\" is null", exception.getMessage());
    }
    @Test
    void binarySort_4() {
        int[] actual = {1, 3, 10, 25, 11};
        int expected = -1;
        assertEquals(expected, methods.binarySearch(actual, 2));
    }
    @Test
    void binarySort_5() {
        int[] actual = {3, 5, 10, 15};
        int expected = 1;
        assertEquals(expected, methods.binarySearch(actual, 6));
    }
    @Test
    void isAllBitsSelected(){
        byte[] actual = {1, 2, 3};
        boolean expected = false;
        assertEquals(expected, methods.isAllBitsSelected(1, actual));
    }
    @Test
    void isAllBitsSelected_1(){
        byte[] actual = {1, 2, 4};
        boolean expected = false;
        assertEquals(expected, methods.isAllBitsSelected(123, actual));
    }
    @Test
    void isAnyBitSelected(){
        byte[] actual = {1, 2, 4};
        boolean expected = true;
        assertEquals(expected, methods.isAnyBitSelected(123, actual));
    }
    @Test
    void isAnyBitSelected_1(){
        byte[] actual = {1, 2, 4};
        boolean expected = false;
        assertEquals(expected, methods.isAnyBitSelected(1, actual));
    }
    @Test
    void selectAnyBitSelected(){
        byte[] actual = {1, 2, 4};
        String expected = "1110010";
        assertEquals(expected, methods.selectAnyBitSelected(66, actual));
    }
    @Test
    void selectAnyBitSelected_1(){
        byte[] actual = {0, 3, 7};
        String expected = "1001010";
        assertEquals(expected, methods.selectAnyBitSelected(2, actual));
    }
    @Test
    void deselectAnyBitSelected(){
        byte[] actual = {1, 2, 4};
        String expected = "1000010";
        assertEquals(expected, methods.deselectAnyBitSelected(66, actual));
    }
    @Test
    void deselectAnyBitSelected_1(){
        byte[] actual = {0, 3, 7};
        String expected = "0000010";
        assertEquals(expected, methods.deselectAnyBitSelected(2, actual));
    }
}