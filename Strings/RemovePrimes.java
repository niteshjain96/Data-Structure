import java.io.*;
import java.util.*;

public class Main {

    public static boolean isPrime(int num){
        boolean isPrime=true;
        for(int div=2;div*div<=num;div++){
            if(num%div==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
    
	public static void solution(ArrayList<Integer> al){
		for(int i=0;i<al.size();i++){
		    int val=al.get(i);
		    boolean isValuePrime=isPrime(val);
		    if(isValuePrime==true){
		        al.remove(i);
		        i--;
		        
		    }
		}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}