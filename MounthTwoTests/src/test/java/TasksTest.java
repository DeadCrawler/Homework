import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TasksTest {
    Tasks tasks;

    @BeforeEach
    public void startUp(){
        tasks = new Tasks();
    }


    static Stream<Arguments> sortTestProvider(){
        return Stream.of(
                Arguments.arguments(new int[]{1, 5, 7, 6, 3, 2, 10}, new int[]{1, 2, 3, 5, 6, 7, 10}),
                Arguments.arguments(new int[]{54, -21, -139, 9, 19}, new int[]{-139, -21, 9, 19, 54}),
                Arguments.arguments(new int[]{0}, new int[]{0})
        );
    }

    static Stream<Arguments> reverseTestProvider(){
        return Stream.of(
                Arguments.arguments(new int[]{1, 5, 7, 6, 3, 2, 10}, new int[]{10, 2, 3, 6, 7, 5, 1}),
                Arguments.arguments(new int[]{54, -21, -139, 9, 19}, new int[]{19, 9, -139, -21, 54}),
                Arguments.arguments(new int[]{0}, new int[]{0})
        );
    }

    @ParameterizedTest
    @MethodSource("sortTestProvider")
    public void quickSortTest(int[] actual, int[] expected){
        assertNotNull(tasks.quickSort(actual));
        assertArrayEquals(expected, tasks.quickSort(actual));
    }


    @ParameterizedTest
    @MethodSource("sortTestProvider")
    public void treeSortTest(int[] actual, int[] expected){
        assertNotNull(tasks.treeSort(actual));
        assertArrayEquals(expected, tasks.treeSort(actual));
    }

    @ParameterizedTest
    @MethodSource("sortTestProvider")
    public void linkedListTwoSidedSortTest(int[] actual, int[] expected){
        assertNotNull(tasks.linkedListTwoSided(actual));
        assertArrayEquals(expected, tasks.linkedListTwoSided(actual));
    }

    @ParameterizedTest
    @MethodSource("sortTestProvider")
    public void linkedListOneSidedTest(int[] actual, int[] expected){
//        assertNotNull(tasks.linkedListSingle(actual));
        assertArrayEquals(expected, tasks.linkedListSingle(actual));
    }

    @ParameterizedTest
    @MethodSource("reverseTestProvider")
    public void linkedListReverseTwoSidedTest(int[] actual, int[] expected){
        assertNotNull(tasks.linkedListReverseTwoSided(actual));
        assertArrayEquals(expected, tasks.linkedListReverseTwoSided(actual));
    }

    @ParameterizedTest
    @MethodSource("reverseTestProvider")
    public void linkedListReverseOneSided(int[] actual, int[] expected){
        assertNotNull(tasks.linkedListReverseOneSided(actual));
        assertArrayEquals(expected, tasks.linkedListReverseOneSided(actual));
    }





}