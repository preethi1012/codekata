
import java.util.*;
import java.lang.*;
import java.io.*;
class prime{    
 public static void main(String args[]){    
  int i,n,m=0,flag=0; 
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
  System.out.println("enter the number");
    
  m=n/2; 
  if(n<=1000)
  {
  if(n==0||n==1){  
   System.out.println(n+" is not prime number");      
  }else{  
   for(i=2;i<=m;i++){      
    if(n%i==0){      
     System.out.println(n+" is not prime number");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)  { System.out.println(n+" is prime number"); }  
  }
  }
  else
  System.out.println("invalid input");
}    
}   
