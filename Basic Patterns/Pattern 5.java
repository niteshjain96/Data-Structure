import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int nsp=n/2;
        int nst=1;
        
        for(int r=1;r<=n;r++){
            for(int i=1;i<=nsp;i++){
                System.out.print("\t");
            }
            for(int i=1;i<=nst;i++){
                System.out.print("*\t");
            }
            System.out.println();
            if(r>n/2){
                nsp++;
                nst -=2;
            }
            else
            {
                nsp--;
            nst +=2;    
            }
            
        }

    }
}