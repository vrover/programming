
import java.util.Iterator;
import java.util.LinkedList;


public class GraphDFS {
     int V=4;
    LinkedList<Integer> adj[]=new LinkedList[V];
   
    GraphDFS(int V){
    for(int i=0;i<V;i++){
    adj[i]=new LinkedList();
    }
}
    void DFSpre(int s){
     boolean visited[]=new boolean[V];
     
     DFS(s,visited);
    }
    void DFS(int s,boolean b[]){
    b[s]=true;
    System.out.print(s+" ");
    Iterator i=adj[s].listIterator();
    while(i.hasNext()){
    int n=(int) i.next();
    if(b[n]==false){
        DFS(n,b);
    }
    }
    }
    void addEdge(int v,int w){
    adj[v].add(w);
    }
    public static void main(String[] args){
    GraphDFS g=new GraphDFS(4);
    g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 g.DFSpre(2);
    }
}
