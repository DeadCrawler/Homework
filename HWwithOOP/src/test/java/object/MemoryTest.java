package object;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemoryTest {
    Memory mem = new Memory(new String[] {"Ylyl", "xD", "kek", "lol"});
//    Memory mem1 = new Memory(null);

    @Test
    public void memoryTest_getInfo(){
        MemoryObject memoryObject = mem.getMemoryInfo();
        assertEquals("MemoryObject{numOfFreeCells=10, percentOfUsage=28}", memoryObject.toString());
    }

    @Test
    public void memoryTest_add(){
        String actual = "kek";
        mem.save(actual);
        assertEquals("kek", mem.readLast());
    }

    @Test
    public void memoryTest_readNull(){
        mem = new Memory(null);
        Exception exception = new Exception(assertThrows(NullPointerException.class, ()->mem.readLast()));
        assertEquals("java.lang.NullPointerException: Cannot load from object array because \"this.memoryCell\" is null", exception.getMessage());
//        mem1.readLast();
    }

    @Test
    public void memoryTest_read(){
        assertEquals("lol", mem.readLast());
    }

    @Test
    public void stackOverTest(){
        String actual = " ";
        for(int i = 0; i<15;i++){
            mem.save(actual);
        }
        assertEquals(false, mem.save("xD"));
    }

    @Test
    public void removeLastTest(){

        assertEquals("Element #3 is null",         mem.removeLast());
    }

    @Test
    public void removeLastTest_2(){
        for(int i = 0; i<10; i++){
            mem.removeLast();
        }
        assertEquals("There is nothing to remove", mem.removeLast());
    }

    @Test
    public void crushTest_1(){
        for(int i = 0; i<10; i++){
            mem.removeLast();
        }
        String actual = "";
        for(int i = 0; i<15;i++){
            mem.save(actual);
        }
        MemoryObject memoryObject = mem.getMemoryInfo();
        assertEquals("MemoryObject{numOfFreeCells=0, percentOfUsage=0} The number of used cells is 14, no memory cells left to use", memoryObject.toString());
    }

}