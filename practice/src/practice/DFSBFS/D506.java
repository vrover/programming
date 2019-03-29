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
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;
import javafx.util.Pair;

/**
 *
 * @author Public
 */
public class D506 {
    public static int count=0;
    static boolean found=false;
      public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        LinkedList ad[]=new LinkedList[n+1];
        boolean visited[]=new boolean[n+1];
        HashSet l[]=new HashSet[n+1];
        for(int i=0;i<n+1;i++){
        ad[i]=new LinkedList<Pair<Integer,Integer>>();
        l[i]=new HashSet();
        }
        for(int i=0;i<m;i++){
        StringTokenizer st1=new StringTokenizer(br.readLine());
        int u=Integer.parseInt(st1.nextToken());
        int v=Integer.parseInt(st1.nextToken());
        int c=Integer.parseInt(st1.nextToken());
       
        l[u].add(c);
        l[v].add(c);
        ad[u].add(new Pair(c,v));
        ad[v].add(new Pair(c,u));
        }
            class dfs{
          
  void DFS(int x,int y,int c,boolean[] v){
     v[x]=true;
      if(x==y || found==true){
     found=true;
     return;
     }
  ListIterator itr= ad[x].listIterator();
  while(itr.hasNext()){
       
  }
  }
 }
        
        int q=Integer.parseInt(br.readLine());
        for(int i=0;i<q;i++){
         StringTokenizer st2=new StringTokenizer(br.readLine());
        int x=Integer.parseInt(st2.nextToken());
        int y=Integer.parseInt(st2.nextToken());
        HashSet tx=new HashSet(l[x]);
        tx.retainAll(l[y]);
            Iterator itr=tx.iterator();
            while(itr.hasNext()){
                Arrays.fill(visited,false);
            int color=(int)itr.next();
            new dfs().DFS(x, y, color,visited);
            if(found==true){count++; found=false;}
            }
            System.out.println(count);
        count=0;
        }
      
      
      }
}
