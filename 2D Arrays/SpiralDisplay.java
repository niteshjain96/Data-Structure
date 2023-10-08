import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner (System.in);
       int n=scn.nextInt();
       int m=scn.nextInt();
       int [][] arr= new int[n][m];
       for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[0].length;j++){
               arr[i][j]=scn.nextInt();
           }
       }
       int minr=0;
       int minc=0;
       int maxr=arr.length-1;
       int maxc=arr[0].length-1;
       int total=n*m;
       int count=1;
       
       while(count<=total){
           // Left Wall
           for(int r=minr;r<=maxr && count<=total;r++){
               System.out.println(arr[r][minc]);
           }
           minc++;
           // Bottom Wall
           for(int j=minc;j<=maxc && count<=total;j++){
               System.out.println(arr[maxr][j]);
           }
           maxr--;
           // Right Wall
           for(int i=maxr;i>=minr && count<=total;i--){
               System.out.println(arr[i][maxc]);
           }
           maxc--;
           // Top Wall
           for(int j=maxc;j>=minc && count<=total;j--){
               System.out.println(arr[minr][j]);
           }
           minr++;
       }
    }

}