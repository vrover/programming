/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Real;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Public
 */
public class LongestIncreasingSubsequence {
     public static void main(String[] args) throws Exception{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int t=Integer.parseInt(br.readLine());
      for(int j=0;j<t;j++){
      int n=Integer.parseInt(br.readLine());
    StringTokenizer st=new StringTokenizer(br.readLine());
    int a[]=new int[n];
    int ar[]=new int[n];
    for(int i=0;i<n;i++){
    a[i]=Integer.parseInt(st.nextToken());
    ar[i]=1;
    }
    int max=ar[0];
    for(int i=1;i<n;i++){
    int k=0;
    while(k<i){
    if(a[i]>a[k] && ar[i]<=ar[k]){
    ar[k]=ar[i]+1;
    max=Math.max(max,ar[i]);
    }
    }
    }
    System.out.println(max);
      }
     }
}
