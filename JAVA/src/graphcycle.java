
import java.util.*;
import javafx.util.Pair;

public class graphcycle {
   LinkedList l[];
   int vertex=0;
   ArrayList white=new ArrayList();
   ArrayList grey=new ArrayList();
   ArrayList black=new ArrayList();
   public graphcycle(int v){
       vertex=v;
   l=new LinkedList[v];
   for(int i=0;i<v;i++){
   l[i]=new LinkedList();
   white.add(i);
   }
   }
   int count=0;
  // Stack<Pair<Integer,Integer>> st=new Stack<>();
  int detectCycle(){
   while(white.size()>0){
   
       if(DFS((int)white.get(0))){
           count++;
           white.clear();
           grey.clear();
           black.clear();
           for(int i=0;i<vertex;i++)
               white.add(i);
       }
   }
   return count;
   }
    
    boolean DFS(int current){
    
        move(current,white,grey);
        Iterator i=l[current].listIterator();
        while(i.hasNext()){
        int z=(int)i.next();
        if(black.contains(z)){
        continue;
        }
        if(grey.contains(z)){
            removeEdge(current,z);
        return true;
        }
        if(DFS(z)){
            
        return true;
        }
        }
        move(current,grey,black);
        return false;
    }
    void move(int n,ArrayList l1,ArrayList l2){
        l1.remove((Integer)n);
    l2.add(n);
    }
   void addEdge(int x,int y){
   l[x].add(y);
   } 
   void removeEdge(int a,int b){
   l[a].remove((Integer)b);
   }
    public static void main(String[] args){
    graphcycle g=new graphcycle(6);
    g.addEdge(0,1);
    g.addEdge(0,3);
    g.addEdge(1,2);
    g.addEdge(1,3);
   // g.addEdge(2,0);
    g.addEdge(3,4);
  //  g.addEdge(4,0);
   g.addEdge(4,5);
  g.addEdge(4,1);
 //  g.addEdge(5,3);
    System.out.println(g.detectCycle());
    for(int i=0;i<g.vertex;i++)
   System.out.println(g.l[i]);
    }
}
