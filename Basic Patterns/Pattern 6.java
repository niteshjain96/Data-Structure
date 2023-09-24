import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World");
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int cst=(n/2)+1;
		int csp=1;
		for(int i=1;i<=n;i++)
		{
		    for(int j=0;j<cst;j++)
		    {
		        System.out.print("*");
		    }
		    for(int k=0;k<csp;k++)
		    {
		        System.out.print(" ");
		    }
		    for(int z=0;z<cst;z++)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		    if(i<=n/2)
		    {
		        cst--;
		        csp+=2;
		    }
		    else
		    {
		        cst++;
		        csp-=2;
		    }
		}
		    
		    
		}
		
		
	}

