import java.io.*;
import java.util.*;
public class dayof{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int y=scn.nextInt();
        if(y<=1917){
            if(y%4==0){
                System.out.println("12.09."+y);
            }
            else{
                System.out.println("13.09."+y);
            }
        }
        else if(y>=1919){
            if(y%400==0 || (y%4==0 && y%100!=0)){
                System.out.println("12.09."+y);
            }
            else{
                System.out.println("13.09."+y);
            }
        }
        else{
            System.out.println("26.09."+y);
        }
    }
}