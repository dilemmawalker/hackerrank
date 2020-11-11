import java.io.*;
import java.util.*;
public class birthday_cake{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int tall=0;
        int max=0;
        int n=scn.nextInt();
        for(int i=0;i<n;i++){
            int a=scn.nextInt();
            if(a>tall){
                max=1;
                tall=a;
            }
            else if(a==tall){
                max++;
            }
        }
        System.out.println(max);
    }
}