import java.util.Scanner;

public class InputOutputData {

    public int[] getArray() {
        return array;
    }

    private int[] array;


    private int typeSort;

    public int getTypeSort() {
        return typeSort;
    }

    public void inputData() {
        Scanner scannner = new Scanner(System.in);
        System.out.println("Enter array size or 0 for exit");
        int arraySize = scannner.nextInt();
        if (arraySize == 0) {
            System.out.println("Thanks for your time. Program closed");
            System.exit(0);
        } else {
            System.out.println("Enter sort type \n 0 Increase sort \n 1 Decrease Sort");
            typeSort = scannner.nextInt();
        }
        array = new int[arraySize];
        System.out.println("Enter elements of array");
        for (int i = 0; i < arraySize; i++) {
            array[i] = scannner.nextInt();
        }
    }
}
