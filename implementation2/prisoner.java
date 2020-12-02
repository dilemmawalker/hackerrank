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
         m=m%n;
        if(m==0)
        m=n;

        m+=s-1;
        m=m%n;
        if(m==0)
        m=n;
            System.out.println(m);
        }
    }
}