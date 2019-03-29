/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.Implementation;

import java.io.*;
import java.util.*;
import javafx.util.Pair;

/**
 *
 * @author Public
 */
public class C518 {
         public static void main(String[] args) throws Exception{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st=new StringTokenizer(br.readLine());
    int n=Integer.parseInt(st.nextToken());
    int m=Integer.parseInt(st.nextToken());
    int k=Integer.parseInt(st.nextToken());
    if(n<=k){System.out.println(m); return;}
    int ar[]=new int[n];
   ArrayList list=new ArrayList(n+1);
   for(int i=0;i<n+1;i++){
   list.add(0);
   }
   ArrayList l[]=new ArrayList[n/k+1];
    StringTokenizer st1=new StringTokenizer(br.readLine());
    long sum=0;
    for(int i=0;i<n/k+1;i++){
    l[i]=new ArrayList(k);
    }
    for(int i=0;i<n;i++){
        int v=Integer.parseInt(st1.nextToken());
        
    list.set(v,i/k);
    l[i/k].add(v);
    }
    StringTokenizer st2=new StringTokenizer(br.readLine());
    for(int i=0;i<m;i++){
    int x=Integer.parseInt(st2.nextToken());
    int j=(int)list.get(x);
    sum=sum+(j)+1;
    int y=l[j].indexOf(x);
    if(y==0 && j!=0){
        int t=(int)l[j-1].get(k-1);
        l[j].set(0, t);
        l[j-1].set(k-1,x );
        list.set(t,j);
        list.set(x, j-1);
  
   
    }
    
    else if(y!=0){
   l[j].set(y, l[j].get(y-1));
   l[j].set(y-1, x);
    }
    }
    System.out.println(sum);
     }
}
