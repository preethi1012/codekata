import java.util.*;
import java.lang.*;
import java.io.*;

class sign
{
	public static void main (String[] args)
	{
		int n;
		Scanner a=new Scanner(System.in);
		System.out.println("enter the number to check");
		n = a.nextInt();
		if(n<0)
		{
		System.out.println("negative number");
		}
		else if(n>0)
		{
		System.out.println("positive number");
		}
		else
		{
		System.out.println("the number is zero");
		}
	}
}
