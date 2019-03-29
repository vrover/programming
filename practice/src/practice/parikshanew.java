/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

public class parikshanew {
     public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
     for(int i=0;i<n;i++){
         int x=sc.nextInt();
     int ar[]=new int[x];
     int a[]=new int[x];
     for(int j=0;j<x;j++){
     ar[j]=sc.nextInt();
     a[j]=1;
     }
     int maxcount=a[0];
       for(int k=1;k<x;k++){
           int v=k-1;
           int count=a[k];
       while(v>=0){
       if(ar[k]-ar[v]==1 || ar[k]-ar[v]==-1){
           if(a[v]>=a[k]){
       a[k]=count+a[v];
           if(a[k]>maxcount){
           maxcount=a[k];
           }
           }
       }
       v--;
       }
               
       }
       System.out.println(maxcount);
     }
     }
}
