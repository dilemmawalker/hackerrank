import java.util.Scanner;
import java.io.*;
public class picking_no{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[]args){
            int n=scn.nextInt();
            int[]arr=new int[n];
            int[]dp=new int[n+1];

            for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
            dp[i]=-10;
            }
            dp[n]=-10;
           int a= solve(arr,0,0,0,dp);
           System.out.println(a);
    }
    public static int solve(int[]arr,int idx,int count,int prev,int[]dp){
        if(idx==arr.length)
        {
            return count;
        }
        if(dp[idx]!=-10)
        return dp[idx];
        int c=0;
        c=Math.max(solve(arr,idx+1,count,prev,dp),c);
        if(count==0 || (arr[idx]-prev)==0 || (arr[idx]-prev)==1 ||(arr[idx]-prev)==-1)
        c=Math.max(solve(arr,idx+1,count+1,arr[idx],dp),c);
        return dp[idx]=c;
    }
}
