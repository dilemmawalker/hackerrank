import java.io.*;
import java.util.*;
public class digit_sum{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        String str=scn.next();
        long n=scn.nextInt();
        long c=0;
        for(int i=0;i<str.length();i++){
            int a=str.charAt(i)-'0';
            c+=a;
        }
        long a=c;
        while(a>9)
         a=solve(a);

         a*=n;
         while(a>9)
         a=solve(a);

        System.out.println(a);
    }
    public static long solve(long n){
        if(n<10)
        return n;

        long c=0;
        c+=solve(n/10)+n%10;
        return c;
    }
}