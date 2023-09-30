import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int d=scn.nextInt();
		int dn=0;
		int tp=1;
		while(n>0){
		    int pow=0;
		    int r=n%d;
		    n=n/d;
		    dn=dn+r*tp;
		    tp*=10;
		}
		System.out.println(dn);
		
	}
}
