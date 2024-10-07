package p_s_consistency;

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
		
		fibonacciSeries(5);
	}

}
