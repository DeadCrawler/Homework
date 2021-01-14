package arrays;

        import org.junit.jupiter.api.Assertions;
        import org.junit.jupiter.api.Test;

        import static org.junit.jupiter.api.Assertions.*;

class ArrTest {

    Arr arr = new Arr();

    @Test
    public void test_minimalArrayChar_1(){
        int[] actual = arr.minimalArrayChar();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_minimalArrayChar_2(){
        int[] actual = arr.minimalArrayChar()null;
        int expected = NullPointerException;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_arrSelectionSort(){
        int[] actual;
        actual = new int[]{9,8,7,6,5,4,3,2,1};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    }

}