import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        int n=scn.nextInt();
        
        int div=1;
        int temp=n;
        while(temp>=10){
            temp=temp/10;
            div*=10;
        }
        while(div>=1){
            int r=n%div;
            int q=n/div;
            System.out.print(q+" ");
            n=r;
            div=div/10;
        }
    }
}