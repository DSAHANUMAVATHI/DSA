package Assignment;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153;
		int originalNumber = num;
        int numberOfDigits = 0;
        while (num != 0) {
            num /= 10;
            numberOfDigits++;
        }
        
        // Reset number to original value
        num = originalNumber;
        
        // Calculate the sum of the powers of digits
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            num /= 10;
        }
        
        // Check if the sum is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

	}
}
