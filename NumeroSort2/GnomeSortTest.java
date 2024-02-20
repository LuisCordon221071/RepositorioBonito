import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class GnomeSortTest {
    @Test
    public void testSortAscendente() {
        int[] arr = {5, 3, 8, 2, 1, 4};
        GnomeSort gnomeSort = new GnomeSort();
        gnomeSort.SortAscendente(arr, arr.length-1);
        int[] expected = {1, 2, 3, 5, 8, 4};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testSortDescendente() {
        int[] arr = {5, 3, 8, 2, 1, 4};
        GnomeSort gnomeSort = new GnomeSort();
        gnomeSort.SortDescendente(arr, arr.length-1);
        int[] expected = {8, 5, 3, 2, 1, 4};
        assertArrayEquals(expected, arr);
    }
}
