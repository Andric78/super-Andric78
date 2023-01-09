public class Sort {
    public int[] sortIncrease(int[] array) {
        boolean isNotSorted = true;
        while (isNotSorted) {
            isNotSorted = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int element = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = element;
                    isNotSorted = true;
                }
            }
        }
        for (int j : array) {
            System.out.printf("%d\t", j);
        }
        System.out.println(" \n");
        return array;
    }

    public int[] sortDecrease(int []array) {
        boolean isNotSorted = true;
        while (isNotSorted) {
            isNotSorted = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[i - 1]) {
                    int element = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = element;
                    isNotSorted = true;
                }
            }
        }
        for (int j : array) {
            System.out.printf("%d\t", j);
        }System.out.println(" \n");
        return array;
    }
}
