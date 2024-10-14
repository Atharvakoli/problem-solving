package arrays;

import java.util.*;

public class PCS {

    // Navie approach
    public static List<Integer> getPositiveCumulativeSum(int[] arr) {
        List<Integer> prefixSum = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            int prefix = 0;
            for (int j = 0; j <= i; j++) {
                prefix += arr[j];
            }
            if (prefix > 0) {
                prefixSum.add(prefix);
            }
        }
        return prefixSum;
    }

    // optimal approach
    List<Integer> getPositiveCumulativeSumOptimal(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        for (int i = 0; i < prefixSum.length; i++) {
            if (prefixSum[i] > 0)
                list.add(prefixSum[i]);
        }
        return list;
    }

    public static void main(String[] args) {

        int[] arr = { 1, -2, 3, 4, -6 };
        // int[] arr = {1, -1, -1, -1, 1};
        // int[] arr = {1, 3, 5, 7};

        System.out.println(getPositiveCumulativeSum(arr));
    }
}
