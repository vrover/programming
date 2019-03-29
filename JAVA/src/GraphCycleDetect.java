 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Public
 */
import java.util.*;
public class GraphCycleDetect {
    LinkedList l[];
    ArrayList white=new ArrayList();
    ArrayList grey=new ArrayList();
    ArrayList black=new ArrayList();
    int vertex;
    GraphCycleDetect(int v){
    l=new LinkedList[v];
    for(int i=0;i<v;i++){
        l[i]=new LinkedList();
        white.add(i);
    }
    vertex=v;
    }
    boolean detect(){
    while(white.size()>0){
    
        if(DFS((int)white.get(0))){
        return true;
        }
    }
    return false;
    
    }
    boolean DFS(int current){
    move(current,white,grey);
    Iterator i=l[current].listIterator();
    while(i.hasNext()){
    int z=(int)i.next();
    if(black.contains(z)){continue;}
    if(grey.contains(z)){return true;}
    if(DFS(z)){return true;}
    
    }
    move(current,grey,black);
    return false;
    }
    
    void move(int n,ArrayList l1,ArrayList l2){
        l1.remove((Integer)n);
    l2.add(n);
    }
    
   void addEdge(int a,int b){
    l[a].add(b);
    }
    
    public static void main(String[] args){
    GraphCycleDetect g=new GraphCycleDetect(5);
     g.addEdge(0,1);
    g.addEdge(0,3);
    g.addEdge(1,2);
  
    
    g.addEdge(3,4);
    g.addEdge(4,3);
   if(g.detect()){System.out.println("found");}
   else{
   System.out.println("Not found");
   }
   
    }
}
