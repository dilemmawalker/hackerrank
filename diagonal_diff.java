import java.io.*;
import java.util.*;
public class diagonal_diff{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int c1=0,c2=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int a=scn.nextInt();
                if(i==j)
                c1+=a;
                if(i+j==n-1)
                c2+=a;
            }
        }
        System.out.println(c1>c2?c1-c2:c2-c1);
    }
}