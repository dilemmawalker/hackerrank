import java.io.*;
import java.util.*;
public class advertising{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int c=5;
        int co=0;
        for(int i=1;i<=n;i++){
            c=(c/2);
            co+=c;
            c=c*3;
        }
        System.out.println(co);
    }
}