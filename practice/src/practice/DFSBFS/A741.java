/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

/**
 *
 * @author Public
 */
public class A741 {
    static int count=0;
     static int k=-1;
     public static void main(String[] args) throws Exception{
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
     ArrayList<Integer> a=new ArrayList<Integer>();
     LinkedList ad[]=new LinkedList[n];
    
   boolean visited[]=new boolean[n];
   Arrays.fill(visited,false);
   StringTokenizer st1=new StringTokenizer(br.readLine());
     for(int i=0;i<n;i++){
     ad[i]=new LinkedList();
     int k=Integer.parseInt(st1.nextToken());
     if(k-1!=i)
     ad[i].add(k-1);
     }
         int t=0;
       
   class dfs{
       
       int gcd(int a, int b) {
  if (b == 0) return a;
  return gcd(b, a%b);
}
int lcm(int[] a, int n) {
  int res = 1, i;
  for (i = 0; i < n; i++) {
    res = res*a[i]/gcd(res, a[i]);
  }
  return res;
}
       
  void DFS(int x,boolean[] v){
      count++;
      k=x;
  v[x]=true;
  ListIterator itr= ad[x].listIterator();
  while(itr.hasNext()){
  int n=(int)itr.next();
  
   if(v[n]==false)
          DFS(n,v);
  }
  }
 }
   
     for(int i=0;i<n;i++){
      count=0;
    
  if(visited[i]==false){
     new dfs().DFS(i,visited);
         if((ad[k].isEmpty()) ){
             if(count==1)
             t=1;
             else{ System.out.println(-1);
    return;    }}
         else if(count==2 && (int)ad[k].getFirst()==i) {t=1;}
   else if(((int)ad[k].getFirst()!=i)){
         System.out.println(-1);
    return;     
   }
   else {
   t=count;
   }
         if(t%2==0)
         a.add(t/2);
         else
             a.add(t);
  }
         }
    int ar[]=new int[a.size()];
    int l=0;
    for(Integer z:a){ar[l]=z; l++;}
     System.out.println(new dfs().lcm(ar, a.size()));
     }
}
