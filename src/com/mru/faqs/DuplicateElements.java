package com.mru.faqs;

import java.util.HashSet;

public class DuplicateElements {

	public static void main(String[] args) {
	int[] arr = {1,2,3,1,4,1};
	HashSet set = new HashSet();
	for(int elements:arr) {
		;
		if(set.contains(elements)){
			System.out.println("Duplicates are Available");
			break;
		}else {
			System.out.println("No duplicates");
		}
		set.add(elements);
	}

	}

}
