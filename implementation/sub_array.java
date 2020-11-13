import java.io.*;
import java.util.*;
public class sub_array{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            int a=scn.nextInt();
            arr[i]=a;
        }
        int d=scn.nextInt();
        int m=scn.nextInt();
        int t=0;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=i;j<n && j<(i+m);j++){
                c+=arr[j];
                if(c==d && j==(i+m-1))
                t++;
                else if(c>d)
                break;
            }
        }
        System.out.println(t);
    }
}