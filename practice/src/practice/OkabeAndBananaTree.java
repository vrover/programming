/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.util.*;
 class OkabeAndBananaTree {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long m=sc.nextInt();
    long b=sc.nextInt();
    long x=m*b;
    long y=b;
   
   long count1=0;
    for(int i=0;i<=x;i++){
        long l=(int)((float)b-(float)((float)i/(float)m));
        count1=Math.max(count1,(i+1)*(l+1)*(i+l)/2);
    }
       
        
    
    
    
    
    System.out.println(count1);
    }
}
