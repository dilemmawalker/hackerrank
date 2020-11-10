import java.io.*;
import java.util.*;
public class big_sum{
    public static Scanner scn=new Scanner(new InputStreamReader(System.in));
    public static void main(String[]args){
        int n=scn.nextInt();
        long c=0l;
        for(int i=0;i<n;i++){
            c+=scn.nextInt();
        }
           System.out.println(c); 
    }
}