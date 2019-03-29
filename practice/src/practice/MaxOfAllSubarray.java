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
public class MaxOfAllSubarray {
    	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    
		    int N=sc.nextInt();
		    int a[]=new int[N];
                    
		    int k=sc.nextInt();
                   
		    for(int j=0;j<N;j++){
		        a[j]=sc.nextInt();
                     
		    }
                 
		    int s=0;
		    
		    for(int l=0;l<=(N-k);l++){
                   
                    int max=a[s];
                    for(int m=s;m<l+k;m++){
                    max=Math.max(max, a[m]);
                    
                    }
		        s=s+1;
                        System.out.print(max+" ");
		    }
		    System.out.println();
		}
	}
}
