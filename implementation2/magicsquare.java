import java.util.Scanner;
import java.util.ArrayList;
public class magicsquare{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int[][]arr=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int a=solve(arr,0,new boolean[9],0);
        System.out.println(a);
    }
    public static int solve(int[][]arr,int idx,boolean[]bool,int cost){
        if(idx==9){
        boolean flag=check(arr);
        if(flag)
        return cost;
        else
        return 1000000;
        }
        int a1=1000000;
        if(!bool[idx]){
            bool[idx]=true;
            a1=solve(arr,idx+1,bool,cost);
            bool[idx]=false;
        }
        int a2=1000000;
        int co=a1;
        for(int i=1;i<=9;i++){
            int r=idx/3;
            int c=idx%3;
            if(arr[r][c]!=i && !bool[idx]){
                bool[idx]=true;
                int temp=arr[r][c];
                arr[r][c]=i;
                a2=solve(arr,idx+1,bool,cost+(temp>i?temp-i:i-temp));
                arr[r][c]=temp;
                bool[idx]=false;
            }
            co=Math.min(co,a2);
        }
        return co;
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