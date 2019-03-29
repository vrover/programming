import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.V;

public class PoliceStations {
      int V;
      int E;
      int k;
      int d;
    
    Scanner sc=new Scanner(System.in);
     LinkedList<Integer> adj[];
   PoliceStations(){
 V=sc.nextInt();
 k=sc.nextInt();
 d=sc.nextInt();
 
 E=V-1;
  LinkedList<Integer> adj[]=new LinkedList[V];
   for(int i=0;i<V;i++)
    adj[i]=new LinkedList();
   }
   boolean visited[]=new boolean[V];
   ArrayList al=new ArrayList();
   void getStation(){
       int p;
       for(int i=0;i<V;i++)
           visited[i]=false;
   for(int j=0;j<k;j++){
     p=sc.nextInt();
     al.add(p);
   visited[p]=true;}
   }
   boolean ed[]=new boolean[E];
   
   Map<Integer,Integer> h=new HashMap<Integer,Integer>();

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
    void addEdge(){
        int v,w;
        for(int i=0;i<V-1;i++){
            v=sc.nextInt();
            w=sc.nextInt();
             adj[v].add(w);
             h.put(v,w);
        }
    }
    public static void main(String[] args){
    PoliceStations g=new PoliceStations();
    g.addEdge();
        
 g.DFSpre(2);
    }
}
