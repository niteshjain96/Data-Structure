import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int nsp=0;
        int nst=n;
        for(int r=1;r<=n;r++){
            for(int i=1;i<=nsp;i++){
                System.out.print("\t");
            }
            for(int i=1;i<=nst;i++){
                System.out.print("*\t");
            }
            System.out.println();
            nst--;
            nsp++;
        }

    }
}