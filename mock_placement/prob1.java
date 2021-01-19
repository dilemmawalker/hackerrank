import java.util.Scanner;
public class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=scn.nextInt();
        int t=scn.nextInt();
        int t1=t;
        int c=0;
        int num=0;
        int t2=0;
        
        while(c<n){
            if(t1>=9){
                num=(num*10)+9;
                t1-=9;
                c++;
            }
            else{
                num=(num*10)+t1;
                t1=0;
                c++;
            }
        }
        t2=t1;
        int n2=num;

        c=0;
        num=0;
        t1=t;
        if((n*9)>=t1)
        while(c<n){
             if(c+1==n){
                num=(t1)*(int)Math.pow(10,c)+num;
                t1=0;
                c++;
            }
            else if(t1>9){
                num=(9)*(int)Math.pow(10,c)+num;
                t1-=9;
                c++;
            }
            
            else if(t1>=2){
                num=(t1-1)*(int)Math.pow(10,c)+num;
                t1=1;
                c++;
            }
            else {
                    c++;
            }
        }
        if(t1==0 && t2==0)
        System.out.print(n2+" "+num);
            else
            System.out.print("Not Possible");
}
}