
package practice;

import java.util.Scanner;

public class Shageer_and_crossroads {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    int ar[][]=new int[4][4];
   
    
    for(int i=0;i<4;i++){
    for(int j=0;j<4;j++){
   ar[i][j]=sc.nextInt();
    }
    }
    for(int k=0;k<4;k++){
       
        if(ar[k][3]==1){
            if(ar[k][0]==1 || ar[k][1]==1 || ar[k][2]==1 ){
              System.out.println("YES");
        return;
            }
        if(ar[(k+1)%4][0]==1){
            System.out.println("YES");
        return;
        }
        if(ar[(k+2)%4][1]==1){
            System.out.println("YES");
        return;
        }
        if(ar[(k+3)%4][2]==1){
            System.out.println("YES");
        return;
        }
        
        }
 
    }
    
     System.out.println("NO"); 
    }
    
}
