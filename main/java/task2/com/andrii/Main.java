package task2.com.andrii;

public class Main {
    public static void main(String[] args) {
        Sort sort=new Sort();
        InputOutputData in=new InputOutputData();
        while (true) {
            in.inputData();
            sort.delete(in.getArray(), in.getDeleteElement());
            sort.sort(in.getArray());
            for (int k : in.getArray()
            ) {
                System.out.printf("%d\t", k);
            }

        }
    }
}