/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Real;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EquilibriumPoint {
 public static void main(String[] args) throws Exception{
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int t=Integer.parseInt(br.readLine());
      for(int j=0;j<t;j++){
      int n=Integer.parseInt(br.readLine());
     
    StringTokenizer st=new StringTokenizer(br.readLine());
    int a[]=new int[n];
    for(int i=0;i<n;i++){
    a[i]=Integer.parseInt(st.nextToken());
    }
     if(n==1){
    System.out.println("1");
    continue;
    }
    int s=0,e=n-1;
    int lsum=a[0],rsum=a[n-1];
    while(e-s>2){
    if(lsum>=rsum){
    rsum+=a[--e];
    }
    else if(rsum>lsum){
    lsum+=a[++s];
    }
   
    }
    if(lsum==rsum && s!=0){
    System.out.println(e);
    }
    else if(lsum==rsum && s==0 && e-s==2){
    System.out.println(1);
    }
    else{
    System.out.println(-1);
    }
      }
}
}
