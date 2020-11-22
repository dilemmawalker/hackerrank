import java.io.*;
import java.util.*;
public class prisoner{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int m=scn.nextInt();
            int s=scn.nextInt();
            if(m>n){
            m=(m%(n));
            }
            // System.out.println(m);
            if(m==0)
            s=s+1;
            else
            while(--m>0){
                s+=1;
            }
            if(s<=n)
            System.out.println(s);
            else
            System.out.println(s%n);
        }
    }
}