import java.io.*;
import java.util.*;
public class climbing{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int[]arr=new int[n];
        arr[0]=scn.nextInt();
        int c=1;
        for(int i=1;i<n;i++){
            int a=scn.nextInt();
            if(a!=arr[c-1]){
            arr[c]=a;
            c++;
            }
        }
        c--;

        int m=scn.nextInt();
        for(int i=0;i<m;i++){
            int a=scn.nextInt();
            while(c>-1 && arr[c]<a){
                c--;
            }
            if(c<0)
            System.out.println(1);
            else if( a==arr[c])
            System.out.println(c+1);
            else
            System.out.println(c+2);
        }
    }
}