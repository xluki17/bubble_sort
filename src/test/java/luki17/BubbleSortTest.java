package luki17;
import org.junit.Test;

import static luki17.BubbleSort.sort;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class BubbleSortTest {
    @Test
    public void shouldDoNothingWithEmptyArray() {
        final int[] values = {};

        sort(values);
    }

    @Test
    public void shouldDoNothingWithOneElementArray() {
        int[] values = {42};

        sort(values);

        assertArrayEquals(new int[] {42}, values);
    }

    @Test
    public void shouldSortValues() {
        int[] values = { 9, -3, 5, 0, 1};
        int[] expectedOrder = { -3, 0, 1, 5, 9};

        sort(values);

        assertArrayEquals(expectedOrder, values);
    }
}
