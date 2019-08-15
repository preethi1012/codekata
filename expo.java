

import java.util.*;
import java.lang.*;
import java.io.*;
class expo
{
	public static void main (String[] args) {
		int n,k;
			int a=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		n=s.nextInt();
		System.out.println("enter the exponent value");
		k=s.nextInt();
		for(int i=1;i<=k;i++)
		{
	
		a=a*n;
		System.out.println("the value is"+a);
		
	}
	}
}
