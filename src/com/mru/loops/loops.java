package com.mru.loops;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {10,20,30,40,50};
		int e1=arr1[0];
		System.out.println(e1);
		//number of elements
		int n=arr1.length;
		System.out.println(n);
		//for loop
		for(int i=0;i<n;i++) {
			System.out.println(arr1[i]);
		}
	    //while loop
			int x =0;
			while(x<n) {
				System.out.println(arr1[x]);
				x++;
			}
		//do while loop
			int y=0;
			do {
				System.out.println(arr1[y]);
				y++;
			}while(y<n);
			
			//for each loop
			for(int ele:arr1) {
				System.out.println(ele);
			}
		}

	}

