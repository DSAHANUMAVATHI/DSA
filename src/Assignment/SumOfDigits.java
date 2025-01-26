package Assignment;

import java.util.Arrays;

public class SumOfDigits {

	public static void main(String[] args) {
		  int[] arr = {12, 34, 56, 78};
			int[] sumDigitsArr = new int[arr.length];
			
			for (int i = 0; i < arr.length; i++) {
	            sumDigitsArr[i] = SumOfDigits(arr[i]);
	        }
			System.out.println("Sum of digits for each element: " + Arrays.toString(sumDigitsArr));
		}
		
		public static int SumOfDigits(int num) {
	        int sum = 0;
	        while (num != 0) {
	            sum += num % 10;  
	            num /= 10; 
	        }
	           return sum;
	        }
	}



