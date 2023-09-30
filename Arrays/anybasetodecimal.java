import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int bgiven=scn.nextInt();
		int dn=0;
		int p=1;
		while(n>0){
		    int r=n%10;
		    n=n/10;
		    dn=dn+r*p;
		    p*=bgiven;
		}
		System.out.println(dn);
	}
}
