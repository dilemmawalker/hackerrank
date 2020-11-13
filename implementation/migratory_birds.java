import java.io.*;
import java.util.*;
public class migratory_birds{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int[]arr=new int[6];
        int max=0;
        for(int i=0;i<n;i++){
            int a=scn.nextInt();
            arr[a]++;
            max=Math.max(max,arr[a]);
        }
        for(int i=1;i<6;i++){
            if(arr[i]==max){
                System.out.println(i);
                break;
            }
        }
    }
}