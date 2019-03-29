/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

/**
 *
 * @author Public
 */
public class DZYLovesChemistry445B {
     static long maxDanger=1;
    public static void main(String[] args) throws Exception{
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
     LinkedList ad[]=new LinkedList[n+1];
    
     boolean visited[]=new boolean[n+1];
     Arrays.fill(visited,false);
     for(int i=1;i<=n;i++){
     ad[i]=new LinkedList();
     }
        for(int i=0;i<m;i++){
        StringTokenizer st1=new StringTokenizer(br.readLine());
        int x=Integer.parseInt(st1.nextToken());
        int y=Integer.parseInt(st1.nextToken());
        ad[x].add(y);
        ad[y].add(x);
        }
      
       class dfs{
          
  void DFS(int x,boolean[] v){
     
  v[x]=true;
  ListIterator itr= ad[x].listIterator();
  while(itr.hasNext()){
  int n=(int)itr.next();
   
      if(v[n]==false){
          maxDanger=maxDanger*2;
         
       
      
          DFS(n,v);}
  }
  }
 }
       
        for(int i=1;i<=n;i++){
     if(visited[i]==false){
     new dfs().DFS(i,visited);}
    }
    System.out.println(maxDanger);
    }   
}
