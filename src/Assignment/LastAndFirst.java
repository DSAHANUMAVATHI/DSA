package Assignment;

import java.util.Arrays;

public class LastAndFirst {

	public static void main(String[] args) {
		 int[] arr = {1, 10, 2, 20, 3, 30, 4, 40};
			
			int[] newArr = new int[arr.length / 2];
			
			for (int i = 0; i < arr.length / 2; i++) {
	            newArr[i] = arr[i] + arr[arr.length - 1 - i];
	        }
			System.out.println("Resulting array: " + Arrays.toString(newArr));

	}

}
