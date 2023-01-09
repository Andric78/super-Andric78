
public class Main {
    public static void main(String[] args) {

        InputOutputData in = new InputOutputData();
        Sort sort = new Sort();
        boolean exit=true;
        while (exit) {
            in.inputData();
            if (in.getTypeSort() == 0) {
                sort.sortIncrease(in.getArray());
            } else {
                sort.sortDecrease(in.getArray());
            }
        }
    }
}
