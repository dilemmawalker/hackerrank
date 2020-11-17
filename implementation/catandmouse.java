import java.io.*;
import java.util.*;
public class catandmouse{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int q=scn.nextInt();
        while(q-->0){
            int x=scn.nextInt();
            int y=scn.nextInt();
            int z=scn.nextInt();
            int a=x>z?x-z:z-x;
            int b=y>z?y-z:z-y;
            if(a<b)
            System.out.println("Cat A");
            else if(b<a)
            System.out.println("Cat B");
            else
            System.out.println("Mouse C");
        }
    }
}