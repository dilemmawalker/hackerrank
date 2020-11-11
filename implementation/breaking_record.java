import java.io.*;
import java.util.*;
public class breaking_record{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int a = scn.nextInt();
        int max=a,min=a;
        int c1=0,c2=0;
        for(int i=1;i<n;i++){
             a = scn.nextInt();
            if(a>max){
                c1++;
                max=a;
            }
            if(a<min){
               c2++;
               min=a;
            }
        }
        System.out.println(c1+" "+c2);
    }
}