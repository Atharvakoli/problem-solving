package arrays;

import java.util.*;

public class InsertionsSort {

    public static void insertionSort(int[] arr) {
        // In insertion sort, the basic idea is to divide the array into a sorted and an
        // unsorted part. Elements from the unsorted part are picked one by one and
        // placed at their correct position in the sorted part until the whole array is
        // sorted. O(n^2)

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int currElement = arr[i];
            int position = i - 1;
            while (position >= 0 && arr[position] > currElement) {
                arr[position + 1] = arr[position];
                position--;
            }
            arr[position + 1] = currElement;
        }
    }

    public static void main(String[] args) {

        int[] arr = { 5, 4, 2, 5, 3, 1 };
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
