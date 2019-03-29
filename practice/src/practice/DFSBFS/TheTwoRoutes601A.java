/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import javafx.util.Pair;

/**
 *
 * @author Public
 */
public class TheTwoRoutes601A {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int t=Integer.parseInt(st.nextToken());
        int rt=Integer.parseInt(st.nextToken());
        LinkedList rail[]=new LinkedList[t+1];
        LinkedList road[]=new LinkedList[t+1];
        for(int i=0;i<=t;i++){
        rail[i]=new LinkedList();
        road[i]=new LinkedList();
        }
        for(int i=1;i<=rt;i++){
        StringTokenizer st1=new StringTokenizer(br.readLine());
       
        int x=Integer.parseInt(st1.nextToken());
        int y=Integer.parseInt(st1.nextToken());
        rail[x].add(y);
        rail[y].add(x);
        }
        for(int i=1;i<=t;i++){
        for(int j=1;j<=t;j++){
        if(i!=j){
        if(!rail[i].contains(j))
            road[i].add(j);
        }
        }
        }
       
        boolean visited[]=new boolean[t+1];
        Queue<Pair<Integer,Integer>> q=new LinkedList<Pair<Integer,Integer>>();
         if(rail[1].contains(t)){
             
    q.add(new Pair(1,0));
    
    visited[0]=true;
    while(!q.isEmpty()){
        Pair p=q.poll();
        if((int)p.getKey()==t){
        System.out.println(p.getValue());
        return;
        }
    int v=(int)p.getKey();  
    Iterator i=road[v].listIterator();
    while(i.hasNext()){
        int k=(int)i.next();
        
    if(visited[k]!=true){
    visited[k]=true;
    q.add(new Pair(k,(int)p.getValue()+1));
    }
    }
     }
  }
         else{
                  
    q.add(new Pair(1,0));
    
    visited[0]=true;
    while(!q.isEmpty()){
        Pair p=q.poll();
        if((int)p.getKey()==t){
        System.out.println(p.getValue());
        return;
        }
    int v=(int)p.getKey();  
    Iterator i=rail[v].listIterator();
    while(i.hasNext()){
        int k=(int)i.next();
        
    if(visited[k]!=true){
    visited[k]=true;
    q.add(new Pair(k,(int)p.getValue()+1));
    }
    }
     }
         
         }
         
         
         
         System.out.println(-1);
         
         
         }
    }
