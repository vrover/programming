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

/**
 *
 * @author Public
 */
public class Party115A {
  public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
         LinkedList ad[]=new LinkedList[n+1];
     boolean visited[]=new boolean[n+1];
     for(int i=0;i<n+1;i++){
     ad[i]=new LinkedList();
     }
     for(int i=1;i<n+1;i++){
     int x=Integer.parseInt(br.readLine());
    if(x==-1){ad[0].add(i);}
    else
     ad[x].add(i);
     }
     int count=0;
     Queue<Integer> q=new LinkedList();
    q.add(0);
    q.add(-2);
    visited[0]=true;
    while(!q.isEmpty() && q.peek()!=-2){
    int v=q.poll();
    
    //System.out.print(v+" ");
    Iterator i=ad[v].listIterator();
    while(i.hasNext()){
        int k=(int)i.next();
        
    if(visited[k]!=true){
    visited[k]=true;
    q.add(k);
    }
    }
     if(q.peek()==-2 && q.size()!=1){
         count++;
     q.remove();
     q.add(-2);
     }
  }
    System.out.println(count);
}
}
