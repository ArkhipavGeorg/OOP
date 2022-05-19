package N4;

import java.util.ArrayList;

public interface Arithmetic {
    static int sum2() {
        return 2 + 2;
    }

    static int increase(int number1, int number2) {
        return number1 * number2;
    }

    double getSum(double number1, double number2);
    int getSum(ArrayList<Integer> arrayList);

    default Integer[] getCountAndSum(ArrayList<Integer> arrayList){
        return new Integer[2];
    }


}
