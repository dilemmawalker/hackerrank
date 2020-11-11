import java.io.*;
import java.util.*;
public class plus_minus{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int c1=0;
        int c2=0;
        int c3=0;
        int n=scn.nextInt();
        for(int i=0;i<n;i++){
            int a=scn.nextInt();
            if(a>0)
            c1++;
            else if(a<0)
            c2++;
            else
            c3++;
        }
        double a=c1*1.0,b=c2*1.0,c=c3*1.0;
         System.out.println(a/n) ;
        System.out.println(b/n);
        System.out.println(c/n); 
     }
}