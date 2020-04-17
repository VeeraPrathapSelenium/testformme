package com.Methods;

public class Driver {

	public static void main(String[] args) {

String str="OracleDBA";

int temp=0;

for(int i=1;i<=str.length()-1;i++)
{
	char c=str.charAt(i);
	
	
	if(Character.isUpperCase(c))
	{
		temp=i;
		
		break;
	}

}

System.out.println(temp);


System.out.println(str.substring(0, temp)+"_"+str.substring(temp));

	}
	
	
	

}
