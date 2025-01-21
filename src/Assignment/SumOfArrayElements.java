package Assignment;

public class SumOfArrayElements {

	public static void main(String[] args) {
int[] arr = {1,3,5,4,6,2,9};
		
		int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum of elements: "+sum);
	}

	}


