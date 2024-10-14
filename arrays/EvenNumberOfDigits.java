package arrays;

import java.util.ArrayList;
import java.util.List;

public class EvenNumberOfDigits {

    static int countDigit(int num) {
        int count = 0;

        if (num == 0) {
            return 1;
        }

        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    static List<Integer> getEvenDigitNumbers(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (countDigit(arr[i]) % 2 == 0) {
                list.add(arr[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442 };
        System.out.println(getEvenDigitNumbers(arr));
    }
}
