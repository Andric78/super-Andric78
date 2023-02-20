package task2.com.andrii;

import org.junit.Assert;
import org.junit.Test;

public class SortTest {

    Sort sort = new Sort();


    @Test
    public void testsort() {
        int[] result = {55, 0, 22};
        int[] array = {55, 11, 22};
        Assert.assertArrayEquals(result, sort.delete(array, 11));


    }

    @Test
    public void testsort2() {
        int[] result = {55, 22, 0};
        int[] array = {55, 0, 22};
        Assert.assertArrayEquals(result, sort.sort(array));


    }

    @Test
    public void testsort3() {
        int[] result = {0,11, 22};
        int[] array = {55, 11, 22};
        Assert.assertArrayEquals(result, sort.delete(array, 55));


    }

    @Test
    public void testsort4() {
        int[] result = {11, 22, 0};
        int[] array = {0,11, 22};
        Assert.assertArrayEquals(result, sort.sort(array));


    }

}
