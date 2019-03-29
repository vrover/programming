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
import java.util.Queue;
import java.util.StringTokenizer;
import javafx.util.Pair;

/**
 *
 * @author Public
 */
public class TwoButtons520B {
 
    
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        if(a>b){System.out.print(a-b); return;}
        else if(a==b){System.out.print(0); return;}
        else{
        boolean v[]=new boolean[10001];
      Queue<Pair<Integer,Integer>> q=new LinkedList<Pair<Integer,Integer>>();
      Arrays.fill(v, false);
      q.add(new Pair(a,0));
      v[a]=true;
      while(!q.isEmpty()){
         
      int x=q.peek().getKey();
      int d=q.poll().getValue();
       if(x==b){
              System.out.println(d);
        return;      
       }
       if(2*x<10001 && v[2*x]==false){
            v[2*x]=true;
           q.add(new Pair(2*x,d+1));}
       if(x-1>=0 && v[x-1]==false){
           q.add(new Pair(x-1,d+1));
       v[x-1]=true;
       }
      
      }
        }
    }
}
