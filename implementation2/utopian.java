import java.io.*;
import java.util.*;
public class utopian{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int t=scn.nextInt();
        while(t-->0){
        int n=scn.nextInt();
        int h=1;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                h*=2;
            }
            else{
                h+=1;
            }
        }
        System.out.println(h);
    }
    }
}