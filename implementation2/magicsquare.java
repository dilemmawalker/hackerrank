import java.util.Scanner;
import java.util.ArrayList;
public class magicsquare{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){   //no dp required!
        int[][]arr=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int []dp=new int[9];
        for(int i=0;i<9;i++)
        dp[i]=1000000;
        int a=solve(arr,0,new boolean[10],0,dp);
        System.out.println(a);
    }
    public static int solve(int[][]arr,int idx,boolean[]bool,int cost,int[]dp){
        if(idx==9){
        boolean flag=check(arr);
        if(flag)
        return cost;
        else
        return 1000000;
        }
        // if(dp[idx]!=1000000)
        // return dp[idx];

        int a1=1000000;
        if(!bool[arr[idx/3][idx%3]]){
            bool[arr[idx/3][idx%3]]=true;
            a1=solve(arr,idx+1,bool,cost,dp);
            bool[arr[idx/3][idx%3]]=false;
        }
        int a2=1000000;
        int co=a1;
        for(int i=1;i<=9;i++){
            int r=idx/3;
            int c=idx%3;
            if(arr[r][c]!=i && !bool[i]){
                bool[i]=true;
                int temp=arr[r][c];
                arr[r][c]=i;
                a2=solve(arr,idx+1,bool,cost+(temp>i?temp-i:i-temp),dp);
                arr[r][c]=temp;
                bool[i]=false;
            }
            co=Math.min(co,a2);
        }
        return dp[idx]=co;
    }
    public static boolean check(int[][]arr){
if((arr[0][0]+arr[0][1]+arr[0][2])==(arr[1][0]+arr[1][1]+arr[1][2]) && (arr[0][0]+arr[0][1]+arr[0][2])==(arr[2][0]+arr[2][1]+arr[2][2])
  && (arr[0][0]+arr[0][1]+arr[0][2])==(arr[0][0]+arr[1][0]+arr[2][0]) && (arr[0][0]+arr[0][1]+arr[0][2])==(arr[0][1]+arr[1][1]+arr[2][1])
   && (arr[0][0]+arr[0][1]+arr[0][2])==(arr[0][2]+arr[1][2]+arr[2][2]) &&
   (arr[0][0]+arr[0][1]+arr[0][2])==(arr[0][0]+arr[1][1]+arr[2][2]) && (arr[0][0]+arr[0][1]+arr[0][2])==(arr[2][0]+arr[1][1]+arr[0][2]))
return true;
else 
return false;
    }
}