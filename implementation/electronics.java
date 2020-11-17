import java.io.*;
import java.util.*;
public class electronics{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int b=scn.nextInt();
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int[]arr1=new int[n1];
        int[]arr2=new int[n2];
        int max=-1;
        for(int i=0;i<n1;i++){
            int a=scn.nextInt();
            arr1[i]=a;
        }
        for(int i=0;i<n2;i++){
            int a=scn.nextInt();
            arr2[i]=a;
        }
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                int c=arr1[i]+arr2[j];
                if(c<=b)
                max=Math.max(max,c);
            }
        }
        System.out.println(max);
    }
}
