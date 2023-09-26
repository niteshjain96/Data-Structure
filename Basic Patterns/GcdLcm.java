import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int temp1=n1;
        int temp2=n2;
        while(temp1%temp2!=0){
            int rem=temp1%temp2;
            temp1=temp2;
            temp2=rem;
            
        }
        System.out.println("GCD is " + temp2);
        int LCM= (n1*n2)/temp2;
        System.out.println("LCM is " + LCM);
    }
}