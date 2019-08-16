import java.io.*;
import java.util.*;
 class primeinterval {
    public static void main(String[] args) {
        int low,high;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the starting value");
        low=s.nextInt();
        System.out.println("enter the ending value");
        high=s.nextInt();
        ++low;
        while (low < high) {
            boolean flag = false;
            for(int i = 2; i <= low/2; ++i) {
                
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.print(low + " ");
            ++low;
        }
    }
}
