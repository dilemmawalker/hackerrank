import java.io.*;
import java.util.*;
public class circular{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int k=scn.nextInt();
        int q=scn.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            int a=scn.nextInt();
            arr[i]=a;
        }
        for(int i=0;i<q;i++){
            int a=scn.nextInt();
            a=(a+k)<n?(a+k):(a+k-1);
            a=a%n;
            System.out.println(arr[a]);//
        }
    }
}