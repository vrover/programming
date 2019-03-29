/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Public
 */
public class FloydWarshall {
     public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
    for(int l=0;l<t;l++){
        StringTokenizer st=new StringTokenizer(br.readLine());
        int V=Integer.parseInt(st.nextToken());
        int g[][]=new int[V][V];
        StringTokenizer st1=new StringTokenizer(br.readLine());
        for(int i=0;i<V;i++)
            for(int j=0;j<V;j++){g[i][j]=Integer.parseInt(st1.nextToken());}
     for(int k=0;k<V;k++)
         for(int i=0;i<V;i++)
             for(int j=0;j<V;j++){
             if(g[i][j]>g[i][k]+g[k][j])
                 g[i][j]=g[i][k]+g[k][j];
             }
    for(int i=0;i<V;i++)
            for(int j=0;j<V;j++){System.out.print(g[i][j]+" ");}
    }
    
     }
}
