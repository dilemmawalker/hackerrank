import java.io.*;
import java.util.*;
public class staircase{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String []args){
        int n=scn.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                if(j>i)
                System.out.print(" ");
                else
                System.out.print("#");
            }
            System.out.println();
        }
    }
}