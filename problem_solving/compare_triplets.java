import java.util.*;
import java.io.*;
public class compare_triplets{
    public static Scanner scn=new Scanner(new InputStreamReader(System.in));
    public static void main(String []args){
        int a1=scn.nextInt();
        int a2=scn.nextInt();
        int a3=scn.nextInt();
        int b1=scn.nextInt();
        int b2=scn.nextInt();
        int b3=scn.nextInt();
        int aa=0;
        int bb=0;
        if(a1>b1)
        aa++;
        else if (b1>a1)
        bb++;
        if(a2>b2)
        aa++;
        else if (b2>a2)
        bb++;
        if(a3>b3)
        aa++;//
        else if(b3>a3)
        bb++;
        System.out.println(aa+" "+bb);
    }
}