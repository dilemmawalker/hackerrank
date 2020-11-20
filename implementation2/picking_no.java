import java.util.Scanner;
import java.io.*;
public class picking_no{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[]args){
            int n=scn.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();
        int[]dp=new int[n+1];
        for(int i=0;i<n;i++)
        dp[i]=-1;
           int a= solve(arr,0,0,1000,0,dp);
           System.out.println(a);
    }
    public static int solve(int[]arr,int idx,int count,int min,int max,int[]dp){
        if(idx==arr.length)
        {
            return 0;
        }
        if(dp[idx]!=-1)
        return dp[idx];
        int c=0;
        // if((arr[idx]-prev)==0 && count!=0)
        // c=Math.max(solve(arr,idx+1,count+1,prev),c);
        // else{
        c=Math.max(solve(arr,idx+1,count,min,max,dp),c);
        if(count==0 || ((((arr[idx]-min)==1) ||((min-arr[idx])==1)||((min-arr[idx]==0))) && 
        (((arr[idx]-max)==1) ||((max-arr[idx])==1)|| ((max-arr[idx])==0)))){
            int m1,m2;
            m1=min;
            m2=max;
            min=Math.min(min,arr[idx]);
            max=Math.max(max,arr[idx]);
            c=Math.max(solve(arr,idx+1,count+1,min,max,dp)+1,c);
            min=m1;
            max=m2;
        }
        // }
        return dp[idx]=c;
    }
}
