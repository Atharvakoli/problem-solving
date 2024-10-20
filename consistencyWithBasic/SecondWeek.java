package consistencyWithBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Stack;

public class SecondWeek {

    public static int missingNumberInArray(int[] arr, int n) {
        int sum = 0;
        int nthNaturalSum = (n * (n + 1)) / 2;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return nthNaturalSum - sum;
    }

    public static boolean isPalindromeArray(int[] arr) {
        int n = arr.length;
        int start = 0, end = n - 1;

        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static List<Integer> findIntersectionOfTwoArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        int max = Math.max(n, m);

        List<Integer> list = new ArrayList<>();

        int i = 0;
        while (i < max) {
            int j = 0;
            while (j < max) {
                if (arr1[i] == arr2[j]) {
                    list.add(arr1[i]);
                }
                j++;
            }
            i++;
        }
        return list;
    }

    public static void findFirstNonRepeatingCharacter(String str) {
        boolean flag = true;

        for (char i : str.toCharArray()) {
            if (str.indexOf(i) == str.lastIndexOf(i)) {
                System.out.println("The first character which is not repeating is: " + i);
                flag = false;
                break;
            }
        }

        if (flag == true) {
            System.out.println("There is no non-repeating character in the input string");
        }
    }

    public static int[] moveZeroesToEnd(int[] arr) {
        int n = arr.length;
        // 0, 1, 0, 3, 12
        // 1, 0, 0, 3, 12
        //
        // int i = 0;
        // while (i < n) {
        // int j = i + 1;
        // while (j < n) {
        // if (arr[i] == 0 && arr[j] != 0) {
        // int temp = arr[i];
        // arr[i] = arr[j];
        // arr[j] = temp;
        // }
        // j++;
        // }
        // i++;
        // }

        int count = 0;
        // 0, 1, 0, 3, 12
        for (int k = 0; k < n; k++) {
            if (arr[k] != 0) {
                int temp = arr[k];
                arr[k] = arr[count];
                arr[count] = temp;
                count++;
            }
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    public static int findMajorityElement(int[] arr) {
        int n = arr.length, occurs = 0;
        // 2,2,1,1,2,2
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    occurs++;
                }
            }
            if (occurs > (n / 2)) {
                return arr[i];
            }
        }
        return -1;
    }

    public static boolean linearSearch(int[] arr, int num) {
        int n = arr.length; // size of array
        for (int i = 0; i < n; i++) {
            if (arr[i] == num)
                return true;
        }
        return false;
    }

    public static int longestConsecutiveElements(int[] arr) {
        int n = arr.length;
        int longest = 1;
        for (int i = 0; i < n; i++) {
            int x = arr[i];
            int cnt = 1;
            while (linearSearch(arr, x + 1)) {
                x += 1;
                cnt += 1;
            }

            longest = Math.max(longest, cnt);
        }
        return longest;
    }

    public static int[] findPairWithTargetSum(int[] arr, int target) {
        int n = arr.length;
        int[] result = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] + arr[i] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static void rotateMatrix90Degree(int[][] arr) {
        int n = arr.length;
        // int rotated[][] = new int[n][n];
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // rotated[j][n - i - 1] = arr[i][j];
        // }
        // }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < arr[i].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][n - 1 - j];
                arr[i][n - 1 - j] = temp;
            }
        }
    }

    public static boolean isValidParentheses(String parentheses) {
        Stack<Character> stack = new Stack<>();
        for (char it : parentheses.toCharArray()) {
            if (it == '(' || it == '[' || it == '{') {
                stack.push(it);
            } else {
                if (stack.isEmpty())
                    return false;
                char ch = stack.pop();
                if (it == ')' && ch == '(' || it == ']' && ch == '[' || it == '}' && ch == '{') {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static int findMaximumSubarraySum(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                // for (int k = i; k <= j; k++) {
                sum += arr[j];
                // }
                maxi = Math.max(maxi, sum);
            }
        }
        // long maxi = Long.MIN_VALUE; // maximum sum
        // long sum = 0;

        // for (int i = 0; i < n; i++) {

        // sum += arr[i];

        // if (sum > maxi) {
        // maxi = sum;
        // }

        // // If sum < 0: discard the sum calculated
        // if (sum < 0) {
        // sum = 0;
        // }
        // }
        return maxi;
    }

    public static int climbStairs(int n) {
        // dp
        // When we see a problem, it is very important to identify it as a dynamic
        // programming problem. Generally (but not limited to) if the problem statement
        // asks for the following:

        // Count the total number of ways
        // Given multiple ways of doing a task, which way will give the minimum or the
        // maximum output.

        // List<Integer> dp = new ArrayList<>();

        // dp.set(0, 1);
        // dp.set(1, 1);

        // for (int i = 2; i <= n; i++) {
        // dp.set(i, dp.get(i - 1) + dp.get(i - 2));
        // }
        // System.out.println(dp.get(n));

        // return 0;

        // space optimization

        int prev2 = 1;
        int prev = 1;

        for (int i = 0; i <= n; i++) {
            int currentIndex = prev2 + prev;
            prev2 = prev;
            prev = currentIndex;
        }

        System.out.println(prev);
        return 0;
    }

    public static void printPermutationsOfArrays(int[] arr, int index, List<List<Integer>> ans) {
        // Recursive

        // if (index == arr.length) {
        // List<Integer> ds = new ArrayList<>();
        // for (int i = 0; i < arr.length; i++) {
        // ds.add(arr[i]);
        // }
        // ans.add(new ArrayList<>(ds));
        // return;
        // }

        // for (int i = index; i < arr.length; i++) {
        // swap(i, index, arr);
        // printPermutationsOfArrays(arr, index + 1, ans);
        // swap(i, index, arr);
        // }

        // Backtracking
        if (index == arr.length) {
            // copy the ds to ans
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                ds.add(arr[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = index; i < arr.length; i++) {
            swap(i, index, arr);
            printPermutationsOfArrays(arr, index + 1, ans);
            swap(i, index, arr);
        }
    }

    static void swap(int i, int j, int[] nums) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        printPermutationsOfArrays(nums, 0, ans);
        return ans;
    }

    public static void printPermutationsOfStrings(String str, int index, List<List<Character>> ans) {
        // Recursive

        // if (index == arr.length) {
        // List<Integer> ds = new ArrayList<>();
        // for (int i = 0; i < arr.length; i++) {
        // ds.add(arr[i]);
        // }
        // ans.add(new ArrayList<>(ds));
        // return;
        // }

        // for (int i = index; i < arr.length; i++) {
        // swap(i, index, arr);
        // printPermutationsOfArrays(arr, index + 1, ans);
        // swap(i, index, arr);
        // }

        // Backtracking
        if (index == str.length()) {
            // copy the ds to ans
            List<Character> ds = new ArrayList<>();
            for (int i = 0; i < str.length(); i++) {
                ds.add(str.charAt(i));
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = index; i < str.length(); i++) {
            swapString(i, index, str);
            printPermutationsOfStrings(str, index + 1, ans);
            swapString(i, index, str);
        }
    }

    static void swapString(int i, int j, String str) {
        char n = str.charAt(i);
        char m = str.charAt(j);

        char temp = n;
        n = m;
        m = temp;

    }

    public static List<List<Character>> permuteString(String str) {
        List<List<Character>> ans = new ArrayList<>();
        printPermutationsOfStrings(str, 0, ans);
        return ans;
    }

    public static void main(String[] args) {

        // int[] arr = { 1, 2, 4, 5 };
        // System.out.println(missingNumberInArray(arr, 5));

        // int[] arr = { 1, 4, 2, 3, 2, 1 };
        // System.out.println(isPalindromeArray(arr));

        // int[] arr1 = { 1, 2, 3 };
        // int[] arr2 = { 2, 3, 4 };
        // System.out.println(findIntersectionOfTwoArrays(arr1, arr2));

        // findFirstNonRepeatingCharacter("swiwess");

        // int[] arr = { 0, 1, 0, 3, 12 };
        // System.out.println(Arrays.toString(moveZeroesToEnd(arr)));

        // int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
        // System.out.println(findMajorityElement(arr));

        // int[] arr = { 100, 200, 1, 2, 3, 4 };
        // System.out.println(longestConsecutiveElements(arr));

        // int[] arr = { 2, 7, 11, 15 };
        // int target = 9;
        // System.out.println(Arrays.toString(findPairWithTargetSum(arr, target)));

        // int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }

        // System.out.println();

        // rotateMatrix90Degree(arr);

        // System.out.println();

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }

        // String parentheses = "()[]{}";
        // System.out.println(isValidParentheses(parentheses));

        // int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        // System.out.println(findMaximumSubarraySum(arr));

        // climbStairs(3);

        // int nums[] = { 1, 2, 3 };
        // List<List<Integer>> ls = permute(nums);
        // System.out.println("All Permutations are");
        // for (int i = 0; i < ls.size(); i++) {
        // for (int j = 0; j < ls.get(i).size(); j++) {
        // System.out.print(ls.get(i).get(j) + " ");
        // }
        // System.out.println();
        // }

        String str = "ABC";
        for (List<Character> ch : permuteString(str)) {
            System.out.println(ch);
        }

    }
}
