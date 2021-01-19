import java.util.Scanner;
public class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int n2=scn.nextInt();
        for(int i=n;i<=n2;i++){
            if(solve(i))
            System.out.print(i+" ");
        }
    }
    public static boolean solve(int n){
        int num=n;
        while(n>0){
            int a=n%10;
            if(a==0 || num%a!=0)
            return false;
            n/=10;
        }
        return true;
    }
}