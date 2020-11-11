import java.io.*;
import java.util.*;
public class apple{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int s=scn.nextInt();
        int t=scn.nextInt();
        int a=scn.nextInt();
        int b=scn.nextInt();
        int m=scn.nextInt();
        int n=scn.nextInt();
        int c=0,c1=0;
        for(int i=0;i<m;i++){
            int j=scn.nextInt();
            int no=a+j;
            if(no>=s && no<=t)
            c++;
        }
        for(int i=0;i<n;i++){
            int j=scn.nextInt();
            int no=b+j;
            if(no>=s && no<=t)
            c1++;
        }
        System.out.println(c);
        System.out.println(c1);
    }
}