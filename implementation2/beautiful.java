import java.io.*;
import java.util.*;
public class beautiful{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[]args){
        int i=scn.nextInt();
        int j=scn.nextInt();
        int k=scn.nextInt();
        int c=0;
        for(;i<=j;i++){
            int rev=reverse(i);
            int a=rev>i?rev-i:i-rev;
            if(a%k==0)
            c++;
        }
        System.out.println(c);
    }
    public static int reverse(int n){
        int no=0;
        while(n>0){
            int a=n%10;
            no=no*10+a;
            n/=10;
        }
        return no;
    }
}