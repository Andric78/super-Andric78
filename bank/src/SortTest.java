import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortTest {
    int[] array;
    int[] array2;
    Sort sort = new Sort();

    @Before
    public void setUp() {
        array = new int[]{5, 11, 22};
        array2 = new int[]{45, 5, 30};

    }

    @Test
    public void testsortIncrease() {
        int[] result = {5, 11, 22};
        int[] result2 = {5, 30, 45};
        Assert.assertArrayEquals(result, sort.sortIncrease(array));
        Assert.assertArrayEquals(result2, sort.sortIncrease(array2));


    }
    @Test
    public void testsortDecrease() {
        int[] result3 = {22, 11, 5};
        int[] result4 = {45, 30, 5};
        Assert.assertArrayEquals(result3, sort.sortDecrease(array));
        Assert.assertArrayEquals(result4, sort.sortDecrease(array2));


    }
}
