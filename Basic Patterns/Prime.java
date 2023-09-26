import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner scn = new Scanner (System.in);
        int n=scn.nextInt();
        boolean isprime=true;
        for(int i=2;i*i<n;i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        }
        if(n==1){
            System.out.println("Not Prime");
        }
        else if(isprime==true){
            System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
        }
    }
}