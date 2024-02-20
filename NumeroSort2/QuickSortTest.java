import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class QuickSortTest {
    @Test
    public void testSortAscendente() {
        int[] arr = {5, 3, 8, 2, 1, 4};
        QuickSort quickSort = new QuickSort();
        quickSort.SortAscendente(arr, 0, arr.length-1);
        int[] expected = {1, 2, 3, 4, 5, 8};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSortDescendente(){
        int[] arr = {5, 3, 8, 2, 1, 4};
        QuickSort quickSort = new QuickSort();
        quickSort.SortDescendente(arr, 0, arr.length-1);
        int[] expected = {8, 5, 4, 3, 2, 1};
        assertArrayEquals(expected, arr);
    }
}
