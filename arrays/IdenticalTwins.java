package arrays;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class IdenticalTwins {

    static int getIdenticalTwinsCount(int[] arr) {
        // add your logic here
        int n = arr.length;
        int twins = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    twins++;
                }
            }
        }
        return twins;
    }

    // optimal approach
    static int getIdenticalTwinsCountOptimal(int[] arr) {
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            Integer val = frequency.get(arr[i]);
            if (val == null) {
                frequency.put(arr[i], 1);
            } else {
                frequency.put(arr[i], ++val);
            }
        }
        int identicalTwinsCount = 0;

        for (Map.Entry<Integer, Integer> x : frequency.entrySet()) {
            identicalTwinsCount += (x.getValue() * (x.getValue() - 1)) / 2;
        }
        return identicalTwinsCount;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1 };
        // System.out.println(getIdenticalTwinsCount(arr));
        System.out.println(getIdenticalTwinsCountOptimal(arr));
    }
}
