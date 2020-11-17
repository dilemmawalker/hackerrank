import java.io.*;
import java.util.*;
public class valley{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int c=0;
        int u=0;
        int d=0;
        String str=scn.next();
        for(int i=0;i<n;i++){
            int a=str.charAt(i);
            if(a=='D'){
                if(u==0 && d==0){
                    c++;
                }
            d++;
            if(u>0){
            u--;
            d--;
            }
            }
            else if(a=='U'){
            u++;
            if(d>0){
            d--;
            u--;
            }
            }
            
        }
        System.out.println(c);
    }
}