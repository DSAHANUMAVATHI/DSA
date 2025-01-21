package Assignment;

public class SumOfEvenAndOddNumbers {

	public static void main(String[] args) {
int[] arr = {1,3,4,5,6,7,8,9,12};
		
		int evenSum = 0; 
        int oddSum = 0;  
        for (int num : arr) {
            if (num % 2 == 0) { 
                evenSum += num;
            } else { 
                oddSum += num;
            }
        }

        System.out.println("The sum of even numbers is: " + evenSum);
        System.out.println("The sum of odd numbers is: " + oddSum);

	}

}
