/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Public
 */
public class TheWayToHome {
    public static void main(String[] args) throws Exception{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int d=Integer.parseInt(st.nextToken());
         char a[]=br.readLine().toCharArray();
        int i=0;
         int e=1;
         int count=0;
         for( i=d;i<n;){
         while(a[i]!='1'){
             if(i==e)
             { 
             System.out.println(-1);
             return;
             }
             i--;
         
         }
         e=i+1;
         count++;
         i=i+d;
         }
       if(i-d==n-1)
         System.out.println(count);
       else if(i>n-1)
           System.out.println(count+1);
        
    }
}
