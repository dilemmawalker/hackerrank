import java.io.*;
import java.util.*;
public class power_sum{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[]args){
        int x=scn.nextInt();
        int n=scn.nextInt();
        int a=solve(x,n,0,1);
        System.out.println(a);
    }
    public static int solve(int x,int n,int sum,int no){
        if(sum==x)
        return 1;
        if(sum>x)
        return 0;
        if(no>(int)Math.sqrt(x))
        return 0;

        int c=0;
            c+=solve(x,n,sum,no+1);
            c+=solve(x,n,sum+(int)Math.pow(no,n),no+1);
            return c;
    }
}