/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Real;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 *
 * @author Public
 */
public class ShortestPathInBinaryMaze {
     public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        outer:  for(int j=0;j<t;j++){
            StringTokenizer st=new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int m=Integer.parseInt(st.nextToken());
            StringTokenizer st2=new StringTokenizer(br.readLine());
            int a[][]=new int[n][m];
            boolean v[][]=new boolean[n][m];
            for(int i=0;i<n;i++)
                for(int l=0;l<m;l++)
                {
                a[i][l]=Integer.parseInt(st2.nextToken());
                }
            StringTokenizer st3=new StringTokenizer(br.readLine());
            int di=Integer.parseInt(st3.nextToken());
            int dj=Integer.parseInt(st3.nextToken());
             if(a[0][0]==0){System.out.println(-1); continue outer;}
            Queue<Integer> qi=new LinkedList<Integer>();
            Queue<Integer> qj=new LinkedList<Integer>();
            Queue<Integer> d=new LinkedList<Integer>();
            qi.add(0);
            qj.add(0);
            d.add(0);
            v[0][0]=true;
            while(!qi.isEmpty()){
           int xi=qi.poll();
            int xj=qj.poll();
            int distance=d.poll();
            if(xi==di && xj==dj){
            System.out.println(distance);
            continue outer;
            }
            
            if(xi-1>=0 && a[xi-1][xj]==1){if(v[xi-1][xj]==false){ v[xi-1][xj]=true; qi.add(xi-1); qj.add(xj); d.add(distance+1);}}
             if(xj-1>=0 && a[xi][xj-1]==1){if(v[xi][xj-1]==false){v[xi][xj-1]=true; qi.add(xi); qj.add(xj-1); d.add(distance+1);}}
            
              if(xi+1<n && a[xi+1][xj]==1){if(v[xi+1][xj]==false){v[xi+1][xj]=true; qi.add(xi+1); qj.add(xj); d.add(distance+1);}}
             if(xj+1<m && a[xi][xj+1]==1){if(v[xi][xj+1]==false){v[xi][xj+1]=true; qi.add(xi); qj.add(xj+1); d.add(distance+1);}}
            
            }
            System.out.println(-1);
            
        }
     }
}
