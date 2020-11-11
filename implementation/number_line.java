import java.io.*;
import java.util.*;
public class number_line{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int x1=scn.nextInt();
        int v1=scn.nextInt();
        int x2=scn.nextInt();
        int v2=scn.nextInt();
        boolean flag=false;
        if(x1<=x2){
            if(v1>v2 && (x2-x1)%(v2-v1)==0)
            System.out.print("YES");
            else
            System.out.print("NO");
        }
        else
        System.out.print("NO");
    }
}