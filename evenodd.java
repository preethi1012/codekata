
import java.util.*;
import java.lang.*;
import java.io.*;
class evenodd
{
	public static void main (String[] args) 
	{
	int n;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	n=s.nextInt();
	if(n<=0)
	{
	System.out.println("invalid input");
	}
	else{
		
	if(n%2==0){
		System.out.println("even number");
	}
		else{
			System.out.println("odd number");
		}
	}
	
	
	
	}
}
