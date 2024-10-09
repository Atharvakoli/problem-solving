package p_s_consistency;

import java.util.*;

public class FirstWeek {
	
	public static boolean isPrime(int num) {
		if(num <= 1) {
			return false;
		}
		for(int i = 2;i < num;i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPerfectNumber(int num) {
		int sum = 0;
		int i = 1;
		while(i < num) {
			if(num % i == 0) {
				sum += i;
				System.out.print(i + " ");
			}
			i++;
		}
		
		if(sum == num) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void maximumNumber(int[] arr) {
		int max = arr[0];
		
		int i = 0;
		while(i < arr.length) {
			if(arr[i] > max) {
				max = arr[i];
			}
			i++;
		}
		System.out.println(max);
	}
	
	public static void ReverseString(String str) {
		String reversed = "";
		
		for(int i = str.length() - 1;i >= 0;i--) {
			reversed += str.charAt(i);
		}
		
		System.out.println(reversed);
	}
	
	public static void factorialOfANumber(int num) {
		int fact = 1;
		for(int i = 1;i <= num;i++) {
			fact *= i;
		}
		
		System.out.println(fact);
	}

	public static boolean palindromeCheck(String str) {
		int i = 0, j = str.length() - 1;
		
		while(i <= j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	public static void sumOfElementsInArray(int[] arr) {
		int n = arr.length;
		int sum = 0;
		int i = 0;
		while(i < n) {
			sum += arr[i++];
		}
		System.out.println(sum);
	}
	
	public static void fibonacciSeries(int num) {
		
		int a = 0, b = 1;
		System.out.print(a + " " + b + " ");
		for(int i = 2;i < num;i++) {
			int third = a + b;
			a = b;
			b = third;
			System.out.print(third + " ");
		}
		
	}

	public static List<Integer> findEvenNumberInArray(int[] arr) {
		List<Integer> list = new ArrayList<>();

		for(int i = 0;i < arr.length;i++) {
			if(arr[i] % 2 == 0) {
				list.add(arr[i]);
			}
		}

		return list;
	}

	public static void countNumberOfVowels(String str) {
		int countVowels = 0;
		for(int i = 0;i < str.length();i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				countVowels++;
			}
		}

		System.out.println(countVowels);
	}

	public static int countNumberOfDigits(int num) {
		int digits = 0;
		while (num > 0) {
			digits++;
			num /= 10;
		}
		return digits;
	}

	public static int power(int base, int power) {
		int result = 1;
		while (power > 0) {
			result *= base;
			power--;
		}
		return result;
	}

	public static boolean isArmStrongNumber(int num) {
		int digits = countNumberOfDigits(num);
		int numCopy = num, number = 0;
		while (numCopy > 0) {
			int rem = numCopy % 10;
			number +=  power(rem, digits);
			numCopy /= 10;
		}

		System.out.println(number + " " + num);

		if(number == num) {
			return true;
		}
		return false;
	}

	public static void sumOfDigits(int num) {
		int numCopy = num;
		int sum = 0;
		while (numCopy > 0) {
			int rem = numCopy % 10;
			sum += rem;
			numCopy /= 10;
		}

		System.out.println(sum);
	}

	public static boolean checkIfPowerTwo(int num) {
		if(num % 2 == 0) {
			return true;
		}
		return false;
	}

	public static int removeDupicates(int[] arr) {
		int n = arr.length;
		if (n==0 || n==1){  
            return n;  
        }    
        int j = 0; 
        for (int i=0; i < n-1; i++){  
            if (arr[i] != arr[i+1]){  
                arr[j++] = arr[i];  
            }  
        }  
        arr[j++] = arr[n-1];  
        return j;
	}
	
	public static int gcd(int num1, int num2) {
		int min = Math.min(num1, num2);
		int gcd = 0;
		for(int i = 1;i < min;i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}

		return gcd;
	}

	public static int lcm(int num1, int num2) {
		int max = Math.min(num1, num2);
		int lcm = 0;
		for(int i = 0;i < max * max;i++) {
			if(i % num1 == 0 && i % num2 == 0) {
				lcm = i;
			}
		}

		return lcm;
	}

	public static boolean isLeapYear(int year) {
		if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public static List<Integer> primeFactors(int num) {
		List<Integer> list = new ArrayList<>();
		for(int i = 2;i < num;i++) {
			while(num % i == 0) {
				list.add(i);
				num /= i;
			}
		}
		return list;
	}

	public static void pow(int base, int exponent) {
		int result = 1; 
		for(int i = 1;i <= exponent;i++) {
			result *= base;
		}

		System.out.println(result);
	}

	public static void secondLargestElement(int[] arr) {
		int n = arr.length;
		for(int i = 0;i < n;i++) {
			for(int j = i + 1;j < n;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println(arr[n - 2]);
	}

	public static void main(String[] args) {
//		int num = 8;
//		if(isPrime(num)) {
//			System.out.println(num + " is a prime number");
//		} else {
//			System.out.println(num + " in not a prime number");
//		}
		
//		int num1 = 28;
//		if(isPerfectNumber(28)) {
//			System.out.println(num1 + " is a perfect number");
//		} else {
//			System.out.println(num1 + " in not a perfect number");
//		}

//		int[] arr = {3, 9, 2, 5};
//		maximumNumber(arr);
//		ReverseString("hello");
		
//		factorialOfANumber(5);
//		String str = "racecar";
//		if(palindromeCheck(str)) {
//			System.out.println(str + " is a palindrome String");
//		} else {
//			System.out.println(str + " is not a palindrome String");
//		}
		
//		int[] arr = {1, 2, 3};
//		sumOfElementsInArray(arr);
		
		// fibonacciSeries(5);
		// int[] arr = {1,2,3,4,5,6,7,8,9};
		// List<Integer> list = findEvenNumberInArray(arr);
		// System.out.println(list);

		// countNumberOfVowels("hello");

		// System.out.println(isArmStrongNumber(153));
		// sumOfDigits(123);
		// System.out.println(checkIfPowerTwo(17));
		// int[] arr = {1,2,2,3};
		// System.out.println(removeDupicates(arr));

		// System.out.println(gcd(12, 15));
		// System.out.println(lcm(12, 15));

		// System.out.println(isLeapYear(2020));

		// System.out.println(primeFactors(18));
		// pow(2, 5);

		int[] arr =  {1, 5, 3, 9};
		secondLargestElement(arr);

	}

}
