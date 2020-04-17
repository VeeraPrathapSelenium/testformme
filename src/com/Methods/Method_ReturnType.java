package com.Methods;

public class Method_ReturnType {

	public static void main(String[] args) {
	
		Method_ReturnType refvar=new Method_ReturnType();
		
		
		int result=refvar.	add(10,20);
		
		System.out.println(result);
		
		
		
		refvar.	add(89,96);

	}

	
	public int add(int a,int b)
	{
	System.out.println(a+b);
			return a+b;
	
		
		
		
		
	}
	
	
	
}
