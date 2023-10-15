import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int x=scn.nextInt();
        int n=scn.nextInt();
        int ans=power(x,n);
        System.out.println(ans);
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int fn1=power(x,n/2);
        int fn=fn1*fn1;
        if(n%2==1){
            fn *=x;
        }
        return fn;
    }
}