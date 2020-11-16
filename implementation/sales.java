import java.io.*;
import java.util.*;
public class sales{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int[]arr=new int[101];

        for(int i=0;i<n;i++){
            int a=scn.nextInt();
            arr[a]++;
        }
        int c=0;
        for(int i=0;i<101;i++){
            c+=arr[i]/2;
        }
        System.out.println(c);
    }
}