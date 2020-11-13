import java.io.*;
import java.util.*;
public class divisible_sum_pairs{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int k=scn.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=scn.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((arr[i]+arr[j])%k==0)
                c++;
       }
        }
        System.out.println(c);
    }
}