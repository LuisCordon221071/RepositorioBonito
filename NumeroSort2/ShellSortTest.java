import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ShellSortTest {

    @Test
    public void testSortAscendente() {
        int[] arr = {5, 3, 8, 2, 1, 4};
        ShellSort shellSort = new ShellSort();
        shellSort.SortAscendente(arr, arr.length);
        int[] expected = {1, 2, 3, 4, 5, 8};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSortDescendente() {
        int[] arr = {5, 3, 8, 2, 1, 4};
        ShellSort shellSort = new ShellSort();
        shellSort.SortDescendente(arr, arr.length);
        int[] expected = {8, 5, 4, 3, 2, 1};
        assertArrayEquals(expected, arr);
    }
}
