
import java.util.*;
import java.lang.*;
import java.io.*;
class oddinterval
{
	public static void main(String args[])
	{
		int n,q;
		Scanner s=new Scanner(System.in);
		System.out.println("enter starting value");
		n=s.nextInt();
		System.out.println("enter ending value");
		q=s.nextInt();
		if(q<=10000)
		{
			while(n<q)
			{
					n=n+1;
				
			
				if(n%2==1){
					System.out.println(+n);
          }
				}
		}
		else{
					System.out.println("invalid input");
				}
	}
				
	
}
