import java.io.*;
import java.util.*;
public class time_conversion{
    public static Scanner scn=new Scanner (System.in);
    public static void main(String[]args){
        String str=scn.next();
        int a=(str.charAt(0)-'0')*10+str.charAt(1)-'0';
        char ch=str.charAt(str.length()-2);
        if(ch=='P'){
            if(a==12)
            System.out.print("12");
            else
            System.out.print(a+12);
        }
        else{
            if(a==12)
            System.out.print("00");
            else
            System.out.print(str.substring(0,2));
        }
        System.out.print(str.substring(2,8));
    }
}