import java.io.*;
import java.util.*;
public class arraysum{
    public static Scanner scn=new Scanner(new InputStreamReader(System.in));
    public static void main(String[]args){
        int n=scn.nextInt();
        long count=0;
        for(int i=0;i<n;i++){
            int a=scn.nextInt();
            count+=a;
        }
        System.out.println(count);
    }
}