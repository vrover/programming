/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class pariksha1 {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
     for(int i=0;i<n;i++){
     int x=sc.nextInt();
     int ar[]=new int[x];
     int a[][]=new int[x+2][x+2];
     a[0][0]=-2;
     a[0][1]=-1;
     a[1][0]=-1;
     for(int j=0;j<x;j++){
     ar[j]=sc.nextInt();
     a[0][j+2]=ar[j];
     a[j+2][0]=ar[j];
     if(j!=0){
     a[1][j]=0;
     a[j][1]=0;
     }
     }
     
     for(int k=2;k<=x+1;k++){
     for(int j=2;j<=x+1;j++){
     if(a[k][0]-a[0][j]==1 || a[k][0]-a[0][j]==-1){ 
     a[k][j]=a[k-1][j-1]+1;
     }
     else{
         if(a[k][j-1]<a[k-1][j]){
         a[k][j]=a[k-1][j];
         }
         else{
         a[k][j]=a[k][j-1];
         }
             
     }
     }
     
     }
     if(a[x+1][x+1]==0){
     System.out.println("1");
     }
     else{
         System.out.println(a[x+1][x+1]+1);
     }
     }
    }
}
