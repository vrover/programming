/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPackage;

import java.util.Scanner;


public class quick {
    
    int partition(int A[],int start,int end){
        int pivot=A[end];
        int pindex=start;
        for(int i=start;i<end;i++){
        if(A[i]<=pivot){
        int temp=A[i];
        A[i]=A[pindex];
        A[pindex]=temp;
        pindex++;
        }
        }
        A[end]=A[pindex];
        A[pindex]=pivot;
        return pindex;
    }
    
     void sort(int A[],int start, int end){
         if(start<end){
     int pivotIndex=partition(A,start,end);
     sort(A,start,pivotIndex-1);
     sort(A,pivotIndex+1,end);}
}
     
     public static void main(String[] args){
          quick obj=new quick();
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    
  for(int i=0;i<n;i++){
a[i]=sc.nextInt();
    }
  obj.sort(a,0,n-1);
  
   for(int i=0;i<n;i++){
System.out.print(a[i]+" ");
    }
     }
}
