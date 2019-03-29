

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;


public class GraphBFS {
     int V=4;
    LinkedList<Integer> adj[]=new LinkedList[V];
   
    GraphBFS(int V){
    for(int i=0;i<V;i++){
    adj[i]=new LinkedList();
    }
    }
    void BFS(int v){
    boolean visited[]=new boolean[V];
    Queue<Integer> q=new LinkedList();
    q.add(v);
    visited[v]=true;
    while(!q.isEmpty()){
    v=q.poll();
    System.out.print(v+" ");
    Iterator i=adj[v].listIterator();
    while(i.hasNext()){
        int n=(int)i.next();
        
    if(visited[n]!=true){
    visited[n]=true;
    q.add(n);
    }
    }
    }
    }
    void addEdge(int v,int w){
    adj[v].add(w);
    }
    public static void main(String[] args){
    GraphBFS g=new GraphBFS(4);
    g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 g.BFS(2);
    }
}
