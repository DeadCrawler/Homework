package functions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class FuncTest {

    @Test
    @DisplayName("numbOfDayTest")
    void numbOfDay(){
        Func func = new Func();
        assertEquals("mon", func.numbOfDay(1));
        assertEquals(null, func.numbOfDay(10));
    }

    @ParameterizedTest
    @NullAndEmptySource
    @DisplayName("{0} + {1} = {2}")
    @ValueSource(ints = {
            "{0, 0}, {1, 0},   1",
            "{1, 0}, {-1, 0},  2",
            "{0, 1}, {0, -1},  2",
    })
    void add(int[] first, int[] second, double expectedResult){
        Func func = new Func();
        assertEquals(expectedResult, func.dotsDistance(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }
}