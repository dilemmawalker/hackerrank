import java.io.*;
import java.util.*;
public class min_max{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int[]arr=new int[5];
        long min=1000000000000l,max=-1,sum=0;
        for(int i=0;i<5;i++){
            int a=scn.nextInt();
            min=Math.min(a,min);
            max=Math.max(a,max);
            sum+=a;
        }
        System.out.println((sum-max)+" "+ (sum-min));
    }
}