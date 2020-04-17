package com.arrays;

import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {

		System.out.println("********** Before Sorting ***********");
		int[] arr=new int[] {1,12,3,45,5,3,2,8};
		
		System.out.println(arr[0]);
		
		System.out.println(arr[1]);
		
		System.out.println(arr[2]);
		System.out.println("********** After Sorting ***********");
		
		Arrays.sort(arr);
		
System.out.println(arr[0]);
		
		System.out.println(arr[1]);
		
		System.out.println(arr[2]);
		
		

	}

}
