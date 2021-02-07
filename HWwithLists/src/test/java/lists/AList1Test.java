package lists;

import lists.AList.AList1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AList1Test {
    int[] actual = {15, 45, -10, 62, 0, 40};
    IList test = new AList1(actual);

    @Test
    public void clearTest(){
        test.clear();
        assertEquals(0, test.size());
    }



}