package N4;

import java.util.ArrayList;

public class Arithmeticlmpl implements Arithmetic {
    @Override
    public double getSum(double number1, double number2) {
        return number1 + number2;
    }

    @Override
    public int getSum(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum = sum + arrayList.get(i);
        }
        return sum;
    }

    @Override
    public Integer[] getCountAndSum(ArrayList<Integer> arrayList) {
        Integer[] integer = new Integer[2];
        int a = 0;
        int sum2 = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > 0) {
                a = a + 1;
            }
        }
        integer[0] = a;
        integer[1] = getSum(arrayList);
        return integer;
    }
}
