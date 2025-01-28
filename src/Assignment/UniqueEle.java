package Assignment;
import java.util.*;

public class UniqueEle {

	public static void main(String[] args) {
		 int[] array = {1, 2, 3, 4, 2, 3, 5, 1, 6};
		 
		 HashSet<Integer> uniqueElements = new HashSet<>();

	        for (int num : array) {
	            uniqueElements.add(num);
	        }

	        System.out.println("Unique elements in the array:");
	        for (int unique : uniqueElements) {
	            System.out.print(unique + " ");
	            }
		 }
	}
