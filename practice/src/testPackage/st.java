/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testPackage;

import java.util.Scanner;

/**
 *
 * @author Public
 */
public class st {
    
     public void mergesort(int A[],int N){
    if(N<2){
    return;}
    int mid=N/2;
    int left[]=new int[mid];
    int right[]=new int[N-mid];
    for(int i=0;i<mid;i++){
    left[i]=A[i];
    }
    for(int i=0;i<(N-mid);i++){
    right[i]=A[mid+i];
    }
    mergesort(left,mid);
    mergesort(right,N-mid);
    sortlast(left,right,A,N);
    }
   public  void sortlast(int l[],int r[],int A[],int t){
    int nl=t/2;
    int nr=t-nl;
    int nA=t;
    int i=0,j=0,k=0;
    while(i<nl && j<nr){
    
        if(l[i]<r[j]){
        A[k]=l[i];
        i++;
        
        }
        else{
        A[k]=r[j];
        j++; 
        
        }
        k++;
    }
    while(i<nl){
				A[k]=l[i];
				i++;
				k++;
		}
		while(j<nr){
				A[k]=r[j];
				j++;
				k++;
		}
    }
    
    
    public static void main(String[] args){
        st obj=new st();
    Scanner sc=new Scanner(System.in);
    int n=5;
    int a[]=new int[n];
    
  for(int i=0;i<n;i++){
a[i]=sc.nextInt();
    }
  obj.mergesort(a,5);
  
   for(int i=0;i<n;i++){
System.out.print(a[i]+" ");
    }
  
    }
}
