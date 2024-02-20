import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MergeSortTest {
    @Test
    public void testSortAscendente() {
        int[] arr = {5, 3, 8, 2, 1, 4};
        MergeSort mergeSort = new MergeSort();
        mergeSort.SortAscendente(arr);
        int[] expected = {1, 2, 3, 4, 5, 8};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSortDescendente() {
        int[] arr = {5, 3, 8, 2, 1, 4};
        MergeSort mergeSort = new MergeSort();
        mergeSort.SortDescendente(arr);
        int[] expected = {8, 5, 4, 3, 2, 1};
        assertArrayEquals(expected, arr);
    }
}
