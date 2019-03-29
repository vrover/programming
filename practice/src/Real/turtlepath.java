/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Real;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import javafx.util.Pair;

/**
 *
 * @author Public
 */
public class turtlepath {
    public static void main(String[] args) throws Exception{
    
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
          int M=Integer.parseInt(st.nextToken());
        int g[][]=new int[N][M];
        boolean a[]=new boolean[100000];
        
        for(int i=0;i<N;i++){
            StringTokenizer st1=new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){g[i][j]=Integer.parseInt(st1.nextToken());}}
         Arrays.fill(a,true);       
    a[0]=a[1]=false; 
    for (int i=2;i<a.length;i++) {
        
        if(a[i]) {
            for (int j=2;i*j<a.length;j++) {
                a[i*j]=false;
            }
        }
    }
    int i=0,j=0;
    ArrayList<Pair<Integer,Integer>> p=new ArrayList<Pair<Integer,Integer>>();
    p.add(new Pair(1,1));
    
    while(j<M-1 || i<N-1){
    if((i<N-1 && j<M-1) && a[g[i+1][j+1]]){
        i=i+1;
    j=j+1;
    p.add(new Pair(i+1,j+1));
     
    }
    
    else if(i<N-1 && a[g[i+1][j]]){
        i=i+1;
     p.add(new Pair(i+1,j+1));  
         
    }
    else if(j<M-1 && a[g[i][j+1]]){
        j=j+1;
   p.add(new Pair(i+1,j+1));
        
    }
    
       
    }
    System.out.println(p.size());
    for(Pair e:p){
    System.out.print(e.getKey()+" ");
    System.out.println(e.getValue());
    }
    }
}
