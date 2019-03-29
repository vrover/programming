/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import sun.util.locale.StringTokenIterator;

/**
 *
 * @author Public
 */
public class BellmanFord {
    class Edge{
        int src,dest,weight;
    Edge(int s,int d,int w){
    src=s;
    dest=d;
    weight=w;
    }
    }
    
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int V=Integer.parseInt(st.nextToken());
        int E=Integer.parseInt(st.nextToken());
        BellmanFord g=new BellmanFord();
        Edge edge[]=new Edge[E];
        for(int i=0;i<E;i++){
         StringTokenizer st1=new StringTokenizer(br.readLine());
         edge[i]=g.new Edge(Integer.parseInt(st1.nextToken()),Integer.parseInt(st1.nextToken()),Integer.parseInt(st1.nextToken()));
        }
         int d[]=new int[V];
        for(int k=1;k<V;k++)
            d[k]=Integer.MAX_VALUE;
        d[0]=0;
        for(int i=0;i<V-1;i++){
        for(int j=0;j<E;j++){
       
            if(d[edge[j].src]!=Integer.MAX_VALUE && d[edge[j].dest]>d[edge[j].src]+edge[j].weight)
            {
                d[edge[j].dest]=d[edge[j].src]+edge[j].weight;
            }
        }
        
        }
        
         for(int j=0;j<E;j++){
       
            if(d[edge[j].src]!=Integer.MAX_VALUE && d[edge[j].dest]>d[edge[j].src]+edge[j].weight)
            {
                System.out.println(-1);
                break;
            }
        }
        for(int i=0;i<V;i++){
        System.out.println(d[i]);
        }
        
    }
}
