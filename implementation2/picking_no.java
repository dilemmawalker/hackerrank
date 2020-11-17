import java.util.Scanner;
import java.io.*;
public class picking_no{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[]args){
            int n=scn.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();

           int a= solve(arr,0,1,0);
           System.out.println(a);
    }
    public static int solve(int[]arr,int idx,int count,int prev){
        if(idx==arr.length)
        {
            return count;
        }

        int c=0;
        if((arr[idx]-prev)==0)
        c=Math.max(solve(arr,idx+1,count+1,prev),c);
        else{
        c=Math.max(solve(arr,idx+1,count,prev),c);
        if(count==0 || (arr[idx]-prev)==1 ||(arr[idx]-prev)==-1)
        c=Math.max(solve(arr,idx+1,count+1,arr[idx]),c);
        }
        return c;
    }
}