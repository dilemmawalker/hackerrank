import java.io.*;
import java.util.*;
public class two_sets{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int m=scn.nextInt();
        int no=0;
        int[]arr=new int[n];
        int[]arr2=new int[m];
        for(int i=0;i<n;i++){
            int a=scn.nextInt();
            arr[i]=a;
            no=Math.max(a,no);
        }
        int no1=10000;
        for(int i=0;i<m;i++){
            int a=scn.nextInt();
            arr2[i]=a;
            no1=Math.min(a,no1);
        }
        int c=0;
        for(int i=no;i<=no1;i++){
            int a=i;
            int j=0;
            for( j=0;j<n;j++){
                if(a%arr[j]!=0)
                break;
            }
            if(j!=n)
            continue;
            for(j=0;j<m;j++){
                if(arr2[j]%a!=0)
                break;
            }
            if(j!=m)
            continue;
            c++;
        }
        System.out.println(c);
    }
}