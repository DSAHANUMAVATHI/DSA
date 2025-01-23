package com.mru.faqs;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
    	//read number dynamically 
    	Scanner scanner=new Scanner(System.in);
    	System.out.print("Enter number :");
    	int num = scanner.nextInt();
    	int original_num = num;
    	//read number of digits
    	int digits = String.valueOf(num).length();
    	int sum = 0;
    	while(num!=0) {
    		int last = num%10;
    		sum+=Math.pow(last,  digits);
    		num=num/10;
    	}
    	System.out.print(original_num == sum ? "ArmStrong !!!" : "Not ArmStrong !!!");
    }
}
