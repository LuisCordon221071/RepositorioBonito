import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SelectionSortTest {
    @Test
    public void testSortAscendente() {
        int[] arr = {5, 3, 8, 2, 1, 4};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.SortAscendente(arr);
        int[] expected = {1, 2, 3, 4, 5, 8};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSortDescendente() {
        int[] arr = {5, 3, 8, 2, 1, 4};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.SortDescendente(arr);
        int[] expected = {8, 5, 4, 3, 2, 1};
        assertArrayEquals(expected, arr);
    }
}
