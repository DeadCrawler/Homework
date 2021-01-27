package dev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeviceTest {
    Device dev = new Device(1066, 30, 64, "X86");

    @Test
    public void deviceSaveTest(){
        String[] expected = {"xD", "lul", "kek"};
        dev.save(expected);
        assertArrayEquals(expected, dev.readAll());
    }

    @Test
    public void deviceSaveTest_1(){
        String[] expected = null;
        dev.save(expected);
        Exception exception = new Exception(assertThrows(NullPointerException.class, ()-> dev.save(null)));
        assertEquals("Data array is null", exception.getMessage());
    }

}