import java.io.*;
import java.util.*;
public class hurdle{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int k=scn.nextInt();
        int max=0;
        for(int i=0;i<n;i++){
            int a=scn.nextInt();
            max=Math.max(a,max);
        }
        max=max>=k?max-k:0;
        System.out.println(max);
    }
}