import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=sc.nextInt();
        int nsp=n-1;
        int nst=1;
        
        for(int i=1;i<=n;i++){
            for(int i=1;i<=nsp;i++){
                System.out.print(" ");
            }
            for(int i=1;i<=nst;i++){
                System.out.print("*");
            }
            System.out.println();
            nsp--;
            nst++;
        }
    }
}