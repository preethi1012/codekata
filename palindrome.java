import java.util.*;
import java.io.*;
class palindrome{  
 public static void main(String args[]){  
  int r,sum=0,temp,n;
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
  
  temp=n; 
  if(n<=1000)
  {
  while(n>0){    
   r=n%10;  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");
   }
   else
   {
   System.out.println("out of range");
   }
}  
} 
