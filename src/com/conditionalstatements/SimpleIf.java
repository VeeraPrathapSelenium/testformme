package com.conditionalstatements;

public class SimpleIf {

	public static void main(String[] args) {


		int a=10;
		
		int b=20;
		
		
		if(a>b)
		{
			System.out.println("A is greater than B");
		}else if(a>=5 && a<=8)	
			
		{
			System.out.println("A is less than B , but it is in the range of 5 - 8");
		}
		else
		{
			System.out.println("A is not greater than B and also not in the range of 5 and 8");
		}
		
		
		
		

	}

}
