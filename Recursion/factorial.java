import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int n=scn.nextInt();
        int ans=factorial(n);
        System.out.println(ans);
    }

    public static int factorial(int n){
        if(n==0)
        {
            return 1;
        }
        int fn=factorial(n-1);
        int ans=n*fn;
        return ans;
    }

}