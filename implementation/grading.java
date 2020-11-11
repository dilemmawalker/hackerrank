import java.io.*;
import java.util.*;
public class grading{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        for (int i=0;i<n;i++){
            int a=scn.nextInt();
            if(a<38)
            System.out.println(a);
            else if((a+1)%5==0)
            System.out.println(a+1);
            else if((a+2)%5==0)
            System.out.println(a+2);
            else
            System.out.println(a);
        }
    }
}