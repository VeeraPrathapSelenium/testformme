package com.loops;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter a Numeric value :");
		int inputvalue=sc.nextInt(); 
		
System.out.println("The Table for the given input value :"+inputvalue+" is as below:");
		for(int i=1;i<=20;i++)
		{
			
			
			System.out.println(inputvalue+" * "+i+" = "+(inputvalue*i));
			
			
			
			
		}
		
		
		
		

	}

}
