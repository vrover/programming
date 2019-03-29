
package practice.DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class LearningLanguages277A {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        ArrayList a[]=new ArrayList[n];
        LinkedList l[]=new LinkedList[n];
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++){
        a[i]=new ArrayList<Integer>();
        l[i]=new LinkedList();
        }
        int c=0;
        for(int i=0;i<n;i++){
        StringTokenizer st1=new StringTokenizer(br.readLine());
        int k=Integer.parseInt(st1.nextToken());
        for(int j=0;j<k;j++){
        a[i].add(Integer.parseInt(st1.nextToken()));
        }
        if(a[i].size()==0)
            c++;
        }
        if(c==n){System.out.println(c); return;}
        for(int i=0;i<n;i++){
            ArrayList ci=new ArrayList(a[i]);
        for(int j=0;j<n;j++){
        if(i!=j){
        
        ArrayList cj=new ArrayList(a[j]);
        cj.retainAll(ci);
        if(cj.size()!=0){l[i].add(j);}
        }
        }
        }
          class dfs{
  void DFS(int x,boolean[] v){
     
  v[x]=true;
  ListIterator itr= l[x].listIterator();
  while(itr.hasNext()){
  int n=(int)itr.next();
   
      if(v[n]==false){
          
          DFS(n,v);}
  }
  }
 }
           int count=0;
     for(int i=0;i<n;i++){
      
     if(visited[i]==false){
     count++;
     new dfs().DFS(i,visited);}
     }
     System.out.println(count-1);
        
    }
}
