import java.io.*;
import java.util.*;
public class birds{
    public static Scanner scn=new Scanner(System.in);
    public static void main(Strin[]args){
        int n=scn.nextInt();
        int[]arr=new int[5];
        for(int i=0;i<n;i++){
            int a=scn.nextInt();
            arr[a-1]++;
        }
        int max=0;
        
        int no=0;
        for(int i=0;i<5;i++){
            int a=arr[i];
            if(a>max){
                max=a;
                no=i+1;
            }
        }
        System.out.println(no);
    }
}