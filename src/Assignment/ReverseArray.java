package Assignment;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		 int[] arr = {101,102,103,104,105};
			
			int[] reversedArr = new int[arr.length];

			 for (int i = 0; i < arr.length; i++) {
		            reversedArr[i] = reverseNumber(arr[i]);
		        }
			 System.out.println("Reversed elements: " +Arrays.toString(reversedArr));
		}
			 public static int reverseNumber(int num) {
			        int reversed = 0;
			        while (num != 0) {
			            int digit = num % 10; 
			            reversed = reversed * 10 + digit;
			            num /= 10;
			        }
			        return reversed;
		}

	}


