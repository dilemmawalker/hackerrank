import java.io.*;
import java.util.*;
public class find_digit{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int a=solve(n);
            System.out.println(a);
        }
    }
    public static int solve(int n){
        int n1=n;
        int c=0;
        while(n>0){
            int a=n%10;
            if(a!=0 && n1%a==0)
            c++;
            n/=10;
        }
        return c;
    }
}