package task2.com.andrii;

public class Sort {
    public int[] delete(int[] array, int deleteElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == deleteElement) {
                array[i] = 0;
            }
        }
        return array;
    }

    public int[] sort(int[] array) {
        boolean isNotSorted = true;
        while (isNotSorted) {
            isNotSorted = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] == 0) {
                    if (array[i] != 0) {
                        array[i - 1] = array[i];
                        array[i] = 0;
                        isNotSorted = true;
                    }
                }
            }
        }
        return array;
    }
}
