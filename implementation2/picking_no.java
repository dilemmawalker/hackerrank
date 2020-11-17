import java.util.Scanner;
import java.util.ArrayList;
public class picking_no{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n-1;i++){
           int a=scn.nextInt();
           arr[i]=a;
        }
        int max=0;
        for(int i=0;i<n;i++){
            int c=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j] || arr[i]-arr[j]==1 || arr[j]-arr[i]==1)
                c++;
            }
            max=Math.max(c,max);
        }
        System.out.println(max);
    }
}