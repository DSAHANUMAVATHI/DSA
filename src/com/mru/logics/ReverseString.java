package com.mru.logics;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "MADAM";
		//Step1.convert string to character Array
		//char[] arr = str.toCharArray();
		char[] arr = new char[str.length()];
		for(int i=0;i<str.length();i++) {
			arr[i] = str.charAt(i);
		}
		
		//swap
		int start=0, end = arr.length-1;
		while (start<end) {
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
			
		}
		String rev = new String(arr);
		if(str.equals(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
			
		}
	}

}
