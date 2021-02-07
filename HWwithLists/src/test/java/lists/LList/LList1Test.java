package lists.LList;

import lists.IList;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LList1Test {
    int[] actual = {5, 23, -10, 7};
    IList test = new LList1(actual);



//    @Test
//    private void LListInitTest_1(){
//        int[] actual = {};
//        test = new LList1(actual);
//
//        assertEquals(0, test.size());
//    }

    @Test
    public void LListInitTest_2(){
        String expected = "[5, 23, -10, 7]";
        assertEquals(expected, Arrays.toString(test.toArray()));
    }

    @Test
    public void LListAddTest_1(){
        test.add(10);
        String expected = "[5, 23, -10, 7, 10]";
        assertEquals(expected, Arrays.toString(test.toArray()));
    }

    @Test
    public void LListAddTest_2(){
        Exception exception = new Exception(assertThrows(IllegalArgumentException.class, ()-> test.add(10, 10)));
        assertEquals("java.lang.IllegalArgumentException: Wrong index", exception.getMessage());
    }

    @Test
    public void LListAddTest_3(){
        test.add(2,10);
        String expected = "[5, 23, 10, -10, 7]";
        assertEquals(expected, Arrays.toString(test.toArray()));
    }

    @Test
    public void LListRemoteTest_1_wrongNumber(){
        Exception exception = new Exception(assertThrows(IllegalArgumentException.class, ()->test.remove(6)));
        assertEquals("java.lang.IllegalArgumentException: No such value in list", exception.getMessage());
    }

    @Test
    public void LListRemoteTest_2(){
        test.remove(5);
        test.remove(7);
        String expected = "[23, -10]";
        assertEquals(expected, Arrays.toString(test.toArray()));
    }

    @Test
    public void LListRemoteTest_3(){
        test.remove(23);
        String expected = "[5, -10, 7]";
        assertEquals(expected, Arrays.toString(test.toArray()));
    }

    @Test
    public void LListRemoteTest_4_NoSuchVal(){
        Exception exception = new Exception(assertThrows(IllegalArgumentException.class, ()->test.remove(1243)));
        assertEquals("java.lang.IllegalArgumentException: No such value in list", exception.getMessage());
    }

    @Test
    public void LListContainsTest_1_NoSuchVal(){
        Exception exception = new Exception(assertThrows(IllegalArgumentException.class, ()->test.contains(666)));
        assertEquals("java.lang.IllegalArgumentException: No such value in list", exception.getMessage());
    }

    @Test
    public void LListContainsTest_2(){
        assertEquals(true, test.contains(5));
    }

    @Test
    public void LListContainsTest_3(){
        assertEquals(true, test.contains(7));
    }

    @Test
    public void LListCrushTest(){
        test.add(3,5);
        test.add(0,7);
        test.removeByIndex(4);
        test.remove(7);
        assertEquals("[5, 23, -10, 7]", Arrays.toString(test.toArray()));
    }
}