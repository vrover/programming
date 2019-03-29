/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.DFSBFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

/**
 *
 * @author Public
 */
public class B574 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        LinkedList ad[]=new LinkedList[n+1];
        for(int i=0;i<n+1;i++){
        ad[i]=new LinkedList();
        }
        for(int i=0;i<m;i++){
         StringTokenizer st1=new StringTokenizer(br.readLine());
         int u=Integer.parseInt(st1.nextToken());
         int v=Integer.parseInt(st1.nextToken());
         ad[u].add(v);
         ad[v].add(u);
        }
        int minRec=Integer.MAX_VALUE;
        boolean visited[]=new boolean[n+1];
        for(int i=1;i<=n;i++){
            visited[i]=true;
            LinkedList tempi=new LinkedList(ad[i]);
        for(int j=1;j<=n;j++){
            
           
        if(i!=j && visited[j]==false && ad[i].contains(j)){
          LinkedList temp2=new LinkedList(ad[j]);
       // tempi.remove(tempi.indexOf(j));
       // temp2.remove(temp2.indexOf(i));
        temp2.retainAll(tempi);
        ListIterator itr=temp2.listIterator();
        while(itr.hasNext()){
        int x=(int)itr.next();
        int sum=ad[i].size()+ad[j].size()+ad[x].size()-6;
        minRec=Math.min(sum,minRec);
       
        }
        }
        //tempi.add(j);
        }
        }
        if(minRec==Integer.MAX_VALUE){
        System.out.println(-1);
        }
        else{
            System.out.println(minRec);}
        
    }
}
