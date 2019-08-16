import java.util.*;
import java.lang.*;
import java.io.*;
class eveninterval
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
		{ n=n+1;
			while(n<q)
			{
				if(n%2==0)
        {
					System.out.println(+n);
					
          }
          n=n+1;
       }
		}
		else{
					System.out.println("invalid input");
				}
	}
				
	
}
