/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author Public
 */
public class Treasure_hunt {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int x1=sc.nextInt();
    int y1=sc.nextInt();
    int x2=sc.nextInt();
    int y2=sc.nextInt();
    int x=sc.nextInt();
    int y=sc.nextInt();
    
    int xcount=0;
    if((x2-x1)%x==0){
   if(x1<=x2){
   
       while(x1<x2 ){
       x1=x1+x;
       xcount++;
       }
   }
   if(x1>x2){
   
       while(x1>x2 ){
       x1=x1-x;
       xcount++;
       }
   }
    }
     else{
    System.out.println("NO");
    return;
    }
    int ycount=0;
    if((y2-y1)%y==0){
   if(y1<=y2){
   
       while(y1<y2 ){
       y1=y1+y;
       ycount++;
       }
   }
   if(y1>y2){
   
       while(y1>y2 ){
       y1=y1-y;
       ycount++;
       }
   }
    }
    else{
    System.out.println("NO");
    return;
    }
    
    if((ycount-xcount)%2==0){
    System.out.println("YES");
    }
    else{
    
    System.out.println("NO");}
    
   
    }
}
