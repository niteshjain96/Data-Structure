import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner scn = new Scanner (System.in);
		int b=scn.nextInt();
		int n1=scn.nextInt();
		int n2=scn.nextInt();
		
		int c=0;
		int sum=0;
		int tp=1;
		while(n1>0 || n2>0 || c>0){
		    int d1=n1%10;
		    n1=n1/10;
		    int d2=n2%10;
		    n2=n2/10;
		     
		     int d=d1+d2+c;
		     c=d/b;
		     d=d%b;
		     sum=sum+d*tp;
		     tp=tp*10;
		}
		System.out.println(sum);
	}
}
