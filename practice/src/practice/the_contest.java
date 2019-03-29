
package practice;

import java.util.Scanner;

public class the_contest {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
   // int a[]=new int[n];
   int total=0;
    for(int i=0;i<n;i++){
    total=total+sc.nextInt();
    }
    int m=sc.nextInt();
    int ar[][]=new int[m][2];
    for(int i=0;i<m;i++)
    {
    ar[i][0]=sc.nextInt();
    ar[i][1]=sc.nextInt();
    }
  
    for(int i=0;i<m;i++){
   if( total<=ar[i][1]){
       if(ar[i][0]<=total){
       System.out.println(total);
       return;
       }
       if(ar[i][0]>=total){
       System.out.println(ar[i][0]);
       return;
       }
       
   }
    }
    System.out.println("-1");
    }
}
