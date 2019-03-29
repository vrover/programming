package Algorithms;
public class Dijkstra {
    static final int V=9;
      int minDistance(Boolean[] sptSet, int[] dist) {
          int min=Integer.MAX_VALUE;
          int min_index=-1;
          for(int l=0;l<V;l++){
          if(sptSet[l]==false && dist[l]<min){
          min=dist[l];
          
          min_index=l;
          }
          }
          return min_index;
       }
   void dijkstra(int graph[][],int src){
        Boolean sptSet[]=new Boolean[V];
        int dist[]=new int[V];
        for(int i=0;i<V;i++){
        dist[i]=Integer.MAX_VALUE;
        sptSet[i]=false;
        }
        dist[src]=0;
        
        for(int j=0;j<V-1;j++){
        int u=minDistance(sptSet,dist);
        sptSet[u]=true;
        for(int k=0;k<V;k++){
        if(sptSet[k]==false && graph[u][k]!=0 && dist[u]+graph[u][k]<dist[k]){
        dist[k]=dist[u]+graph[u][k];
        }
        }
        }
        printSolution(dist,V);
   }
     void printSolution(int dist[], int n)
    {
        System.out.println("Vertex   Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i+" \t\t "+dist[i]);
    }

   public static void main(String[] args){
   int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
                                  {4, 0, 8, 0, 0, 0, 0, 11, 0},
                                  {0, 8, 0, 7, 0, 4, 0, 0, 2},
                                  {0, 0, 7, 0, 9, 14, 0, 0, 0},
                                  {0, 0, 0, 9, 0, 10, 0, 0, 0},
                                  {0, 0, 4, 14, 10, 0, 2, 0, 0},
                                  {0, 0, 0, 0, 0, 2, 0, 1, 6},
                                  {8, 11, 0, 0, 0, 0, 1, 0, 7},
                                  {0, 0, 2, 0, 0, 0, 6, 7, 0}
                                 };
   Dijkstra d=new Dijkstra();
   d.dijkstra(graph,0);
  
   
   
   }
}
