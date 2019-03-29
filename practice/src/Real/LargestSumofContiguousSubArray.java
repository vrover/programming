/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Real;

import java.io.BufferedReader;
import java.io.*;
import java.util.StringTokenizer;
import sun.util.locale.StringTokenIterator;

/**
 *
 * @author Shivi
 */
public class LargestSumofContiguousSubArray  {
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
    ar[i]=0;
    }
    int sum=a[0];
    ar[0]=a[0];
   
   
    for(int j=1;j<n;j++){
        
        int s=a[j]+ar[j-1];
    if(s>a[j]){
    ar[j]=s;
    sum=Math.max(s,sum);
    }
    else{
        ar[j]=a[j];
        sum=Math.max(ar[j],sum);
    }
    }
    System.out.println(sum);
    }}
}
