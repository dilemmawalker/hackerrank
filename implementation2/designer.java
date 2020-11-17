import java.util.Scanner;
public class designer{
    public static Scanner scn =new Scanner(System.in);
    public static void main(String[]args){
        int []arr=new int[26];
        for(int i=0;i<26;i++){
            int a=scn.nextInt();
            arr[i]=a;
        }
        String str=scn.next();
        int max=0;
        for(int i=0;i<str.length();i++){
            int a=str.charAt(i)-'a';
            max=Math.max(arr[a],max);
        }
        System.out.println(max*str.length());
    }
}