import java.io.*;
import java.util.*;
public class professor{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
            int n=scn.nextInt();
            int k=scn.nextInt();
            int c=0;
            for(int i=0;i<n;i++){
                int a=scn.nextInt();
                if(a<=0)
                c++;
            }
            if(c>=k)
            System.out.println("NO");
            else
            System.out.println("YES");
        }
    }
}