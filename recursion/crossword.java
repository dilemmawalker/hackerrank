import java.io.*;
import java.util.*;
public class crossword{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int n=10;
        char [][]arr=new char[n][n];
        HashMap<String,Integer>[]ar=new HashMap[n];
        for(int i=0;i<n;i++){
            String str=scn.next();
            for(int j=0;j<n;j++){
                char ch=str.charAt(i);
                arr[i][j]=ch;
            }
        }
        for(int i=0;i<n;i++){
            ar[i]=new HashMap<>();
        }
        int c=0;
        String s="";
        String str=scn.next();
        for(int i=0;i<str.length();i++){
            char ch=str.chatAt(i);
            if(ch!=';'){
                c++;
                s+=ch;
            }
            else{
                ar[c].put(s,1);
                c=0;
                s="";
            }
        }
        solve();
    }
    public static void solve(int idx,char [][]arr,HashMap<String,Integer>[]ar){
        if(){

        }

        int m=10;
        int r=idx/m;
        int c=idx%m;
        char ch=arr[r][c];
        if(ch=='+'){
            solve(idx+1,arr,ar);
        }
        else {
           
        }
    }
}