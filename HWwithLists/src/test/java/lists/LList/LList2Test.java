package lists.LList;

import lists.IList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LList2Test {

    IList test;


    @BeforeEach
    public void setUp() {
        int[] ar = {10, 14, 125, -34, 0, 54};
        test = new LList2(ar);
    }

    @Test
    public void addByIndexTest(){
        test.add(1, -10);
        assertArrayEquals(new int[]{10 ,-10, 14, 125, -34, 0, 54}, test.toArray());
    }

    @Test
    public void addByIndexTest_1(){
        test.add(0, -10);
        assertArrayEquals(new int[]{-10 ,10, 14, 125, -34, 0, 54}, test.toArray());
    }

    @Test
    public void crushTest(){
        test.add(5, 125);
        test.removeByIndex(5);
        test.remove(10);
        test.remove(54);
        test.add(-666);
        assertArrayEquals(new int[]{14, 125, -34, 0, -666}, test.toArray());
    }

    @Test
    public void initTest(){
        test.print();
    }

    @Test
    public void removeFakeNumberTest(){
        Exception exception = new Exception(assertThrows(IllegalArgumentException.class, ()->test.remove(15)));
        assertEquals("java.lang.IllegalArgumentException: No such value", exception.getMessage());
    }

    @Test
    public void removeMultipleTest(){
        test.removeByIndex(2);
        test.remove(54);
        test.removeByIndex(0);
        test.print();
        assertArrayEquals(new int[] {14, -34, 0}, test.toArray());
    }

    @Test
    public void addAndRemoveTest(){
        test.remove(10);
        test.add(4, 34);
        test.add(0, -10);
        test.removeByIndex(1);
        test.add(666);
        assertArrayEquals(new int[]{-10, 125, -34, 0, 34, 54, 666}, test.toArray());
    }

    @Test
    public void clearTest(){
        test.clear();
        Exception exception = new Exception(assertThrows(NullPointerException.class, ()->test.toArray()));
        assertEquals("java.lang.NullPointerException: List is null", exception.getMessage());
    }

    @Test
    public void sizeTest(){
        assertEquals(6 ,test.size());
    }

    @Test
    public void zeroSizeTest(){
        test.clear();
        assertEquals(0, test.size());
    }

    @Test
    public void getTest(){
        assertEquals(0, test.get(4));
    }

    @Test
    public void getNothingTest(){
        Exception exception = new Exception(assertThrows(IllegalArgumentException.class, ()->test.get(-666)));
        assertEquals("java.lang.IllegalArgumentException: Wrong index", exception.getMessage());
    }

    @Test
    public void containsTest(){
        assertTrue(test.contains(10));
    }

    @Test
    public void containsNotTest(){
        assertFalse(test.contains(-666));
    }

    @Test
    public void setTest(){
        test.set(4, -666);
        test.print();
        assertArrayEquals(new int[]{10, 14, 125, -34, -666, 54}, test.toArray());
    }



}