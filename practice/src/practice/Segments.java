/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import javafx.util.Pair;

/**
 *
 * @author Public
 */
public class Segments {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        ArrayList<Pair<Integer,Integer>> s=new ArrayList<Pair<Integer,Integer>>();
          if(n==1)
         {System.out.println(1); return;}
        int count=n;
       
        while(count>0){
            int i=0,j=count;
        while(j<=n)
            s.add(new Pair(i++,j++));
        count--;
        }
         int scount=1;
         boolean a[]=new boolean[s.size()];
       
         Arrays.fill(a, true);
         a[0]=false;
         for(int v=1;v<s.size();v++){
         if(a[v]==true){
         int i=s.get(v).getKey();
         int j=s.get(v).getValue();
         
         int start=v+1;
         while(start<s.size() && j!=n ){
         if( a[start]==true && s.get(start).getKey()==j){
            a[v]=false; a[start]=false; scount++;
            
            break;  
         
         }
         start++;
         }
         start=v+1;
          while(start<s.size() && i!=0){
         if(a[start]==true && s.get(start).getValue()==i){
           a[v]=false;  a[start]=false; scount++;
          break;}
         start++;
         }
         }
         
         }
         for(int i=0;i<a.length;i++){
           
         if(a[i]==true)
             scount++;
         }
         System.out.println(scount);
    }
   
}

