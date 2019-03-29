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
import javafx.util.Pair;


/**
 *
 * @author Public
 */
public class IceSkating {
    
    
 public static void main(String[] args) throws Exception{
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int n=Integer.parseInt(br.readLine());
     ArrayList<Pair<Integer,Integer>> d=new ArrayList<Pair<Integer,Integer>>();
     LinkedList ad[]=new LinkedList[n];
     boolean visited[]=new boolean[n];
     Arrays.fill(visited,false);
     for(int i=0;i<n;i++){
         ad[i]=new LinkedList<Integer>();
         StringTokenizer st=new StringTokenizer(br.readLine());
         d.add(new Pair(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
     }
     for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
             if(i!=j){
         if((int)(d.get(i).getKey())==(int)(d.get(j).getKey()) || (int)(d.get(i).getValue())==(int)(d.get(j).getValue()) )
             ad[i].add(j);}
         }
     }
   
     
   class dfs{
  void DFS(int x,boolean[] v){
     
  v[x]=true;
  ListIterator itr= ad[x].listIterator();
  while(itr.hasNext()){
  int n=(int)itr.next();
   
      if(v[n]==false){
          
          DFS(n,v);}
  }
  }
 }
     int count=0;
     for(int i=0;i<n;i++){
      
     if(visited[i]==false){
     count++;
     new dfs().DFS(i,visited);}
     }
     System.out.println(count-1);
 } 
}
