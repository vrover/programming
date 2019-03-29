/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Real;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Shivi
 */
public class MaximumSumIncreasingSsubSequence {
     public static void main(String[] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   int t=Integer.parseInt(br.readLine());
   for(int k=0;k<t;k++){
    int n=Integer.parseInt(br.readLine());
    int a[]=new int[n];
    int ar[]=new int[n];
         StringTokenizer st=new StringTokenizer(br.readLine());
    for(int i=0;i<n;i++){
    a[i]=Integer.parseInt(st.nextToken());
    ar[i]=a[i];
    }
    int sum=0;
   
    for(int j=1;j<n;j++){
        for(int v=0;v<j;v++){
        if(a[j]>a[v] && ar[j]<ar[v]+a[j]){
        ar[j]=ar[v]+a[j];
        }
        }
    
    }
    for(int x:ar){
    if(x>sum){sum=x;}
    }
    System.out.println(sum);
   }
     }
}
