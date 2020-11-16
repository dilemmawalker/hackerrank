import java.io.*;
import java.util.*;
public class bon_appetite{
        public static Scanner scn=new Scanner (System.in);
        public static void main(String[]args){
            int n=scn.nextInt();
            int k=scn.nextInt();
            int arr[]=new int[n];
            int c=0;
            for(int i=0;i<n;i++){
                arr[i]=scn.nextInt();
                if(i!=k)
                c+=arr[i];
            }
            int b=scn.nextInt();
            int avg=c/2;
            if(b==avg)
            System.out.println("Bon Appetit");
            else
            System.out.println(b-avg);
        }
}